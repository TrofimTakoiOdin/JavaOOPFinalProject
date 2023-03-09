import java.io.IOException;
import java.util.Scanner;
public class app {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Введите ваше сообщение: ");
            try {
                String a = scan.next();
                new Innerapp(a).write();
                System.out.println("Всё супер!");
                System.exit(0);
            }
            catch (IOException e) {
                System.out.println("Нужно ввести сообщение!");

            }

        }
    }
}



class Innerapp implements IInterface {
    private String message;

    public Innerapp(String message) throws IOException {
        this.message = message;


    }
    public String getMessage() {
        return message;
    }




    public void write() {
        String str = getMessage();
        System.out.println("Искомая строка: " + str);

        }

    }

