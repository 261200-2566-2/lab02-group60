import java.util.Scanner;
public class AirPurifier {
    public boolean powerStatus;
    public String brand;
    public int serialNO;
    public int PMLevel;
    AirPurifier(String brand,int serialNO){
        this.powerStatus = false;
        this.brand = brand;
        this.serialNO = serialNO;
        this.PMLevel = 0;
    }
    public void Display(){
        System.out.println("Brand: " + brand + " SerialNO: " + serialNO);
    }
    public void turn_off(){
        powerStatus = true;
        System.out.println("Status: CLOSE");
    }
    public void turn_on(){
        powerStatus = false;
        System.out.println("Status: OPEN");
    }
    public void setMode(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your PmLevel: ");
        int PM = s.nextInt();
        s.nextLine();

        System.out.print("Enter your Mode: ");
        String mode = s.nextLine();


        System.out.println("Your pm current is level : " + PM);
        System.out.println("Your mode current is : " + mode + " mode" );

        if (mode.equals("Auto")) {
            if(PM >= 5){
                System.out.println("Use : hight filter");
            }else if (PM < 4){
                System.out.println("Use : low filter");
            }
        } else if (mode.equals("Max")) {
            System.out.println("Use : hight filter");
        }else if (mode.equals("Min")){
            System.out.println("Use : low filter");
        }
    }
}
