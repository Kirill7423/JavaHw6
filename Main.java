import java.util.*;

import static HW6.Notebook.filt;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> notebooks = new HashSet<>();

        Notebook notebook1 = new Notebook();
        notebook1.brand = "Acer";
        notebook1.ram = 4;
        notebook1.hdd = 128;
        notebook1.os = "windows 11";
        notebook1.color = "белый";

        Notebook notebook2 = new Notebook();
        notebook2.brand = "Asus";
        notebook2.ram = 8;
        notebook2.hdd = 256;
        notebook2.os = "windows 11";
        notebook2.color = "черный";

        Notebook notebook3 = new Notebook();
        notebook3.brand = "Dell";
        notebook3.ram = 8;
        notebook3.hdd = 128;
        notebook3.os = "windows 11";
        notebook3.color = "белый";

        Notebook notebook4 = new Notebook();
        notebook4.brand = "HP";
        notebook4.ram = 16;
        notebook4.hdd = 512;
        notebook4.os = "windows 11";
        notebook4.color = "серый";

        Notebook notebook5 = new Notebook();
        notebook5.brand = "Lenovo";
        notebook5.ram = 8;
        notebook5.hdd = 128;
        notebook5.os = "без ОС";
        notebook5.color = "черный";

        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "brand");
        map.put(2, "ram");
        map.put(3, "hdd");
        map.put(4, "os");
        map.put(5, "color");

        print(filt(notebooks));
    }
        static void print(Set<Notebook> notebooks){
            for (Notebook notebook: notebooks) {
                System.out.println(notebook);
            }
    }
}
