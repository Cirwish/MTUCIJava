/*Напишите функцию, которая возвращает позицию второго вхождения " zip " в
строку, или -1, если оно не происходит по крайней мере дважды. Ваш код должен
быть достаточно общим, чтобы передать все возможные случаи, когда "zip" может
произойти в строке.*/
public class task2 {
    public static void main(String[] args) {
        System.out.println(findZip("all zip files are zipped"));
        System.out.println(findZip("all zip files are compressed"));
    }

    private static int findZip(String s) {
        if (s.lastIndexOf("zip") != s.indexOf("zip") && s.indexOf("zip") != -1)
            return s.lastIndexOf("zip");
        return -1;
    }
}
