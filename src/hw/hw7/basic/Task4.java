package hw.hw7.basic;
/*
Напишите метод для подсчета всех слов в строке.

Дано:

Введите строку: Java is good to learn Object Oriented programming.

Ожидаемый результат:

Количество слов в строке: 8

 */
public class Task4 {
    public static void main(String[] args) {

        String sentence = "Java is good to learn Object Oriented programming.";

        int amountWords = countAllWords(sentence);
        System.out.println(amountWords);
    }

    private static int countAllWords(String sentence) {

        String sentenceCount = sentence.replaceAll("\\s", "");

        return sentence.length()-sentenceCount.length() + 1;
    }

}
