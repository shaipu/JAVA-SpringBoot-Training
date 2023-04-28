
public class Square extends Shapes {
	
	private int len;
	private String Type;
	
		
	public Square(int len) {
		Type = "Square";
		this.len = len;
			
	}
	
	public String Type() {
		return Type;
		
	}
	
	public float area() {
		return len*len;
		
	}
	public int getRadius() {
		return len;
	}
	public void setRadius(int len) {
		this.len = len;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	

	
	
}
