public class AbstracKeywordUse {
    public static void main(String[] args) {
        laptop lp = new laptop("40k");
        lp.ShowPrice();
        lp.start();

        Android ph = new Android("20k");
        ph.ShowPrice();
        ph.start();
    }

}

abstract class Device{                  //  Abstract Class 

    protected String price ;
    public void ShowPrice(){
        System.out.println("Your Device Price is "+price);
    }
    abstract void start();              //  Abstract Method
}

class laptop extends Device{

    laptop(String price){
        super.price = price;
    }

    @Override
    void start() {
        System.out.println("Your laptop starting");
        
    }
    
}

class Android extends Device{
    Android(String price){
        super.price = price;
    }

    @Override
    void start() {
        System.out.println("Your Phone in String Now");
        
    }
    
}