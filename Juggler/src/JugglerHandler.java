import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Arrays;


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
        	
        	int intArray[] = {c,b,a};
        	System.out.println(Arrays.toString(intArray));
        				
        	int x = intArray[0]+1;
        	intArray[0] = intArray[1];
			jf.getThirdTf().setText("" + intArray[0]);
			intArray[1] = intArray[2];
			jf.getSecondTf().setText("" + intArray[1]);
			intArray[2] = x;
			jf.getFirstTf().setText("" + intArray[2]);
			
					
		} else 
		if(e.getActionCommand().equalsIgnoreCase("Anti-Clock-Wise")) {
			
			int intArray[] = {a,b,c};
			System.out.println(Arrays.toString(intArray));
			
			int x = intArray[0]-1;
			intArray[0] = intArray[1];
			jf.getFirstTf().setText("" + intArray[0]);
			intArray[1] = intArray[2];
			jf.getSecondTf().setText("" + intArray[1]);
			intArray[2] = x;
			jf.getThirdTf().setText("" + intArray[2]);
		
		}
	
	}

}
