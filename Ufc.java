import java.util.Random;
import java.util.Scanner;

public class UFCGame {
    public static void main(String[] args) {

        // 1. Elegir Categoría
        System.out.println("Categorías disponibles: Mosca, Ligero, Gallo, Pluma, Welter, Mediano, Semi-pesado, Pesado");
        System.out.print("Selecciona categoría: ");
        String catElegida = sc.nextLine();

        // 2. Configurar Jugador
        System.out.print("Elige tu peleador (0-5), 'c' para el Campeón, o 'r' para aleatorio: ");
        String inputP1 = sc.nextLine();
        Pelea jugador;
        if (inputP1.equalsIgnoreCase("r")) {
            jugador = filtrados[rand.nextInt(6)];
        } else {
            int sel = Integer.parseInt(inputP1);
            jugador = filtrados[sel];
        }

        //3. Elegir contrincante 
        System.out.print("Elige oponente (0-5), 'c' para el Campeón, o 'r' para aleatorio: ");
        String inputP2 = sc.nextLine();
        Pelea oponente;
        if (inputP2.equalsIgnoreCase("c")) {
            oponente = filtrados[0];
        } else if (inputP2.equalsIgnoreCase("r")) {
            oponente = filtrados[rand.nextInt(6)];
        } else {
            oponente = filtrados[Integer.parseInt(inputP2)];
        }

        // --- CATEGORÍA LIGERO (125 lb) ---
        // Campeón
        Striker campeonMosca = new Striker("Jhosua Van", "Mosca", 1200, 40, 90, 70, 50);
        // Top 5
        Striker rank1 = new Grappler("Alexandre Pantoja", "Mosca", 1000, 35, 85, 75, 45);
        Luchador rank2 = new Luchador("Manel Kape", "Mosca", 950, 30, 80, 85, 35);
        Grappler rank3 = new Grappler("Tatsuro Taira", "Mosca", 1050, 45, 70, 60, 40);
        Striker rank4 = new Striker("Brandon Royval", "Mosca", 1000, 42, 75, 65, 40);
        Striker rank5 = new Striker("Brandon Moreno", "Mosca", 1000, 42, 75, 65, 40);

        // --- CATEGORÍA LIGERO (135 lb) ---
        // Campeón
        Striker campeonGallo = new Striker("Petr Yan", "Gallo", 1200, 40, 90, 70, 50);
        // Top 5
        Striker rank1 = new Luchador("Merab Dvalishvili", "Gallo", 1000, 35, 85, 75, 45);
        Luchador rank2 = new Luchador("Umar Nurmagomedov", "Gallo", 950, 30, 80, 85, 35);
        Grappler rank3 = new Striker("Sean O'Malley", "Gallo", 1050, 45, 70, 60, 40);
        Striker rank4 = new Striker("Cory Sandhagen", "Gallo", 1000, 42, 75, 65, 40);
        Striker rank5 = new Striker("Song Yadong", "Gallo", 1000, 42, 75, 65, 40);

        // --- CATEGORÍA LIGERO (145 lb) ---
        // Campeón
        Striker campeonPluma = new Striker("Alexander Volkanosky", "Pluma", 1200, 40, 90, 70, 50);
        // Top 5
        Striker rank1 = new Luchador("Movsar Evloev", "Pluma", 1000, 35, 85, 75, 45);
        Luchador rank2 = new Striker("Diego Lopes", "Pluma", 950, 30, 80, 85, 35);
        Grappler rank3 = new Striker("Lerone Murphy", "Pluma", 1050, 45, 70, 60, 40);
        Striker rank4 = new Striker("Yair Rodriguez", "Pluma", 1000, 42, 75, 65, 40);
        Striker rank5 = new Grappler("Aljamain Sterling", "Pluma", 1000, 42, 75, 65, 40);

        // --- CATEGORÍA LIGERO (155 lb) ---
        // Campeón
        Striker campeonLigero = new Striker("Ilia Topuria", "Ligero", 1200, 40, 90, 70, 50);
        // Top 5
        Striker rank1 = new Striker("Justin Gaethje", "Ligero", 1000, 35, 85, 75, 45);
        Luchador rank2 = new Luchador("Arman Tsarukyan", "Ligero", 950, 30, 80, 85, 35);
        Grappler rank3 = new Grappler("Charles Oliveira", "Ligero", 1050, 45, 70, 60, 40);
        Striker rank4 = new Striker("Max Holloway", "Ligero", 1000, 42, 75, 65, 40);
        Striker rank5 = new Striker("Benoit Saint Denis", "Ligero", 1000, 42, 75, 65, 40);

        // --- CATEGORÍA LIGERO (170 lb) ---
        // Campeón
        Striker campeonWelter = new Striker("Islam Makachev", "Welter", 1200, 40, 90, 70, 50);
        // Top 5
        Striker rank1 = new Striker("Jack Della Maddalena", "Welter", 1000, 35, 85, 75, 45);
        Striker rank2 = new Striker("Ian Machado Garry", "Welter", 950, 30, 80, 85, 35);
        Striker rank3 = new Striker("Michael Morales", "Welter", 1050, 45, 70, 60, 40);
        Luchador rank4 = new Luchador("Belal Muhammad", "Welter", 1000, 42, 75, 65, 40);
        Striker rank5 = new Striker("Carlos Prates", "Welter", 1000, 42, 75, 65, 40);

        // --- CATEGORÍA LIGERO (185 lb) ---
        // Campeón
        Luchador campeonMedio = new Luchador("Khamzat Chimaev", "Mediano", 1200, 40, 90, 70, 50);
        // Top 5
        Striker rank1 = new Striker("Dricus Du Plessis", "Mediano", 1000, 35, 85, 75, 45);
        Striker rank2 = new Striker("Nassourdine Imavov", "Mediano", 950, 30, 80, 85, 35);
        Striker rank3 = new Striker("Sean Strickland", "Mediano", 1050, 45, 70, 60, 40);
        Grappler rank4 = new Grappler("Brendan Allen", "Mediano", 1000, 42, 75, 65, 40);
        Striker rank5 = new Striker("Israel Adesanya", "Mediano", 1000, 42, 75, 65, 40);

        // --- CATEGORÍA LIGERO (205 lb) ---
        // Campeón
        Striker campeonSemi_pesado = new Striker("Alex Pereira", "Semi-pesado", 1200, 40, 90, 70, 50);
        // Top 5
        Luchador rank1 = new Luchador("Magomed Ankalaev", "Semi-pesado", 1000, 35, 85, 75, 45);
        Striker rank2 = new Striker("Jiří Procházka", "Semi-pesado", 950, 30, 80, 85, 35);
        Striker rank3 = new Striker("Carlos Ulberg", "Semi-pesado", 1050, 45, 70, 60, 40);
        Striker rank4 = new Striker("Khalil Rountree Jr", "Semi-pesado", 1000, 42, 75, 65, 40);
        Striker rank5 = new Striker("Jan Błachowicz", "Semi-pesado", 1000, 42, 75, 65, 40);

        // --- CATEGORÍA LIGERO (206 a 265 lb) ---
        // Campeón
        Striker campeonPesado = new Striker("Tom Aspinnal", "Pesado", 1200, 40, 90, 70, 50);
        // Top 5
        Striker rank1 = new Striker("Ciryl Gane", "Pesado", 1000, 35, 85, 75, 45);
        Striker rank2 = new Striker("Alexander Volkov", "Pesado", 950, 30, 80, 85, 35);
        Striker rank3 = new Striker("Sergei Pavlovich", "Pesado", 1050, 45, 70, 60, 40);
        Striker rank4 = new Striker("Curtis Blaydes", "Pesado", 1000, 42, 75, 65, 40);
        Striker rank5 = new Striker("Waldo Cortes Acosta", "Pesado", 1000, 42, 75, 65, 40);

        // --- SIMULACIÓN DE PELEA POR EL TÍTULO ---
        System.out.println("=== PELEA POR EL TITULO ===");
        //hacer random para elegir el retador
        System.out.println(inputP1.getNombre() + inputP2.getNombre() );
        System.out.println("-----------------------------------");

        // Cambiar 
        while (campeonLigero.estaVivo() && rank2.estaVivo()) {
            // Turno del Campeón
            campeonLigero.lanzarHighKick(rank2);
            
            if (!rank2.estaVivo()) break;

            // Turno del Retador
            rank2.mataLeon(campeonLigero);

            // Mostrar Estado
            campeonLigero.mostrarStatus();
            rank2.mostrarStatus();
            System.out.println(" ");
        }

        // Resultado
        System.out.println("=== RESULTADOS FINALES ===");
        if (campeonLigero.estaVivo()) {
            System.out.println("AND STILL! " + campeonLigero.getNombre() + " retiene el título.");
        } else {
            System.out.println("AND NEW! " + rank2.getNombre() + " es el nuevo campeón.");
        }
    }
}
