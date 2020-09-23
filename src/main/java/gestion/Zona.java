package gestion;

class Zona{
  private String nombre;
  private Zoologico zoo;
  private ArrayList<Animal> animales = new ArrayList();
  
  public Zona(String name, Zoologico z, ArrayList<Animal> animals){
    this.nombre = name;
    this.zoo = z; 
    this.animales = animals;
  }
  
  public Zona(){
    
  }
  
  public void agregarAnimales(Animal a){
    animales.add(a);
  }
  
  public int cantidadAnimales(){
    return animales.size();
  }
}