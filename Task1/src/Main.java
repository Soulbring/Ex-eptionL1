import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] numbers = { "10", "15", "30", "40" }; //ВВодимые данные
        try {
            int result = NumberConversion.convertAndSum(numbers);
            System.out.println("Сумма чисел: " + result);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}