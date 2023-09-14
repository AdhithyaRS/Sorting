package sorting;
public class Sorting {

	public static void main(String[] args) {
		// Create a random array of integers for testing
        int n = 1000000;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr1[i] = (int) (Math.random() * 10000);
            arr2[i] = arr1[i];
            arr3[i] = arr1[i];
        }

        // Measure time and run Merge Sort
        long startTime = System.currentTimeMillis();
        MergeSort.mergeSort(arr1, 0, arr1.length - 1);
        long endTime = System.currentTimeMillis();
        System.out.println("Merge Sort Time: " + (endTime - startTime) + "ms");

        // Measure time and run Quick Sort
        startTime = System.currentTimeMillis();
        QuickSort.quickSort(arr2, 0, arr2.length - 1);
        endTime = System.currentTimeMillis();
        System.out.println("Quick Sort Time: " + (endTime - startTime) + "ms");

        // Measure time and run Heap Sort
        startTime = System.currentTimeMillis();
        HeapSort.heapSort(arr3);
        endTime = System.currentTimeMillis();
        System.out.println("Heap Sort Time: " + (endTime - startTime) + "ms");


	}

}
