class pen {
    String color;
    String type;

    public void write(){
        System.out.println("bakchiosid");
    }
    public void pritcolor(){
        System.out.println(this.color);
    }
}
class student {
    String name;
    int age;

    public void printinfo(String name) {
        System.out.println(name);
    }

    //        System.out.println(this.age);
    public void printinfo(int age) {
        System.out.println(age);
    }

    public void printinfo(String name, int age) {
        System.out.println(name + " " + age);
    }

//    student (student s2){
//        this.name = s2.name;
//        this.age=s2.age;
//        System.out.println("constructo call");
//    }
//    student(){

//    }
}
class shape{
    String colo1r;
}
class triangle extends shape{

}
public class apanaclg {
public static void main(String args[]){
    pen pen1 = new pen();
    pen1.color = "black";
    pen1.type=" bolll";
//    pen1.write();
    pen pen2 = new pen();
    pen2.color = "blllack";
    pen2.type=" bolssll";
//    pen2.write();
//    pen1.pritcolor();
//    pen2.pritcolor();
    student s1 =new student();
    s1.name = "mc";
    s1.age = 34;
    s1.printinfo(s1.age);
//     student s2=new student (s1);
//     s2.printinfo();
    triangle t1 = new triangle();
    t1.colo1r = "red";

}
}
