package Recursion;

public class Basic {
    public static void main(String[] args){
        massage();
    }
    static void massage(){
        System.out.println("Hello World");
        massage2();
    }
    static void massage2(){
        System.out.println("Hello World");
        massage3();
    }
    static void massage3(){
        System.out.println("Hello World");
        massage4();
    }
    static void massage4(){
        System.out.println("Hello World");
        massage5();
    }
    static void massage5(){
        System.out.println("Hello World");
    }
}
