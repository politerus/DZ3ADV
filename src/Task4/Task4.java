package Task4;

import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        File txtFile = new File("D:\\ДЗ\\Дз 3 Уровень\\DZ3ADV\\untitled\\src\\text.txt");
        File classFile = new File("D:\\ДЗ\\Дз 3 Уровень\\DZ3ADV\\untitled\\src\\Task4\\newclass.class");

        try {
            classFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileWriter fw = new FileWriter(txtFile)) {
            fw.write("Україна – це, незалежна держава, " +
                         "що знаходиться в південно-східній частині Європи," +
                         " омивається Чорним та Азовським морями.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(txtFile));
            String temp;
            while ((temp = br.readLine()) != null){
                System.out.println(temp);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/* Створіть у пакеті текстовий файл і клас, внесіть у файл якийсь текст.
    Виведіть на екран вміст файлу.
 */