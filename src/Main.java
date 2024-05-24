import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Solution sol=new Solution();
        int g[]={70,70,0};
        int s[]={0,0,500};
        int w[]={100,100,2};
        int t[]={4,8,1};
        System.out.println(sol.solution(90,500,g,s,w,t));
    }
}