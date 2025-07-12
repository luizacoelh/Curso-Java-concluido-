import java.util.Scanner;

public class v3 {
    public static void main(String[] args) throws Exception{
        String ranking;
        int posição; //Integer -> Integer.parseInt(string)  
        //float -> Float -> Float.parseFloat(string)
        //double -> Double -> Double.parseDouble(string)

        String valor;

        //crio um objeto leitor para ler valores digitados no teclado 
        Scanner leitor = new Scanner(System.in);
        //configuro (definindo que os separadores de linha serão \r\n)
        leitor.useDelimiter("[\r\n]+");

        //League of legends/n

        System.out.println("Qual o seu elo?");
        ranking = leitor.nextLine();
        
        System.out.println("Qual o seu tier");
        valor = leitor.nextLine(); 
        posição = Integer.parseInt(valor); //convert a String para int
        //posição = leitor.nextInt();

        //String + int (ou float ou duble) = String

        System.out.println("valor = " +  (posição + 1));
       
      /*  System.out.println("Qual o seu capeão preferido?");
       String campeão = leitor.nextLine(); //quando usamos a classe Scanner, o método nextLine() lê a linha inteira, incluindo espaços.
    

        System.out.println("Você é mono" + campeão + " no elo " + ranking + " " + posição + "!");*/

        
    }
    
} 



