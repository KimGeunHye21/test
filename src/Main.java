import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i<n; i++) list.add(input.nextInt());

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (int value : list) sb.append(value).append('\n');

        System.out.println(sb);

        // 주석추가
    }
}
