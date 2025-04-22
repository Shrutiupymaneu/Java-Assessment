public class VowelCounter {
    public static String mostVowels(String[] words) {
        String result = "";
        int max = 0;
        for (String word : words) {
            int count = 0;
            for (char c : word.toLowerCase().toCharArray()) {
                if ("aeiou".indexOf(c) != -1) count++;
            }
            if (count > max) {
                max = count;
                result = word;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"hello", "world", "beautiful", "java", "programming"};
        System.out.println("Word with most vowels: " + mostVowels(words));
    }
}