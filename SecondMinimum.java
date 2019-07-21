class SecondMinimum 
{
	public static void main(String[] args) 
	{
		int[] a = {2, 1, 3, 4, 7, 2, 8};
		int min1 = a[0];
		int min2 = a[0];
		for (int i = 1; i<a.length; i++)
		{
			if (a[i] < min1)
			{
				min2 = min1;
				min1 = a[i];
			}
			else if(a[i] < min2 && a[i] != min1)
			{
				min2 = a[i];
			}
			else if (min1 == min2)
			{
				min2 = a[i];
			}
		}
		System.out.println("first minimum:"+min1);
		System.out.println("second minimum:"+min2);
	}
}
