class Luchador extends Peleador {
    public Luchador(String nombre, String peso,int rank, int hp, int atk, int car, int agl, int def) {
        super(nombre, peso,rank, hp, atk, car, agl, def);
    }

    public void slam(Peleador enemigo) {
        int daño = (atk + agl) - enemigo.def;
        enemigo.setHp(enemigo.getHp() - daño);
        System.out.println(nombre + " aplicó un Suplex: " + daño + " de daño!");
    }

    public void single_leg(Peleador enemigo) {
        int daño = (atk + agl) - (enemigo.def / 2);
        enemigo.setHp(enemigo.getHp() - daño);
        System.out.println(nombre + " intentó un Single Leg Takedown: " + daño + " de daño!");
    }

    public void double_leg(Peleador enemigo) {
        int daño = (atk + agl) - (enemigo.def / 3);
        enemigo.setHp(enemigo.getHp() - daño);
        System.out.println(nombre + " intentó un Double Leg Takedown: " + daño + " de daño!");
    }

    public void body_lock(Peleador enemigo) {
        int daño = (atk + agl) - (enemigo.def / 4);
        enemigo.setHp(enemigo.getHp() - daño);
        System.out.println(nombre + " aplicó un Body Lock: " + daño + " de daño!");
    }

    public void proyeccion (Peleador enemigo) {
        int daño = (atk + agl) - (enemigo.def / 5);
        enemigo.setHp(enemigo.getHp() - daño);
        System.out.println(nombre + " ejecutó una Proyección: " + daño + " de daño!");
    }
}

// class Luchador extends Peleador {
//     public Luchador(String nombre, String peso, int hp, int atk, int car, int agl, int def) {
//         super(nombre, peso, hp, atk, car, agl, def);
//     }

//     @Override
//     public void realizarAtaqueAleatorio(Peleador enemigo) {
//         int daño = (atk + agl) - (enemigo.def / 3);
//         enemigo.setHp(enemigo.getHp() - daño);
//         System.out.println(nombre + " ejecutó un Suplex: " + daño + " daño!");
//     }
// }

