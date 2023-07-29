import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    //3
    public void arrayDivisibleByThree() throws IOException {
        System.out.println("Введите массив целых чисел через запятую:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArray = br.readLine().split(",");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArray.length; i++) {
            if (Integer.parseInt(strArray[i].trim()) % 3 == 0) {
                sb.append(strArray[i] + ", ");
            }
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        System.out.println(sb);
    }
}
