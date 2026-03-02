class Striker extends Pelea {
    public Striker(String nombre, String peso, int hp, int atk, int car, int agl, int def) {
        super(nombre, peso, hp, atk, car, agl, def);
    }
    @Override
    
    public void lanzarHighKick(Pelea enemigo) {
        if (car >= 15) {
            int daño = (atk * 3) - (enemigo.def / 2);
            enemigo.setHp(enemigo.getHp() - daño);
            this.car -= 15;
            System.out.println(nombre + " lanzó una HIGH KICK brutal: " + daño + " de daño!");
        } else {
            System.out.println(nombre + " está muy cansado para patear.");
        }
    }

    public void lanzarJab(Pelea enemigo) {
        int daño = atk - (enemigo.def / 3);
        enemigo.setHp(enemigo.getHp() - daño);
        System.out.println(nombre + " lanzó un Jab: " + daño + " de daño!");
    }

    public void lanzarCross(Pelea enemigo) {
        int daño = (atk * 2) - (enemigo.def / 4);
        enemigo.setHp(enemigo.getHp() - daño);
        System.out.println(nombre + " lanzó un Cross: " + daño + " de daño!");
    }

    public void lanzarUppercut(Pelea enemigo) {
        int daño = (atk * 2) - (enemigo.def / 3);
        enemigo.setHp(enemigo.getHp() - daño);
        System.out.println(nombre + " lanzó un Uppercut: " + daño + " de daño!");
    }

    public void lanzarHook(Pelea enemigo) {
        int daño = (atk * 2) - (enemigo.def / 4);
        enemigo.setHp(enemigo.getHp() - daño);
        System.out.println(nombre + " lanzó un Hook: " + daño + " de daño!");
    }

    public void lanzarLowKick(Pelea enemigo) {
        int daño = (atk * 2) - (enemigo.def / 5);
        enemigo.setHp(enemigo.getHp() - daño);
        System.out.println(nombre + " lanzó una Low Kick: " + daño + " de daño!");
    }
}

// class Striker extends Peleador {
//     public Striker(String nombre, String peso, int hp, int atk, int car, int agl, int def) {
//         super(nombre, peso, hp, atk, car, agl, def);
//     }

//     @Override
//     public void realizarAtaqueAleatorio(Peleador enemigo) {
//         Random r = new Random();
//         int opc = r.nextInt(3);
//         if (opc == 0 && car >= 15) {
//             int daño = (atk * 3) - (enemigo.def / 2);
//             enemigo.setHp(enemigo.getHp() - daño);
//             this.car -= 15;
//             System.out.println(nombre + " lanzó una HIGH KICK: " + daño + " daño!");
//         } else if (opc == 1) {
//             int daño = (atk * 2) - (enemigo.def / 4);
//             enemigo.setHp(enemigo.getHp() - daño);
//             System.out.println(nombre + " conectó un Hook: " + daño + " daño!");
//         } else {
//             int daño = atk - (enemigo.def / 5);
//             enemigo.setHp(enemigo.getHp() - daño);
//             System.out.println(nombre + " marcó con un Jab: " + daño + " daño!");
//         }
//     }
// }