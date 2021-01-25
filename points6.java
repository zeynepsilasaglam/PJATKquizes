public class points6 {
    public static void main(String[] args) {
        int points = 0;
        int[] x = {1, 2, 3};
        int[] y = {4, 5, 6, 7};
        int[] sum = arraySum(x, y);
        if (sum.length == 3 && sum[0] == 5 && sum[1] == 7 && sum[2] == 9) {
            points++;
        }
        int lengthWeWant = 21;
        int min = 30;
        int max = 100;
        int[] z = generateRandomArrayInRange(lengthWeWant, min, max);
        sortBy3Elemenets(z);
        if (checkSortBy3Elements(z)) {
            points += 2;
        }
        System.out.println("I have " + points);
    }

    public static boolean checkSortBy3Elements(int[] array) {
        for (int i = 0; i < array.length; i += 3) {
            if (array[i] > array[i + 1]) return false;
            if (array[i + 1] > array[i + 2]) return false;
        }
        return true;
    }

    // TIP: start here
    public static int[] arraySum(int[] array1, int[] array2) {
        int newlenght;
        if (array1.length == array2.length) {
            newlenght = array1.length;
        } else if (array1.length < array2.length) {
            newlenght = array1.length;
        } else {
            newlenght = array2.length;
        }
        int[] result = new int[newlenght];
        for (int i = 0; i < newlenght; i++) {
            result[i] = array1[i] + array2[i];
        }
        return result;
    }
    public static int[]  generateRandomArrayInRange(int lengthWeWant, int min,int max){
        int[] arr = new int[lengthWeWant];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*(max-min+1))+min;
        }
        return arr;
    }
    public static int[] sortBy3Elemenets(int [] arr) {
        for (int i = 0; i < arr.length; i += 3) {
            int temp = 0;
            // Insert arr[1]
            if (arr[i+1] < arr[i]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

            // Insert arr[2]
            if (arr[i + 2] < arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i + 2];
                arr[i + 2] = temp;

                if (arr[i+1] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
}



