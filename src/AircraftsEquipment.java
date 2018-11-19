import javax.sound.midi.Soundbank;

public class AircraftsEquipment {
    private String shape;//Hexagon,Kite
    private String size;
    private String quality;
    private String name;
    private  String color;
    private int cost;
    public String getColor() {
        return color;

    }
    public  void  setColor(String color/*,String password*/){
//        if (password.equals("MySuperPassword")) {
            this.color = color;
//        }else {
//            System.out.println("COME OVER!!!");
//        }
    }
}
