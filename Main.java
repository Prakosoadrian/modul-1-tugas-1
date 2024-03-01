import java.util.Scanner;

class LibrarySystem {
    private static boolean isStudentLoggedIn = false;
    private static boolean isAdminLoggedIn = false;
    private static String studentNIM;
    private static String adminUsername;
    private static String adminPassword;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Library System");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                if (isStudentLoggedIn) {
                    System.out.println("You are already logged in as a student.");
                } else {
                    System.out.print("Enter your NIM: ");
                    String nim = scanner.next();
                    if ("202210370311203".equals(nim)) {
                        System.out.println("Successful Login as Student");
                        isStudentLoggedIn = true;
                        studentNIM = nim;
                    } else {
                        System.out.println("User Not Found");
                    }
                }
            } else if (choice == 2) {
                if (isAdminLoggedIn) {
                    System.out.println("You are already logged in as an admin.");
                } else {
                    System.out.print("Enter your username (admin): ");
                    String username = scanner.next();
                    System.out.print("Enter your password (admin): ");
                    String password = scanner.next();

                    if ("admin".equals(username) && "adm1n".equals(password)) {
                        System.out.println("Successful Login as Admin");
                        isAdminLoggedIn = true;
                        adminUsername = username;
                        adminPassword = password;
                    } else {
                        System.out.println("Admin User Not Found!!");
                    }
                }
            } else if (choice == 3) {
                System.out.println("adios");
                break;
            } else {
                System.out.println("Invalid option, please choose a number between 1 and 3.");
            }
            System.out.println();
        }
        scanner.close();
    }
}