import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt(), q = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];

        long sum1 = 0, sum2 = 0;
        HashSet<Long> set1 = new HashSet<>(); 
        HashSet<Long> set2 = new HashSet<>();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum1 += a[i];
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            sum2 += b[i];
        }

        for (int num : a) {
            set1.add(sum1 - num); 
        }

        for (int num : b) {
            set2.add(sum2 - num); 
        }

        while (q-- > 0) {
            boolean flag = false;
            int x = sc.nextInt();

            for (int i = 1; i * i <= Math.abs(x); i++) {
                if (x % i == 0) {
                    int num1 = i;
                    int num2 = x / i;

                    boolean c1 = set1.contains((long) num1);
                    boolean c2 = set2.contains((long) num2);
                    boolean c3 = set1.contains((long) num2);
                    boolean c4 = set2.contains((long) num1);
                    boolean c5 = set1.contains(-(long) num1);
                    boolean c6 = set2.contains(-(long) num2);
                    boolean c7 = set1.contains(-(long) num2);
                    boolean c8 = set2.contains(-(long) num1);

                    if (c1 && c2 || c3 && c4 || c5 && c6 || c7 && c8) {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
