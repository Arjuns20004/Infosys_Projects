import java.util.*;
class Laptop{
    String company;
    Integer ram;
    String processor;
    Integer rom;
    public Laptop(String company,Integer ram,String processor,Integer rom){
        this.company=company;
        this.ram=ram;
        this.processor=processor;
        this.rom=rom;
    }
    public void details(){
        System.out.println("Name:"+company);
        System.out.println("Ram:"+ram);
        System.out.println("Processor:"+processor);
        System.out.println("Rom:"+rom);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner st=new Scanner(System.in);
        Laptop asus=new Laptop("Asus",128,"Intel",256);
        asus.details();
        Laptop hp=new Laptop("HP",128,"ryzen",256);
        hp.details();
    }
}