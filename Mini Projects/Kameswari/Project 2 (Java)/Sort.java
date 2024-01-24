package kam;

public class Sort {

	public static void main(String[] args) {
		int i,j;
		String s[]= {"Delhi","Mumbai","Kolkata","Cochi","Chennai","Banglore","Hyderabad","Vizag"};
		int l=s.length;
		for(i=0;i<l-1;i++)
		{
			for(j=0;j<l-i-1;j++)
			{
				if(s[j].compareTo(s[j+1])>0)
				{
				String t=s[j];
				s[j]=s[j+1];
				s[j+1]=t;
				}
					
			}
		}
		System.out.println("The Sorted string is:");
for(i=0;i<l;i++)
{
	System.out.println(s[i]);
}
	}

}
