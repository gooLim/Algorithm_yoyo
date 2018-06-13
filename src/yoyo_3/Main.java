package yoyo_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        new Main();
    }
    public Main() throws IOException {
        Algorithm();
    }

    private void Algorithm() throws IOException {
        ArrayList prime_number = new ArrayList<Integer>();
        int size ;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String data = br.readLine();


        Scanner sc = new Scanner(data);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int i = 2;
        while ( i <= m ) {
            int index = 2;
            while( index < m ) {
                if ( m % index == 0) {
                    break;
                }
                index++;
            }
            if ( index == m ) {
                prime_number.add(m);
            }
            i++;
        }

        while ( m <= n ) {

        }
    }
}
