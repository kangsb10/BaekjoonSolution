package stack.ex10828;

import java.util.Scanner;

class Main {

    public static int[] stack;

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
//        for(int i = stack.length - 1; i >= 0; i--){
//            if(stack[i] == 0){
//                stack[i] = n;
//                break;
//            }
//        }
    }

    public static int pop(){
        int answer = -1;
        for(int i = 0; i < stack.length; i++){
            if(stack[i] != 0){
                answer = stack[i];
                stack[i] = 0;
                break;
            }
        }
        return answer;
    }

    public static int size(){
        int answer = 0;
        for(int i = 0; i < stack.length; i++){
            if(stack[i] != 0){
                ++answer;
            }
        }

        return answer;
    }

    public static int empty(){
        int answer = 1;
        for(int i = 0; i < stack.length; i++){
            if(stack[i] != 0){
                answer = 0;
                break;
            }
        }
        return answer;
    }

    public static int top(){
        int answer = -1;
        for(int i = 0; i < stack.length; i++){
            if(stack[i] != 0){
                answer = stack[i];
                break;
            }
        }
        return answer;
    }

}
