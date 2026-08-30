public class MergeSortedArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {4, 5, 6, 7};

        int[] c = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }

            k++;
        }

        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }

        for (int x : c) {
            System.out.print(x + " ");
        }
    }
}