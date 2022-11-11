package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        char[] isText = name.toCharArray();
        for (int i = 0; i < isText.length; i++) {
            int code = name.codePointAt(i);
            if (isSpecialSymbol(code) || isUpperLatinLetter(code) || isLowerLatinLetter(code) || isDigit(code)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        if (code == 96 || code == 36) {
            return true;
        }
        return false;
    }

    public static boolean isUpperLatinLetter(int code) {
        if (code >= 65 && code <= 90) {
            return true;
        }
        return false;
    }

    public static boolean isLowerLatinLetter(int code) {
        if (code >= 97 && code <= 122) {
            return true;
        }
        return false;
    }

    public static boolean isDigit(int code) {
        if (code >= 48 && code <= 57) {
            return true;
        }
        return false;
    }
}