
public class Entry {
	
	public static void main(String[] args) {
		
		
		Shapes s[] = new Shapes[3];
		s[0] = new Square(2);
		s[1] = new Circle(2);
		s[2] = new Triangle(2,4);
		
		float totalShapeArea = 0.0f;
		
		for (int i=0;i<3;i++) {
			totalShapeArea = totalShapeArea + s[i].area();
			
			System.out.println("Area of each " + s[i].Type() + " Shape " + s[i].area());
		}
		
		System.out.println("Total Area of all Shapes " + totalShapeArea);
		
		
		
	}

	
}
