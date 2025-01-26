public class Scooter extends Vehicule {
    private boolean besoinPermis;

    public Scooter(int id, String modele, int autonomieBatterie, boolean besoinPermis) {
        super(id, modele, autonomieBatterie);
        this.besoinPermis = besoinPermis;
    }

    @Override
    public String toString() {
        return "Scooter ===>>  ID: " + getId() + ", Modèle: " + getModele() +
                ", Autonomie: " + getAutonomieBatterie() + "km, Permis requis: " + (besoinPermis ? "Oui" : "Non") +
                ", Disponible: " + (isDisponible() ? "Oui" : "Non");
    }
}
