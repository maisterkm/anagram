package ua.com.foxminded;

public class Anagram {
    public String makeAnagram(String sentence) {
        String[] wordArr = sentence.split("\\u0020");
        String anagram = "";
        for(String item : wordArr) {
            anagram += reverseWord(item) + " ";
        }
        return anagram;
    }
     
    private String reverseWord(String word) {
        char[] characters = word.toCharArray();
        int begin = 0;
        int end = characters.length-1;
        char temp;
        while(end>begin) {
            if(Character.isLetter(characters[begin]) && Character.isLetter(characters[end])) {
                temp = characters[begin];
                characters[begin] = characters[end];
                characters[end] = temp;
                begin++;
                end--;
            } else if(!Character.isLetter(characters[begin])) {
                begin++;
            } else if (!Character.isLetter(characters[end])) {
                end--;
            }
        }
        return new String(characters);
    }
}
