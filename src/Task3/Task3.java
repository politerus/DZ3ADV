package Task3;
public class Task3 {
    public static void main(String[] args) {

     /*  StringBuilder sb = new StringBuilder("Моя рідна країна, земля наших батьків, " +
                                              " на якій нам судилося народитися і жити," +
                                                " яка стала для всіх нас Батьківщиною. ");

      */



        String inputString = "Моя рідна країна, земля наших батьків, " +
                             " на якій нам судилося народитися і жити," +
                             " яка стала для всіх нас Батьківщиною. ";

        // Розбиття рядка на 2 підрядки рівної довжини
        int inputLength = inputString.length();
        int midIndex = inputLength / 2;


        String substring1 = inputString.substring(0, midIndex);




        String substring2 = inputString.substring(midIndex);
System.out.println(substring1);
System.out.println(substring2);
      //  System.out.println(sb.substring(0,58));
      //  System.out.println(sb.substring(58));
    }
}
/*    Необхідно створити рядок із текстом (текст взяти будь-який з інтернету).
Розбити цей рядок на 2 підрядки рівної довжині та
вивести на екран кожну речення з нового рядка.
 */