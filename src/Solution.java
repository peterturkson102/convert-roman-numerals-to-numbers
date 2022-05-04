class Solution {
    public static int romanToInt(String s) {
        int sum = 0;
        int[] arrr=new int[s.length()];
        for(int i=0;i<s.length();i++){
            arrr[i]= s.charAt(i);
            switch(s.charAt(i)){
                case 'I':
                    arrr[i] = 1;
                    break;
                case 'V':
                    arrr[i] = 5;
                    break;
                case 'X':
                    arrr[i] = 10;
                    break;
                case 'L':
                    arrr[i] = 50;
                    break;
                case 'C':
                    arrr[i] = 100;
                    break;
                case 'D':
                    arrr[i] = 500;
                    break;
                case 'M':
                    arrr[i] = 1000;
                    break;


            }

        }

        for(int ty =0;ty<arrr.length-1;ty++){
            if(arrr[ty+1]>arrr[ty]){
                arrr[ty]=-(arrr[ty]);
            }
        }

        for(int tt =0;tt<arrr.length;tt++){
            sum =sum + arrr[tt];
        }
        return sum;
    }

    public static void main(String[] args) {
        String m = "XIX";
        int number = Solution.romanToInt(m);
        System.out.println(number);
    }
}