import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JugglerHandler implements ActionListener {

	JugglerFrame jf;
	
	public JugglerHandler(JugglerFrame jugglerFrame) {
		this.jf = jugglerFrame;		
	}

	public void actionPerformed(ActionEvent e) {
       	
    	int c = Integer.parseInt(jf.getThirdTf().getText());
		int b = Integer.parseInt(jf.getSecondTf().getText());
		int a = Integer.parseInt(jf.getFirstTf().getText());
	
        if(e.getActionCommand().equalsIgnoreCase("Clock-Wise")) {
        	
        	int arry[] = {c,b,a};
        				
        	int x = arry[0]+1;
        	arry[0] = arry[1];
			jf.getThirdTf().setText("" + arry[0]);
			arry[1] = arry[2];
			jf.getSecondTf().setText("" + arry[1]);
			arry[2] = x;
			jf.getFirstTf().setText("" + arry[2]);
			
					
		} else 
		if(e.getActionCommand().equalsIgnoreCase("Anti-Clock-Wise")) {
			
			int arry[] = {a,b,c};
			
			int x = arry[0]-1;
			arry[0] = arry[1];
			jf.getFirstTf().setText("" + arry[0]);
			arry[1] = arry[2];
			jf.getSecondTf().setText("" + arry[1]);
			arry[2] = x;
			jf.getThirdTf().setText("" + arry[2]);
		
		}
	
	}

}
