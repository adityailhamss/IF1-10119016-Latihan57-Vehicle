package if1.pkg10119016.latihan57.vehicle;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan program
 * menampilkan macam macam kendaraan
 */
public class Program {

    
    public static void main(String[] args) {
       Bicycle bicycle;
        Skateboard skateboard;
        
        bicycle = new Bicycle();
        bicycle.setBrand("Trek Bike");
        bicycle.setModel("7.4FX");
        System.out.println("Brand : " + bicycle.getBrand());
        System.out.println("Model : " + bicycle.getModel());
        bicycle.setGearCount(23);
        System.out.println("Jumlah Gear : " + bicycle.getGearCount());
      
        System.out.println();
      
        skateboard = new Skateboard();
        skateboard.setBrand("Ally Skate");
        skateboard.setModel("Rocket");
        System.out.println("Brand : " + skateboard.getBrand());
        System.out.println("Model : " + skateboard.getModel());
        skateboard.setBoardLength(54.5);
        System.out.println("Jumlah Gear : " + skateboard.getBoardLength());
    }
    
}
