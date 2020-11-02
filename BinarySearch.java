
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {4, 8, 9, 12, 20, 22, 24};
		
		int num = 1;
		
		int pos = doBinarySearch(a, num);
		
		if(pos == -1)
			System.out.println("Number does not exist");
		else
			System.out.println("Number exist at position "+pos);

	}
	
	public static int doBinarySearch(int[] a, int num)
	{
		int start = 0, end = a.length-1, pos = -1;
		
		int mid = 0;
	
		try {
			while(start<=end)
			{
				//System.out.println("Printing");
				mid = (start + end)/2;
				
				if(a[mid] == num)
				{
					pos = mid;
					break;
				}
				
				else if(a[mid] > num)
					end = mid-1;
				else
					start = mid + 1;
			}
		}
		catch(Exception e)
		{
			System.out.println("Error is encountered "+e.getMessage());
		}
		
		return pos;
	}

}
