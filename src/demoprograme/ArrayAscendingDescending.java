package demoprograme;

public class ArrayAscendingDescending {
	public static void main(String[] args) {
		int [] a= {10,20,40,50,80,90,70};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp =a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int x:a)
		{
			
		}
		
	}

}
