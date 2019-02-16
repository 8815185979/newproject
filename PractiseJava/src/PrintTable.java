
public class PrintTable {
	
	
	static int i=1;
	 static int mul=0;
	
	public void ForPrintTable(int a)
	{
		for(int i=1;i<=10;i++)
		
		{
			mul=a*i;
			System.out.println(a+"*"+i+"="+mul);
		}
		
	}
	public void WhilePrintTable(int b)
	
	{
		while(i<=10)
		{
			mul=b*i;
			System.out.println(b+"*"+i+"="+mul);
			i++;
		}
	}
	
	public void DoPrintTable(int c)
	{
		do
		{
			mul=c*i;
			System.out.println(c+"*"+i+"="+mul);
			i++;
		}
		while (i<=10);
	}
	public static void main(String[] args) {
		 
		PrintTable obj=new PrintTable();
		obj.ForPrintTable(7);
		obj.WhilePrintTable(9);
	}
}
