package stack.ex10828;

import java.util.Scanner;

public class Main2 {

    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) {

        int cmdCnt = 0;
        String cmd = "";

        Scanner sc = new Scanner(System.in);
        cmdCnt = sc.nextInt();
        stack = new int[cmdCnt];

        sc.nextLine();  // 에러방지
        for(int i = 0; i < cmdCnt; i++) {
            cmd = sc.nextLine();

            switch (cmd) {
                case "pop":
                    System.out.println(pop());
                    break;

                case "top":
                    System.out.println(top());
                    break;

                case "size":
                    System.out.println(size());
                    break;

                case "empty":
                    System.out.println(empty());
                    break;

                default:
                    if (cmd.contains("push")) {
                        int num = Integer.parseInt(cmd.split(" ")[1]);
                        push(num);
                    }
                    break;
            }

        }

    }

    public static void push(int n){
        stack[size] = n;
        size++;
    }

    public static int pop(){
        int answer = 0;
        if(size == 0){
            answer = -1;
        }else{
            answer = stack[size - 1];
            stack[size -1] = 0;
            size--;
        }
        return answer;
    }

    public static int top(){
        int result = -1;
        if(size != 0){
            result = stack[size - 1];
        }
        return result;
    }

    public static int empty(){
        int result = 1;
        if(size != 0){
            result = 0;
        }
        return result;
    }

    public static int size(){
        return size;
    }


}
