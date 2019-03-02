package ua.com.foxminded;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    public String makeAnagram(String sentence) {
        List<String> w = new ArrayList<String>();
        String[] arrayOfWord = sentence.split("\\s+");
        ArrayList<String> listOfWord = new ArrayList<String>(Arrays.asList(arrayOfWord));
        
        String anagram = "";
        for(String item : listOfWord) {
            if(item != listOfWord.get(listOfWord.size()-1)) {
                anagram += reverseWord(item) + " ";
            } else {
                anagram += reverseWord(item);
            }
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
