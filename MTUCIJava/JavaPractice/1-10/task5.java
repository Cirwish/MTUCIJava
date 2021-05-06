/*Напишите функцию, которая принимает 3 числа и возвращает, что нужно сделать с
a и b: они должны быть сложены, вычитаны, умножены или разделены, чтобы
получить N. Если ни одна из операций не может дать N, верните "none".
3 числа – это N, a и b.*/
public class task5 {
    public static void main(String[] args) {
        System.out.println(operation(24,15,9));
        System.out.println(operation(24,26,2));
        System.out.println(operation(15,11,11));
    }

    static String operation(int N, int a, int b) {
        if (a+b == N)
            return "added";
        else if (a-b == N)
            return "subtracted";
        else if (a*b == N)
            return "multiplied";
        else if (a/b == N)
            return "divided";
        else
            return "none";
    }
}
