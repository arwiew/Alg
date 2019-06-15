import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        Array<Integer> array = new ArrayImpl<>(8);
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

























    /*  private static double[] arr;
    private static int addSize = 1;
    private static int deleteSize;
    private static int arrSize = 10;


    public static void main(String[] args) {

        arr = new double[arrSize];
        for (int i = 0; i<arr.length; i++){
            arr[i] = rnd();
        }
        System.out.println(Arrays.toString(arr));
        deleteSize = 1;

    }

    private static double rnd(){
        double rnd = (int) Math.random();
        return rnd;
    }


    private void add(){
        int add = 1;
        arr = new double[arrSize + addSize];
        arr[arrSize+add] = add;
        System.out.println(Arrays.toString(arr));
    }

    private static void delete(){
        arr = new double[arrSize - deleteSize];
        System.out.println(Arrays.toString(arr));
    }

    private void find(){

        System.out.println(Arrays.toString(arr));
    }
*/

}
