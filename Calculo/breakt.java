public class breakt {
    public static void main(String[] args) throws Exception{
        int diaSemana = 2;

        switch (diaSemana){
          
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
          System.out.println("Dia da semana");
          break;

        case 1: 
        case 7:
          System.out.println("Final da semana");
          break;
        }
    }
}
