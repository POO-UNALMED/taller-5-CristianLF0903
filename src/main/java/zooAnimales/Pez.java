package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
  private static ArrayList<Pez> listado = new ArrayList<>();
  public static int salmones = 0;
  public static int bacalaos = 0;
  private String colorEscamas;
  private int cantidadAletas;
  
  public Pez(){totalAnimales++; listado.add(this);}
  
  public Pez(String name, int age, String habit, String g, String color, int cant){
  	this.setNombre(name);
  	this.setEdad(age);
  	this.setHabitat(habit);
  	this.setGenero(g);
  	this.colorEscamas = color;
  	this.cantidadAletas = cant;
  	totalAnimales++;
  	listado.add(this);
  }

  public static int cantidadPeces() {
    return listado.size();
  }

  public static Pez crearSalmon(String name, int age, String g) {
    Pez x = new Pez(name, age, "oceano", g, "rojo", 6);
    salmones++;
    return x;
  }

  public static Pez crearBacalao(String name, int age, String g) {
    Pez x = new Pez(name, age, "oceano", g, "gris", 6);
    bacalaos++;
    return x;
  }

  public String movimiento() {
    return "nadar";
  }

  public String getColorEscamas() {
    return this.colorEscamas;
  }

  public void setColorEscamas(String y) {
    this.colorEscamas = y;
  }

  public int getCantidadAletas() {
    return this.cantidadAletas;
  }

  public void setCantidadAletas(int y) {
    this.cantidadAletas = y;
  }
}
