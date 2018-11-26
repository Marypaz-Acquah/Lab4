import java.net.SocketTimeoutException;

public class Main {
    public static void main(String[] args) {
        AircraftsEquipment aircraftsEquipment = new AircraftsEquipment("kite", "black","500",
                "aircraft","high" , 200);
        AircraftsEquipment aircraftsEquipment2 = new AircraftsEquipment("kite", "black","700",
                "aircraft2","high" , 100);
        /*aircraftsEquipment.cost = 200;
        aircraftsEquipment.cost =aircraftsEquipment . cost +200;
        aircraftsEquipment . cost += 200;
        System.out.println(aircraftsEquipment.cost);*/

        aircraftsEquipment.setColor("black");
        System.out.println(aircraftsEquipment.getColor());
        /*System.out.println("Finished!);
        int a = 2;
        int b = 3;
        boolean c = false;
        if (a) {
        }
        System.out.println(a + b);

        System.out.println(a + c); */


    }
}
