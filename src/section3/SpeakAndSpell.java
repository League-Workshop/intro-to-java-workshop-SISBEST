package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		
		speak("Please spell the following sentence: I will destroy the earth.");
		String sentence = JOptionPane.showInputDialog(null, "Please spell the sentence in the box below.");
		if (sentence.equals("I will destroy the earth.")) {
			speak("Correct!");}
		else {
			speak("Incorrect!");}
		speak("Now spell the following sentence: Everyone is stupid.");
		String sentence1 = JOptionPane.showInputDialog(null, "Please spell the sentence in the box below.");
		if (sentence1.equals("Everyone is stupid.")) {
			speak("Correct!");}
		else {
			speak("Incorrect!");}
		speak("Now spell the following sentence: I will not play Minecraft for the rest of the day.");
		String sentence2 = JOptionPane.showInputDialog(null, "Please spell the sentence in the box below.");
		if (sentence2.equals("I will not play Minecraft for the rest of the day.")) {
			speak("Correct! The End. Have a nice day!");}
		else {
			speak("Incorrect! The End. Have a nice day!");}
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


