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
    public double calculpaie(double prime){
        return montantHebdo*4+prime;
    }
}
