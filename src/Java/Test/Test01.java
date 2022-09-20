package Java.Test;

public class Test01 {
    public static void main(String[] args) {
        int[][] arr = new int[8][7];
        for(int a = 0;a < arr.length;a++){
            arr[a][0] = 1;
            arr[a][6] = 1;
        }
        arr[3][1] = 1;
        arr[3][2] = 1;
        arr[2][2] = 1;
        for(int a = 2,b = 3;a < 4;a++,b++)
            arr[a][b] = 1;
        for(int a = 0; a < arr.length;a++){
            for (int b = 0; b < arr[0].length; b++) {
                arr[0][b] = 1;
                arr[7][b] = 1;
                System.out.print(arr[a][b] + "\t");
            }
            System.out.println(" ");
        }
        mi mi1 = new mi();
        mi1.mi01(arr,1,1);
        System.out.println("==============");
        for(int a = 0;a< arr.length;a++) {
            for (int b = 0; b < arr[0].length; b++)
                System.out.print(arr[a][b] + "\t");
            System.out.println(" ");
        }
    }
}
class mi{
    public boolean mi01(int[][] arr,int x,int y){
        if (arr[6][5] == 2){
            return true;
        }else{
            if (arr[x][y] == 0){
                arr[x][y] = 2;
                if (mi01(arr,x + 1,y))
                    return true;
                else if (mi01(arr,x,y + 1))
                    return true;
                else if (mi01(arr,x - 1,y))
                    return true;
                else if (mi01(arr,x,y - 1))
                    return true;
                else {
                    arr[x][y] = 3;
                    return false;
                }
            }else
                return false;
        }
    }
}
