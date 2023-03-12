/**
 * insurance
 */
import java.util.*;;
public class insurance {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        try{
        while(true){
        System.out.println("Enter your car model:");
        String model=scn.nextLine();
        System.out.println("Enter your car type(Hatchback/Sedan/SUV):");
        String type=scn.nextLine();
        System.out.println("Enter your car price:");
        int price=0;
        try{  
            //code that may raise exception  
           price=Integer.parseInt(scn.nextLine());
         }catch(NumberFormatException e)
         {
          System.out.println("Price is Incorrect.");
         }  

        System.out.println("Enter your insurance type(base/premium):");
        String insurance= scn.nextLine();
        
        switch(type){
            case "Hatchback":
                switch(insurance){
                    case "base":
                         float baseinsurance= (price*5)/100;
                         System.out.println("Car type :"+type);
                         System.out.println("Car price :"+price);
                         System.out.println("insurance price to be paid: "+baseinsurance);
                         break;
                    case "premium":
                        baseinsurance= (price*5)/100;
                        float premiuminsurance=baseinsurance+(baseinsurance*20)/100;
                        System.out.println("Car type :"+type);
                        System.out.println("Car price :"+price);
                        System.out.println("insurance price to be paid: "+premiuminsurance);    
                        break;   
              }
                break;
            case "Sedan":
                switch(insurance){
                    case "base":
                        float baseinsurance= (price*8)/100;
                        System.out.println("Car type :"+type);
                         System.out.println("Car price :"+price);
                         System.out.println("insurance price to be paid: "+baseinsurance);
                        break;
                    case "premium":
                        baseinsurance= (price*8)/100;
                        float premiuminsurance=baseinsurance+(baseinsurance*20)/100;
                        System.out.println("Car type :"+type);
                        System.out.println("Car price :"+price);
                        System.out.println("insurance price to be paid: "+premiuminsurance); 
                        break;

                }
                break;

            case "SUV":
                switch(insurance){
                    case "base":
                        float baseinsurance= (price*10)/100;
                        System.out.println("Car type :"+type);
                        System.out.println("Car price :"+price);
                        System.out.println("insurance price to be paid: "+baseinsurance);
                        break;
                    case "premium":
                        baseinsurance= (price*10)/100;
                        float premiuminsurance=baseinsurance+(baseinsurance*20)/100;
                        System.out.println("Car type :"+type);
                        System.out.println("Car price :"+price);
                        System.out.println("insurance price to be paid: "+premiuminsurance); 
                        break;

                }
                break;

            default:
                System.out.println("Invalid type of car");
        }

        System.out.println("Do you want to enter details of any other car (y/n):");
        String str=scn.nextLine();
        if (str.equals("n"))
            break;
        }
    }
    finally {
        scn.close();
    }
    }
}