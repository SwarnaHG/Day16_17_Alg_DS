public class InsertionSort {
    public static void main(String[] args) {


          //creating instance of class I
        InsertionSort sort = new InsertionSort();


          //taking array of Strings

        String names[] = { "Bangalore", "Hubli", "Kerala", "Delhi", "Maharashtra", "Hyderabad" };

        System.out.println("\nBefore Sorting");

         //calling printArray method from main and print the elements before swapping

        sort.printArray(names);

        System.out.println("\nAfter Sorting");

          //calling sortByInsertion method and print the elements After swapping

        sort.sortByInsertion(names);
        sort.printArray(names);

        Integer values[] = { 45, 19, 25, 64, 76, 11 };

        System.out.println("\nBefore Sorting");
        sort.printArray(values);

        System.out.println("\nAfter Sorting");
        sort.sortByInsertion(values);
        sort.printArray(values);
    }

    public <t extends Comparable<t>> t[] sortByInsertion(t array[]) {


        for (int i = 1; i < array.length; i++) {
            t temp = array[i];
            int j = i;


            while (j > 0 && (array[j - 1].compareTo(temp) > 0)) {
                array[j] = array[j - 1];
                j = j - 1;
            }
            array[j] = temp;
        }
        return array;
    }


    public <t> void printArray(t array[]) {
        System.out.println("Printing the Array : ");
        for (t element : array) {
            System.out.println(element);
        }
    }
}
