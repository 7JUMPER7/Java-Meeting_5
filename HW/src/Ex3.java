import static org.junit.Assert.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.Test;

public class Ex3 {
    public static String text;

    @Before
    public void before() {
        text = "Test text in the test string";
    }

    @Test
    public void palindrome() {
        boolean result = StringTools.IsPalindrome(text);
        assertEquals(false, result);

        result = StringTools.IsPalindrome("text txet");
        assertEquals(true, result);
    }

    @Test
    public void vowelsCount() {
        int result = StringTools.VowelsCount(text);
        assertEquals(6, result);
    }

    @Test
    public void consonantsCount() {
        int result = StringTools.ConsonantsCount(text);
        assertEquals(17, result);
    }

    @Test
    public void wordCount() {
        int result = StringTools.WordCount(text, "test");
        assertEquals(2, result);
    }
}



class StringTools {
    public static boolean IsPalindrome(String text) {
        String clearText = text.replaceAll("\\W","");
        StringBuilder reversedText = new StringBuilder(clearText).reverse();
        return clearText.equalsIgnoreCase(reversedText.toString());
    }

    public static int VowelsCount(String text) {
        Pattern vowelsPattern = Pattern.compile("(?iu)[aeiouy]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = vowelsPattern.matcher(text);
        
        int vowelsCount = 0;
        while(matcher.find()) {
            vowelsCount++;
        }

        return vowelsCount;
    }

    public static int ConsonantsCount(String text) {
        Pattern consonantsPattern = Pattern.compile("(?iu)[bcdfgjklmnpqstvxzhrw]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = consonantsPattern.matcher(text);
        
        int consonantsCount = 0;
        while(matcher.find()) {
            consonantsCount++;
        }

        return consonantsCount;
    }

    public static int WordCount(String text, String word) {
        Pattern consonantsPattern = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
        Matcher matcher = consonantsPattern.matcher(text);
        
        int wordsCount = 0;
        while(matcher.find()) {
            wordsCount++;
        }

        return wordsCount;
    }
}