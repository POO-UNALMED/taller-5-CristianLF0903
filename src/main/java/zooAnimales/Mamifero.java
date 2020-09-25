package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
  private static ArrayList<Mamifero> listado = new ArrayList<>();
  static int leones = 0;
  static int caballos = 0;
  private boolean pelaje;
  private int patas;
  
  public Mamifero(){totalAnimales++; listado.add(this);}
  
  public Mamifero(String name, int age, String habit, String g, boolean p, int pt){
  	this.setNombre(name);
  	this.setEdad(age);
  	this.setHabitat(habit);
  	this.setGenero(g);
  	this.pelaje = p;
  	this.patas = pt;
  	totalAnimales++;
  	listado.add(this);
  }

  public static int cantidadMamiferos() {
    return listado.size();
  }

  public void crearCaballo(String name, int age, String g) {
    Mamifero x = new Mamifero(name, age, "pradera", g, true, 4);
    caballos++;
  }

  public void crearLeon(String name, int age, String g) {
    Mamifero x = new Mamifero(name, age, "pradera", g, true, 4);
    leones++;
  }

  public Boolean getPelaje() {
    return this.pelaje;
  }

  public void setPelaje(Boolean y) {
    this.pelaje = y;
  }

  public int getPatas() {
    return this.patas;
  }

  public void setPatas(int y) {
    this.patas = y;
  }
}
