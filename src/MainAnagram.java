import java.util.Scanner;

public class MainAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово:");
        String userWord = scanner.nextLine();

        Anagram anagram = new Anagram(userWord);

        System.out.println("Анаграмма на слово  - " + anagram.getAnagram(userWord));

    }
}
