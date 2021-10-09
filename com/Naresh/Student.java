package com.Naresh;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        String Name;
        float Maths;
        float Phy;
        float Chem;

        Queue que=new LinkedList();

        /* Making an object of "Records" Class so i can access all the Function of That class*/
        Records obj=new Records();

        /* Calling the store function of "Records" Class using Object "obj" and storing The Queue data in "que" variable */
        que=obj.store();

        /* Calling the "showData" function of "Records" Class using obj and Passing the Queue Variable Name "que" as Parameter*/
        obj.showData(que);

    }
}

class Records {
    public String Name;
    public float Maths;
    public float Phy;
    public float Chem;
    public Queue q;

    Records() {

    }

    Queue store() {
        Queue q = new LinkedList();
        System.out.println("Enter the no of records you want to add--");
        Scanner sc = new Scanner(System.in);

        /* Here "x " is the variable which is no of records you want to Store */
        int x = sc.nextInt();

        /* Running a for loop until "x" variable to store the Data in the Queue */
        for (int i = 0; i < x; i++) {
            System.out.println("Enter Your Name");
            Name = sc.next();
            System.out.println("Enter Your Maths Marks");
            Maths = sc.nextFloat();
            System.out.println("Enter Your Physics Marks");
            Phy = sc.nextFloat();
            System.out.println("Enter Your Chemistry Marks");
            Chem = sc.nextFloat();

            /* Addint the data in Queue usng "<QueueName>.add(data)" Method */
            q.add(Name);
            q.add(Maths);
            q.add(Phy);
            q.add(Chem);
        }
        System.out.println("The records are" + q);

        /* Returning The Queue so i can Store in Another Variable Name "que" in Main Class */
        return q;


    }

    /* This function is use to Search and Show a Particular record of Student */
    void showData(Queue q) {
        String SearchName;
        System.out.println("enter The Name Of which record you want to find ");
        Scanner sc = new Scanner(System.in);

        /* Here "SearchName" variable Storing the name of Student which i want to Find*/
        SearchName = sc.next();

        /* Using Iterator to iterate through a queue, You Can learn more about how Iterator works by going to this link--https://www.techiedelight.com/iterate-through-queue-java/ */
        Iterator itr = q.iterator();


        System.out.println("----------------------------------------------------------");
        System.out.println();
        System.out.println("Hello " + SearchName);
        System.out.println("Your Marks in Maths,Physics And Chemistry are--");

        /*  hasNext() returns true if the queue has more elements */
        while (itr.hasNext()) {

            /* Like Python you Can't use "==" double Equals to here, instead of that you Should use .equals(<the Value which you want to equate>)*/
            if (itr.next().equals(SearchName)) {
                for (int i = 0; i < 3; i++) {

                    /*next() returns the next element in the iteration */
                    System.out.println(itr.next());
                }

                System.out.println();
                System.out.println("----------------------------------------------------------");
            }
        }
    }
}


