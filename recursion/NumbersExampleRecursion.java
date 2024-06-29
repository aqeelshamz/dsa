package recursion;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        // write a fucntion that takes in a number and prints it
        // print first 5 numbers: 1 2 3 4 5

        print(1);
    }

    static void print(int n) {
        System.out.println(n);
        if(n == 5){ //Base condition in recursion: a condition where the recursion will stop making new calls, if there is no base condition, the function will keep calling itself until the computer exceeds the stack memory
            return;
        }
        print(n + 1);
    }
}
