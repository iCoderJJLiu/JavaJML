
class Student{
	String name;
	int age;
	double height;
	//类属性(静态属性)
	static int weight;
	//构造器
	public Student() {
		System.out.println("只是一个普通人");
		
	}
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
		
		System.out.println(this.name+"只是一个普通人");
		
	}
	public Student (String name,int age,double height) {
		this(name,age);
		System.out.println("这个"+age+height+"叫"+name);
	}
	//类方法（静态方法）
	public static void introduce(int age ) {
		System.out.println("我的岁数是"+age);
	}
	
}

class textStu
{
	public static void main(String[] args){
		//类属性前是类名
		Student.weight++;
		System.out.println(Student.weight);
		
		Student.weight++;
		System.out.println(Student.weight);
		//调用构造器函数
		Student person1 = new Student ("余阳",20);
		System.out.println(person1);
		Student person2 = new Student ("科比",40,200);
		System.out.println(person2);
		//类方法
		Student.introduce(15);
		
		
	}

}
