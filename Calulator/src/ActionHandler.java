import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

	private TextField firstTf;
	private TextField SecondTf;


	public ActionHandler(TextField firstTf, TextField secondTf) {
		this.firstTf = firstTf;
		this.SecondTf = secondTf;
		
					
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println(e.getActionCommand());
		
		if (e.getActionCommand().equalsIgnoreCase("Addtion")){
			String a = this.firstTf.getText();
			String b = this.SecondTf.getText();
			
			float firstNo = Float.parseFloat(a);
			float SecondNo = Float.parseFloat(b);
			System.out.println(firstNo);
			System.out.println(SecondNo);
			
			float result = firstNo + SecondNo;
			System.out.println(result);
			
			
			
			
		}else if (e.getActionCommand().equalsIgnoreCase("Subtraction")) {
			
			String a = this.firstTf.getText();
			String b = this.SecondTf.getText();
			
			float firstNo = Float.parseFloat(a);
			float SecondNo = Float.parseFloat(b);
			System.out.println(firstNo);
			System.out.println(SecondNo);
			
			float  result = firstNo - SecondNo;
			System.out.println(result);
			
			
			
		}else if (e.getActionCommand().equalsIgnoreCase("Multiplication")){
			
			String a = this.firstTf.getText();
			String b = this.SecondTf.getText();
			
			float firstNo = Float.parseFloat(a);
			float SecondNo = Float.parseFloat(b);
			System.out.println(firstNo);
			System.out.println(SecondNo);
			
			float result = firstNo * SecondNo;
			System.out.println(result);
			
			
			
			
		}else if (e.getActionCommand().equalsIgnoreCase("Division")){
			
			String a = this.firstTf.getText();
			String b = this.SecondTf.getText();
			
			float firstNo = Float.parseFloat(a);
			float SecondNo = Float.parseFloat(b);
			System.out.println(firstNo);
			System.out.println(SecondNo);
			
			float result = firstNo / SecondNo;
			System.out.println(result);
			
			
		}
		

	}

}
