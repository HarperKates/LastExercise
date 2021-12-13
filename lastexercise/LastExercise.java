package lastexercise;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author harperkates
 */
public class LastExercise {

    public static boolean foundMatch(int value, List<Integer> list){
        for(int i:list){
            if(i == value){
                return true;
            }
        }
        return false;
    } //foundMatch(int, List<Integer>)
    
    public static int countMatches(int value, List<Integer> list){
        int count = 0;
        for(int i:list){
            if(i == value){
                count++;
            }
        }
        return count;
    } //countMatches(int, List<Integer>)
    
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(34);
        data.add(13);
        data.add(89);
        data.add(55);
        data.add(21);
        data.add(13);
        boolean found = foundMatch(55, data);
        System.out.println("55 was found in the list: " + found);
        int count = countMatches(13, data);
        System.out.printf("Found %2d matches to 13 in the list\n", count);
    } //main(String[])
    
} //LastExercise
