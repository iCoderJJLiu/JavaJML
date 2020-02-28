//四边形类
class Quadrangle
{
	public static void draw(Quadrangle q)
	{
		System.out.println("Begin to draw");
	}
}
//平行四边形类
public class Parallelogram extends Quadrangle
{
	public static void main(String[] args) 
	{
		//实例化平行四边形类对象引用
		//类似于“Quadrangle obj = new Parallelogram();” 就是吧子类对象赋值给父类类型的变量
		//“向上转型”：将一个较具体的类转换成一个较抽象的类
		Quadrangle p = new Parallelogram();
		//调用父类方法
		draw(p);
		
		//“向下转型”：将一个较抽象的类转换成一个较具体的类
		//将父类对象赋值给子类，并强制转换为子类型
		Parallelogram parallelogram = (Parallelogram)p;
		
		//在执行“向下转型”之前要判断父类对象是否是子类对象的实例
		//可以使用instanceof操作符判断
		//myobject instanceof ExampleClass
		//myobject:某类的对象引用
		//ExampleClass:某个类
	}
}
