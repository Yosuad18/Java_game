import java.util.Random;

public class Peleador {
    protected String nombre, categoriaPeso;
    protected int hp, atk, car, maxCar, agl, def;
    private final int rank;

    public Peleador(String nombre, String Peso ,int rank, int hp, int atk, int car, int agl, int def) {
        this.nombre = nombre;
        this.categoriaPeso = Peso;
        this.rank = rank;
        this.hp = hp;
        this.atk = atk;
        this.car = car;
        this.maxCar = car; // Guardamos el máximo para el descanso
        this.agl = agl;
        this.def = def;
    }

    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = Math.max(0, hp); }
    
    public String getNombre() { return nombre; }
    
    public int getRank() { return rank; }
    public String getNombreConRank() {return (rank == 0) ? "[C] " + nombre : "[" + rank + "] " + nombre;}
    
    public int getCar() { return car; }
    
    public boolean estaVivo() { return hp > 0; }
    
    public void recuperarCardio() {
        this.car = Math.min(maxCar, this.car + 20); // Recupera 20 por asalto
        System.out.println(">>> " + nombre + " recupera aliento en el descanso. Cardio: " + car);
    }

    // Este método será sobreescrito por cada estilo
    public void realizarAtaqueAleatorio(Peleador enemigo) {
        System.out.println(nombre + " lanza un golpe básico.");
    }
}
