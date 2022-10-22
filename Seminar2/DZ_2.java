package Java.Seminar2;

import java.util.Arrays;

public class DZ_2 {
    public static void main(String[] args) {
        int[] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        // берем i за 1 так как нулевой элемент уже находится в отсортированном массиве, и идем от первго(не от нулевого) до конца
        for (int i = 1; i < array.length; i++) { 
            int current = array[i]; // присваиваем current элемент который проверяем
            int j = i; // j присваиваем i что бы он проходил по массиву от неотсортированого
            // в цикле смотрим j больше 0 или элемент который проверяем меньше предыдушего в отсортированном массива
            while (j > 0 && array[j - 1] > current) {   
                array[j] = array[j - 1]; // перемещаем элемент array[j] вправо пока не выполниться условие выше 
                j--; // уменьшаем j так как двигаемся с конца в начало
            }
            array[j] = current; // вставляем в освободившееся место
        }
    }    
}
