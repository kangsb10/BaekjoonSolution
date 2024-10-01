package queue;

import java.util.Scanner;

public class Main {

    public static int[] queue;
    public static int size = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cmdCnt = sc.nextInt();

        queue = new int[cmdCnt];

        for(int i = 0; i < cmdCnt; i++){

        }


    }

    public static void push(int n){
        queue[size] = n;
        size++;
    }

    public static int pop(){
        int res = -1;
        if(size > 0){
            res = queue[size - 1];
        }
        return res;
    }

    public static int size(){
        return size;
    }

    public static int empty(){
        int res = 1;
        if(size > 0){
            res = 0;
        }
        return res;
    }

    public static void front(){
        pop();
    }

    public static int back(){
        int res = -1;


        return res;
    }

}
