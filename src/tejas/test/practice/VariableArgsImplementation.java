package tejas.test.practice;

public class VariableArgsImplementation {

	public static void main(String[] args) {
		String [] firstType = {"first","second","third","fourth"};
		System.out.println("Printing firstType");
		printMyVarArgs(firstType);

		String [][] secondType = {{"11","21","34"},
				{"43","54"},
				{"64","77","81","19"}};
		System.out.println("Printing secondType");
		printMyVarArgs(secondType);
	}

	private static void printMyVarArgs(String...strings) {
		for(int i=0; i<strings.length; i++) {
			System.out.println(" " + strings[i]);
		}
	}
	
	private static void printMyVarArgs(String[]...strings) {
		for(int i=0; i<strings.length; i++) {
			for(int j=0; j<strings[i].length;j++) {
				System.out.println( strings[i][j]);
			}
			
		}
	}

}
