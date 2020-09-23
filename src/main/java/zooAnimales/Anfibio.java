package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
  private static ArrayList<Anfibio> listado = new ArrayList<>();
  static int ranas = 0;
  static int salamandras = 0;
  private boolean venenoso;
  private String ColorPiel;

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

  public void crearSalamandra() {
    Anfibio x = new Anfibio();
    x.ColorPiel = "negro y amarillo";
    x.venenoso = false;
    x.setHabitat("selva");
    salamandras++;
    totalAnimales++;
    listado.add(x);
  }

  public void crearRanas() {
    Anfibio x = new Anfibio();
    x.ColorPiel = "rojo";
    x.venenoso = true;
    x.setHabitat("selva");
    ranas++;
    totalAnimales++;
    listado.add(x);
  }

  public String movimiento() {
    return "saltar";
  }
}
