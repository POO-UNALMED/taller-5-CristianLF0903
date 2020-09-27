package gestion;

import java.util.ArrayList;

public class Zoologico {
  private String nombre;
  private String ubicacion;
  private ArrayList<Zona> zonas = new ArrayList<>();

  public Zoologico(String name, String ub) {
    this.nombre = name;
    this.ubicacion = ub;
  }

  public Zoologico() {}

  public void agregarZonas(Zona zone) {
    zonas.add(zone);
  }

  public void setUbicacion(String ub) {
    this.ubicacion = ub;
  }

  public void setNombre(String name) {
    this.nombre = name;
  }

  public void setZonas(ArrayList<Zona> z) {
    this.zonas = z;
  }

  public int cantidadTotalAnimales() {
    int animales = 0;
    for (int i = 0; i < this.zonas.size(); i++) {
      int num = this.zonas.get(i).getAnimales().size();
      animales = animales + num;
    }
    return animales;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getUbicacion() {
    return this.ubicacion;
  }

  public ArrayList<Zona> getZona() {
    return this.zonas;
  }
}
