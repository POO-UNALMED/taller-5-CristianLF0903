package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
  private static ArrayList<Reptil> listado = new ArrayList<>();
  public static int iguanas = 0;
  public static int serpientes = 0;
  private String colorEscamas;
  private int largoCola;

	public Reptil(){totalAnimales++; listado.add(this);}
	
	public Reptil(String name, int age, String habit, String g, String color, int l){
		this.setNombre(name);
		this.setEdad(age);
		this.setHabitat(habit);
		this.setGenero(g);
  	this.colorEscamas = color;
  	this.largoCola = l;
  	totalAnimales++;
  	listado.add(this);
	}
	
  public String getColorEscamas(){
    return this.colorEscamas;
  }

  public void setColorEscamas(String y) {
    this.colorEscamas = y;
  }

  public int getLargoCola() {
    return this.largoCola;
  }

  public void setLargoCola(int y) {
    this.largoCola = y;
  }

  public static int cantidadReptiles() {
    return listado.size();
  }

  public static Reptil crearIguana(String name, int age, String g) {
    Reptil x = new Reptil(name, age, "humedal", g, "verde",3);
    iguanas++;
    return x;
  }

  public static Reptil crearSerpiente(String name, int age, String g) {
    Reptil x = new Reptil(name, age, "jungla",g,"blanco",1);
    serpientes++;
    return x;
  }

  public String movimiento() {
    return "reptar";
  }
}
