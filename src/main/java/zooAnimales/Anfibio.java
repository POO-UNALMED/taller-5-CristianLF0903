package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
  private static ArrayList<Anfibio> listado = new ArrayList<>();
  public static int ranas = 0;
  public static int salamandras = 0;
  private boolean venenoso;
  private String colorPiel;
  
  public Anfibio(){totalAnimales++; listado.add(this);}
  
  public Anfibio(String name, int age, String habit, String g, String color, boolean v){
  	this.setNombre(name);
  	this.setEdad(age);
  	this.setHabitat(habit);
  	this.setGenero(g);
  	this.colorPiel = color;
  	this.venenoso = v;
  	totalAnimales++;
  	listado.add(this);
  }

  public Boolean isVenenoso() {
    return this.venenoso;
  }

  public void setVenenoso(Boolean y) {
    this.venenoso = y;
  }

  public String getColorPiel() {
    return this.colorPiel;
  }

  public void setPelaje(String y) {
    this.colorPiel = y;
  }

  public static int cantidadAnfibios() {
    return listado.size();
  }

  public static Anfibio crearSalamandra(String name, int age, String g) {
    Anfibio x = new Anfibio(name, age, "selva", g, "negro y amarillo", false);
    salamandras++;
    return x;
  }

  public static Anfibio crearRana(String name, int age, String g) {
      Anfibio x = new Anfibio(name, age, "selva", g, "negro y amarillo", false);
      ranas++;
      return x;
  }

  public String movimiento() {
    return "saltar";
  }
}
