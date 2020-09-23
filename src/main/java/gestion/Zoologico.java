package gestion;

class Zoologico{
  private String nombre;
  private String ubicacion;
  private arrayList<Zona> zonas = new ArrayList();
  
  public Zoologico(String name, String ub, Arraylist<Zona> z){
    this.nombre = name;
    this.ubicacion = ub;
    this.zonas = z; 
  }
  public Zoologico(){
    
  }
  
  public void agregarZonas(Zona zone){
    zonas.add(zon);
  }
  public int cantidadTotalAnimales(){
    int animales = 0;
    for(int i=0; i<zonas.size(); i++){
      animales = animales + zonas[i].animales.size();
    }
    return animales;
  }
}