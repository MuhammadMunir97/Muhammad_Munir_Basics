import java.util.ArrayList;
public class Basics{
    public void printNum(int start, int end){
        for (int i=start;i<= end;i++){
            System.out.println(i);
        }
    }
    public void printOdd(int end){
        for (int i=1;i<= end;i+=2){
            System.out.println(i);
        }
    }
    public void printSum(int end){
        int sum = 0;
        for (int i=0;i<= end;i++){
            sum += i;
            System.out.println(i + "  sum is: " + sum);
        }
    }
    public void printArr(int Arr []){
        int sum = 0;
        for (int i=0;i< Arr.length;i++){
            System.out.println(Arr[i]);
        }
    }
    public void printMax(int Arr []){
        int Max = Arr[0];
        for (int i=0;i< Arr.length;i++){
            if (Arr[i]> Max){
                Max = Arr[i];
            }
        }
        System.out.println("Max is: " + Max);
    }
    public void getAvg(int Arr []){
        int sum = 0;
        for (int i=0;i< Arr.length;i++){          
            sum += Arr[i];
        }
        System.out.println("Average is: " + (sum/Arr.length));
    }
    public void ArrOdd(int end){
        ArrayList<Integer> Arr = new ArrayList<Integer>();
        for (int i=1;i<= end;i+=2){
           Arr.add(i);
        }
        System.out.println(Arr);
    }
    public void greaterThanY(int Arr [], int y){
        int val =0;
        for (int i=0;i< Arr.length;i++){
            if (Arr[i] > y){
                val++;
            }
        }
        System.out.println(val);
    }
    public void squareArr (int Arr []){
        for (int i=0;i<Arr.length;i++){
            Arr[i]=Arr[i]*Arr[i];
        }
    }
    public void replaceNegatives (int Arr []){
        for (int i=0;i<Arr.length;i++){
            if (Arr[i]<0){
                Arr[i] = 0;
            }
            System.out.println("newVal at arr[" + i + "]is: " + Arr[i]);  
        }
    }
    public int[] MaxMinAvg (int Arr[]){
        int[] newArr = {Arr[0],Arr[0],0};
        for (int i = 0; i< Arr.length; i++){
            if (newArr[0]<Arr[i]){
                newArr[0]=Arr[i];
            }
            if (newArr[1]>Arr[i]){
                newArr[1]=Arr[i];
            }
            newArr[2] += Arr[i];
        }
        newArr[2] /= Arr.length;
        return newArr;
    }
    public void shiftValue (int Arr []){
        for (int i=1;i<Arr.length;i++){
           Arr[i-1]= Arr[i];
        }
        Arr[Arr.length -1] = 0;
    }    


}
