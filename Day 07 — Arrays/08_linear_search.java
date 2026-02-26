/*
========================================
08_linear_search.java
========================================
Linear Search:

✔ Search element by checking each array element
✔ Returns index if found, else -1
*/

public class linear_search {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        int index = -1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                index = i;
                break;
            }
        }

        if(index != -1) {
            System.out.println(key + " found at index " + index);
        } else {
            System.out.println(key + " not found");
        }
    }
}