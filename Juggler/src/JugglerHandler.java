import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JugglerHandler implements ActionListener {

	JugglerFrame jf;
	
	public JugglerHandler(JugglerFrame jugglerFrame) {
		this.jf = jugglerFrame;		
	}

	public void actionPerformed(ActionEvent e) {
		
		
        if(e.getActionCommand().equalsIgnoreCase("Clock-Wise")) {
        	
        	String c = jf.getThirdTf().getText();
    		String b = jf.getSecondTf().getText();
    		String a = jf.getFirstTf().getText();
    		
        	String x = c;
        	c = b;
			jf.getThirdTf().setText(c);
			b = a;
			jf.getSecondTf().setText(b);
		   	a = x;
			jf.getFirstTf().setText(a);
			
						
		} else 
		if(e.getActionCommand().equalsIgnoreCase("Anti-Clock-Wise")) {
			
			String a = jf.getFirstTf().getText();
			String b = jf.getSecondTf().getText();
			String c = jf.getThirdTf().getText();
			
			String x = a;
			a = b;
			jf.getFirstTf().setText(a);
			b = c;
			jf.getSecondTf().setText(b);
			c = x;
			jf.getThirdTf().setText(c);
					
		}
	
	}

}
