/*Создайте функцию, которая определяет, является ли строка допустимым
шестнадцатеричным кодом.
Шестнадцатеричный код должен начинаться с фунтового ключа # и иметь длину ровно 6
символов. Каждый символ должен быть цифрой от 0-9 или буквенным символом от A-F.
все буквенные символы могут быть прописными или строчными.*/
import java.util.Arrays;
import java.util.List;


public class task5 {
    public static void main(String[] args){
        System.out.println(isValidHexCode("#CD5C5C"));
        System.out.println(isValidHexCode("#EAECEE"));
        System.out.println(isValidHexCode("#eaecee"));
        System.out.println(isValidHexCode("#CD5C58C"));
        System.out.println(isValidHexCode("#CD5C5Z"));
        System.out.println(isValidHexCode("#CD5C&C"));
        System.out.println(isValidHexCode("#CD5C5C"));
    }

    public static boolean isValidHexCode(String s) {
        return s.matches("#[a-fA-F0-9]{6}");
    }
}
