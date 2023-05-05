import java.awt.Frame;
import java.awt.Button;
import java.awt.Color;
import java.awt.TextField;
import java.awt.Label;



public class MyFrame extends Frame {
	
	public TextField firstTf;
	public TextField secondTf;
	public Label l1;
	public Label lbl;
	public Label lbla;
	
	public MyFrame(boolean visible, String title, int x, int y, int width, int height ) {
		
		this.setVisible(true);
		this.setTitle(title);
		this.setBounds(x,y,width,height);
		this.setLayout(null);
		this.setBackground(Color.magenta);
		
		int intialX = 20;
		int intialY = 50;
	
		 //Input Text boxes
		
		l1 = new Label();
		l1.setText("First no.");;
		l1.setBounds(intialX,intialY,80,30);
		add(l1);
		
		firstTf = new TextField();
		firstTf.setBounds(intialX+80,intialY,80,30);
		firstTf.setBackground(Color.cyan);
		add(firstTf);
		
		Label l2 = new Label("Second no.");
		l2.setBounds(intialX+240,intialY,80,30);
		add(l2);
		
		secondTf = new TextField();
		secondTf.setBounds(intialX+320,intialY,80,30);
		secondTf.setBackground(Color.cyan);
		add(new Label("Second no."));
		add(secondTf);

		lbl = new Label();
		lbl.setBounds(intialX, intialY+50, 250,30);
		lbl.setBackground(Color.yellow);
		add(lbl);
	  
		

	//Buttons
		
		Button addButton = new Button("Addtion");
		addButton.setBackground(Color.green);
		addButton.setBounds(intialX+50,150,80,30);
		
		Button subButton = new Button("Subtraction");
		subButton.setBackground(Color.green);
		subButton.setBounds(intialX+150,150,80,30);
		
		Button multiButton = new Button("Multiplication");
		multiButton.setBackground(Color.green);
		multiButton.setBounds(intialX+250,150,80,30);
		
		Button divButton = new Button("Division");
		divButton.setBackground(Color.green);
		divButton.setBounds(intialX+350,150,80,30);
		
		

		this.add(addButton);
		this.add(subButton);
		this.add(multiButton);
		this.add(divButton);
		
		
		
		addButton.addActionListener(new ActionHandler(this));
		subButton.addActionListener(new ActionHandler(this));
		multiButton.addActionListener(new ActionHandler(this));
		divButton.addActionListener(new ActionHandler(this));


		//Master Handler
		addWindowListener(new MasterWindowHandler());
    	addMouseListener(new MasterWindowHandler());
    	addMouseMotionListener(new MasterWindowHandler());
	}

	
	
}
