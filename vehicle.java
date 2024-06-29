class Vehicle {
  String licensePlate;
  String owner;

  void get(String license, String own) {
    licensePlate = license;
    owner = own;
  }

  void displayInfo() {
    System.out.println("License Plate: " + licensePlate);
    System.out.println("Owner: " + owner);
  }
}

class Car extends Vehicle {
  String model;
  int doors;

  void get(String license, String own, String mod, int dor) {
    super.get(license, own);
    model = mod;
    doors = dor;
  }

  void displayInfo() {
    super.displayInfo();
    System.out.println("Model: " + model);
    System.out.println("Number of doors: " + doors);
  }
}

class Truck extends Vehicle {
  int payloadCapacity;

  void get(String license, String own, int payload) {
    super.get(license, own);
    payloadCapacity = payload;
  }

  void displayInfo() {
    super.displayInfo();
    System.out.println("Payload Capacity: " + payloadCapacity + " tons");
  }
}

class Motorcycle extends Vehicle {
  String engineType;

  void get(String license, String own, String engine) {
    super.get(license, own);
    engineType = engine;
  }

  void displayInfo() {
    super.displayInfo();
    System.out.println("Engine Type: " + engineType);
  }
}

public class vehicleinheritance {
  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.get("ABC-123", "John Doe", "Honda Civic", 4);
    System.out.println("My Car:");
    myCar.displayInfo();

    Truck myTruck = new Truck();
    myTruck.get("DEF-456", "Jane Doe", 10);
    System.out.println("\nMy Truck:");
    myTruck.displayInfo();

    Motorcycle myMotorcycle = new Motorcycle();
    myMotorcycle.get("GHI-789", "Peter Pan", "V-Twin");
    System.out.println("\nMy Motorcycle:");
    myMotorcycle.displayInfo();
  }
}