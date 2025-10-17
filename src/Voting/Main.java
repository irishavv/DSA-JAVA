package Voting;


import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> voters = Set.of("E001", "E002", "E003", "E004");
        Set<String> cands  = Set.of("Alice", "Bob", "Carol");

        OfficeVotingSystem ovs = new OfficeVotingSystem(voters, cands);

        ovs.castVote("E001", "Alice");
        ovs.castVote("E002", "Bob");
        ovs.castVote("E001", "Carol");
        ovs.castVote("E005", "Bob");
        ovs.castVote("E003", "Dave");

        System.out.println("Final Tally:");
        ovs.getResults().forEach((candidate, count) ->
                System.out.println(candidate + ": " + count)
        );
    }
}
