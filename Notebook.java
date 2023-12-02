import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Notebook {
    String brand;
    int ram;
    int hdd;
    String os;
    String color;


    public String toString() {
        return "brand: " + brand + ", ram: " + ram + ", hdd: " + hdd + ", os: " + os + ", color: " + color;
    }


    public static Set<Notebook> filt(Set<Notebook> notebooks) {
        Set<Notebook> res = new HashSet<>(notebooks);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество фильтров: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Введите номер характеристики для поиска: \n1. Название производителя " +
                    "\n2. Объем оперативной памяти: \n3. Объем жесткого диска: \n4. Операционная система \n5. Цвет");
            int num = Integer.parseInt(scanner.nextLine());

            switch (num) {
                case 1:
                    System.out.println("Введите название марки: ");
                    String name1 = scanner.nextLine();
                    for (Notebook temp : notebooks) {
                        if (!name1.equalsIgnoreCase(temp.brand)) {
                            res.remove(temp);
                        }
                    }
                    break;

                case 2:
                    System.out.println("Введите минимальный объем ОЗУ: ");
                    int n2 = Integer.parseInt(scanner.nextLine());
                    for (Notebook temp : notebooks) {
                        if (temp.ram < n2) {
                            res.remove(temp);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Введите объем HDD: ");
                    int n3 = Integer.parseInt(scanner.nextLine());
                    for (Notebook temp : notebooks) {
                        if (temp.hdd < n3) {
                            res.remove(temp);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Введите название ОС: ");
                    String name4 = scanner.nextLine();
                    for (Notebook temp : notebooks) {
                        if (!name4.equalsIgnoreCase(temp.os)) {
                            res.remove(temp);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Введите цвет: ");
                    String name5 = scanner.nextLine();
                    for (Notebook temp : notebooks) {
                        if (!name5.equalsIgnoreCase(temp.color)) {
                            res.remove(temp);
                        }
                    }
                    break;

                default:
                    System.out.println("Попробуйте снова");
            }
        }
        return res;
    }
}


