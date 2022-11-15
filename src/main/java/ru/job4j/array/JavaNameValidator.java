package ru.job4j.array;

import static java.lang.Character.isUpperCase;
import static java.lang.Character.isDigit;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        char[] isText = name.toCharArray();
        if (!name.isEmpty() && !isUpperCase(name.codePointAt(0))) {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                return code == 96 || code == 36 || code >= 65 && code <= 90 || code >= 97 && code <= 122;
            }
        }
        return false;
    }
}
