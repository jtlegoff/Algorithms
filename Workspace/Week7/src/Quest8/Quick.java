package Quest8;

public class Quick {

	void quicksortName(Player[] data){
		if(data.length < 2)
			return;
		int max = 0;
		
		for(int i = 1; i < data.length; i++)
			if (((Comparable)data[max].getName()).compareTo(data[i].getName()) < 0)
				max = i;
			swap(data, data.length-1, max);
			quicksortName(data, 0, data.length-2);
	}
	
	void quicksortName(Player[] data, int first, int last){
		int lower = first + 1, upper = last;
		swap(data, first, (first+last)/2);
		Comparable bound = (Comparable)data[first].getName();
		
		while(lower <= upper){
			while(bound.compareTo(data[lower].getName()) > 0)
				lower++;
			while (bound.compareTo(data[upper].getName()) < 0)
				 upper--;
			if(lower < upper)
				swap(data, lower++, upper--);
			else
				lower++;
		}
		swap(data, upper, first);
		
		if(first < upper-1)
			quicksortName(data, first, upper-1);
		if(upper+1 < last)
			quicksortName(data, upper+1, last);
	}
	
	void quicksortAge(Player[] data){
		if(data.length < 2)
			return;
		int max = 0;
		
		for(int i = 1; i < data.length; i++)
			if ((data[max].getAge() < data[i].getAge()))
				max = i;
			swap(data, data.length-1, max);
			quicksortAge(data, 0, data.length-2);
	}
	
	void quicksortAge(Player[] data, int first, int last){
		int lower = first + 1, upper = last;
		swap(data, first, (first+last)/2);
		Comparable bound = (Comparable)data[first].getAge();
		
		while(lower <= upper){
			while(bound.compareTo(data[lower].getAge()) > 0)
				lower++;
			while (bound.compareTo(data[upper].getAge()) < 0)
				 upper--;
			if(lower < upper)
				swap(data, lower++, upper--);
			else
				lower++;
		}
		swap(data, upper, first);
		
		if(first < upper-1)
			quicksortAge(data, first, upper-1);
		if(upper+1 < last)
			quicksortAge(data, upper+1, last);
	}
	
	void swap(Player[] data, int first, int second){
		Player temp = new Player();
		temp = data[first];
		data[first] = data[second];
		data[second] = temp;
	}
	
	void display(Player[] data){
		for(int i = 0; i < data.length; i++){
			System.out.println(data[i].getName() + " Age: " + data[i].getAge());
		}
	}
	
}
