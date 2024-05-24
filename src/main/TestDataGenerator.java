
package main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class TestDataGenerator {
    public static void main(String[] args) {
        int[] sizes = {13, 130, 1300, 13000, 130000, 1300000};
        Random rand = new Random();

        for (int sz : sizes) {
            try (FileWriter fw = new FileWriter("f" + sz + ".txt")) {
                for (int i = 0; i < sz; i++) {
                    fw.write(rand.nextInt(1000000) + " ");
                }
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл: " + e.getMessage());
            }
        }
    }
}
