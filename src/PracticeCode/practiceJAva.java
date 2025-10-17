package PracticeCode;

public class practiceJAva {
    public static void main(String[] args){
        salary(20000.0);
    }
    public static void salary(double sal){
        if(sal>10000){
            sal = sal+2000;
        }
        else{
            sal = sal+1000;
        }
        System.out.print(sal);
    }
}
