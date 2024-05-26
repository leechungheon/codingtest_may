class Solution {
    public long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
        long answer = -1;
        long left=1;
        long right=(long)(10e9*2*10e5*2);
        int len=s.length;

        while(left<=right){
            long mid=(left+right)/2; //운반 시간 지정

            //도시 순회
            int gold=0, silver=0, sum=0;
            for(int i=0; i<len; i++){
                int weight=w[i];
                int time=t[i];

                long cnt=mid/(time*2);
                //몇 번 왕복운반 가능한 지
                if((mid%(time*2))>=time){
                    cnt++;
                }
                gold+=Math.min(g[i], weight*cnt);//min함수내 더 작은 것 대입
                silver+=Math.min(s[i], weight*cnt);
                sum+=Math.min(g[i]+s[i], weight*cnt);
            }
            if(gold>=a&&silver>=b && sum>=a+b){
                answer=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

        return answer;
    }
}