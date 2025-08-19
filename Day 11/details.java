import java.util.*;

class Laptop {
    String company;
    String processor;
    Integer ram;
    Integer rom;

    
    public Laptop(String company, String processor, Integer ram, Integer rom) {
        this.company = company;
        this.processor = processor;
        this.ram = ram;
        this.rom = rom;
    }


    public void printLaptopInfo() {
        System.out.println("Laptop Company: " + company);
        System.out.println("Laptop Processor: " + processor);
        System.out.println("Laptop RAM: " + ram + " GB");
        System.out.println("Laptop ROM: " + rom + " GB");
    }
}
class details{
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Dell", "Intel i5", 16, 512);
        myLaptop.printLaptopInfo();
        Laptop myLaptop2= new Laptop("Asus","Intel i5",16,512);
        myLaptop2.printLaptopInfo();
    }
}