package Recursion;

public class count {
    public static void main(String[] args){
        int num = 5;
//        countnumber(num);
//        countreverse(num);
//        both(num);
        decrement(num);
    }

    static void countnumber(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        countnumber(num -1);
    }

    static void countreverse(int num){
        if(num == 0){
            return;
        }
        countreverse(num - 1);
        System.out.println(num);
    }
    static void both(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        both(num-1);
        System.out.println(num);
    }

    static void decrement(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
//        n-- vs --n ,,, n-- will pass the value than sub , and --n will sub first then pass;
        decrement(--num);
    }

}
