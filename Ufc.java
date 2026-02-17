public class UFCGame {
    public static void main(String[] args) {
        // --- CATEGORÍA LIGERO (155 lb) ---
        // Campeón
        Striker campeonLigero = new Striker("Ilia Topuria", "Ligero", 1200, 40, 90, 70, 50);
        
        // Top 5
        Striker rank1 = new Striker("Justin Gaethje", "Ligero", 1000, 35, 85, 75, 45);
        Luchador rank2 = new Luchador("Arman Tsarukyan", "Ligero", 950, 30, 80, 85, 35);
        Grappler rank3 = new Grappler("Charles Oliveira", "Ligero", 1050, 45, 70, 60, 40);
        Striker rank4 = new Striker("Max Holloway", "Ligero", 1000, 42, 75, 65, 40);

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