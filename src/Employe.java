/**
 * Created by Fatmi on 31/10/2016.
 */
public class Employe {
    private String nom;
    private String fonction;
    private double salaire;
    public Employe(String nom,String fonction){
        this.nom=nom;
        this.fonction=fonction;
    }
    public String getNom(){return nom;}
    public String getFonction(){return fonction;}
    public double getSalaire(){return salaire;}
    public void setSalaire(){this.salaire=salaire;}
    public void chequePaie(){
        System.out.println("le nom d'employe est" +nom+ "sa fonction est" +fonction+ "son salaire est" +salaire);
    }
    public double calculSalaire(){return salaire;}
}

