package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
  private static ArrayList<Pez> listado = new ArrayList<>();
  static int salmones = 0;
  static int bacalaos = 0;
  private String colorEscamas;
  private int cantidadAletas;
  
  public Pez(){totalAnimales++; listado.add(this);}
  
  public Pez(String name, int age, String habit, String g, String color, int cant){
  	this.nombre = name;
  	this.edad = age;
  	this.habitat = habit;
  	this.genero = g;
  	this.colorEscamas;
  	this.cantidadAletas;
  	totalAnimales++;
  	listado.add(this);
  }

  public static int cantidadPeces() {
    return listado.size();
  }

  public void crearSalmon(String name, int age, String g) {
    Pez x = new Pez(name, age, "oceano", g, "rojo", 6);
    salmones++;
  }

  public void crearBacalo(String name, int age, String g) {
    Pez x = new Pez(name, age, "oceano", g, "gris", 6);
    bacalaos++;
  }

  public String movimiento() {
    return "nadar";
  }

  public String getColorEcamas() {
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
