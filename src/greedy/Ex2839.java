package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Ex2839 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sugar = Integer.parseInt(st.nextToken());

        int rtnVal = -1;

        // 3, 5 혼합
        if(sugar >= 5){



            int rest = 0;
            rest = sugar / 5;
            if(rest % 3 == 0){
                rtnVal = (sugar / 5) + (rest / 3);
            }



        }else{
            if(sugar == 3){
                rtnVal = 1;
            }else{
                rtnVal = -1;
            }
        }

        bw.write(rtnVal + "");
        bw.flush();
        bw.close();

    }

}
