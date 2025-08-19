class GrandParent {
    String grandParentName = "Ramu";
    String grandParentGender = "Male";
    
    public void printGrandParentInfo() {
        System.out.println(grandParentName);
        System.out.println(grandParentGender);
    }
}

class Parent extends GrandParent {
    String parentName = "Sunitha";
    String parentGender = "Female";
    
    public void printParentInfo() {
        System.out.println(parentName);
        System.out.println(parentGender);
    }
}

class Child extends Parent {
    String name = "Sudheer";
    String gender = "Male";
    
    public void printChildInfo() {
        System.out.println(name);
        System.out.println(gender);
    }
}

public class Par {
    public static void main(String[] args) {
        Child child = new Child();

        System.out.println("The Child name and gender:");
        child.printChildInfo();

        System.out.println("The Parent name and gender:");
        child.printParentInfo();

        System.out.println("The GrandParent name and gender:");
        child.printGrandParentInfo();
    }
}
