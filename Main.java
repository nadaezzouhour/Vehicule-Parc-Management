/*public class Main {
    public static void main(String[] args) {

        GestionParc gestionParc = new GestionParc();


        Vehicule v1 = new Vehicule(1, "Pppp", 500);
        Vehicule v2 = new Vehicule(2, "Tttt", 300);
        Vehicule v3 = new Vehicule(3, "Ggg", 200);

        gestionParc.ajouterVehicule(v1);
        gestionParc.ajouterVehicule(v2);
        gestionParc.ajouterVehicule(v3);

        Client c1 = new Client(1, "nn");
        Client c2 = new Client(2, "jj");

        gestionParc.ajouterClient(c1);
        gestionParc.ajouterClient(c2);


        gestionParc.affecterVehiculeAClient(c1, 1);
        gestionParc.affecterVehiculeAClient(c2, 2);


        gestionParc.afficherVehiculesDisponibles();


        gestionParc.retournerVehicule(c1);


        gestionParc.afficherVehiculesDisponibles();

        gestionParc.afficherClients();
    }
}
Exercice 2*/

public class Main {
    public static void main(String[] args) {
        GestionParc gestionParc = new GestionParc();

        Voiture voiture1 = new Voiture(1, "peogot", 600, 4);
        Camion camion1 = new Camion(2, "camion", 300, 10000);
        Scooter scooter1 = new Scooter(3, "Motor", 120, true);

        gestionParc.ajouterVehicule(voiture1);
        gestionParc.ajouterVehicule(camion1);
        gestionParc.ajouterVehicule(scooter1);

        Client client1 = new Client(1, "Nada");
        Client client2 = new Client(2, "Ali");

        gestionParc.ajouterClient(client1);
        gestionParc.ajouterClient(client2);

        gestionParc.affecterVehiculeAClient(client1, 1);
        gestionParc.afficherVehiculesDisponibles();

        gestionParc.retournerVehicule(client1);
        gestionParc.afficherVehiculesDisponibles();
    }
}
