package Java.Seminar4;

public class DZ_1 {
   
    public static void main(String[] args) {
        
        int [] array = new int[] {1,9,5,6,3,10,0,32};
        System.out.println("Ваш массив:"+ "\n" + arrayToString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println("Отсортированный массив:"+ "\n" +arrayToString(array));
        

    }
    // вызов быстрой сортировки сначало от начала до элемента(невключительно) и от элемента(включительно) до конча
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int divideIndex = partition(arr, start, end);
            quickSort(arr, start, divideIndex - 1);
            quickSort(arr, divideIndex, end);
        }
    }
    // деление массива и вызов функции swap(перестановки элементов)
    private static int partition(int[] arr, int start, int end) {
        int rightIndex = end;
        int leftIndex = start;

        int pivot = arr[start + (end - start) / 2];
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
    // перемещение элементов массива
    private static void swap(int[] array, int index1, int index2) {
        int tmp  = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
    // вывод массива
    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}

