class Solution {
    int N, min;          // 전체 노드 수(N)와 최소 송전탑 개수 차이(min)를 저장하는 변수d
    int[][] map;         // 전력망 연결 정보를 저장하는 이차원 배열
    int[] vst;           // 방문 여부를 저장하는 배열..

    // DFS를 통해 전력망을 탐색하고,, 각 전력망의 송전탑 개수를 계산하며 최소 송전탑 개수 차이를 업데이트하는 함수
    int dfs(int n) {
        vst[n] = 1;      // 현재 노드를 방문했음을 표시
        int child = 1;   // 현재 노드를 포함한 송전탑 개수를 저장하는 변수

        // 현재 노드와 연결된 모든 노드에 대해 탐색
        for (int i = 1; i <= N; i++) {
            if (vst[i] == 0 && map[n][i] == 1) { //
                vst[i] = 1;                       // 해당 노드를 방문했음을 표시
                child += dfs(i);                  // 해당 노드에서 재귀적으로 탐색하고, 송전탑 개수를 누적
            }
        }
        // 해당 서브트리의 송전탑 개수와 나머지 전력망의 송전탑 개수 차이를 계산하여 최소값 갱신
        min = Math.min(min, Math.abs(child - (N - child)));
        return child;  // 현재 서브트리의 송전탑 개수 반환
    }

    // 전력망을 구성하고 최소 송전탑 개수 차이를 계산하는 함수
    public int solution(int n, int[][] wires) {
        N = n;                             // 전체 노드 수 저장
        min = n;                           // 최소 송전탑 개수 차이 초기화
        map = new int[n+1][n+1];          // 전력망 연결 정보를 저장하는 이차원 배열 초기화
        vst = new int[n+1];               // 방문 여부를 저장하는 배열 초기화

        // 전력망 연결 정보 입력
        for (int[] wire : wires) {
            int a = wire[0], b = wire[1];
            map[a][b] = map[b][a] = 1;   // 두 노드가 연결되어 있음을 표시
        }

        dfs(1);  // DFS 탐색 시작 (시작 노드는 1로 가정)
        return min;  // 최소 송전탑 개수 차이 반환
    }
}
