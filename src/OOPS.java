public class OOPS {
    public static void main(String[] args) {
        Student s1=new Student("nilima");
        System.out.println(s1.name);
        Pen p1=new Pen();//created a pen object p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());
        //BankAccount myAcc=new BankAccount();
//       System.out.println( myAcc.username="nilimamishra");
//        System.out.println(myAcc.setPassword("abcdef"));
    }
}
//class BankAccount{
//    public String username;
//    private String password;
//    public String setPassword(String pwd){
//        password=pwd;
//        return pwd;
//    }
//}
class Pen{
    private String color;
    private int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color=newColor;
    }
    void setTip(int Tip){
      this.tip=Tip;
    }
}
class Student{
    String name;
    int roll;
    Student(String name){
        this.name=name;
    }
}
