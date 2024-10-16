import java.util.Scanner;

public class Perro {

    private String nombre;
    private String raza;
    private int edad;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void comer(String comida, double gramos) {
        System.out.println(nombre + " está comiendo " + gramos + " gramos de " + comida);

    }
    public String ladrar() {
        return "guau guau";

    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Perro perro1 = new Perro();
        System.out.print("Ingrese el nombre del primer perro: ");
        perro1.setNombre(scanner.nextLine());

        Perro perro2 = new Perro();
        System.out.print("Ingrese el nombre del segundo perro: ");
        perro2.setNombre(scanner.nextLine());

        perro1.comer("croquetas", 200);
        System.out.println(perro1.ladrar());

        perro2.comer("carne", 150);
        System.out.println(perro2.ladrar());

        scanner.close();
    }
}