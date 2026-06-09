public class Car {
    int noOfWheels;
    float maxSpeed;
    float currentFuelinLitres;
    int noOfSeats;
    String color;

    public void start(){//void can be replaced with Car
        if(currentFuelinLitres == 0) {
            System.out.println("car is out of fuel");
        }else if(currentFuelinLitres <5){
            System.out.println("car is in reserved mode, please refuel");
            currentFuelinLitres--;
        }else{
            System.out.println("car has started");
        }   // return this;
    }
    public void drive(){
        currentFuelinLitres--;
        System.out.println("car is driving");
    }

    public void addFuel(float fuel){
        currentFuelinLitres += fuel;
    }
    public float  getCurrentFuelLevel(){
        return currentFuelinLitres;
    }
}
