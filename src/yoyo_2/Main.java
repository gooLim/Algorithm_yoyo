package yoyo_2;


import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Algorithm();
    }
    private void Algorithm() {
        LinkedList prime_number = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;

        while ( m <= n ) {
            int i = 2;
            while ( i < m ) {
                if ( m % i == 0) {
                    break;
                }
                i++;
            }
            if ( m == i ) {
                prime_number.add(m);
                sum += m;
            }
            m++;
        }
        if( prime_number.size() == 0 ) {
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(prime_number.pop());
        }
    }
}