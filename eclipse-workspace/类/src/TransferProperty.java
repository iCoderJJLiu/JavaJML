
public class TransferProperty {
	// static int i = 47;//定义静态成员变量
	int i = 47;

	// 定义成员方法
	public void call() {
		System.out.println("调用call()方法");
		for (i = 0; i < 3; i++) {
			System.out.print(i + " ");
			if (i == 2)
				System.out.println("\n");
		}
	}

	// 定义构造方法
	public TransferProperty() {

	}

	public static void main(String[] args) {
		TransferProperty t1 = new TransferProperty();
		TransferProperty t2 = new TransferProperty();
		// 将类成员变量赋值为60
		t2.i = 60;
		// 使用第一个对象调用类成员变量
		System.out.println("第一个实例对象调用变量i的结果：" + t1.i);
		t1.call();
		// 使用第二个对象调用类成员变量
		System.out.println("第二个实例对象调用变量i的结果：" + t2.i);
		t2.call();

		String c1 = new String("abc");
		String c2 = new String("abc");
		String c3 = c1;
		// 使用“==”运算符比较c2与c3
		// "=="比较的是两个对象引用的地址是否相等
		System.out.println("c2 == c3的运算结束为：" + (c2 == c3));
		// 使用equals()方法比较c2与c3
		// equals()比较两个对象引用所指内容是否相等
		System.out.println("c2.equals(c3)的运算结束为：" + (c2.equals(c3)));	
	}

}

class Test {
	//构造方法
	public Test () {
		//SomeSentence
	}
	//成员方法
	protected void doSomething() {
		//SomeSentence
	}
	//方法返回值类型为Test类型
	protected Test doIt() {
		return new Test();
	}
}

//实例化子类对象时，首先要实例化父类对象，再实例化子类对象
//在子类构造方法访问父类的构造方法前，父类已经完成实例化操作

//继承父类Test
class Test2 extends Test {
	//构造方法
	public Test2() {
		//调用父类构造方法
		super();
		//调用父类成员方法
		super.doSomething();
		
		//子类没有权限调用父类中被修饰为private的方法
		//只可以调用父类中修饰为public或protected的成员方法
	}
	//新增方法
	public void doSomethingNew() {
		//SomeSentence
	}
	//重写父类方法
	//当重写父类方法时，不能降低方法的修饰权限范围
	//private > protected > public
	public void doSomething() {
		//SomeNewSentence
	}
	//重写父类方法，方法返回值类型为Test2类型
	//子类重写父类方法可以修改方法的返回值类型
	//原则：重写的返回值类型必须是父类中同一方法返回值类型的子类
	protected Test2 doIt() {
		return new Test2();
	}
}


