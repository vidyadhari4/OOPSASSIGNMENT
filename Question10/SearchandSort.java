package sortingandsearching;
public class SearchandSort{
    public static void main(String[] args){
        int a[]={21,16,58,17,14};
        InsertionSort ins=new InsertionSort();
        ins.sort(a);
        ins.printArray(a);
    }
}


class SelectionSort 
{ 
 void sort(int arr[]) 
 { 
 int n = arr.length; 
 
 // One by one move boundary of unsorted subarray 
 for (int i = 0; i < n-1; i++) 
 { 
 // Find the minimum element in unsorted array 
 int min_idx = i; 
 for (int j = i+1; j < n; j++) 
 if (arr[j] < arr[min_idx]) 
 min_idx = j; 
 
 // Swap the found minimum element with the first 
 // element 
 int temp = arr[min_idx]; 
 arr[min_idx] = arr[i]; 
 arr[i] = temp; 
 } 
 } 
 
 // Prints the array 
 void printArray(int arr[]) 
 { 
 int n = arr.length; 
 for (int i=0; i<n; ++i) 
    System.out.print(arr[i]+" "); 
 System.out.println(); 
 }
} 
class InsertionSort 
{ 
 /*Function to sort array using insertion sort*/ 
 void sort(int arr[]) 
 { 
 int n = arr.length; 
 for (int i = 1; i < n; ++i) { 
 int key = arr[i]; 
 int j = i - 1; 
 
 /* Move elements of arr[0..i-1], that are 
 greater than key, to one position ahead 
 of their current position */ 
 while (j >= 0 && arr[j] > key) { 
 arr[j + 1] = arr[j]; 
 j = j - 1; 
 } 
 arr[j + 1] = key; 
 } 
 } 
 
 /* A utility function to print array of size n*/ 
 static void printArray(int arr[]) 
 { 
 int n = arr.length; 
 for (int i = 0; i < n; ++i) 
 System.out.print(arr[i] + " "); 
 
 System.out.println(); 
 } 
}
class BubbleSort 
{ 
 void bubbleSort(int arr[]) 
 { 
 int n = arr.length; 
 for (int i = 0; i < n-1; i++) 
 for (int j = 0; j < n-i-1; j++) 
 if (arr[j] > arr[j+1]) 
 { 
 // swap arr[j+1] and arr[j] 
 int temp = arr[j]; 
 arr[j] = arr[j+1]; 
 arr[j+1] = temp; 
 } 
 } 
 
 /* Prints the array */ 
 void printArray(int arr[]) 
 { 
 int n = arr.length; 
 for (int i=0; i<n; ++i) 
 System.out.print(arr[i] + " "); 
 System.out.println(); 
 } 
}
class BinarySearch 
{ 
 // Returns index of x if it is present in arr[l.. 
 // r], else return -1 
 int binarySearch(int arr[], int l, int r, int x) 
 { 
 if (r >= l) { 
 int mid = l + (r - l) / 2; 
 
 // If the element is present at the 
 // middle itself 
 if (arr[mid] == x) 
 return mid; 
 
 // If element is smaller than mid, then 
 // it can only be present in left subarray 
 if (arr[mid] > x) 
 return binarySearch(arr, l, mid - 1, x); 
 
 // Else the element can only be present 
 // in right subarray 
 return binarySearch(arr, mid + 1, r, x); 
 } 
 
 // We reach here when element is not present 
 // in array 
 return -1; 
 } 
}
class Linearsearch 
{ 
 int search(int arr[], int x) 
 { 
 int n = arr.length; 
 for (int i = 0; i < n; i++) 
 { 
 if (arr[i] == x) 
 return i; 
 } 
 return -1; 
 } 
}
/*import sortingandsearching.InsertionSort;
import sortingandsearching.SelectionSort;
import sortingandsearching.BubbleSort;
import sortingandsearching.BinarySearch;
import sortingandsearching.Linearsearch;*/
//import sortingandsearching;

