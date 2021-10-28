package arraysexample;

/**
 *
 * @author denis
 */
public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6};
        int[] arraySec = new int[] {-6, -5, -4, -3, -2, -1};
        int[] tempArray;
        //добавление элеманта в конец массива
        tempArray = Arrays.add(array, 7);
        System.out.println("добавление элеманта в конец массива");
        for (int i=0 ; i<tempArray.length ; i++){
            System.out.print(tempArray[i]);
        }
        System.out.println("");
        
        //Добавление элемента по индексу
        tempArray = Arrays.add(array, 2, 9);
        System.out.println("Добавление элемента по индексу");
        for (int i=0 ; i<tempArray.length ; i++){
            System.out.print(tempArray[i]);
        }
        System.out.println("");
        
        //добавление копируемого массива в конец основного массива
        tempArray = Arrays.addAll(array, arraySec);
        System.out.println("добавление копируемого массива в конец основного массива");
        for (int i=0 ; i<tempArray.length ; i++){
            System.out.print(tempArray[i]);
        }
        System.out.println("");
        
        
        //Обнуление массива типа int
        tempArray = Arrays.clear(tempArray);
        System.out.println("Обнуление массива типа int");
        for (int i=0 ; i<tempArray.length ; i++){
            System.out.print(tempArray[i]);
        }
        System.out.println("");
        
        //Клонирование массива типа int
        tempArray = Arrays.clone(array);
        System.out.println("Клонирование массива типа int");
        for (int i=0 ; i<tempArray.length ; i++){
            System.out.print(tempArray[i]);
        }
        System.out.println("");
        
        //удаление элеманта по индексу
        tempArray = Arrays.delete(array, 3);
        System.out.println("удаление элеманта по индексу");
        for (int i=0 ; i<tempArray.length ; i++){
            System.out.print(tempArray[i]);
        }
        System.out.println("");
    }
    
}
