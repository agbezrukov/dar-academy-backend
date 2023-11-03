package hw.hw7.basic;
/*
3. Напишите метод подсчета всех гласных букв в строке.
Дано:
DarTech123
Ожидаемый результат:
Количество гласных в строке: 2
«A», «E», «I», «O», «U», «Y».
 */

public class Task3 {
    public static void main(String[] args) {

        String word = "DarTech123";

        int amountVowels = countVowelsInLine(word);

        System.out.println(amountVowels);
    }

    private static int countVowelsInLine(String word) {

        int count = 0;

        String wordLowerCase = word.toLowerCase();

        for (int i = 0; i < wordLowerCase.length(); i++) {
            if (wordLowerCase.charAt(i) == 'a' || wordLowerCase.charAt(i) == 'e' || wordLowerCase.charAt(i) == 'i' ||
                    wordLowerCase.charAt(i) == 'o' || wordLowerCase.charAt(i) == 'u' || wordLowerCase.charAt(i) == 'y') {
                count++;
            }
        }
        return count;
    }
}
