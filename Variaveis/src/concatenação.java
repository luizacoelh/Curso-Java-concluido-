public class concatenação {

    public static void main(String[] args) {
        String filme = "Um dia "; //%s
        int anoLancamento = 2011; //%d
        int duração = 240; 
        double nota = 8.9; //%f
        char letraInicial = 'U'; //%c
        boolean assistido = true; //%b

        System.out.println("O filme " + filme + " foi lançado em " + anoLancamento + ", tem duração de " + duração + " minutos, uma nota de " + nota + ", começa com a letra " + letraInicial + " e foi assistido: " + assistido ); //"tradição"

        System.out.format("O filme %s foi lançado em %d, tem duração de %d minutos uma nota de %f, começa com a letra %c e foi assistido: %b \n", filme, anoLancamento, duração, nota, letraInicial, assistido); //"formatação"

        String texto = "O filme " + filme + " foi lançado em " + anoLancamento + ", tem duração de " + duração + " minutos, uma nota de " + nota + ", começa com a letra " + letraInicial + " e foi assistido: " + assistido;
        System.out.println(texto); // String formatação

        String texto2 = String.format("-> O filme %s foi lançado em %d tem uma duração %d minutos uma nota de %f, começa com a letra %c e foi assistido: %b \n", filme, anoLancamento,duração, nota, letraInicial, assistido); // String.format


        String canal = "Academia de Devs ";
        String mensagem = "Se inscreva no canal ";
        String mensagem2 = "Obrigada"; 
        String mensagemFinal = mensagem + canal + mensagem2;
        System.out.println(mensagemFinal);
        

       String mensagemFinal2 = String.format("%s %s. %s", mensagem, canal, mensagem2);
        System.out.println(mensagemFinal2);
    }
}
