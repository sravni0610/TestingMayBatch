package sample;

public class Students1 {

    String name;
    int rollno;
    int age;
    void insert(String name, int rollno){

        this.name = name;
        this.rollno = rollno;

    }



    void insert(String n,int r, int a){
        name = n;
        rollno = r;
        age = a;
    }

    void display(){
        System.out.println("name of the student is "+name);
        System.out.println("Rollno of the student is "+rollno);
        System.out.println("Age of the student is "+age);
    }


    public static void main(String args[]){

        Students1 s1 = new Students1();
        s1.insert("Aravind",201);
        s1.display();
//        Students1 s2 = new Students1();
//        s2.insert("abmnc",202,27);
//        s2.display();

    }
}
