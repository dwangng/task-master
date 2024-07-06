import java.util.Scanner;

public class TaskMaster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isfinished = false;

        while (isfinished == false){

            System.out.println("What is the task?");
            String task = scanner.nextLine();
            System.out.println("Is it urgent? (Y/N)");
            String urgency = scanner.nextLine();
            System.out.println("Is it important? (Y/N)");
            String importance = scanner.nextLine();

            System.out.println("\t" + task + " " + urgency + " " + importance);

            System.out.println("Continue? (Y/N)");
            String fin = scanner.nextLine();
            isfinished = switch (fin) {
                case "Y" -> false;
                case "N" -> true;
                default -> isfinished;
            };
        }
    }
}
