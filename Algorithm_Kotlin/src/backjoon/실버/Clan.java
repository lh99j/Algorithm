import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Clan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(tk.nextToken());
        int b = Integer.parseInt(tk.nextToken());


        String array[][] = new String[a][b];

        for (int i = 0; i < array.length; i++) {
            String str[] = br.readLine().split("");
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = str[j];
            }
        }

        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            int Xcount1 = 0;
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j].equals("X")) {
                    Xcount1++;
                }
            }
            if (Xcount1 == 0) {
                count1++;
            }
        }


        int count2 = 0;
        for (int i = 0; i < array[0].length; i++) {
            int Xcount2 = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j][i].equals("X")) {
                    Xcount2++;
                }
            }
            if (Xcount2 == 0) {
                count2++;
            }
        }

        if(count1 <= count2){
            System.out.println(count2);
        }else{
            System.out.println(count1);
        }
    }
}