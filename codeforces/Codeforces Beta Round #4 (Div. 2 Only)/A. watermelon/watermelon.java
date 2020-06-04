import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if (a == 2)
            System.out.println("NO\n");
        else if (a%2 == 0) {
            System.out.println("YES\n");
        }
        else {
            System.out.println("NO\n");
        }
    }
}
