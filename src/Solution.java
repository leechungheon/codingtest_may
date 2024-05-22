import java.lang.Math;
class Solution {
    public long solution(int k, int d) { // k 배수만큼 d거리 이하로 좌표 찍기
        long answer = 0;
        int point=0;//찍을 수 있는 점의 개수
        int x,y;
        long dd=(long)d*d;

        for(int i=0; i*k<=d; i++){
            x=i*k;
            for(int j=0; j*k<=d; j++){
                y=j*k;

                long xx=(long)x*x;
                long yy=(long)y*y;
                if(xx + yy > dd){

                }else{
                    //System.out.println(x+","+y+" ");
                    point++;
                }
            }
        }
        answer=point;
        return answer;
    }
}