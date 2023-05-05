import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;



public class MyFrame extends Frame {
	
	public MyFrame(boolean visible, String title, int x, int y, int width, int height ) {
		
		this.setVisible(true);
		this.setTitle(title);
		this.setBounds(x,y,width,height);
		
		int intialX = 20;
		int intialY = 80;
	
		 //Input Text boxes
		
		Label l1 = new Label();
		l1.setText("First no.");;
		l1.setBounds(intialX,intialY,80,30);
		add(l1);
//		
//		TextField firstTf = new TextField();
//		firstTf.setBounds(intialX+80,intialY,50,30);
//		add(firstTf);
//	
		
		
		
		
		Label l2 = new Label("Second no.");
		l2.setBounds(intialX+250,intialY,80,30);
		add(l2);
//		
//		TextField secondTf = new TextField();
//		secondTf.setBounds(intialX+120,intialY,80,30);
//		add(new Label("Second no."));
//		add(secondTf);
		
//		
	
		 
		
		//Answer
//	
////		TextField resultOut = new TextField("Answer is ");
////		resultOut.setBounds(100,100,80,30);
////		add(resultOut);
//		
//		//Buttons
//				
//		Button addButton = new Button("Addtion");
//		addButton.setBounds(50,150,80,30);
//		
//		Button subButton = new Button("Subtraction");
//		subButton.setBounds(100,150,80,30);
//		
//		Button multiButton = new Button("Multiplication");
//		multiButton.setBounds(150,150,80,30);
//		
//		Button divButton = new Button("Division");
//		divButton.setBounds(200,150,80,30);
//		
		setLayout(null);
//		
//		this.add(addButton);
//		this.add(subButton);
//		this.add(multiButton);
//		this.add(divButton);
//		
//		
//		
//		addButton.addActionListener(new ActionHandler(firstTf,secondTf));
//		subButton.addActionListener(new ActionHandler(firstTf,secondTf));
//		multiButton.addActionListener(new ActionHandler(firstTf,secondTf));
//		divButton.addActionListener(new ActionHandler(firstTf,secondTf));
//
//
		//Master Handler
		addWindowListener(new MasterWindowHandler());
    	addMouseListener(new MasterWindowHandler());
    	addMouseMotionListener(new MasterWindowHandler());
	}
	
}
