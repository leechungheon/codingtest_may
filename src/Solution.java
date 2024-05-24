class Solution {
    public String solution(String letter) {
        String answer ="";
        StringBuilder sb=new StringBuilder();
        String[] s={
                ".-", "-...", "-.-.", "-..",
                ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-",
                "-.--", "--.."};
        String[] alpha = {"a", "b", "c", "d", "e", "f", "g",
                "h", "i", "j", "k", "l", "m", "n",
                "o", "p", "q", "r", "s", "t", "u",
                "v", "w", "x", "y", "z"};

        String[] let=letter.split(" ");
        for(int i=0; i<let.length; i++){
            for(int j=0; j<s.length; j++){
                if(let[i].equals(s[j])){
                    sb.append(alpha[j]);
                }
            }
        }
        answer=sb.toString();
        return answer;
    }
}