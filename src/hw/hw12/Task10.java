package hw.hw12;

//Shuffle String https://leetcode.com/problems/shuffle-string/
public class Task10 {
    public static void main(String[] args) {

        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        String s = "codeleet";
        System.out.println(restoreString(s, indices));

    }

    public static String restoreString(String s, int[] indices) {
        char[] chArray = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            chArray[indices[i]] = s.charAt(i);
        }
        return new String(chArray);
    }

}
