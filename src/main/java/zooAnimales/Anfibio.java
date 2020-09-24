package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
  private static ArrayList<Anfibio> listado = new ArrayList<>();
  static int ranas = 0;
  static int salamandras = 0;
  private boolean venenoso;
  private String ColorPiel;
  
  public Anfibio(){totalAnimales++; listado.add(this);}
  
  public Anfibio(String name, int age, String habit, String g, String color, boolean v){
  	this.nombre = name;
  	this.edad = age;
  	this.habitat = habit;
  	this.genero = g;
  	this.colorPiel = color;
  	this.venenoso = v;
  	totalAnimales++;
  	listado.add(this);
  }

  public Boolean getVenenoso() {
    return this.venenoso;
  }

  public void setVenenoso(Boolean y) {
    this.venenoso = y;
  }

  public String getColorPiel() {
    return this.ColorPiel;
  }

  public void setPelaje(String y) {
    this.ColorPiel = y;
  }

  public static int cantidadAnfibios() {
    return listado.size();
  }

  public void crearSalamandra(String name, int age, String g) {
    Anfibio x = new Anfibio(name, agen, "selva", g, "negro y amarillo", false);
    salamandras++;
  }

  public void crearRana(String name, int age, String g) {
      Anfibio x = new Anfibio(name, agen, "selva", g, "negro y amarillo", false);
      ranas++;
  }

  public String movimiento() {
    return "saltar";
  }
}
