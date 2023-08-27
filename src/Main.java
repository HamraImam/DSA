import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] printArray = {2,5,7,3,0,9};
        int[] addElementArray = {2,5,7,3,0,9};
        System.out.println(Arrays.toString(printArray));

        //For each element in the array named printArray Iterate through each element
        //traditional
        for(int i=0; i< printArray.length; i++){
            System.out.print(printArray[i]);
            System.out.print(" ");
            System.out.println(i);
        }

        System.out.println();

        //enhanced
        for(int num: printArray){
            System.out.print(num);
            System.out.print(" | ");
        }
        System.out.println();

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for(int b=0; b< names.size(); b++){
            System.out.println(names.get(b));
        }
        System.out.println();
        for(String name: names){
            System.out.println(name);
        }
        System.out.println();

        int sum =0;
        for (int x = 0; x< printArray.length; x++){
            sum += printArray[x];
        }
        System.out.println(sum);
        System.out.println();

        int total=0;
        for(int y: printArray){
          total += y;
        }
        System.out.println(total);
        System.out.println();

        for (int x = 0; x< printArray.length; x++){
            System.out.println("Before muliplication "+ printArray[x]);
            //This accesses the value of the element at position x  multiplied by 2.
            // The result is then assigned back to the element at position x.
            printArray[x] = printArray[x]*2;
            System.out.println("After muliplication" + printArray[x]);
        }
        System.out.println(Arrays.toString(printArray));

        System.out.println();
        addValueElement(addElementArray);
        System.out.println("new Array" + Arrays.toString(addElementArray));

    }

    public static int[] addValueElement(int[] arrAdd){
        for (int el=0; el< arrAdd.length; el++){
            arrAdd[el] += 10;
        }

        for(int printNum: arrAdd){
            System.out.println(printNum + " ");
        }

        return arrAdd;

    }
}