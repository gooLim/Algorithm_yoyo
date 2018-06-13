package yoyo_2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList prime_number = new LinkedList();
        int m = 0;
        int n = -1;
        int index = 0;
        Scanner sc = new Scanner(System.in);

        while ( m > n ) {
            if ( m <= 0 || m > 10000 ) {
                m = sc.nextInt();
            }
            if ( n <= 0 || n > 10000 ) {
                n = sc.nextInt();
            }
        }

        index = m;
        while ( index <= n ) {
            int i = 2;
            while ( i < index ) {
                if (index % i == 0) {
                    break;
                }
                i++;
            }
            if ( index == i ) {
                prime_number.add(index);
            }
            index++;
        }
    }
}
