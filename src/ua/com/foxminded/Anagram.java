package ua.com.foxminded;

public class Anagram {
	
    public String makeAnagram(String sentence) {
        return reverseString(sentence);
    }
	 
    private String reverseWord(String word) {
        char[] inputArr = word.toCharArray();
        int begin = 0;
        int end = inputArr.length-1;
        char temp;
        while(end>begin) {
            if(Character.isLetter(inputArr[begin]) && Character.isLetter(inputArr[end])) {
			    temp = inputArr[begin];
			    inputArr[begin] = inputArr[end];
			    inputArr[end] = temp;
			    begin++;
			    end--;
            } else if(!Character.isLetter(inputArr[begin])) {
			    begin++;
            } else if (!Character.isLetter(inputArr[end])) {
			    end--;
            }
        }
        return new String(inputArr);
    }
     
    private String reverseString(String string) {
    	String[] wordArr = string.split("\\u0020");
    	String outputArr = "";
    	for(String item : wordArr) {
    	    outputArr += reverseWord(item) + " ";
        }
        return outputArr;
    }
}