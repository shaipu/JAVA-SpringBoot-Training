
public class Circle extends Shapes {

	private int radius;
	private String Type;

	
	public float area() {
		Type = "Circle";		
		return 3.14f*radius*radius;
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String Type() {
		return Type;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
	
	

}
