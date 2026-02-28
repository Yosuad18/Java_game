public class UFCGame {
    public static void main(String[] args) {

        // 1. Elegir Categoría
        System.out.print("Elige categoría (Ligero/Wélter/Pesado): ");
        String cat = sc.nextLine();

        // 2. Configurar Jugador
        System.out.print("Nombre de tu peleador (escribe 'random' para azar): ");
        String p1Nombre = sc.nextLine();
        Pelea jugador = crearPeleador(p1Nombre, cat);

        // --- CATEGORÍA LIGERO (125 lb) ---
        // Campeón
        Striker campeonLigero = new Striker("Jhosua Van", "Mosca", 1200, 40, 90, 70, 50);
        // Top 5
        Striker rank1 = new Grappler("Alexandre Pantoja", "Mosca", 1000, 35, 85, 75, 45);
        Luchador rank2 = new Luchador("Manel Kape", "Mosca", 950, 30, 80, 85, 35);
        Grappler rank3 = new Grappler("Tatsuro Taira", "Mosca", 1050, 45, 70, 60, 40);
        Striker rank4 = new Striker("Brandon Royval", "Mosca", 1000, 42, 75, 65, 40);
        Striker rank5 = new Striker("Brandon Moreno", "Mosca", 1000, 42, 75, 65, 40);
        // --- CATEGORÍA LIGERO (135 lb) ---
        // Campeón
        Striker campeonLigero = new Striker("Petr Yan", "Gallo", 1200, 40, 90, 70, 50);
        // Top 5
        Striker rank1 = new Luchador("Merab Dvalishvili", "Gallo", 1000, 35, 85, 75, 45);
        Luchador rank2 = new Luchador("Umar Nurmagomedov", "Gallo", 950, 30, 80, 85, 35);
        Grappler rank3 = new Striker("Sean O'Malley", "Gallo", 1050, 45, 70, 60, 40);
        Striker rank4 = new Striker("Cory Sandhagen", "Gallo", 1000, 42, 75, 65, 40);
        Striker rank5 = new Striker("Song Yadong", "Gallo", 1000, 42, 75, 65, 40);

        // --- CATEGORÍA LIGERO (145 lb) ---
        // Campeón
        Striker campeonLigero = new Striker("Alexander Volkanosky", "Pluma", 1200, 40, 90, 70, 50);
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
        // --- CATEGORÍA LIGERO (155 lb) ---
        // --- CATEGORÍA LIGERO (155 lb) ---
        // --- CATEGORÍA LIGERO (155 lb) ---
        // --- CATEGORÍA LIGERO (155 lb) ---
        //Mas categorias  
        // --- SIMULACIÓN DE PELEA POR EL TÍTULO ---
        System.out.println("=== PELEA POR EL TITULO ===");
        //hacer random para elegir el retador
        System.out.println(campeonLigero.getNombre() + " (C) vs " + rank2.getNombre() + " (#2)");
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