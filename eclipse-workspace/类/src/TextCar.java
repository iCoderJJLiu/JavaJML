class Car{
			//属性
			String color;
			double height;
			String name ;
			//行为（方法）
			public void takePeople()
			{
			System.out.println("我希望我以后能开上"+name);
			}
			public void  fun() {
				System .out.println(color+"的车颜色更好看");
			}
		}
		 class TextCar
		{
			
			public static void main(String[] args) {
				Car car=new Car();
				car.color = "yellow";
				car.height = 1.6;
				car.name = "baoma";
				car.fun();
				car.takePeople();
			}
		}
