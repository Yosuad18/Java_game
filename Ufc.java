import java.util.Random;
import java.util.Scanner;

public class Ufc {
    public static void main(String[] args) {
        //Entradas y random
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] categorias = {"Mosca", "Gallo", "Pluma", "Ligero", "Welter", "Mediano", "Semi-pesado", "Pesado"};
        for (String categoria : categorias) {
            System.out.println("Categorías: " + categoria);
        }
        
        System.out.print("Selecciona categoría (o 'r' para aleatoria): ");
        String entradaCat = sc.nextLine();
        
        String catElegida;
        if ("r".equalsIgnoreCase(entradaCat)) {
            catElegida = categorias[rand.nextInt(categorias.length)];
            System.out.println("Categoría aleatoria elegida: " + catElegida);
        } else {
            catElegida = entradaCat;
        }
           
        Peleador[] todos = Division.obtenerPeleadores(); 
        Peleador[] filtrados = filtrarPeleadores(todos, catElegida);

        if (filtrados[0] == null) {
            System.out.println("No se encontraron peleadores en esta categoría.");
            return;
        }
        
        System.out.println("\n--- LISTA DE PELEADORES (" + catElegida + ") ---");
        for (Peleador p : filtrados) {
            if (p != null) System.out.println(p.getNombreConRank());
        }
        
        Peleador jugador = seleccionarPeleador(sc, rand, filtrados, "tu peleador", -1);
        int idxJugador = obtenerIndice(filtrados, jugador);
        Peleador oponente = seleccionarPeleador(sc, rand, filtrados, "tu oponente", idxJugador);

        System.out.println("\n=== COMBATE: " + jugador.getNombre() + " vs " + oponente.getNombre() + " ===");
             
     
    public static Peleador[] filtrarPeleadores(Peleador[] listaTotal, String categoria) {
        Peleador[] resultado = new Peleador[6]; // C + Top 5
        for (Peleador p : listaTotal) {
            if (p.categoriaPeso.equalsIgnoreCase(categoria)) {
                if (p.getRank() >= 0 && p.getRank() <= 5) {
                    resultado[p.getRank()] = p;
                }
            }
        }
        return resultado;
    } 
        
    public static int obtenerIndice(Peleador[] lista, Peleador p) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == p) return i;
        }
        return -1;
    }
}
