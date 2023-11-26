import java.util.Scanner;
public class DSA_Array_Deletion2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the index of the value to be deleted:");
		int index=sc.nextInt();
		
		//Deletion from Specified index of array
		for (int i = index; i < arr.length-1; i++) {
			arr[i]=arr[i+1];
		}
		int []newArr=new int[arr.length-1];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i]=arr[i];
		}
		arr=newArr;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
