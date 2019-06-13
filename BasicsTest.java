public class BasicsTest{
    public static void main(String[] args) {
        Basics test = new Basics();
        // Part 1
        System.out.println("Part 1: ");
        test.printNum(1,255);
        // Part 2
        System.out.println("Part 2: ");
        test.printOdd(255);
        // Part 3
        System.out.println("Part 3: ");
        test.printSum(255);
        // Part 4
        System.out.println("Part 4: ");
        int[] arr = {1,2,3,4};
        test.printArr(arr);
        // Part 5
        System.out.println("Part 5: ");
        test.printMax(arr);
        // Part 6
        // different array is being used 
        System.out.println("Part 6: ");
        int[] arr1 = {10,2,3};
        test.getAvg(arr1);
        //Part 7
        System.out.println("Part 7: ");
        test.ArrOdd(255);
        // Part 8
        System.out.println("Part 8: ");
        test.greaterThanY(arr, 2);
        // Part 9
        System.out.println("Part 9: ");
        System.out.println("Non-squared array: " + arr1[0] + " , " + arr1[1] + " , " + arr1[2]);
        test.squareArr(arr1);
        System.out.println("squared array: " + arr1[0] + " , " + arr1[1] + " , " + arr1[2]);
        // Part 10 
        System.out.println("Part 10: ");
        int[] arr3 = {1,2,4, -1,-2,-4};
        test.replaceNegatives(arr3);
        // Part 11 
        System.out.println("Part 11: ");
        int[] arr4 = {1,2,4, -1,-2,-4,5,22};
        int[] arr5 = test.MaxMinAvg(arr4);
        System.out.println("Max is: " + arr5[0] + " , Min is:" + arr5[1] + " , Avg is: " + arr5[2]);
    }
}
