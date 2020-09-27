package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave> listado = new ArrayList<>();
    public static int aguilas = 0;
    public static int halcones = 0;
    private String colorPlumas;
    
    public Ave(){totalAnimales++; listado.add(this);}
    
    public Ave(String name, int age, String habit, String g, String color){
    	this.setNombre(name);
    	this.setEdad(age);
 	  	this.setHabitat(habit);
 	  	this.setGenero(g);
 	  	this.colorPlumas = color;
 	  	totalAnimales++;
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

    public static Ave crearAguila(String name, int age, String g){
    	Ave x = new Ave(name, age, "montana", g, "blanco y amarillo");
      aguilas++;
      return x;
    }

    public static Ave crearHalcon(String name, int age, String g){
        Ave x = new Ave(name, age, "montana", g, "cafe glorioso");
        halcones++;
        return x;
    }

    public String movimiento() {
        return "volar";
      }
}
