import java.util.*;
public class TreasureHunt {
    public static void main(String[] args) {
        int health = 100;
        int coins = 0;
        boolean track = false;
        Scanner s = new Scanner(System.in);
        System.out.println(" Welcome To Treasure Hunt");
        System.out.println("Start Value for Health is:" + health + "\n Start value for coins are:" + coins);
        while (!track) {
            System.out.println("The menu is\n 1.Fight\n2.Search\n3.Rest\nCheckStatus\n5.Quit");
            System.out.println("Enter your Choice:");
            int choice = s.nextInt();
            if (choice == 1) {
                health -= 20;
                coins += 10;
                System.out.println("You have " + health + "health \n You have " + coins + "coins");

            } else if (choice == 2) {
                health -= 10;
                coins += 20;
                System.out.println("You have " + health + "health \n You have " + coins + "coins");
            } else if (choice == 3) {
                health += 15;
                coins -= 5;
                System.out.println("You have " + health + "health \n You have " + coins + "coins");
            } else if (choice == 4) {
                System.out.println("You have " + health + "health \n You have " + coins + "coins");
            } else if (choice == 5) {
                System.out.println("GoodBye!");
                break;
            } else {
                System.out.println("Invalid Choice.....");
                continue;
            }
            if (coins >= 100) {
                System.out.println("You won the Game.....");
                track = true;
                System.out.println("GameOver");
            }
            if (health <= 0) {
                System.out.println("You lost.....");
                track = true;
                System.out.println("GameOver");
            }
        }
                   s.close();
                 }
        }
