package batch2;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,s,j,d,r=5;
		
		for(i=5;i>=1;i--)
		{
			for(s=i;s>0;s--)
			{
				System.out.print(" ");
				r--;
			}
			for(j=5;j<=i;j--)
			{
				System.out.print(j + " ");
			}
				System.out.println();
			
		}

	}

}
