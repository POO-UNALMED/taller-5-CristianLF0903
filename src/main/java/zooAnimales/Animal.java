package zooAnimales;

import gestion.*;

public class Animal {
  static int totalAnimales = 0;
  private String nombre;
  private int edad;
  private String habitat;
  private String genero;
  private Zona zona;

  public Animal(String name, int num, String habit, String g) {
    totalAnimales++;
    this.nombre = name;
    this.edad = num;
    this.habitat = habit;
    this.genero = g;
  }

  public Animal() {
    totalAnimales++;
  }

  public void setNombre(String name) {
    this.nombre = name;
  }

  public void setEdad(int num) {
    this.edad = num;
  }

  public void setGenero(String g) {
    this.genero = g;
  }

  public void setHabitat(String h) {
    this.habitat = h;
  }

  public void setZona(Zona b) {
    this.zona = b;
  }

  public String getNombre(){
    return this.nombre;
  }

  public int getEdad(){
    return this.edad;
  }

  public String getGenero(){
    return this.genero;
  }

  public String getHabitat(){
    return this.habitat;
  }

  public Zona getZona(){
    return this.zona;
  }

  public String movimiento() {
    return "desplazarse";
  }

  public String toString() {
    if (zona != null) {
      return (
        "Mi nombre es " +
        this.nombre +
        ", tengo una edad de " +
        this.edad +
        ", habito en " +
        this.habitat +
        " y mi genero es " +
        this.genero +
        ", la zona en la que me ubico es " +
        this.zona.getNombre() +
        ", en el " +
        zona.getZoo().getNombre()
      );
    } else {
      return (
        "Mi nombre es " +
        this.nombre +
        ", tengo una edad de " +
        this.edad +
        ", habito en " +
        this.habitat +
        " y mi genero es " +
        this.genero
      );
    }
  }

  public void totalPorTipo() {
    System.out.println("Mamiferos: " + Mamifero.cantidadMamiferos());
    System.out.println("Aves: " + Ave.cantidadAves());
    System.out.println("Reptiles: " + Reptil.cantidadReptiles());
    System.out.println("Peces: " + Pez.cantidadPeces());
    System.out.println("Anfibios: " + Anfibio.cantidadAnfibios());
  }
}
