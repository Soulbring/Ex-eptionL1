public class NumberConversion {
    public static int convertAndSum(String[] numbers) {
        int sum = 0;
        for (String number : numbers) {
            try {
                int value = Integer.parseInt(number);
                sum += value;
                if (sum > 100) {
                    throw new ArithmeticException("Превышен лимит суммы");
                }
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Строка не может быть преобразована в число: " + number);
            }
        }
        return sum;
    }
}
