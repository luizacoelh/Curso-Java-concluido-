public class Condicional3 {
    public static void main (String[] args) throws Exception{
       String video = "WandaVision";

       String categoria = (video == "HunterXHunter") ? "anime" : "série";

      /*if (categoria == "Hunter X Hunter"){
        categoria = "anime";
       } ese {
        categoria = "série";
        } */

       System.out.println(categoria);
    }
}
