public class Vehicule {
    private int id;
    private String modele;
    private int autonomieBatterie;
    private boolean estDisponible;

    public Vehicule(int id, String modele, int autonomieBatterie) {
        this.id = id;
        this.modele = modele;
        this.autonomieBatterie = autonomieBatterie;
        this.estDisponible = true;  // dispo
    }

    public int getId() {
        return id;
    }

    public String getModele() {
        return modele;
    }

    public int getAutonomieBatterie() {
        return autonomieBatterie;
    }

    public boolean isDisponible() {
        return estDisponible;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setAutonomieBatterie(int autonomieBatterie) {
        this.autonomieBatterie = autonomieBatterie;
    }

    public void setDisponible(boolean estDisponible) {
        this.estDisponible = estDisponible;
    }

    @Override
    public String toString() {
        return "Vehicule ===>>  ID=" + id + ", Modèle=" + modele + ", Autonomie=" + autonomieBatterie + " km, Disponible=" + (estDisponible ? "Oui" : "Non");
    }
}
