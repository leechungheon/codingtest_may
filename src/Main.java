import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        Solution sol=new Solution();
        int[]answer=sol.solution(a,b);
        for(int i=0; i<answer.length; i++){
            System.out.println(answer[i]+",");
        }
    }
}
