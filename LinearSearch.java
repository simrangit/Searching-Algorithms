
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int[] a = {4, 8, 9, 12, 20, 22, 24}; // works for all types of array - sorted/unsorted
		
		int num = 13;
		
		int pos = doLinearSearch(a, num);
		
		if(pos == -1)
			System.out.println("Number does not exist");
		else
			System.out.println("Number exist at position "+pos);

	}
	
	public static int doLinearSearch(int[] a, int num)
	{
		int n = a.length, pos = -1;
		
		try {
			for(int i = 0; i < n; i++)
			{
				if(a[i] == num)
				{
					pos = i;
					break;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Error is encountered "+e.getMessage());
		}
		
		return pos;
	}
	
	

}
