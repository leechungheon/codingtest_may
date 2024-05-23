import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        Solution sol=new Solution();
        System.out.println("답 : "+sol.solution(s));
    }
}
