import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        Solution sol=new Solution();
        System.out.println(sol.solution(a,b));
    }
}
