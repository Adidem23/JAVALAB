import java.util.*;
import java.util.stream.Collectors;

public class Question23 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int[] arr= new int[90];
        ArrayList<Integer> list= new ArrayList<Integer>(90);


        int size;
        System.out.println("Enter Size of Array : ");
        size=sc.nextInt();

        System.out.println("Enter Elements in Array : ");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }




    }
}
