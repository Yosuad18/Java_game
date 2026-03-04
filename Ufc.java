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


// import java.util.Random;
// import java.util.Scanner;

// public class UFCGame {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Random rand = new Random();

//         // --- DEFINICIÓN DE TODOS LOS PELEADORES ---
//         // Mosca
//         Peleador[] mosca = {
//             new Striker("Jhosua Van", "Mosca", 1200, 40, 90, 70, 50),
//             new Grappler("Alexandre Pantoja", "Mosca", 1000, 35, 85, 75, 45),
//             new Luchador("Manel Kape", "Mosca", 950, 30, 80, 85, 35),
//             new Grappler("Tatsuro Taira", "Mosca", 1050, 45, 70, 60, 40),
//             new Striker("Brandon Royval", "Mosca", 1000, 42, 75, 65, 40),
//             new Striker("Brandon Moreno", "Mosca", 1000, 42, 75, 65, 40)
//         };

//         // Gallo
//         Peleador[] gallo = {
//             new Striker("Petr Yan", "Gallo", 1200, 40, 90, 70, 50),
//             new Luchador("Merab Dvalishvili", "Gallo", 1000, 35, 85, 75, 45),
//             new Luchador("Umar Nurmagomedov", "Gallo", 950, 30, 80, 85, 35),
//             new Striker("Sean O'Malley", "Gallo", 1050, 45, 70, 60, 40),
//             new Striker("Cory Sandhagen", "Gallo", 1000, 42, 75, 65, 40),
//             new Striker("Song Yadong", "Gallo", 1000, 42, 75, 65, 40)
//         };

//         // Ligero (Ejemplo para el resto de categorías)
//         Peleador[] ligero = {
//             new Striker("Ilia Topuria", "Ligero", 1200, 45, 100, 80, 50),
//             new Striker("Justin Gaethje", "Ligero", 1000, 40, 85, 70, 45),
//             new Luchador("Arman Tsarukyan", "Ligero", 1050, 35, 90, 75, 55),
//             new Grappler("Charles Oliveira", "Ligero", 1000, 42, 80, 75, 40),
//             new Striker("Max Holloway", "Ligero", 1100, 38, 110, 85, 50),
//             new Striker("Benoit Saint Denis", "Ligero", 950, 44, 75, 65, 40)
//         };

//         // 1. Elegir Categoría
//         System.out.println("Categorías: 1. Mosca | 2. Gallo | 3. Ligero");
//         System.out.print("Selecciona número de categoría: ");
//         int catNum = sc.nextInt();
//         sc.nextLine(); // Limpiar buffer

//         Peleador[] filtrados;
//         switch(catNum) {
//             case 1: filtrados = mosca; break;
//             case 2: filtrados = gallo; break;
//             default: filtrados = ligero; break;
//         }

//         // Mostrar Ranking de la categoría
//         System.out.println("\nRANKING SELECCIONADO:");
//         for(int i=0; i<filtrados.length; i++) {
//             System.out.println(i + ". " + (i==0 ? "[C] " : "") + filtrados[i].getNombre());
//         }

//         // 2. Configurar Jugador
//         System.out.print("\nElige tu peleador (0-5) o 'r' aleatorio: ");
//         String inputP1 = sc.nextLine();
//         Peleador p1 = inputP1.equalsIgnoreCase("r") ? filtrados[rand.nextInt(6)] : filtrados[Integer.parseInt(inputP1)];

//         // 3. Elegir contrincante 
//         System.out.print("Elige oponente (0-5) o 'r' aleatorio: ");
//         String inputP2 = sc.nextLine();
//         Peleador p2 = inputP2.equalsIgnoreCase("r") ? filtrados[rand.nextInt(6)] : filtrados[Integer.parseInt(inputP2)];

//         // --- LÓGICA DE ASALTOS ---
//         boolean esPorTitulo = (p1 == filtrados[0] || p2 == filtrados[0]);
//         int totalAsaltos = esPorTitulo ? 5 : 3;

//         System.out.println("\n=======================================");
//         System.out.println("¡COMIENZA LA PELEA!");
//         System.out.println(p1.getNombre() + " vs " + p2.getNombre());
//         System.out.println("Duración: " + totalAsaltos + " asaltos de 5 min.");
//         System.out.println("=======================================\n");

//         simularCombate(p1, p2, totalAsaltos);
//     }

//     public static void simularCombate(Peleador p1, Peleador p2, int asaltos) {
//         for (int a = 1; a <= asaltos; a++) {
//             if (!p1.estaVivo() || !p2.estaVivo()) break;

//             System.out.println(">>> ASALTO " + a + " <<<");

//             // 5 minutos, reportes cada 30 segundos (10 segmentos)
//             for (int seg = 30; seg <= 300; seg += 30) {
//                 if (!p1.estaVivo() || !p2.estaVivo()) break;

//                 System.out.print("[" + (seg/60) + ":" + (seg%60==0?"00":seg%60) + "] ");
                
//                 // Turnos aleatorios de ataque según su clase
//                 if (new Random().nextBoolean()) {
//                     p1.realizarAtaqueAleatorio(p2);
//                 } else {
//                     p2.realizarAtaqueAleatorio(p1);
//                 }

//                 p1.mostrarStatus();
//                 p2.mostrarStatus();
//                 System.out.println("-----------------------------------");
                
//                 try { Thread.sleep(600); } catch (Exception e) {} // Pausa para leer
//             }

//             // Descanso
//             if (a < asaltos && p1.estaVivo() && p2.estaVivo()) {
//                 System.out.println("\n--- FIN DEL ASALTO. LOS PELEADORES VAN A LA ESQUINA ---");
//                 p1.recuperarCardio();
//                 p2.recuperarCardio();
//                 System.out.println();
//             }
//         }

//         // Resultado Final
//         System.out.println("\n=== RESULTADOS FINALES ===");
//         if (!p1.estaVivo()) System.out.println("GANADOR POR KO: " + p2.getNombre());
//         else if (!p2.estaVivo()) System.out.println("GANADOR POR KO: " + p1.getNombre());
//         else {
//             String ganador = (p1.getHp() > p2.getHp()) ? p1.getNombre() : p2.getNombre();
//             System.out.println("GANADOR POR DECISIÓN: " + ganador);
//         }
//     }
// }

