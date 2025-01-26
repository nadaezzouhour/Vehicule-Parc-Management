import java.util.ArrayList;

/*public class GestionParc {
    private ArrayList<Vehicule> listeVehicules;
    private ArrayList<Client> listeClients;

    public GestionParc() {
        this.listeVehicules = new ArrayList<>();
        this.listeClients = new ArrayList<>();
    }

    public void ajouterVehicule(Vehicule vehicule) {
        listeVehicules.add(vehicule);
        System.out.println("Véhicule ajouté: " + vehicule);
    }

    public void ajouterClient(Client client) {
        listeClients.add(client);
        System.out.println("Client ajouté: " + client);
    }

    public void affecterVehiculeAClient(Client client, int vehiculeId) {
        for (Vehicule v : listeVehicules) {
            if (v.getId() == vehiculeId && v.isDisponible()) {
                client.louerVehicule(v);
                return;
            }
        }
        System.out.println("Véhicule non disponible ou non trouvé.");
    }

    public void retournerVehicule(Client client) {
        client.retournerVehicule();
    }

    public void afficherVehiculesDisponibles() {
        System.out.println("Véhicules disponibles :");
        for (Vehicule v : listeVehicules) {
            if (v.isDisponible()) {
                System.out.println(v);
            }
        }
    }

    public void afficherClients() {
        System.out.println("Liste des clients :");
        for (Client c : listeClients) {
            System.out.println(c);
        }
    }
}*/

import java.util.ArrayList;

public class GestionParc {
    private ArrayList<Vehicule> listeVehicules;
    private ArrayList<Client> listeClients;

    public GestionParc() {
        listeVehicules = new ArrayList<>();
        listeClients = new ArrayList<>();
    }

    public void ajouterVehicule(Vehicule vehicule) {
        listeVehicules.add(vehicule);
    }

    public void ajouterClient(Client client) {
        listeClients.add(client);
    }

    public void affecterVehiculeAClient(Client client, int vehiculeId) {
        for (Vehicule vehicule : listeVehicules) {
            if (vehicule.getId() == vehiculeId && vehicule.isDisponible()) {
                client.louerVehicule(vehicule);
                return;
            }
        }
        System.out.println("Véhicule non disponible ou introuvable.");
    }

    public void retournerVehicule(Client client) {
        client.retournerVehicule();
    }

    public void afficherVehiculesDisponibles() {
        for (Vehicule vehicule : listeVehicules) {
            if (vehicule.isDisponible()) {
                System.out.println(vehicule);
            }
        }
    }

    public void afficherClients() {
        for (Client client : listeClients) {
            System.out.println(client);
        }
    }
}


