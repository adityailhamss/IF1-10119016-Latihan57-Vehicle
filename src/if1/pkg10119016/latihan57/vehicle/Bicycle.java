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
public class Bicycle extends Vehicle {
    private int myGearCount;
    
    public Bicycle() {
        super();
        System.out.println("Bicycle");
    }
    
    public int getGearCount() {
        return this.myGearCount;
    }
    
    public void setGearCount(int gearCount) {
        this.myGearCount = gearCount;
    }
}