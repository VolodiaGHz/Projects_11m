
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringProcessor {
	  public String readInputText() throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter text: ");
	        
	        String inputText = br.readLine();
	        String inputNumber = br.readLine();
	        inputText = inputText.concat(" " + inputNumber);
	        return inputText;
	  }
	  
	  public String processText(String inputText){
		  List<String> list = new ArrayList<>(Arrays.asList(inputText.split(" ")));
		  String number = list.get(list.size()-1);
		  
	        String result = "";
	        for (int i = 0; i < list.size()-1; i++)
	        {
	        	if ((list.get(i).concat(" "+list.get(i+1))).equals("logo " + number)) {
	        		list.set(i + 1, "LOGO_");
	        	}
	        }
	        
	        for (int i = 0; i < list.size()-1; i++) {
	        	result = result.concat(list.get(i) + " ");
	        }
	        
	        return result;
	    }
	  
	    public void showResults(String resultText){
	        System.out.println(resultText);
	    }
}
