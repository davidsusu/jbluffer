package hu.webarticum.jbluffer;

import java.text.Normalizer;

public final class Util {
    
    private Util() {}
    
    public static String normalizeString(String input) {
        return Normalizer.normalize(input, Normalizer.Form.NFD)
            .replaceAll("\\p{M}", "")
            .replaceAll("\\W+", " ")
            .toLowerCase()
            .trim()
        ;
    }
    
    public static String createStringByRegex(String regex) {
        // TODO
        return "some-password";
    }
    
}
