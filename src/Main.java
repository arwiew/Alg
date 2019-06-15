import java.util.Arrays;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) {


        final int ARR_SIZE = 80000;

        Array<Integer> arr = new ArrayImpl<>(ARR_SIZE);
                for (int i = 0; i < ARR_SIZE ; i++) {
                    int random = randomGen(1,ARR_SIZE);
                    arr.add(random);

        }
        Array<Integer> arr1 = arr;
        Array<Integer> arr2 = arr;
        Array<Integer> arr3 = arr;

      timer(arr1,arr2,arr3);

    }

    private static void timer(Array<Integer> arr1, Array<Integer> arr2, Array<Integer> arr3){
        long startBubble = System.currentTimeMillis();
        arr1.sortBubble();
        long stopBubble = System.currentTimeMillis()-startBubble;
        System.out.println("Bubble time : " + stopBubble);

        long startInserrt = System.currentTimeMillis();
        arr2.sortInsert();
        long stopInsert = System.currentTimeMillis()-startInserrt;
        System.out.println("Insert time : " + stopInsert);

        long startSelect = System.currentTimeMillis();
        arr3.sortSelect();
        long stopSelect = System.currentTimeMillis()-startSelect;
        System.out.println("Select time : " + stopSelect);

    }

    private static int randomGen(int i, int i1) {
        int max = i;
        int min = i1;
        int x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }


}

  /*      Array<Integer> array = new ArrayImpl<>(8);
        //Array<Integer> array = new SortedArrayImpl<>(8);
        array.add(1);
        array.add(5);
        array.add(3);
        array.add(4);
        array.add(2);
        array.add(6);
        array.add(7);
        array.add(8);


        array.display();
   //     array.sortBubble();
   //     array.sortSelect();
        array.sortInsert();

 //       TimeUnit.NANOSECONDS.toMillis;


        System.out.println("Размер массива: " + array.size());
        System.out.println("Find 1: " + array.contains(1));
        System.out.println("Find 6: " + array.contains(6));
        System.out.println("Find 66: " + array.contains(66));
        System.out.println("Find index for 3: " + array.indexOf(3));
        array.remove(3);
        System.out.println("Find index for 3: " + array.indexOf(3));
        array.display();
    }

    private static void testJdkArray(){
        int [] array = {1,2,3};
        for (int i = 0; i < array.length; i++);

    }

*/

























