import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    //2
    public void nameCheck() throws IOException {
        System.out.println("Введите имя:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = "Вячеслав";
        String inputName = br.readLine();
        if (inputName.equals(name)) {
            System.out.println("Привет " + name);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
