package src.CoreJava;

public class Task1 {
    int togetherApples;
    double  totalApples;
    int appleCount(int danialApples ,int  amberApples){
       togetherApples = danialApples+amberApples;
    return togetherApples;
    }
    double appleCount(double danialApples ,double  amberApples){
        totalApples = danialApples+amberApples;
        return totalApples;
    }

    public static void main(String args[]){
     Task1 task1 =new Task1();
     int count= task1.appleCount(3,2);
     System.out.println(count);
        System.out.println(task1.appleCount(3.5,2.5));


    }
}
