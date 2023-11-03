package hw7.basic;

/*
5. Напишите метод, который проверяет, все ли символы в заданной строке являются гласными (a, e, i, o, u) или нет.
Верните true, если каждый символ строки является гласным, иначе верните false.
Дано:
AIEEE
Ожидаемый результат:
true
 */
public class Task6 {
    public static void main(String[] args) {

        String str = "AIEBEE";

        Boolean result = allCharactersVowels(str);
        System.out.println(result);
    }

    private static Boolean allCharactersVowels(String str) {

        String wordLowerCase = str.toLowerCase();
        boolean result = true;

        for (int i = 0; i < wordLowerCase.length(); i++) {
            if (!(wordLowerCase.charAt(i) == 'a' || wordLowerCase.charAt(i) == 'e' || wordLowerCase.charAt(i) == 'i' ||
                    wordLowerCase.charAt(i) == 'o' || wordLowerCase.charAt(i) == 'u' || wordLowerCase.charAt(i) == 'y')) {
                result = false;
                break;
            }
        }
        return result;
    }
}
