package Exercise2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Search search = new Search();
		
		for (int i = 0; i < search.data.length; i++){
			int generatedHashIndex = search.hashRoutine(search.data[i][0]);
			search.datahashed[generatedHashIndex][0] = search.data[i][0];
			search.datahashed[generatedHashIndex][1] = search.data[i][1];
			search.datahashed[generatedHashIndex][2] = search.data[i][2];
			search.datahashed[generatedHashIndex][3] = search.data[i][3];
			
		}
		int rowItWasFound = search.hash("K3");
		System.out.println(search.displayRecord(rowItWasFound));
		

	}

}
