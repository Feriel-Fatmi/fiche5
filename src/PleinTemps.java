/**
 * Created by Fatmi on 31/10/2016.
 */
public class PleinTemps extends Employe{
    private double montantHebdo;
    private double prime;
    public PleinTemps(String nom, String fonction, double prime ){
        super(nom, fonction);
        this.prime=prime;
    };
    public double getPrime(){return prime;}
    public double getMontantHebdo(){return montantHebdo;}
    public double calculpaie(double prime){ // salaire ne change de cette façon si tu affcihe la valeur de salaire ça sera 0
        return montantHebdo*4+prime;
    }
    
     @Override
    public double calcul_paie() {
        salaire = this.heure_mois * montant_heure;
        return salaire; 
    }

}
