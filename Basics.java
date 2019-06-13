public class Basics{
    public void printNum(int start, int end){
        for (var i=start;i<= end;i++){
            System.out.println(i);
        }
    }
    public void printOdd(int end){
        for (var i=1;i<= end;i+=2){
            System.out.println(i);
        }
    }
    public void printSum(int end){
        int sum = 0;
        for (var i=0;i<= end;i+=2){
            sum += i;
            System.out.println(i + "sum is: " + sum);
        }
    }
    public void printArr(int Arr []){
        int sum = 0;
        for (var i=0;i<= Arr.length;i+=2){
            System.out.println(Arr[i]);
        }
    }
    public Integer printMax(int Arr []){
        int Max = Arr[0];
        for (var i=0;i<= Arr.length;i+=2){
            if (Arr[i]> Max){
                Max = Arr[i];
            }
        }
        return Max;
    }
    



}
