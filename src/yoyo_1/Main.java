package yoyo_1;

import java.io.*;
import java.util.StringTokenizer;

// 소수 구하기
public class Main {
    public static void main(String[] args) throws IOException {
        new Main();
    }
    public Main() throws IOException {
        System.out.println( calculate() );
    }
    private int calculate() throws IOException {
        int[] data = read_Input();
        int count = 0;
        int prime_number = 0;

        while ( count < data.length) {
            int target = data[count++];
            int tmp = 2;

            while ( tmp < target ) {
                if ( (target % tmp) == 0) {
                    break;
                }
                tmp++;
            }
            if ( tmp == target) {
                prime_number++;
            }
        }
        return prime_number;
    }
    private int[] read_Input() throws IOException {
        int count = 0;
        int index = 0;
        int[] num_data;
        String data = "";

        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        count = Integer.parseInt( br.readLine() );

        if ( count > 100 ) {
            System.exit(0);
        }
        num_data = new int[count];

        data = br.readLine();
        StringTokenizer tokens = new StringTokenizer(data);

        while ( tokens.hasMoreTokens() ) {
            int tmp = Integer.parseInt(tokens.nextToken(" "));
            if (tmp <= 0 || tmp > 1000) {
                System.exit(0);
            }
            num_data[index++] = tmp;
        }
        return num_data;
    }
}
