/**
 * Created by Fatmi on 31/10/2016.
 */
public class main {
    public static void main(String[]args){
        Employe A= new Employe("Feriel","informaticienne");
        A.chequePaie();
        EmployeTempsPartiel B=new EmployeTempsPartiel("Nacer","docteur");
        B.chequePaie();
        B.calculPaie();
        PleinTemps C= new PleinTemps("Arslane","commerçant",5000);
        C.chequePaie();
        C.calculpaie(5.0);
    }
}
