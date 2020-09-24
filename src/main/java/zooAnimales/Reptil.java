package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
  private static ArrayList<Reptil> listado = new ArrayList<>();
  static int iguanas = 0;
  static int serpientes = 0;
  private String colorEscamas;
  private int largoCola;

	public Reptil(){}
	
	public Reptil(String name, int age, String habit, String g, String color, int l){
		this.nombre = name;
  	this.edad = age;
  	this.habitat = habit;
  	this.genero = g;
  	this.colorEscamas = color;
  	this.largoCola = l;
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

  public void crearIguana() {
    Reptil x = new Reptil();
    x.colorEscamas = "verde";
    x.largoCola = 3;
    x.setHabitat("humedal");
    iguanas++;
    totalAnimales++;
    listado.add(x);
  }

  public void crearSerpiente() {
    Reptil x = new Reptil();
    x.colorEscamas = "blanco";
    x.largoCola = 1;
    x.setHabitat("jungla");
    serpientes++;
    totalAnimales++;
    listado.add(x);
  }

  public String movimiento() {
    return "reptar";
  }
}
