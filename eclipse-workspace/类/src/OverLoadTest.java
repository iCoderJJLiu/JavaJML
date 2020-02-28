public class OverLoadTest 
{
	//方法一
	public static int add(int a, int b)
	{
		return a + b;
	}
	//与方法一名相同，参数类型不同的方法二
	public static double add(double a, double b) 
	{
		return a + b;
	}
	//与方法一参数个数不同
	public static int add(int a) 
	{
		return a;
	}
	
	//方法四：不定长参数方法
	//参数a就是一个数组
	//int...a == int[]a
	public static int add(int...a)
	{
		int s = 0;
		for(int i = 0; i < a.length; i++)
			s += a[i];
		return s;
	}
	//方法一和方法二参数类型不同，方法的返回值类型也不同
	//方法三参数与前两个不同
	//这3个方法构成了重载关系
	
	//方法4也是重载
	
	public static int add(int a, double b)
	{
		return 1;
	}
	//与前一个次序不同
	public static int add(double a, int b)
	{
		return 1;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("调用add(int,int)方法：" + add(1,2));
		System.out.println("调用add(double,double)方法：" + add(1.5,2.7));
		System.out.println("调用add(int)方法：" + add(1));
		//调用不定长参数方法
		System.out.println("调用不定长参数方法：" + add(1,2,3,4,5,6,7,8,9));
	}

}
