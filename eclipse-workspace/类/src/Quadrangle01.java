	

//定义一个正方形类，继承四边形类
	class Square extends Quadrangle01
	{
		public Square ()
		{
			System.out.println("正方形");
		}
	}
	
//定义一个平行四边形类，继承四边形类
	class Parallelogram01 extends Quadrangle01
	{
		public Parallelogram01 ()
		{
			System.out.println("平行四边形");
		}
	}

public class Quadrangle01 {
	//实例化保存四边形对象的数组对象
	private Quadrangle01[] qtest = new Quadrangle01[6];
	private int nextIndex = 0;
	//定义draw方法，参数为四边形对象
	public void draw(Quadrangle01 q) 
	{
		if (nextIndex < qtest.length)
		{
			qtest[nextIndex] = q;
			System.out.println(nextIndex);
			nextIndex ++;
		}
	}
	public static void main(String[] args)
	{
		//实例化两个四边形对象，用于调用draw()方法
		Quadrangle01 quadrangle01 = new Quadrangle01();
		//以正方形对象为参数调用draw方法
		quadrangle01.draw(new Square());
		//以平行四边形对象为参数调用draw方法
		quadrangle01.draw(new Parallelogram01());
	}
}
