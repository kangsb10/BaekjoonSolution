package stack.ex10828;


import java.util.Scanner;

public class Main3 {

    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int test = sc.nextInt();

        stack = new int[test];

        for(int i = 0 ; i < test; i++){

            String str = sc.next();

            switch(str){
                case "push" :
                    push(sc.nextInt());
                    break;

                case "pop" :
                    sb.append(pop()).append('\n');
                    break;

                case "size" :
                    sb.append(size()).append('\n');
                    break;

                case "empty" :
                    sb.append(empty()).append('\n');
                    break;

                case "top" :
                    sb.append(top()).append('\n');
                    break;

            }

        }

        System.out.println(sb);

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
