package Task3;
public class Task3 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Моя рідна країна, земля наших батьків, " +
                                              " на якій нам судилося народитися і жити," +
                                                " яка стала для всіх нас Батьківщиною. ");
        System.out.println(sb.substring(0,58));
        System.out.println(sb.substring(58));
    }
}
/*    Необхідно створити рядок із текстом (текст взяти будь-який з інтернету).
Розбити цей рядок на 2 підрядки рівної довжині та
вивести на екран кожну речення з нового рядка.
 */