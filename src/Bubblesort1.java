
public class Bubblesort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};  
          int n=arr.length,temp=0;
     
         System.out.println("Array Before Bubble Sort");  
         for(int i=0; i < n; i++){  
                 System.out.print(arr[i] + " ");  
                 
         }  
         for(int i=0; i < n; i++){  
             for(int j=1; j < (n-i); j++){  
                      if(arr[j-1] > arr[j]){  
                          
                             temp = arr[j-1];  
                             arr[j-1] = arr[j];  
                             arr[j] = temp;  
                     }  
                      
             }  
     } 
         System.out.println("\nArray After Bubble Sort");  
         for(int i=0; i < arr.length; i++){  
                 System.out.print(arr[i] + " "); 
         }
	}
}

	


