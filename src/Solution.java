class Solution {
    public long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
        long answer = -1;
        //시간순대로 오름차순 정렬 후, 운반 완료되는 w[t] 시점에서 시간 구하기-카운팅정렬 사용
        int max=0;
        for(int i=0; i<t.length; i++){
            if(max<t[i])max=t[i];
        }
        int[] count=new int[max+1];
        int[] resultT = new int[t.length];
        int[] resultG = new int[g.length];
        int[] resultS = new int[s.length];
        int[] resultW = new int[w.length];
        int[] result=new int[t.length];
        // 각 원소의 개수를 카운팅 배열에 저장
        for (int i = 0; i < t.length; i++) {
            count[t[i]]++;
        }
        // 카운팅 배열의 누적 합 계산
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }
        // **결과 배열에 원소 저장**
        for (int i = t.length - 1; i >= 0; i--) {//끝인덱스부터 0번째 인덱스
            int index = count[t[i]] - 1;
            resultT[index] = t[i];
            resultG[index] = g[i];
            resultS[index] = s[i];
            resultW[index] = w[i];
            count[t[i]]--;
        }
        // 정렬된 결과를 원래 배열 t에 복사
        for (int i = 0; i < t.length; i++) {
            t[i] = resultT[i];
            g[i] = resultG[i];
            s[i] = resultS[i];
            w[i] = resultW[i];
        }


        return answer;
    }
}