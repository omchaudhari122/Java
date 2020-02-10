package array;

public class ArrayDemo {
	
	void oneDArray() {
		
		int array[]= {1,2,3,4,5};
		
		int array1[]=new int[5];
		
		array1[0]=1;
		array1[1]=2;
		array1[2]=3;
		array1[3]=4;
		array1[4]=5;
		
		
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
	}
}
	
	void twoDArray() {
		int array[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<array.length;i++) {
		for(int j=0;j<array.length;j++) {
			if(i==j)
			System.out.println(array[i][j]);
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}		
		
		
	public static void main(String[]args) {
		ArrayDemo demo=new ArrayDemo();
		demo.oneDArray();		
	}
}