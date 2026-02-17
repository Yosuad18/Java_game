class Luchador extends Pelea {
    public Luchador(String nombre, String peso, int hp, int atk, int car, int agl, int def) {
        super(nombre, peso, hp, atk, car, agl, def);
    }

    public void slam(Pelea enemigo) {
        int daño = (atk + agl) - enemigo.def;
        enemigo.setHp(enemigo.getHp() - daño);
        System.out.println(nombre + " aplicó un Suplex: " + daño + " de daño!");
    }

    public void single_leg(Pelea enemigo) {
        int daño = (atk + agl) - (enemigo.def / 2);
        enemigo.setHp(enemigo.getHp() - daño);
        System.out.println(nombre + " intentó un Single Leg Takedown: " + daño + " de daño!");
    }

    public void double_leg(Pelea enemigo) {
        int daño = (atk + agl) - (enemigo.def / 3);
        enemigo.setHp(enemigo.getHp() - daño);
        System.out.println(nombre + " intentó un Double Leg Takedown: " + daño + " de daño!");
    }

    public void body_lock(Pelea enemigo) {
        int daño = (atk + agl) - (enemigo.def / 4);
        enemigo.setHp(enemigo.getHp() - daño);
        System.out.println(nombre + " aplicó un Body Lock: " + daño + " de daño!");
    }

    public void proyeccion (Pelea enemigo) {
        int daño = (atk + agl) - (enemigo.def / 5);
        enemigo.setHp(enemigo.getHp() - daño);
        System.out.println(nombre + " ejecutó una Proyección: " + daño + " de daño!");
    }
}