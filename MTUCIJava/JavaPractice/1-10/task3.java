/*В этой задаче фермер просит вас сказать ему, сколько ног можно сосчитать среди
всех его животных. Фермер разводит три вида:
chickens = 2 legs
cows = 4 legs
pigs = 4 legs

Фермер подсчитал своих животных, и он дает вам промежуточный итог для каждого вида.
Вы должны реализовать функцию, которая возвращает общее количество ног всех
животных.*/
public class task3 {
    public static void main(String[] args) {
        System.out.println(animals(2, 3, 5));
        System.out.println(animals(1, 2, 3));
        System.out.println(animals(5, 2, 8));
    }

    static int animals(int chickens, int cows, int pigs) {
        return chickens*2 + cows*4 + pigs*4;
    }
}
