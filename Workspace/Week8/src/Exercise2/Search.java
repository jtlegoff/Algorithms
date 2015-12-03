package Exercise2;

public class Search {

		// fix for exercise 3
		//}else{
		//	upper = index;
		//	index = (index + previous)/2;
		//	if(index == previous) index--;
		//}
	
	String[][] data = {
			{"K0", "Abby Linc", "18", "al@ch.org"},
			{"K1", "John Doe", "23", "jc@abc.com"},
			{"K2", "Janet Basco", "39", "jb@ids.com"},
			{"K3", "Charles River", "64", "cr@neit.edu"},
			{"K4", "Barak Obama", "50", "bo@democrat.gov"},
			{"K5", "Sarah Palin", "44", "sp@republican.gov"},
			{"K6", "John McCain", "72", "jm@it.com"},
			{"K7", "George Bush", "54", "gb@white.com"},
			{"K8", "Al Gore", "56", "ag@vp.edu"},
			{"K9", "Dick Cheney", "60", "dc@vp.gov"},
			{"K10", "Dick Cheney", "60", "dc@vp.gov"}
	};
	
	
	
	public int sequential(String keyToSearch){
		System.out.println("Searching for " + keyToSearch + " using sequential method.");
		int i;
		for (i = 0; i < data.length; i++){
			System.out.println("Read " + i + ", key= " + data[i][0]);
			if(keyToSearch.equalsIgnoreCase(data[i][0])){
				break;
			}
		}
		if(i >= data.length){
			i = -1;
			System.out.println("Key " + keyToSearch + " is not found.");
		} else {
			System.out.print("Key " + keyToSearch + " is found at index " + i);
			System.out.println(" after " + (i+1) + " reads.");
		}
		
		return i;
	}
	
	
	public int binary(String keyToSearch) {
		System.out.println("Searching for " + keyToSearch + " using binary method.");
		int len = data.length;
		int index = 0;
		int tries = 0;
		int upper = len;
		int foundAtIndex = -1;
		int previous = 0;
		
		index = (len/2);
		
		do{
			System.out.println("Read " + index + ", key- " + data[index][0]);
			tries++;
			if(keyToSearch.equalsIgnoreCase(data[index][0])){
				foundAtIndex = index;
				break;
			} else {
				if(keyToSearch.compareToIgnoreCase(data[index][0]) > 0) {
					index = (index + upper) / 2;
					if(index == previous) index ++;
				} else {
					upper = index;
					index = (index / 2);
					if(index == previous) index--;
				}
				previous = index;
			}
		} while(index >= 0 && index < len);
		
		
		if(foundAtIndex == -1){
			System.out.println("Key " + keyToSearch + " is not found.");
		} else {
			System.out.print("Key " + keyToSearch + " is found at index " + foundAtIndex);
			System.out.println(" after " + tries + " reads.");
		}
		return foundAtIndex;
	}

	
	public int hashRoutine(String keyToSearch){
		int len = keyToSearch.length();
		int sum = 0;
		for(int i = 0; i < len; i++){
			int decVal = keyToSearch.charAt(i);
			sum = sum + decVal;
		}
		return sum % data.length;
	}
	
	String [][] datahashed = new String[135][4];
	
	public int hash(String keyToSearch){
		System.out.println("Searching for " + keyToSearch + " using hash method.");
		
		int foundAtIndex = hashRoutine(keyToSearch);
		
		System.out.print("Key " + keyToSearch + " is found at index " + foundAtIndex);
		System.out.println(" after 1 read.");
		
		return foundAtIndex;
	}
	
	public String displayRecordFromHashtable(int index){
		return "Record = "
				+ datahashed[index][0]
				+ ", "
				+ datahashed[index][1]
				+ ", "
				+ datahashed[index][2]
				+ ", "
				+ datahashed[index][3];
	}
	
	public String displayRecord(int index){
		return "Record = "
				+ data[index] [0]
						+", "
						+ data[index] [1]
								+", "
								+ data[index] [2]
										+", "
										+ data[index] [3];
	}
}
