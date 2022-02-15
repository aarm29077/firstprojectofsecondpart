package user;
import java.util.Scanner;
public class UserTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User[] users1 = new User[3];
        inputData(users1);
        printUser(users1);


    }
    public static void inputData(User users1[]) {
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < users1.length; i++) {
            User user = new User();
            System.out.print("Input user name: ");
            user.name = scanner.next();
            System.out.print("Input user lastName: ");
            user.lastName = scanner.next();
            System.out.print("Input user age: ");
            user.age = scanner.nextInt();
            users1[i] = user;

        }
    }
    public static void printUser(User users1[]) {
        for (int i = 0; i < users1.length; i++) {
            System.out.println(users1[i].name + " " + users1[i].lastName + " " + users1[i].age);

            wait1Second();

        }
    }


    public static void wait1Second(){
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 1000) {

        }
    }
}