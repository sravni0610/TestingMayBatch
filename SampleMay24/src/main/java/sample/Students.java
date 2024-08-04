package sample;

public class Students {

    String name;
    int rollno;

    void display(){

        System.out.println("name of the student is "+name);
        System.out.println("Rollno of the student is "+rollno);

    }

    public static void main(String args[]){

        Students s1 = new Students();
        s1.display();
        s1.rollno = 101;
        s1.name = "Aravind";
        s1.display();
        Students s2 = new Students();
        s2.rollno = 102;
        s2.name = "Ranjith";
        s2.display();
        Students s3 = new Students();
        s3.name = "Ishaq";
        s3.rollno = 103;
        s3.display();

    }

}
