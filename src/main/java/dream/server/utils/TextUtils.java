package dream.server.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class TextUtils {
    public static String normaliseLineEndings(String input) {
        if (input == null) {
            return null;
        }

        return input.replaceAll("\r\n", "\n");
    }
}
