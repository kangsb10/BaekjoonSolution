import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex1904 {


    static int[] arr;
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());

        arr = new int[num + 1];

        int result = fnc(num);

        bw.write(result + "");
        bw.flush();
        bw.close();


    }

    public static int fnc(int num){

        if(num == 1) return 1;
        if(num == 2) return 2;

        if(arr[num] > 0) return arr[num];

        arr[num] = (fnc(num - 1) + fnc(num - 2)) % 15746;

        return arr[num];
    }

}
