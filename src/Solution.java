class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] array_string=s.split(" ");
        System.out.println("array.string.length : "+array_string.length);
        for(int i=0; i<array_string.length; i++) {
            System.out.print(array_string[i]+" ");
        }
        int[] array_int=new int[array_string.length];
        for(int i=0; i<array_string.length; i++){
            if(!array_string[i].equals("Z")){
                array_int[i]=Integer.parseInt(array_string[i]);
            }else{
                if(i>0)array_int[i]=-1*array_int[i-1];
            }
        }
        for(int i=0; i<array_int.length; i++){
            answer+=array_int[i];
        }

        return answer;
    }
}