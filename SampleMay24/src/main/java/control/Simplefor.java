package control;

public class Simplefor {

    public static void main(String args[]){
//
//        for(int i =1;i<=10;i++){
//
//            System.out.println(i);
//        }    i = 2  j=2

        aa:
        for(int i =1; i<=3;i++){

            bb:
            for(int j=1;j<=3;j++){

               if(i==2 && j==2){

                   break bb;
               }

               System.out.println(i+" "+j);
            }


        }
    }
}
