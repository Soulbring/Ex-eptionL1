public class ArraySubtractor {
    public static int[] subArraysWithExceptionHandling(int[] array1, int[] array2) {
        // Проверка на равенство длин массивов
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Массивы разной длины");
        }

        // Создание нового массива для хранения результатов разностей
        int[] resultArray = new int[array1.length];

        // Вычисление разностей и проверка на отрицательные результаты
        for (int i = 0; i < array1.length; i++) {
            int result = array1[i] - array2[i];
            if (result < 0) {
                throw new RuntimeException("Отрицательный результат разности");
            }
            resultArray[i] = result;
        }

        return resultArray;
    }
}