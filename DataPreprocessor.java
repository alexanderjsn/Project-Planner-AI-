import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.Data;

public class DataPreprocessor {
//steg två 

public DataPreprocessor() {
    // Constructor code goes here
}


//positive/negative

//ord som är lika

// översättning

//sammanfattning

// kategori

// tokenization
// Söker efter input i metod när den kallas
public String[] tokenize(String sentence) {
    
    //samla biliotek med alla språk regler
    // Regular expression to remove punctuation
    String regex = "[\\p{Punct}]";
        
    // Remove punctuation from input
    sentence = sentence.replaceAll(regex, "");

    // Delar upp input i tokens
    String[] tokens = sentence.split(" ");

    for (int i = 0; i < tokens.length; i++) {
        tokens[i] = tokens[i].toLowerCase();
    }
    
    for (String word : tokens) {
        System.out.println(word);
    }
    
    return tokens;
}
//hantera språk/input


}