import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> tasks  = new ArrayList<>();

        System.out.println("***  MENU  ***" +
                            "\n1. Добавить новую задачу в список дел" +
                            "\n2. Отметить задачу как выполненную и удалить" +
                            "\n3. Отобразить текущий список дел" +
                            "\n4. Редактировать задачу" +
                            "\n0. Выйти");

        int code = scan.nextInt();
        while (code != 0) {
            switch (code) {
                case 1: {
                    scan.nextLine();
                    System.out.print("Введите задачу: ");
                    tasks.add(scan.nextLine());
                    System.out.println("Задача добавлена!");
                } break;
                case 2: {
                    System.out.println("Выберите номер задачи для удаления");
                    int num = scan.nextInt();
                    tasks.remove(num - 1);
                    System.out.println("Задача отмечена как выполненная и удалена!");
                } break;
                case 3: {
                    System.out.println("Список дел: ");
                    int j = 1;
                    for (String i : tasks) {
                        System.out.println(j + ". " + i);
                        j++;
                    }
                } break;
                case 4: {
                    System.out.println("Выберите номер задачи для редактирования");
                    int num = scan.nextInt();
                    System.out.println("Текущая задача: <" + tasks.get(num-1) + ">. Введите новый текст");
                    scan.nextLine();
                    tasks.set(num - 1, scan.nextLine());
                    System.out.println("Задача отредактирована!");
                } break;
                default: System.out.println("Неверный ввод, попробуйте еще раз");
            }
            System.out.println("*** MENU ***" +
                    "\n1. Добавить новую задачу в список дел" +
                    "\n2. Отметить задачу как выполненную и удалить" +
                    "\n3. Отобразить текущий список дел" +
                    "\n4. Редактировать задачу" +
                    "\n0. Выйти");
            code = scan.nextInt();
        }
    }
}
