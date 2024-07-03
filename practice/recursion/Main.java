package practice.recursion;

public class Main {
    public static void main(String[] args){
        message();
    }

    static void message(){
        System.out.println("Message0");
        message1();
    }

    static void message1(){
        System.out.println("Message1");
        message2();
    }

    static void message2(){
        System.out.println("Message2");
    }
}
