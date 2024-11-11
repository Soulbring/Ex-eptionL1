public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 25, 3, 4};
        int[] array2 = {5, 6, 7, 8};

        try {
            int[] mergedArray = ArrayMerger.mergeAndValidateArrays(array1, array2);
            System.out.println("Объединенный массив:");
            for (int value : mergedArray) {
                System.out.print(value + " ");
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }
}

