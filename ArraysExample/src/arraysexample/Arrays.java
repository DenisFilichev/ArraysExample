/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysexample;

/**
 *
 * @author denis
 */
public class Arrays {
    /*увеличение размера массива на размер size
    Создается копия массива с размером array.length+size
    */
    public static int[] resize(int[] array, int size) {
        if (size > 0){
            int[] newArray = java.util.Arrays.copyOf(array, array.length+size);
            return newArray;
        }
        return array;
    }

    //добавление элеманта в конец массива
    public static int[] add (int[] array, int element){
        array = resize(array, 1);
        array[array.length-1] = element;
        return array;
    }

    /*Добавление элемента по индексу
    т.е. в массив добавляется новый элемент с индексом равным index,
    все остальные элементы переиндексируются на +1
    */
    public static int[] add (int[] src, int index, int element){
        int[] tempArray = new int[src.length+1];
        System.arraycopy(src, 0, tempArray, 0, index);
        tempArray[index] = element;
        System.arraycopy(src, index, tempArray, index+1, tempArray.length-index-1);
        return tempArray;
    }

    //добавление копируемого массива в конец основного массива
    public static int[] addAll (int[] src, int[]dest){
        int[] tempArray = new int[src.length + dest.length];
        System.arraycopy(src, 0, tempArray, 0, src.length);
        System.arraycopy(dest, 0, tempArray, src.length, dest.length);
        return tempArray;
    }

    //Добавление массива dest в массив src начиная с индекса index массива src
    public static int[] addAll (int[] src, int index, int[]dest){
        int[] tempArray = new int[src.length + dest.length];
        System.arraycopy(src, 0, tempArray, 0, index);
        System.arraycopy(dest, 0, tempArray, index, dest.length);
        System.arraycopy(src, index, tempArray,  dest.length+index, src.length-index);
        return tempArray;
    }

    //Изменение элемента по индексу
    public static int[] set (int[] src, int index, int element){
        src[index] = element;
        return src;
    }

    //Обнуление массива типа int
    public static int[] clear (int[] src){
        src = new int[src.length]; // Вариант 1: Создание нового массива со значениями равными 0
/*      Вариант 2: Обнуление элементов существующего массива
        for (int i=0 ; i<src.length ; i++){
            src[i]=0;
        }
*/
        return src;
    }

    //Клонирование массива типа int
    public static int[] clone (int[] src){
        int[] tempArray = new int[src.length];
        for (int i=0 ; i<src.length ; i++){
            tempArray[i] = src[i];
        }
        return tempArray;
    }

    //удаление элеманта по индексу
    public static int[] delete (int[] src, int index){
        int[] tempArray = new int[src.length-1];
        System.arraycopy(src, 0, tempArray, 0, index);
        System.arraycopy(src, index+1, tempArray, index, src.length-index-1);
        return tempArray;
    }
}
