/**
 * Created by Fatmi on 31/10/2016.
 */
public class EmployeTempsPartiel extends Employe {
    private double montantHeure;
    private final int Heure=35;
    public EmployeTempsPartiel(String nom, String fonction){
        super(nom,fonction);
    }
    public double getMontantHeure(){
        return montantHeure;
    }
    public void setMonatantHeure(double montantHeure){
        this.montantHeure=montantHeure;
    }
    public double calculPaie(){
        return montantHeure*35;
    }
}
