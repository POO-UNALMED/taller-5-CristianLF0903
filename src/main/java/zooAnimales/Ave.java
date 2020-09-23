package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave> listado = new ArrayList<>();
    static int aguilas = 0;
    static int halcones = 0;
    private String colorPlumas;

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
        x.setHabitat("montañas");
        aguilas++;
        totalAnimales++;
        listado.add(x);
    }

    public void crearHalon(){
        Ave x = new Ave();
        x.colorPlumas = "cafe glorioso";
        x.setHabitat("montañas");
        halcones++;
        totalAnimales++;
        listado.add(x);
    }

    public String movimiento() {
        return "volar";
      }
}
