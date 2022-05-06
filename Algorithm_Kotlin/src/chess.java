import java.io.BufferedReader;
import java.io.InputStreamReader;

public class chess {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String array[][] = new String[8][8];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            String[] str = br.readLine().split("");
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = str[j];
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if((i+j) % 2 == 0 && array[i][j].equals("F")){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
