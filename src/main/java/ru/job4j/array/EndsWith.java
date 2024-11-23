package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = false;
        int z = word.length - 1;
        for (int i = postfix.length - 1; i > 0; i--) {
            if (postfix[i] != word[z]) {
                break;
            }
            z--;
            result = true;
        }
        return result;
    }
}
