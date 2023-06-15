package day22_ArrayList;

public class maxAndMin {
    public static void main(String[] args) {

        int[]  list = {1,2,34,6,7,8,566};

        int max = list[0];
        int min = list[0];

        for(int each : list){
            if(each > max){
                max = each;
            }else if(each < min){
                each = min;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
