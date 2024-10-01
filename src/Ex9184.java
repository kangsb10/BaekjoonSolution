import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex9184 {


    static int[][][] arr = new int[51][51][51];
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = 0;
        int b = 0;
        int c = 0;

        boolean endChk = false;
        while(!endChk){
            String row = br.readLine();
            StringTokenizer st = new StringTokenizer(row);

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            if(a == -1 && b == -1 && c == -1){
                endChk = true;
            }else{
                int result = w(a,b,c);

                bw.write("w(" + a + ", " + b + ", " + c + ") = " + result + "\n");

            }
        }

        bw.flush();
        bw.close();

    }


    public static int w(int a, int b, int c){

        if(a <= 0 || b <= 0 || c<= 0){
            return 1;
        }

        if(arr[a][b][c] != 0) return arr[a][b][c];

        if(a > 20 || b > 20 || c > 20){
            arr[a][b][c] = w(20,20,20);
            return arr[a][b][c];
        }

        if(a < b && b < c){
            arr[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
            return arr[a][b][c];
        }

        arr[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
        return arr[a][b][c];

    }

}
