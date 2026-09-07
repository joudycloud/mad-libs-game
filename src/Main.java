
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String noun2;
        String urname;

        System.out.println("enter an adjective : ");
        adjective1 = scanner.nextLine();
        System.out.println(" enter a noun ( name ) : ");
        noun1 = scanner.nextLine();
        System.out.println(" enter an adjective : ");
        adjective2 = scanner.nextLine();
        System.out.println(" enter a noun ( name ) : ");
        noun2 = scanner.nextLine();
        System.out.println(" enter ur name : ");
        urname = scanner.nextLine();


        System.out.println("one day i saw a "+ adjective1+" cat");
        System.out.println(", me and " + noun1 + " running to her ,");
        System.out.println("we found that up close she has a " + adjective2 + " hair");
        System.out.println("and after we met her , we called her " + noun2 + ",how it cutiii !! .");
        System.out.println(" i thought that i will bring her to my room, " + urname + ", what do u think ? .");


         scanner.close();

    }
}
