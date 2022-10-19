import java.util.Scanner;

public class AdventureRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You are on an island surrounded by water.\nThere is a path to the woods to the north, the sea to the south, and a beach shack to the east. \nWhich way do you want to go (n,e,s,w)?");
        String command = scan.nextLine();

        if (command.equals("n"))
        {
            System.out.println("You enter the forest and hear some rustling.\nThere may be tigers here or maybe it's just monkeys.");
            System.out.println("It is a monkey, do you give it a banana?(y,n)");
            command = scan.nextLine();
            if (command == "y"){
                System.out.println("You provoked the monkey and you get injured.");
            }
            else {
                System.out.println("You leave the forest instead.");
            }
            /* add nested if statements for possible next actions! */


        }

        // Add else-ifs for s, e, and an else for any other input. Be creative!




        System.out.println("End of adventure!");
    }
}
