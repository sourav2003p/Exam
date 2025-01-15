import java.util.Scanner;
public class ReverseNumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        int startNumber = rows * (rows + 1) / 2;

        for(int i = rows; i >= 1; i--) {
            System.out.format("%" + (rows - i + 1) * 2 + "s", "");
            for(int j = i; j >= 1; j--) { 
                System.out.print(startNumber + " ");
                startNumber--;
            }
            System.out.println();
        }
        scanner.close();
    }
}
