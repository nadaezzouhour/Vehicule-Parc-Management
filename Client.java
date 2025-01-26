/*public class Client {
    private int id;
    private String nom;
    private Vehicule vehiculeLoue;

    public Client(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.vehiculeLoue = null;
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public Vehicule getVehiculeLoue() { return vehiculeLoue; }

    public void louerVehicule(Vehicule vehicule) {
        if (vehicule.isDisponible()) {
            this.vehiculeLoue = vehicule;  // Assigner le véhicule loué
            vehicule.setDisponible(false); // Marquer le véhicule comme loué (indisponible)
            System.out.println(nom + " a loué le véhicule: " + vehicule.getModele());
        } else {
            System.out.println("Le véhicule n'est pas disponible.");
        }
    }

    public void retournerVehicule() {
        if (this.vehiculeLoue != null) {
            this.vehiculeLoue.setDisponible(true);  // Marquer le véhicule comme disponible
            System.out.println(nom + " a retourné le véhicule: " + vehiculeLoue.getModele());
            this.vehiculeLoue = null;
        } else {
            System.out.println("Aucun véhicule n'a été loué.");
        }
    }

    @Override
    public String toString() {
        return "Client [ID: " + id + ", Nom: " + nom +
                ", Véhicule loué: " + (vehiculeLoue != null ? vehiculeLoue.getModele() : "Aucun") + "]";
    }
}*/
public class Client {
    private int id;
    private String nom;
    private Vehicule vehiculeLoue;

    public Client(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.vehiculeLoue = null;
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public Vehicule getVehiculeLoue() { return vehiculeLoue; }

    public void louerVehicule(Vehicule vehicule) {
        if (vehicule.isDisponible()) {
            this.vehiculeLoue = vehicule;
            vehicule.setDisponible(false);
        } else {
            System.out.println("Le véhicule n'est pas disponible.");
        }
    }

    public void retournerVehicule() {
        if (this.vehiculeLoue != null) {
            this.vehiculeLoue.setDisponible(true);
            this.vehiculeLoue = null;
        }
    }

    @Override
    public String toString() {
        return "Client ===>>  ID: " + id + ", Nom: " + nom +
                ", Véhicule loué: " + (vehiculeLoue != null ? vehiculeLoue.getModele() : "Aucun");
    }
}

