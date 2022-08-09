/*ONLy*/

class vehicleProductionFactory{
    public String name;
    /*registration number is protected 
    for factory */
    protected String registrationNumaber;
    public String address;

    vehicleProductionFactory(String name,String registrationNumaber,String address)
    {
        this.name=name;
        this.registrationNumaber=registrationNumaber;
        this.address=address;

    }
    /*static Innerr class
    it can't be instantiate only can be inherited and extended*/
    static abstract class vehicle{
        public  boolean gear;
        public boolean Break;
        /** some abstarct funtions have, no body, they will be inherited by the chill class and will be coded accordingly */
        abstract void start();
        abstract void run();
        abstract void stop();

    }
    class car extends vehicle{
        public String name;
        public int seatCapacity;
        public String model;
        public int speed;
        public int ignition;
        car(String name,String model,int seatCapacity){
            this.name=name;
            this.model=model;
            this.seatCapacity=seatCapacity;
        }
        //can directly access member of outer class
        /**Run time polymorphism, extention  */
        @Override
        public void start(){
            ignition=1;
            Break=false;
            System.out.println(name+"car is started.");
        }
        @Override
        public void run(){
            gear=true;
            System.out.println(name+"car is running.");
        }
        @Override
        public void stop(){
            ignition=0;
            gear=false;
            Break=true;
            System.out.println(name+"car is stoped.");
        }
        void speedUp(){
            speed++;
        }
        void speedDown(){
            speed--;
        }
        int getSpeed(){
            return speed;
        }
        int getSeatingCapacity(){
            return seatCapacity;
        }

    }
    class bus extends vehicle{
        public String name;
        public String model;
        public int wheels;
        public int seatCapacity;
        public int speed;
        public int ignition;
        
        bus(String name,String model,int seatCapacity,int wheels){
            this.name=name;
            this.model=model;
            this.seatCapacity=seatCapacity;
            this.wheels=wheels;

        }
        //can directly access member of outer class.
        @Override
        public void start(){
           ignition=1;
           Break=false;
            System.out.println(name+"bus is start.");

        }
        @Override
        public void run(){
           gear=true;
           System.out.println(name+"bus is running.");
        }
        @Override
        public void stop(){
           ignition=0;
           gear=false;
           Break=true;
           System.out.println(name+"bus is stop.");

        }
        int getSeatingCapacity(){
            return seatCapacity;
        }
         void speedUp(){
            speed++;
        }
        void speedDown(){
            speed--;
        }
        int getSpeed(){
            return speed;
        }

    }
    class truck extends vehicle{
        public int wheels;
        public String name;
        public int speed;
        public int ignition;
        truck(int wheels,String name){
            this.name=name;
            this.wheels=wheels;
        }
         //can directly access member of outer class.
         @Override
        public void start(){
          ignition=1;
          System.out.prinrtln(name+"truck is started.");
        }
        @Override
        public void run(){
          gear=true;
          System.out.prinrtln(name+"truck is running.");
        }
        @Override
        public void stop(){
          ignition=0;
          gear=false;
          System.out.prinrtln(name+"truck is stop.");
        }
        int getWheels(){
            return wheels;
        }
         void speedUp(){
            speed++;
        }
        void speedDown(){
            speed--;
        }
        int getSpeed(){
            return speed;
        }
    }
    class cycle extends vehicle{
        public int pedalRpm;
        public float wheelDiameter;
        public int speed;
        cycle(int pedalRpm,float wheelDiameter ){
            this.pedalRpm=400;
            this.wheelDiameter=80;

        }
         //can directly access member of outer class.
         @Override
        public void start(){
           gear=true;
        }
        @Override
        public void run(){
          Break=false;
        }
        @Override
        public void stop(){
          Break=true;
          gear=false;
        }
        public void changeGear(){
           gear=!gear;
        }
        public void speedUp(){
           speed++;
        }
        public void speedDown(){
            speed--;
        }
        public void applyBreak(){
           Break=true;
        }
    }
  public void main(String args[]){
    //creating an factory
    vehicleProductionFactory factory=new vehicleProductionFactory("LET'S MAKE IT HAPPEN","12345","LUCKNOW UP");
    //creating car in factory
      car c1=factory.new car("BMW","2020-21",4);
      c1.start();

    



}

}
