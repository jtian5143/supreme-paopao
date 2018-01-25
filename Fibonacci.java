import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n) {
    if (n <= 1)
      return n;
      
    long[] fib_num = new long[n];
    long fibo_pprev = 0;
    long fibo_prev = 1;
    for(int i=1;i<n;i++){
        fib_num[i] = fibo_pprev+fibo_prev;
        fibo_pprev = fibo_prev;
        fibo_prev = fib_num[i];
    }
      return fibo_prev;
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}
