public class ArrayMerger {
    public static int[] mergeAndValidateArrays(int[] array1, int[] array2) {
        // Проверка на равенство длин массивов
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Длины массивов не равны");
        }

        // Объединение массивов
        int[] mergedArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        // Проверка на отрицательные элементы
        for (int value : mergedArray) {
            if (value < 0) {
                throw new RuntimeException("Обнаружен отрицательный элемент");
            }
        }

        return mergedArray;
    }
}
