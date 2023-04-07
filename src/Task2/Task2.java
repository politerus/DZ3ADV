package Task2;

import java.io.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        File file = new File("./text.txt");
       // File file = new File("D:\\ДЗ\\Дз 3 Уровень\\DZ3ADV\\untitled\\src\\text.txt");

        FileWriter fw = new FileWriter(file);

        fw.write("Україна це найкраща країна!"
                + "\n Наші хлопці з ЗСУ міць .");
        fw.flush();
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader(file));

        String temp;
        while ((temp = br.readLine()) != null){
            System.out.println(temp);
        }
        br.close();
    }
}