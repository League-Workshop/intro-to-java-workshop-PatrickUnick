package section3;

import javax.swing.JOptionPane;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class StephenHawking {
	
	public static void main(String[] args) {
		
		for (int i=0;0<10000;i++) {
			 String ans = JOptionPane.showInputDialog("speak what?");
			 if (ans.equals("null")) {
				 speak("goodbye");
				 break;
				 
			 }
			 else {
				 speak(ans);
				 println("hi");
			 }
		}
	}
	

	
	
	
	
	
	
	
	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	}


	static void println(String input) {
		JOptionPane.showMessageDialog(null, input);
	}
}