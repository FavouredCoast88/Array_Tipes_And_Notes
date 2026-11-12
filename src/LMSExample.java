import java.util.Scanner;
public class LMSExample {
  public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Number of students and subjects
        int students = 3;
        int subjects = 3;

        int[][] marks = new int[students][subjects];
        String[] names = new String[students];
        double[] averages = new double[students];

        // Subject names
        String[] subjectNames = {"SDE", "JDC", "MATH"};

        // INPUT DATA
        for (int i = 0; i < students; i++) {
            System.out.print("Enter student name: ");
            names[i] = input.nextLine();

            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter " + subjectNames[j] + " marks: ");
                marks[i][j] = input.nextInt();
            }
            input.nextLine(); // clear buffer
        }

        // CALCULATE AVERAGES
        for (int i = 0; i < students; i++) {
            int total = 0;

            for (int j = 0; j < subjects; j++) {
                total += marks[i][j];
            }

            averages[i] = (double) total / subjects;
        }

        // DISPLAY RESULTS
        System.out.println("\n--- Student Averages ---");
        for (int i = 0; i < students; i++) {
            System.out.println(names[i] + " Average: " + averages[i]);
        }

        // SEARCH STUDENT
        System.out.print("\nEnter student name to search: ");
        String searchName = input.nextLine();
        boolean found = false;

        for (int i = 0; i < students; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                System.out.println("Found " + names[i] + " Average: " + averages[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        // SORT BY AVERAGE (Descending)
        for (int i = 0; i < students - 1; i++) {
            for (int j = i + 1; j < students; j++) {

                if (averages[i] < averages[j]) {

                    // swap averages
                    double tempAvg = averages[i];
                    averages[i] = averages[j];
                    averages[j] = tempAvg;

                    // swap names
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

        // DISPLAY SORTED RESULTS
        System.out.println("\n--- Sorted by Average (Highest to Lowest) ---");
        for (int i = 0; i < students; i++) {
            System.out.println(names[i] + " Average: " + averages[i]);
        }

        input.close();
    }  
}//end class LMSExample
