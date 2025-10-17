package Voting;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class OfficeVotingSystem {
    private Set<String> eligibleVoters;
    private Set<String> candidates;
    private Map<String, Boolean> hasVoted;
    private Map<String, Integer> voteCount;

    public OfficeVotingSystem(Set<String> eligibleVoters, Set<String> candidates) {
        this.eligibleVoters = new HashSet<>(eligibleVoters);
        this.candidates     = new HashSet<>(candidates);
        this.hasVoted       = new HashMap<>();
        this.voteCount      = new HashMap<>();

        for (String voter : eligibleVoters) {
            hasVoted.put(voter, false);
        }
        for (String candidate : candidates) {
            voteCount.put(candidate, 0);
        }
    }

    public boolean castVote(String voterId, String candidateId) {
        if (!eligibleVoters.contains(voterId)) {
            return false;
        }
        if (hasVoted.getOrDefault(voterId, true)) {
            return false;
        }
        if (!candidates.contains(candidateId)) {
            return false;
        }
        hasVoted.put(voterId, true);
        voteCount.put(candidateId, voteCount.get(candidateId) + 1);
        return true;
    }

    public Map<String, Integer> getResults() {
        return Collections.unmodifiableMap(voteCount);
    }
}


