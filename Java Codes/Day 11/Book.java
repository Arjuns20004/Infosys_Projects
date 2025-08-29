import java.util.*;
class Book{
    String title;
    String author;
    double price;
    
    public void setDetails(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    
    public void displayInfo(){
        System.out.println("Title: "+title+", author:"+author+", price: "+price);
    }
    public static void main(String args[]){
        Scanner lee=new Scanner(System.in);
        String title=lee.nextLine();
        String author=lee.nextLine();
        double price=lee.nextDouble();
        
        Book boo=new Book();
        boo.setDetails(title,author,price);
        boo.displayInfo();

        lee.close();
    }
}