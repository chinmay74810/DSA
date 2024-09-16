// Here’s the entire explanation in a concise and copyable format for your notes:

// ---

// # Arrays in Java (DSA)

// ### 1. What is an Array?
// - **Array**: A collection of elements of the same type stored in a contiguous block of memory.
// - **Key Characteristics**:
//   - Fixed size
//   - Homogeneous data (same type)
//   - Random access

// ### Syntax:
// ```java
// int[] arr = new int[5];          // Declare and initialize an array
// int[] arr = {1, 2, 3, 4, 5};     // Declare and initialize with values
// ```

// ---

// ### 2. Types of Arrays

// - **1D Array**: 
//   ```java
//   int[] arr = new int[5];
//   ```

// - **2D Array**: 
//   ```java
//   int[][] arr = new int[3][3];   // 3x3 matrix
//   ```

// - **Jagged Array**: 
//   ```java
//   int[][] arr = new int[3][];
//   arr[0] = new int[2];           // Sub-array of length 2
//   arr[1] = new int[4];           // Sub-array of length 4
//   arr[2] = new int[1];           // Sub-array of length 1
//   ```

// ---

// ### 3. Common Operations

// - **Accessing Elements**:
//   ```java
//   arr[2] = 10;     // Set third element to 10
//   int first = arr[0];   // Access first element
//   ```

// - **Iterating Through an Array**:
//   ```java
//   // Using for loop
//   for (int i = 0; i < arr.length; i++) {
//       System.out.print(arr[i] + " ");
//   }

//   // Using for-each loop
//   for (int element : arr) {
//       System.out.print(element + " ");
//   }
//   ```

// - **Iterating Through a 2D Array**:
//   ```java
//   for (int i = 0; i < arr.length; i++) {
//       for (int j = 0; j < arr[i].length; j++) {
//           System.out.print(arr[i][j] + " ");
//       }
//   }
//   ```

// - **Sorting an Array**:
//   ```java
//   Arrays.sort(arr);     // Sort array in ascending order
//   System.out.println(Arrays.toString(arr));
//   ```

// - **Binary Search**:
//   ```java
//   int index = Arrays.binarySearch(arr, 3);  // Search for element 3 in sorted array
//   ```

// ---

// ### 4. Time Complexity of Array Operations
// - **Access**: O(1)
// - **Insertion**: O(1) (at end) or O(n) (with shifting)
// - **Deletion**: O(n)
// - **Search**: O(n) (linear search), O(log n) (binary search)

// ---

// ### 5. Algorithms Using Arrays

// - **Linear Search**:
//   ```java
//   public int linearSearch(int[] arr, int target) {
//       for (int i = 0; i < arr.length; i++) {
//           if (arr[i] == target) return i;
//       }
//       return -1;
//   }
//   ```

// - **Binary Search** (for sorted arrays):
//   ```java
//   public int binarySearch(int[] arr, int target) {
//       int low = 0, high = arr.length - 1;
//       while (low <= high) {
//           int mid = (low + high) / 2;
//           if (arr[mid] == target) return mid;
//           if (arr[mid] < target) low = mid + 1;
//           else high = mid - 1;
//       }
//       return -1;
//   }
//   ```

// - **Reverse an Array**:
//   ```java
//   public void reverseArray(int[] arr) {
//       int left = 0, right = arr.length - 1;
//       while (left < right) {
//           int temp = arr[left];
//           arr[left] = arr[right];
//           arr[right] = temp;
//           left++;
//           right--;
//       }
//   }
//   ```

// - **Find Maximum and Minimum**:
//   ```java
//   public int findMax(int[] arr) {
//       int max = arr[0];
//       for (int i = 1; i < arr.length; i++) {
//           if (arr[i] > max) max = arr[i];
//       }
//       return max;
//   }

//   public int findMin(int[] arr) {
//       int min = arr[0];
//       for (int i = 1; i < arr.length; i++) {
//           if (arr[i] < min) min = arr[i];
//       }
//       return min;
//   }
//   ```

// - **Merge Two Sorted Arrays**:
//   ```java
//   public int[] mergeSortedArrays(int[] arr1, int[] arr2) {
//       int[] result = new int[arr1.length + arr2.length];
//       int i = 0, j = 0, k = 0;

//       while (i < arr1.length && j < arr2.length) {
//           if (arr1[i] < arr2[j]) result[k++] = arr1[i++];
//           else result[k++] = arr2[j++];
//       }

//       while (i < arr1.length) result[k++] = arr1[i++];
//       while (j < arr2.length) result[k++] = arr2[j++];

//       return result;
//   }
//   ```

// ---

// ### 6. Array vs. ArrayList

// - **Array**: Fixed size, can store primitives (e.g., `int[]`), memory-efficient.
// - **ArrayList**: Dynamic size, stores objects (e.g., `ArrayList<Integer>`), more flexible.

// ---

// ### 7. Limitations of Arrays
// - **Fixed Size**: Cannot resize once declared.
// - **Manual Shifting**: Insertions and deletions require shifting elements.
// - **Inefficient Memory Usage**: Wasteful if array size is too large.

// ---

// This covers the essentials of arrays in Java for DSA!


