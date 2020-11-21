package if1.pkg10119016.latihan57.vehicle;

/**
 *
 * @author aditi
 * NAMA             : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan program
 * menampilkan macam macam kendaraan
 */
public class Skateboard extends Vehicle{
    private double myBoardLength;
    
    public Skateboard() {
        System.out.println("SkateBoard");
    }
    
    public double getBoardLength() {
        return this.myBoardLength;
    }
    
    public void setBoardLength(double boardLength) {
        this.myBoardLength = boardLength;
    }
}