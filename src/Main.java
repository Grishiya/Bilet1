public class Main {
    //    public static void returnArray(int[] returnArray) {
////        for (int i=array.length-1;i>=0;i--) {
////            System.out.println(array[i]);
//
//        for (int i = 0; i < returnArray.length / 2; i++) {
//            int reverseArray = returnArray[i];
//            returnArray[i] = returnArray[returnArray.length - 1 - i];
//            returnArray[returnArray.length - 1 - i] = reverseArray;
//            System.out.println(returnArray[i]);
//
//        }
//    }
    public static int[] array(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        return arr;
    }
        public static void main (String[]args){
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        returnArray(arr);
            int[] arr = {1, 2, 3};
            array(arr);
        }

    }

