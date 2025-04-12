public class ArrayUtility {

    public static void print(int[] array) {
        for(int i =0; i<array.length; i++){
            System.out.print(array[i]);
            if(i< array.length-1){
                System.out.print(", ");
            }
        }
    }

    public static int sum(int[] array) {
        int sum=0;
        for(int num:array){
            sum= sum+num;
        }
        return sum;
    }

    public static double average(int[] array) {
        int sum=0;
        for(int num: array){
            sum=sum+num;
        }
        double average= (double)sum/(array.length);
        return Math.floor(average * 100.0)/100.0;
    }

    public static int minimum(int[] array) {
        int min=array[0];
        for(int num:array){
            if(num<min){
                min=num;
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max=array[0];
        for(int num:array){
            if(num>max){
                max=num;
            }
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int even=0;
        for(int num:array){
            if(num%2==0){
                even++;
            }
        }
        return even;
    }

    public static int[] reverseOne(int[] array) {
        int[] reversed=new int[array.length];
        for(int i=0;i<array.length;i++){
            reversed[i]=array[array.length-1-i];
        }
        return reversed;
    }

    public static void reverseTwo(int[] array) {
        for(int i=0;i<array.length/2;i++){
            int temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for(int i=0; i<array.length;i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for(int i=0; i<array.length; i++){
            if (array[i].equals(str)){
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for(int i=0; i<array.length; i++){
            array[i]=array[i]*2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for(int i=0; i<array.length; i++){
            array[i]=array[i]*n;
        }
    }

    public static String toString(int[] array) {
        String total= new String("");
        for(int i=0; i<array.length-1; i++){
            String temp=Integer.toString(array[i]);
            total=total+temp+", ";
        }
        String last=Integer.toString(array[array.length-1]);
        total=total+last;
        return total;
    }

    public static boolean twoSum(int[] array, int num) {
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]+array[i]==num){
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int temp=array[0];
        array[0]=array[array.length-1];
        for(int i=1; i<array.length; i++){
            int temp1=array[i];
            array[i]=temp;
            temp=temp1;
        }
    }

    public static void shiftLeft(int[] array) {
        int temp=array[array.length-1];
        array[array.length-1]=array[0];
        for(int i=0; i<array.length-1; i++){
            array[i]=array[i+1];
        }
        array[array.length-2]=temp;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for(int i=0; i<n; i++){
            shiftRight(array);
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for(int i=0; i<n; i++){
            shiftLeft(array);
        }
    }


}
