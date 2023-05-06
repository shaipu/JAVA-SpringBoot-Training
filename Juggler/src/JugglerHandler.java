import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JugglerHandler implements ActionListener {

	JugglerFrame jf;
	
	public JugglerHandler(JugglerFrame jugglerFrame) {
		this.jf = jugglerFrame;		
	}

	public void actionPerformed(ActionEvent e) {
		
		
        if(e.getActionCommand().equalsIgnoreCase("Clock-Wise")) {
        	
        	       	
        	int c = Integer.parseInt(jf.getThirdTf().getText());
    		int b = Integer.parseInt(jf.getSecondTf().getText());
    		int a = Integer.parseInt(jf.getFirstTf().getText());
    					
        	int x = c+1;
        	c = b;
			jf.getThirdTf().setText("" + c);
			b = a;
			jf.getSecondTf().setText("" + b);
		   	a = x;
			jf.getFirstTf().setText("" + a);
			
					
		} else 
		if(e.getActionCommand().equalsIgnoreCase("Anti-Clock-Wise")) {
			
		
			int a = Integer.parseInt(jf.getFirstTf().getText());
			int b = Integer.parseInt(jf.getSecondTf().getText());
			int c = Integer.parseInt(jf.getThirdTf().getText());
			
			int x = a-1;
			a = b;
			jf.getFirstTf().setText("" + a);
			b = c;
			jf.getSecondTf().setText("" + b);
			c = x;
			jf.getThirdTf().setText("" + c);
		
		}
	
	}

}
