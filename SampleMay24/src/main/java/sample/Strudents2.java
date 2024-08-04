package sample;

public class Strudents2 {

    String name;
    int rollno;
    int age;

    Strudents2(){

    }
    Strudents2(int a,String n,int r){
        age = a;
        name = n;
        rollno = r;

    }
    Strudents2(int r,String n){
        rollno = r;
        name = n;
    }

    Strudents2(Strudents2 s){
        name = s.name;
        rollno = s.rollno;
        age = s.age;

    }


    void display(){
        System.out.println("name of the student is "+name);
        System.out.println("Rollno of the student is "+rollno);
        System.out.println("Age of the student is "+age);
    }

    public static void main(String args[]){


        Strudents2 s1 = new Strudents2(23,"Abhi",101);
        s1.display();
        Strudents2 s2 = new Strudents2(s1);
        s2.display();


    }



}
