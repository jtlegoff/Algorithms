package myPackage;

public final class Sort {

	private Sort(){
		
	}
	
	public static int[] Ascending(int[] array){
		
		for (int i = (array.length - 1); i >= 0; i--)
		   {
		      for (int j = 1; j <= i; j++)
		      {
		         if (array[j-1] > array[j])
		         {
		              int temp = array[j-1];
		              array[j-1] = array[j];
		              array[j] = temp;
		         }
		      } 
		    }
		return array;
	}
	
	public static int[] Descending(int[] array){
		
		for (int i = (array.length - 1); i >= 0; i--)
		   {
		      for (int j = 1; j <= i; j++)
		      {
		         if (array[j-1] < array[j])
		         {
		              int temp = array[j-1];
		              array[j-1] = array[j];
		              array[j] = temp;
		         }
		      } 
		    }
		return array;
	}
	
}
