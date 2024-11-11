public class Main {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40};
        int[] array2 = {5, 15, 30, 35};

        try {
            int[] resultArray = ArraySubtractor.subArraysWithExceptionHandling(array1, array2);
            System.out.println("Результирующий массив:");
            for (int value : resultArray) {
                System.out.print(value + " ");
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }
}
