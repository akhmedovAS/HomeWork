
public class Anagram {

    String userWord;

    Anagram(String userWord) {
        this.userWord = userWord;
    }


    public String getAnagram(String userWord) {
        String[] array = userWord.split("");
        String temp;

        temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        userWord = String.join("", array);
        return userWord;
    }

}
