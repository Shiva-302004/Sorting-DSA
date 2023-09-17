//sort the given array such that all the element are arraged alphabetically(lexicographical).

public class selectionsortquestion {
    
    
    static String[] selectionsortquestion1(String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[min_index].compareTo(arr[j]) < 0) {
                    min_index = j;
                }

                String temp = arr[min_index];
                arr[min_index] = arr[j];
                arr[j] = temp;
            }
        }

        return arr;
    }
    public static void main(String[] args) {

        String[] fruits = { "mango", "apple", "grapes", "jackfruit", "pumpkin" };
        // selectionsortquestion1(fruits);
        selectionsortquestion1(fruits);
        for (String i : fruits) {
            System.out.print(i + " ");

        }

    }

}
