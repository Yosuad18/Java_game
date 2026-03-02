import java.util.*;

public class Division {

    private String nombre;
    private Peleador campeon;
    private List<Peleador> ranking; // posiciones 1 al 5

    public Division(String nombre, Peleador campeon) {
        this.nombre = nombre;
        this.campeon = campeon;
        this.ranking = new ArrayList<>();
    }

    public void agregarRankeado(Peleador p) {
        if (ranking.size() < 5) {
            ranking.add(p);
        }
    }

    public void mostrarRanking() {
        System.out.println("=== DIVISIÓN " + nombre.toUpperCase() + " ===");
        System.out.println("C - " + campeon.getNombre());
        for (int i = 0; i < ranking.size(); i++) {
            System.out.println((i + 1) + " - " + ranking.get(i).getNombre());
        }
    }

    public Peleador elegirOponente(String opcion) {

        if (opcion.equalsIgnoreCase("C")) {
            return campeon;
        }

        int pos = Integer.parseInt(opcion);

        if (pos >= 1 && pos <= ranking.size()) {
            return ranking.get(pos - 1);
        }

        return null;
    }

    public String getNombre() {
        return nombre;
    }
}