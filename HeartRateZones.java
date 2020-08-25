/***********************************************************************************************************************
 * @file   HeartRateZone.java
 * @brief  The user enter their resting heart rate and age, then choose an exercise program to get their target heart rate zone
 * @author Heba Beshai
 * @date   February 6, 2016
 **********************************************************************************************************************/
import java.util.Scanner;
public class HeartRateZones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Define Variables to be Used in this program
            int hRate;
            int age;
            int maxHR;
            int diff;
            double LowerEst1;
            double HigherEst1;
            double LowerEst2;
            double HigherEst2;
            double LowerEst3;
            double HigherEst3;
            String a;
            String choice;
            String b;
            String c;
            try (Scanner scan = new Scanner(System.in)) {

        // Ask the user to enter the data needed by the program
            System.out.println("Target Rate Zone Calculator");
            System.out.println();
            System.out.print("Please enter your age: ");
            age = input.nextInt();
            System.out.print("Please enter your resting heart rate: ");
            hRate = input.nextInt();
            System.out.println();
            System.out.println("Choose the exercise you would like to know your heart rate for:" +
                    "\n a. Weight loss or Building Endurance" +
                     "\n b. Weight Management or Improving cardio fitness\n" +
                      " c. Interval Workout");
            System.out.println();
            System.out.print("Please enter your choice here: ");
                          choice = input.next();
            System.out.println();
        }
        // Do the needed calculations, use 1 or more variables to store your results
            maxHR = 220 - age;
            diff = maxHR - hRate;
            LowerEst1 = diff * 0.60 + hRate; //Calculating weight loss, building endurance
            HigherEst1 = diff * 0.70 + hRate;
            LowerEst2 = ((diff * 0.70) + hRate); //Calculating weight management, improving cardio fitness
            HigherEst2 = ((diff * 0.80) + hRate);
            LowerEst3 = diff * 0.80 + hRate; //Calculating interval workouts
            HigherEst3 = diff * 1 + hRate;

        // Print the results to the screen
            if (choice.equals("a")) {
                System.out.println("Your target heart rate zone is [" +LowerEst1+ " - " +HigherEst1+ "]");
            }
            if (choice.equals("b")) {
            System.out.println("Your target heart rate zone is [" +LowerEst2+ " - " +HigherEst2+ "]");
             }
            if (choice.equals("c")) {
            System.out.println("Your target heart rate zone is [" +LowerEst3+ " - " +HigherEst3+ "]");
             }
    }

}