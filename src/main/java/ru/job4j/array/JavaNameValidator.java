package ru.job4j.array;

import static java.lang.Character.isUpperCase;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {

        boolean rls = (!name.isEmpty() && !isUpperCase(name.codePointAt(0)) && !Character.isDigit(name.codePointAt(0)));
        if (rls) {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (!Character.isDigit(code) && isNotSpecialSymbol(code) && isNotUpperLatinLetter(code) && isNotLowerLatinLetter(code)) {
                    rls = false;
                    break;
                }
            }
        }
        return rls;
    }

    private static boolean isNotLowerLatinLetter(int code) {
        return code < 97 || code > 122;
    }

    private static boolean isNotUpperLatinLetter(int code) {
        return code < 65 || code > 90;
    }

    private static boolean isNotSpecialSymbol(int code) {
        return code != 36 && code != 95;
    }
}
