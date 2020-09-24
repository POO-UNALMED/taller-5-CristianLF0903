package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
  private static ArrayList<Reptil> listado = new ArrayList<>();
  static int iguanas = 0;
  static int serpientes = 0;
  private String colorEscamas;
  private int largoCola;

	public Reptil(){totalAnimales++; listado.add(this);}
	
	public Reptil(String name, int age, String habit, String g, String color, int l){
		this.nombre = name;
  	this.edad = age;
  	this.habitat = habit;
  	this.genero = g;
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

  public void crearIguana(String name, int age, String g) {
    Reptil x = new Reptil(name, age, "humedal", g, "verde",3);
    iguanas++;
  }

  public void crearSerpiente(String name, int age, String g) {
    Reptil x = new Reptil(name, age, "jungla",g,"blanco",1);
    serpientes++;
  }

  public String movimiento() {
    return "reptar";
  }
}
