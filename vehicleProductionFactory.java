class vehicleProductionFactory{
    public String name;
    public String registrationNumaber;
    public String address;
    factory(String name,String registrationNumaber,String address)
    {
        this.name=name;
        this.registrationNumaber=registrationNumaber;
        this.address=address;

    }
    abstract class vehicle{
        public int wheels;
        public int seat;
        public int break;
        public int stearing;
        public int engine;
        abstract void start(){
        }
        abstract void run(){

        }
        abstract void stop(){

        }

    }
    class car extends vehicle{
        public int numberOfDoors;
        public int seatingCapacity;
        public String model;
        public double speed;
        car(String){
           
        }
        @Override
        public void start(){

        }
        @Override
        public void run(){

        }
        @Override
        public void stop(){

        }

    }
    class cycle extends vehicle{
        public int pedalRpm;
        public int gear;
        public int wheelDiameter;
        public int numberOfGear;
        public int speed;
        cycle(){

        }
         @Override
        public void start(){

        }
        @Override
        public void run(){

        }
        @Override
        public void stop(){

        }
        public void changeGear(){

        }
        public void speedUp(){

        }
        public void applyBreak(){

        }
    }
  public void main(String args[]){
    

}

}