import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.stream.Collectors;

public class Assignment5SunSetView {
    public static void main(String[] args) {
        System.out.println("Direction is EAST:");
        int[] buildings={3, 5, 4, 4, 3, 1, 3, 2};
        sunsetViews(buildings,"EAST").forEach(System.out::println);
        System.out.println("Direction is WEST:");
        sunsetViews(buildings,"WEST").forEach(System.out::println);
    }
    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        Stack<Integer> candidateBuildings = new Stack<>(); //O(n) space complexity
        int startIdx = 0;
        int step=1;

        if(direction.equals("WEST")){startIdx = buildings.length-1;
            step=-1;
        }
        int idx=startIdx;

        while(idx>=0 && idx< buildings.length) {
            while(!candidateBuildings.isEmpty()&&buildings[candidateBuildings.peek()]<=buildings[idx]){
                candidateBuildings.pop();
            }
            candidateBuildings.push(idx);
            idx+=step;
        }

        //O(n)
        if(direction.equals("WEST")) Collections.reverse(candidateBuildings); //O(n)
        return new ArrayList<Integer>(candidateBuildings);
    }

    //complexity = O(2n) = O(n) time complexity

}
