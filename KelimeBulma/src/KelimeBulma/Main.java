package KelimeBulma;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz: ");
        String sentence = scan.nextLine();

        // Metini kelimelere ayırmak için split metodu kullanılır.
        String[] words = sentence.split(" ");

        // Kelimelerin kaç kez tekrarlandığını takip etmek için bir HashMap kullanılır.
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        // Metindeki her kelime gezilir.
        for (String word : words) {
            // Kelimenin tekrar sayısı alınır.
            Integer counter = hashMap.get(word);

            // Eğer kelime daha önce eklenmemişse, 1 kez olarak eklenir.
            if (counter == null) {
                hashMap.put(word, 1);
            } else {
                // Eğer kelime zaten ekliyse, tekrar sayısı bir artırılır.
                hashMap.put(word, counter + 1);
            }
        }

        String mostUsedWord = null;
        int mostUsedWordsVal = 0;

        // En çok tekrarlanan kelimeyi bulmak için HashMap gezilir.
        for (String word : hashMap.keySet()) {
            int wordValue = hashMap.get(word);

            // Şu ana kadar en çok tekrarlanan kelimenin yerine yeni kelime atanır.
            if (wordValue > mostUsedWordsVal) {
                mostUsedWord = word;
                mostUsedWordsVal = wordValue;
            }
        }

        // En çok tekrarlanan kelime ve tekrar sayısı ekrana yazdırılır.
        System.out.println("En çok kullanılan kelime: " + mostUsedWord);
        System.out.println("Bu kelime cümle içerisinde " + mostUsedWordsVal+ " kez kullanıldı.");
    }
}