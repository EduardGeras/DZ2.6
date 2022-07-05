import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    // Задание 1
    private static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // Задание 2
    private static void task2() {
        Set<Integer> nums = new TreeSet<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // Задание 3
    private static void task3() {
        Set<String> words = new HashSet<>(List.of("слова", "слова", "слово", "словечко", "словечко", "словосочетание"));
        System.out.println(words);
    }

    // Задание 4
    private static void task4() {
        List<String> words = new ArrayList<>(List.of("слова", "слова", "слова", "слово", "словечко", "словечко", "словосочетание"));
        Map<String, Integer> words2 = new HashMap<>();

        for (String word : words) {
            if (words2.containsKey(word)) {
                words2.put(word, words2.get(word) + 1);
            } else {
                words2.put(word, 1);
            }
        }
            for (Map.Entry<String, Integer> entry : words2.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey() + " в " + entry.getValue() + " экземплярах");
                }
            }
    }

}