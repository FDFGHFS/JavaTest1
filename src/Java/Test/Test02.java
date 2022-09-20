package Java.Test;

public class Test02 {
    public static void main(String[] args){
       long[] arr = new long[1];
        han h = new han();
        h.han01(arr,30,'A','B','C');
        System.out.println(arr[0]);
    }
}
class han{
    public void han01(long[] arr,int num,char a,char b, char c){
        arr[0] += 1;
        if (num == 1)
            System.out.println(a + "-->" + c);
        else{
            han01(arr,num-1,a,c,b);
            System.out.println(a + "-->" + c);
            han01(arr,num - 1,b,a,c);
        }
    }
}