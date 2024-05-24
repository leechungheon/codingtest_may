class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        //주어진 변이 가장 큰 변일 때
        if(sides[0]>=sides[1]){
            for(int i=1; i<sides[0]; i++){
                if(i+sides[1]>sides[0])answer++;
            }
        }else{
            for(int i=1; i<sides[1]; i++){
                if(i+sides[0]>sides[1])answer++;
            }
        }
        //추가된 변이 가장 큰 변일 때
        int large=0;
        if(sides[0]>=sides[1])large=sides[0];
        else {large=sides[1];}
        for(int i=large; i<sides[0]+sides[1]; i++){
            answer++;
        }
        return answer;
    }
}