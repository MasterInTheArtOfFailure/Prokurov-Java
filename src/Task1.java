import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    //1
    public void moreThanSeven() throws IOException {
        System.out.println("Введите целое число:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        if (number > 7) {
            System.out.println("Привет");
        }
    }
}
