/**
 * Created by Fatmi on 31/10/2016.
 */
public class main {
    public static void main(String[]args){
        Employe A= new Employe("Feriel","informaticienne");
        A.chequePaie();
        EmployeTempsPartiel B=new EmployeTempsPartiel("Nacer","docteur");
          B.calculPaie();
        B.chequePaie();
      
        PleinTemps C= new PleinTemps("Arslane","commerçant",5000);
        C.chequePaie(); // il faut d'abord appeler calculPaie() puis chequePaie()
        C.calculpaie(5.0);
    }
}// la aussi il faut déclarer un tableau de type employe et donc éviter la répétition des aappels a chequePaie() et calculPaie()
