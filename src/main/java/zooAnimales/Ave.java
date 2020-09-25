package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave> listado = new ArrayList<>();
    static int aguilas = 0;
    static int halcones = 0;
    private String colorPlumas;
    
    public Ave(){totalAnimales++; listado.add(this);}
    
    public Ave(String name, int age, String habit, String g, String color){
    	this.setNombre(name);
    	this.setEdad(age);
 	  	this.setHabitat(habit);
 	  	this.setGenero(g);
 	  	this.colorPlumas = color;
 	  	totalAnimales++
 	  	listado.add(this);
    }

    public String getColorPlumas() {
        return this.colorPlumas;
      }
    
      public void setPelaje(String y) {
        this.colorPlumas = y;
      }

    public static int cantidadAves(){
        return listado.size();
    }

    public void crearAguila(String name, int age, String g){
    	Ave x = new Ave(name, age, "montana", g, "blanco y amarillo");
    	aguilas++;
    }

    public void crearHalon(String name, int age, String g){
        Ave x = new Ave(name, age, "montana", g, "cafe glorioso");
        halcones++;
    }

    public String movimiento() {
        return "volar";
      }
}
