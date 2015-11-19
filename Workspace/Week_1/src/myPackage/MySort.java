package myPackage;
import javax.swing.JOptionPane;

public class MySort {

	public int[] sortInt(int[] ar){

		for (int i = (ar.length - 1); i >= 0; i--)
		   {
		      for (int j = 1; j <= i; j++)
		      {
		         if (ar[j-1] > ar[j])
		         {
		              int temp = ar[j-1];
		              ar[j-1] = ar[j];
		              ar[j] = temp;
		         }
		      } 
		    }
		return ar;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrayCount = Integer.parseInt(JOptionPane.showInputDialog("How many numbers will you be entering?"));
		int[] arrayToSort = new int[arrayCount];
		for(int i = 0; i < arrayCount; i++)
		{
			arrayToSort[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter number."));
		}
		
		//MySort sorter = new MySort();
		//arrayToSort = sorter.sortInt(arrayToSort);
		Sort.Ascending(arrayToSort);
		for(int i = 0; i < arrayToSort.length; i++)
		{
			System.out.println(arrayToSort[i]);
		}
	}

}
