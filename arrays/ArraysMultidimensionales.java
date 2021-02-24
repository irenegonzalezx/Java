package arrays;

public class ArraysMultidimensionales {

	public static void main(String[] args) {
		
		int x[][]=new int[2][3];
		
		x[0][0]=1;
		x[1][0]=1;
		x[1][1]=1;

		//System.out.println(x[0][0]);
		for (int z=0; z<x.length;   z++)			
		{
			for (int h=0;h<x[z].length;h++)
			{
				System.out.print(x[z][h]);
			}
			System.out.println();
		}

	}

}
