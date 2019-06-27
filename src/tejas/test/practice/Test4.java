package tejas.test.practice;

public class Test4 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		int i=5;
		arr[i++] = i+++i++;
		System.out.print(arr[5] + "  "+arr[6]);
		Object object = new Object();
	}

}
