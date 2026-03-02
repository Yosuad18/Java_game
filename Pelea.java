class Striker extends Peleador {
    public Striker(String nombre, String peso, int hp, int atk, int car, int agl, int def) {
        super(nombre, peso, hp, atk, car, agl, def);
    }

    @Override
    public void realizarAtaqueAleatorio(Peleador enemigo) {
        Random r = new Random();
        int opc = r.nextInt(3);
        if (opc == 0 && car >= 15) {
            int daño = (atk * 3) - (enemigo.def / 2);
            enemigo.setHp(enemigo.getHp() - daño);
            this.car -= 15;
            System.out.println(nombre + " lanzó una HIGH KICK: " + daño + " daño!");
        } else if (opc == 1) {
            int daño = (atk * 2) - (enemigo.def / 4);
            enemigo.setHp(enemigo.getHp() - daño);
            System.out.println(nombre + " conectó un Hook: " + daño + " daño!");
        } else {
            int daño = atk - (enemigo.def / 5);
            enemigo.setHp(enemigo.getHp() - daño);
            System.out.println(nombre + " marcó con un Jab: " + daño + " daño!");
        }
    }
}

class Grappler extends Peleador {
    public Grappler(String nombre, String peso, int hp, int atk, int car, int agl, int def) {
        super(nombre, peso, hp, atk, car, agl, def);
    }

    @Override
    public void realizarAtaqueAleatorio(Peleador enemigo) {
        Random r = new Random();
        int daño = 50;
        if (r.nextBoolean()) {
            enemigo.setHp(enemigo.getHp() - daño);
            System.out.println(nombre + " aplicó una Guillotina: " + daño + " daño!");
        } else {
            daño = 60;
            enemigo.setHp(enemigo.getHp() - daño);
            System.out.println(nombre + " encajó un Mata León: " + daño + " daño!");
        }
    }
}

class Luchador extends Peleador {
    public Luchador(String nombre, String peso, int hp, int atk, int car, int agl, int def) {
        super(nombre, peso, hp, atk, car, agl, def);
    }

    @Override
    public void realizarAtaqueAleatorio(Peleador enemigo) {
        int daño = (atk + agl) - (enemigo.def / 3);
        enemigo.setHp(enemigo.getHp() - daño);
        System.out.println(nombre + " ejecutó un Suplex: " + daño + " daño!");
    }
}