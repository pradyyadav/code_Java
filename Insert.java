import java.util.Arrays;
import java.util.Scanner; 
public class Insert {
 
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
   int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

    
   System.out.println("Enter the index of new value : ");
   int Index_position = scan.nextInt();
System.out.println("Enter the new value : ");  
int newValue    = scan.nextInt();

  System.out.println("Original Array : "+Arrays.toString(my_array));     
   
  for(int i=my_array.length-1; i > Index_position; i--){
    my_array[i] = my_array[i-1];
   }
   my_array[Index_position] = newValue;
   System.out.println("New Array: "+Arrays.toString(my_array));
 }
 }
