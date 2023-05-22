import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Question15 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size;
        ArrayList <String> Namedlist=new ArrayList<String>(40);
        System.out.println("Enter Numbers You Want to Add: ");
        size=sc.nextInt();
        String [] list= new String[size+2];
        System.out.println("Enter Elements : ");
        for (int i = 0; i <=size; i++) {
            list[i]=sc.nextLine();
        }

        Namedlist.addAll(0, List.of(list));

        Iterator iterator= Namedlist.iterator();
        System.out.println("Printing Elements: ");
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
