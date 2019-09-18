package com.company.homework6;


/**
 * Изменить сортировку выбором - исключите обмен значений, если найденный минимальный элемент уже находится на своем месте.
 */

public class SelectionSorter {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                }
            }
            if (i != pos) {
                array[pos] = array[i];
                array[i] = min;
            }  // меняем местами наименьший с array[i]
        }
    }
}




