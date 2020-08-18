public class SelectionSort {

    public static void main(String[] args) {

    int[] a = new int[]{40,34,21,0,65,78,12,-13,2,30,76,-3,100,15,235,23,20};

        for (int i = 0; i < a.length; i++) {

        int min = a[i];
        int imin = i;
        
        for (int j = i + 1; j < a.length; j++) {

        if (a[j] < min) {
        min = a[j];
        imin = j;
            }
        }


        if (i != imin) {
        int temp = a[i];
        a[i] = a[imin];
        a[imin] = temp;
            }
        System.out.print(a[i] + " ");
        }
    }
}