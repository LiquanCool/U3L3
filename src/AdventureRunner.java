import java.util.Scanner;

public class AdventureRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You are on an island surrounded by water.\nThere is a path to the woods to the north, the sea to the south, a pink elephant to the west, and a beach shack to the east. \nWhich way do you want to go (n,e,s,w)?");
        String command = scan.nextLine();

        if (command.equals("n"))
        {
            System.out.println("You enter the forest and hear some rustling.\nThere may be tigers here or maybe it's just monkeys.");
            System.out.println("It is a monkey, do you give it a banana?(y,n)");
            command = scan.nextLine();
            if (command.equals("y")){
                System.out.println("You provoked the monkey and you get injured.");
            }
            else {
                System.out.println("You leave the forest and go home.");
            }


        }
        if (command.equals("e"))
        {
            System.out.println("You enter the beach shack and see a chest.");
            System.out.println("Do you open the very sketchy chest? (y,n)");
            command = scan.nextLine();
            if (command.equals("y")){
                System.out.println("You found 10 million dollars so you are set for life.");
            }
            else {
                System.out.println("You leave the shack and go home.");
            }


        }
        if (command.equals("s"))
        {
            System.out.println("You go towards the sea, a kraken suddenly comes out the ocean and offers some tea.");
            System.out.println("Do you accept the tea and have a nice little chat?(y,n)");
            command = scan.nextLine();
            if (command.equals("y")){
                System.out.println("You accept the tea and learn the meaning of life.");
            }
            else {
                System.out.println("The kraken cries a little and you go away from the sea.");
            }


        }
        if (command.equals("w"))
        {
            System.out.println("You go towards the pink elephant and greet it.");
            System.out.println("It does not respond so you check on it. You find out it is dead, eat it?(y,n)");
            command = scan.nextLine();
            if (command.equals("y")){
                System.out.println("You ate some pink elephant and turned pink.");
            }
            else {
                System.out.println("You leave the pink elephant and go home.");
            }


        }



        System.out.println("End of adventure!");
    }
}
