class Grappler extends Pelea {
    public Grappler(String nombre, String peso, int hp, int atk, int car, int agl, int def) {
        super(nombre, peso, hp, atk, car, agl, def);
    }

    public void mataLeon(Pelea enemigo) {
        int daño = 60; // Daño fijo por sumisión
        enemigo.setHp(enemigo.getHp() - daño);
        System.out.println(nombre + " encajó un Mata León: " + daño + " de daño!");
    }

    public void guillotina(Pelea enemigo) {
        int daño = 50; // Daño fijo por sumisión
        enemigo.setHp(enemigo.getHp() - daño);
        System.out.println(nombre + " aplicó una Guillotina: " + daño + " de daño!");
    }

    public void armbar(Pelea enemigo) {
        int daño = 55; // Daño fijo por sumisión
        enemigo.setHp(enemigo.getHp() - daño);
        System.out.println(nombre + " ejecutó un Armbar: " + daño + " de daño!");
    }

    public void triangulo_de_brazo(Pelea enemigo) {
        int daño = 45; // Daño fijo por sumisión
        enemigo.setHp(enemigo.getHp() - daño);
        System.out.println(nombre + " aplicó un Triangulo de Brazo: " + daño + " de daño!");
    }
}