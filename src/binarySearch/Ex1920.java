package binarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex1920 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        String[] A  = br.readLine().split(" ");

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        String[] B = br.readLine().split(" ");




        bw.flush();
        bw.close();


    }

    // 순차정렬
//    public static String[] sort(String[] arr){
//
//    }

}
