import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Button;

public class JugglerFrame extends Frame{
	
	private TextField firstTf;
	private TextField secondTf;
	private TextField thirdTf;
	private Button ClockWisewBt;
	private Button AntiClockWisewBt;
	

	public JugglerFrame(boolean b, String title, int i, int j, int k, int l) {
		
		this.setVisible(true);
		this.setTitle(title);
		this.setBounds(i,j,k,l);
		this.setLayout(null);
		this.setBackground(Color.magenta);
		this.setLayout(null);
		
		int intialX = 20;
		int intialY = 80;
		
	// set Text boxes
		firstTf = new TextField();
		firstTf.setBounds(intialX+80,intialY,80,30);
		firstTf.setBackground(Color.cyan);
		add(firstTf);
		
		
		secondTf = new TextField();
		secondTf.setBounds(intialX+300,intialY,80,30);
		secondTf.setBackground(Color.cyan);
		add(secondTf);
		
		thirdTf = new TextField();
		thirdTf.setBounds(intialX+190,intialY+100,80,30);
		thirdTf.setBackground(Color.cyan);
		add(thirdTf);
		
		//close Juggler window
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				JugglerFrame jf = (JugglerFrame)e.getSource();
				jf.dispose();
				}
			});		
		
		
		// set buttons 
		
		ClockWisewBt = new Button("Clock-Wise");
		ClockWisewBt.setBounds(120,250,100,30);
		ClockWisewBt.setBackground(Color.orange);
		add(ClockWisewBt);
		
		
		ClockWisewBt.addActionListener(new JugglerHandler(this));
		
		AntiClockWisewBt = new Button("Anti-Clock-Wise");
		AntiClockWisewBt.setBounds(300,250,100,30);
		AntiClockWisewBt.setBackground(Color.orange);
		add(AntiClockWisewBt);
		
		AntiClockWisewBt.addActionListener(new JugglerHandler(this));	
	}


	public Button getClockWisewBt() {
		return ClockWisewBt;
	}


	public void setClockWisewBt(Button clockWisewBt) {
		ClockWisewBt = clockWisewBt;
	}


	public Button getAntiClockWisewBt() {
		return AntiClockWisewBt;
	}


	public void setAntiClockWisewBt(Button antiClockWisewBt) {
		AntiClockWisewBt = antiClockWisewBt;
	}


	public TextField getFirstTf() {
		return firstTf;
	}


	public void setFirstTf(TextField firstTf) {
		this.firstTf = firstTf;
	}


	public TextField getSecondTf() {
		return secondTf;
	}


	public void setSecondTf(TextField secondTf) {
		this.secondTf = secondTf;
	}


	public TextField getThirdTf() {
		return thirdTf;
	}


	public void setThirdTf(TextField thirdTf) {
		this.thirdTf = thirdTf;
	}

	
}
