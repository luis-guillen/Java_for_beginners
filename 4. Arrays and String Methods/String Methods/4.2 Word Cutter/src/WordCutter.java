public class WordCutter
{
    //code the method cutInHalf that returns the first half of the String passed as argument
    public static String cutInHalf(String word) {
        int length = word.length();
        int halfLength = length / 2;

        // Extract the first half of the string
        String firstHalf = word.substring(0, halfLength);

        return firstHalf;
    }
}