package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave> listado = new ArrayList<>();
    static int aguilas = 0;
    static int halcones = 0;
    private String colorPlumas;
    
    public Ave(){
    }
    
    public Ave(String name, int age, String habit, String g, String color){
    	this.nombre = name;
    	this.edad = age;
 	  	this.habitat = habit;
 	  	this.genero = g;
 	  	this.colorPlumas = color;
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

    public void crearAguila(){
        Ave x = new Ave();
        x.colorPlumas = "blanco y amarillo";
        x.setHabitat("monta�as");
        aguilas++;
        totalAnimales++;
        listado.add(x);
    }

    public void crearHalon(){
        Ave x = new Ave();
        x.colorPlumas = "cafe glorioso";
        x.setHabitat("monta�as");
        halcones++;
        totalAnimales++;
        listado.add(x);
    }

    public String movimiento() {
        return "volar";
      }
}
