
    public class BinarySearchWord {
        static int binarySearch(String[] arr, String srch) {

            int l = 0, r = arr.length - 1;

            while (l <= r) {


                int m = (l + r) / 2;
                int res = srch.compareTo(arr[m]);

                /*
                 * Check if srch value is present at mid
                 */
                if (res == 0)
                    return m;

                /*
                 * If srch value greater than midpoint value then ignore the left half
                 */
                if (res > 0)
                    l = m + 1;

                    /*
                     * If srch value is smaller than midpoint ignore the right half
                     */
                else
                    r = m - 1;
            }
            /**
             * else return -1 to print element is not found
             */
            return -1;
        }

        public static void main(String[] args) {
            String[] arr = {"Delhi", "Karnataka", "Kerala", "Noida"};
            String srch = "Delhi";

            int result = binarySearch(arr, srch);

            if (result == -1)
                System.out.println("Element not present");
            else
                System.out.println("Element found at " + "index " + result);
        }


    }