//定义接口
interface drawTest
{
	//定义方法
	//接口中所有的方法都没有方法体
	public void draw();
}
//定义平行四边形类，该类继承了四边形类，并实现了drawTest接口
class ParallelogramgleUseInterface extends QuadrangleUseInterface implements drawTest
{
	//覆盖draw方法
	public void draw()
	{
		System.out.println("平行四边形.draw()");
	}
	
	public //覆盖父类方法
	void doAnyThing() 
	{
		//somedcode;
	}
}

class SquareUseInterface extends QuadrangleUseInterface implements drawTest
{
	public void draw() 
	{
		System.out.println("正方形.draw()");
	}
	public void doAnyThing(){};
}
public class QuadrangleUseInterface {

	public void doAnyThing()
	{
		//somecode;
	}
	
	public static void main(String[] args) {
		drawTest aDrawTest = new SquareUseInterface();
		drawTest bDrawTest = new ParallelogramgleUseInterface();
		aDrawTest.draw();
		bDrawTest.draw();
	}

}
