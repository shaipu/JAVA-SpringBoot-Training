
public class Triangle extends Shapes {

	private String Type;
	private int height;
	private int base;


	public Triangle(int height, int base) {
		
		this.height = height;
		this.base = base;
	}


	public float area() {
		
		Type = "Triangle";
		return 0.5f*height*base;
	}

	
	public String Type() {
		
		return Type;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getBase() {
		return base;
	}


	public void setBase(int base) {
		this.base = base;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}
	
	

}
