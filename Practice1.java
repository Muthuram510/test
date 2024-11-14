package ram;

import java.util.Arrays;

public class Practice1 {
	
	public static float SI(float p,float n,float r)
	{
		return (p*n*r)/100;
	}
	
	public static float discount(float p)
	{
		return (float) (p-(p*0.1));
	}
	
	public static int minvalue(int[] arr)
	{
		Arrays.sort(arr);
		return arr[0];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
