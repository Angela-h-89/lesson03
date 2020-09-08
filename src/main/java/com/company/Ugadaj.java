import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Ugadaj {
    public static void main(String[] args) {
        int n = 0;
        Integer user_number;
        Scanner input = new Scanner(System.in);
        System.out.println("ДАВАЙТЕ ПОИГРАЕМ! Я угадаю Ваше число!");
        int search_results = (int) (Math.random() * 100);
        System.out.print("Введите ваше число: ");
        user_number = input.nextInt();
        if (user_number instanceof Integer) {
            do {
                n++;
                if (user_number > search_results) {
                    search_results++;
                } else {
                    if (user_number < search_results) {
                        search_results--;
                    }
                }
            } while (user_number != search_results);
            System.out.print("СТОП ИГРА! Я УГАДАЛ!");
            System.out.println("\nВаше число: " + search_results);
            System.out.println("Я угадал Ваше число с " + n + " раза!");
        }
        else {
            System.out.print("Некорректный ввод!"); //ошибку не ловит, как сделать пока не знаю
            System.exit(0);
        }
    }
}