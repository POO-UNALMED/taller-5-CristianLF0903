package gestion;

import java.util.ArrayList;
import zooAnimales.*;

public class Zona {
  private String nombre;
  private Zoologico zoo;
  private ArrayList<Animal> animales = new ArrayList<>();

  public Zona(String name, Zoologico z, ArrayList<Animal> animals) {
    this.nombre = name;
    this.zoo = z;
    this.animales = animals;
  }

  public Zona() {}

  public void setNombre(String name) {
    this.nombre = name;
  }

  public void setAnimales(ArrayList<Animal> list) {
    this.animales = list;    
  }
  public void agregarAnimales(Animal a) {
    animales.add(a);
  }

  public void setZoo(Zoologico z) {
    this.zoo = z;
    z.agregarZonas(this);
  }

  public int cantidadAnimales() {
    return animales.size();
  }

  public Zoologico getZoo() {
    return this.zoo;
  }

  public String getNombre() {
    return this.nombre;
  }

  public ArrayList<Animal> getAnimales() {
    return animales;
  }
}
