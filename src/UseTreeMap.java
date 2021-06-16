import java.util.Scanner;
import java.util.TreeMap;

public class UseTreeMap {

    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        String[] strings = string.split("");
        for (String s : strings) {
            if (!treeMap.containsKey(s)) {
                treeMap.put(s, 1);
            } else {
                treeMap.put(s, treeMap.get(s) + 1);
            }
        }
        System.out.println(treeMap);
    }
}
