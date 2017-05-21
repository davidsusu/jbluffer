package hu.webarticum.jbluffer;

import java.text.Normalizer;

import nl.flotsam.xeger.Xeger;

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
        return new Xeger(regex).generate();
    }
    
}
