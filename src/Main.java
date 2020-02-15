import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter: ");
        String[] inputArray = reader.readLine().split("\\s+");
        if (inputArray.length == 3) {
            String strA = inputArray[0];
            String sign = inputArray[1];
            String strB = inputArray[2];

            Calculator calculator = new Calculator();
            calculator.parse(strA, strB);
            String result = calculator.calculateToString(sign);
            System.out.println(result);
        } else {
            throw new IllegalArgumentException("Wrong argument count.");
        }
    }
}
