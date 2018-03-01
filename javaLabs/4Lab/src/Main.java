import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		StringProcessor sp = new StringProcessor();
		try {
			String input = sp.readInputText();
			String resultText = sp.processText(input);
			sp.showResults(resultText);
			
		} catch (IOException e) {
			e.getStackTrace();
		}

	}

}
