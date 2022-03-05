import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ThreeSum {
    public static void main(String[] args) {
        int [] myArray = {12,3,1,2,-6,5,-8,6};
        Arrays.toString(threeSum(myArray, 0));

        System.out.println("-----------------------------");
        Arrays.toString(threeSum2(myArray,0));
    }


    public static int[] threeSum(int[] array, int target) {
        Arrays.sort(array);
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == target)
                        System.out.println(Arrays.toString(new int[]{array[i], array[j], array[k]}));
                }
            }
        }
        return new int[]{};
    }

    public static int[] threeSum2(int[] array, int target) {
        //Create HashMap
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(array);
        //Iterate over the array.
        // If a potential match exists return that indices else put the array value and index to map
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int potentialMatch = target - (array[i] + array[j]);
                if (map.containsKey(potentialMatch))
                    if(map.get(potentialMatch)!=i && map.get(potentialMatch) !=j){
                    System.out.println(Arrays.toString(new int[]{i, j, map.get(potentialMatch)}));}
                else map.put(array[i], i);
            }
        }
        return new int[]{};
    }


//    public static int[] threeSum1(int[] array, int target){
//        for(int i=0;i<array.length-1;i++){
//            for(int j=i+1; j<array.length;j++)
//                for(int k=j+1;k<array.length;k++)
//                    if((array[i]+array[j]+array[k])==target)
//                        return new int[]{i,j,k};
//        }
//        return new int[]{};
//    }


//    public static int[] threeSum1(int[] array, int target) {
// //       boolean found = false;
//        for (int i = 0; i < array.length - 2; i++) {
//            for (int j = i + 1; j < array.length - 1; j++) {
//                for (int k = j + 1; k < array.length; k++) {
//                    if (array[i] + array[j] + array[k] == target)
//                        System.out.print(Arrays.toString(new int[]{array[i], array[j], array[k]}));
////                    {
////                        System.out.print(arr[i]);
////                        System.out.print(" ");
////                        System.out.print(arr[j]);
////                        System.out.print(" ");
////                        System.out.print(arr[k]);
////                        System.out.print("\n");
////                        found = true;
////                    }
//                }
//            }
//        }
//
//        return new int[]{};
//        // If no triplet with 0 sum found in array
////        if (found == false)
////            System.out.println(" not exist ");
//    }


}
