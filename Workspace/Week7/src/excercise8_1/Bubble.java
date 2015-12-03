package excercise8_1;

public class Bubble {
	
	String[] data = {"cat", "apple", "apple", "george", "neit",};
	
	
	public String[] sort(String[] data){
		long start, stop, elapsed;
		start = System.currentTimeMillis();
		int length = data.length;
		
		for(int pass = 1; pass < length; pass++) {
			System.out.println("Pass = " + pass);
			for(int compares = 0; compares < length - pass; compares++){
				if(data[compares].compareTo(data[compares + 1]) < 0){
					String temp = data[compares];
					data[compares] = data[compares + 1];
					data[compares + 1] = temp;
				}
			}
		}
	
		stop = System.currentTimeMillis();
		elapsed = stop - start;
		System.out.println("Elapse: " + elapsed);
	
		return data;
	}
	
	
	public void printData() {
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
	}

