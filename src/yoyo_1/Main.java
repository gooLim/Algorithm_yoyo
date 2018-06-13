package yoyo_1;

import java.io.IOException;
import java.util.Scanner;

//// 소수 구하기 (배열 생성)
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
        int data_count;
        int data;
        int[] data_arr;

        Scanner sc = new Scanner(System.in);
        data_count = sc.nextInt();

        while( data_count > 100 || data_count <= 0) {
            data_count = sc.nextInt();
        }

        data_arr = new int[data_count];
        for ( int i = 0; i < data_count; i++) {
            data = sc.nextInt();
            while(data > 1000 || data <= 0) {
                data = sc.nextInt();
            }
            data_arr[i] = data;
        }
        return data_arr;
    }
}