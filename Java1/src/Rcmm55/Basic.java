package Rcmm55;

public class Basic 
{
	public static void main(String[] args) 
	{
		String s="i have 100 chocolates";
		//        0   1    2     3
		String []arr=s.split(" ");
		String h=arr[2];//"100"	
		System.out.println(h);
		int no=Integer.parseInt(h);//100
		System.out.println(no);
		
		int f=123;
		//    012
		String k=String.valueOf(f);
		System.out.println(k.charAt(1));
	}
}
