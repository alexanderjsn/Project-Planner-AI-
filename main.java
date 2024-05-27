import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

         // Tar input från Main och rensar text på punkter, delar den osv
         DataPreprocessor dataPreprocessor = new DataPreprocessor();

         // Konverterar tokens från DataP till vektorer
         EmbeddingLayer embeddingLayer = new EmbeddingLayer();
 
         // Skapar en vektor för varje token och lägger till positionell kodning
         PositionalEncoder encoding = new PositionalEncoder();
 
         //Applies self-attention mechanism to the encoded data
         SelfAttention selfAttentionLayer = new SelfAttention();
 
         // Applies feed-forward neural network to the self-attention output
         FeedForwardNN feedForwardLayer = new FeedForwardNN();
 
         // Combines the self-attention and feed-forward layers in a transformer block
         TransformerBlock transformerBlock = new TransformerBlock();
 
         // Generates the final output based on the transformer blocks
         OutputLayer outputLayer = new OutputLayer();




        //håller input - output
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv in en mening: ");
        String sentence = scanner.nextLine();
        String[] tokens = dataPreprocessor.tokenize(sentence);

            for(int i = 0; i < tokens.length; i++) {
                System.out.println(tokens[i]);
            }
        scanner.close();       
    }
}