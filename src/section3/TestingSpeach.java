package section3;

import javax.swing.JOptionPane;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TestingSpeach {
	public static void main(String[] args) {
		while(true) {
			String asub = JOptionPane.showInputDialog("type first number");
			int a = Integer.parseInt(asub);
			
			String bsub = JOptionPane.showInputDialog("type second number");
			int b = Integer.parseInt(bsub);
			
			String ask = JOptionPane.showInputDialog("add? subtract? multiply? devide?");
			
			if (ask.equals("add"))
		}
			
	}

}
