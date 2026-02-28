import java.util.Random;
import java.util.Scanner;

public class Pelea {
    // Cambiar protected
    protected String nombre;
    protected String categoriaPeso;
    protected int hp, atk, car, agl, def;

    public Pelea(String nombre, String categoriaPeso, int hp, int atk, int car, int agl, int def) {
        this.nombre = nombre;
        this.categoriaPeso = categoriaPeso;
        this.hp = hp;
        this.atk = atk;
        this.car = car;
        this.agl = agl;
        this.def = def;
    }


    //Hacer mas get y set
    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = Math.max(0, hp); }
    public String getNombre() { return nombre; }
    public int getCar() { return car; }
    public void setCar(int car) { this.car = car; }
    public boolean estaVivo() { return hp > 0; }

    public void mostrarStatus() {
        System.out.println("[" + categoriaPeso + "] " + nombre + " | HP: " + hp + " | Cardio: " + car);
    }

    public boolean estaVivo() {
        return hp > 0;
    }
}