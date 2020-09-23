package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
  private static ArrayList<Pez> listado = new ArrayList<>();
  static int salmones = 0;
  static int bacalaos = 0;
  private String colorEscamas;
  private int cantidadAletas;

  public static int cantidadPeces() {
    return listado.size();
  }

  public void crearSalmon() {
    Pez x = new Pez();
    x.cantidadAletas = 6;
    x.colorEscamas = "rojo";
    x.setHabitat("oceano");
    salmones++;
    totalAnimales++;
    listado.add(x);
  }

  public void crearBacalo() {
    Pez x = new Pez();
    x.cantidadAletas = 6;
    x.colorEscamas = "gris";
    x.setHabitat("oceano");
    bacalaos++;
    totalAnimales++;
    listado.add(x);
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
