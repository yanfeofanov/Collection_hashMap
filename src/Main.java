import java.lang.reflect.Array;
import java.util.*;


public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        List<Integer> nums = generateInt(10);
        System.out.println("Сгенерированные числа " + nums);
        task1(nums);
        task2(nums);
        task3(List.of("Test","test","TEST","teST","test","test"));
        task4(List.of("Test","test","TEST","teST","test","test"));
    }

    private static void task1(List<Integer> nums) {
        System.out.println("Task 1");
        for (Integer number : nums) {
            if (number % 2 == 1) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void task2(List<Integer> nums) {
        System.out.println("Task 2");
        Set<Integer> set = new TreeSet<>(nums);
        for (Integer numbers : set) {
            if (numbers % 2 == 0) {
                System.out.print(numbers + " ");
            }
        }
        System.out.println();
    }

    private static void task3(List<String> words){
        System.out.println("Task 3");
        for(String word : words) {
            if (Collections.frequency(words, word) == 1) {
                System.out.print(word + " ");
            }
        }
        System.out.println();
    }

    public static void task4(List<String> words){
        System.out.println("Task 4");
        Map<String ,Integer> map = new TreeMap<>();
        for(String word : words){
            if(!map.containsKey(word)){
                map.put(word,1);
            }else {
                map.put(word,map.get(word) + 1 );
            }
        }
        System.out.println(map);
    }

    public static List<Integer> generateInt(int n) {
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(RANDOM.nextInt(5));
        }
        return list;
    }

}