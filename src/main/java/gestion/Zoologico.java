package gestion;

import java.util.ArrayList;

public class Zoologico {
  private String nombre;
  private String ubicacion;
  private ArrayList<Zona> zonas = new ArrayList<>();

  public Zoologico(String name, String ub, ArrayList<Zona> z) {
    this.nombre = name;
    this.ubicacion = ub;
    this.zonas = z;
  }

  public Zoologico() {}

  public void agregarZonas(Zona zone) {
    zonas.add(zone);
    zone.setZoo(this);
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
    for (int i = 0; i < zonas.size(); i++) {
      Zona zone = zonas.get(i);
      int num = zone.cantidadAnimales();
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

  public ArrayList<Zona> getZonas() {
    return this.zonas;
  }
}
