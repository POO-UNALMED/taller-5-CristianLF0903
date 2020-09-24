package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
  private static ArrayList<Mamifero> listado = new ArrayList<>();
  static int leones = 0;
  static int caballos = 0;
  private boolean pelaje;
  private int patas;
  
  public Mamifero(){}
  
  public Mamifero(String name, int age, String habit, String g, boolean p, int pt){
  	this.nombre = name;
  	this.edad = age;
  	this.habitat = habit;
  	this.genero = g;
  	this.pelaje = p;
  	this.patas = pt;
  }

  public static int cantidadMamiferos() {
    return listado.size();
  }

  public void crearCaballo() {
    Mamifero x = new Mamifero();
    x.patas = 4;
    x.pelaje = true;
    x.setHabitat("pradera");
    caballos++;
    totalAnimales++;
    listado.add(x);
  }

  public void crearLeon() {
    Mamifero x = new Mamifero();
    x.patas = 4;
    x.pelaje = true;
    x.setHabitat("pradera");
    leones++;
    totalAnimales++;
    listado.add(x);
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
