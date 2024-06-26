package emailapp;

import java.util.Scanner;

public class Email {
    private  String firstname;
    private  String lastname;
    private  String Email;
    private  String department;
    private  String password;
    private int deafaultPasswordlength;
    private int MailBoxCapacity;
    private String alternateEmail;

    //constructor to receive the first and last name
    public Email(String firstname,String lastname){
        this.firstname= firstname;
        this.lastname=lastname;
        System.out.println("Email Created: "+this.firstname +" " +this.lastname);

        //call a method asking for a department -return the department

        this.department=setDepartment();
        System.out.println("Department: "+this.department);

    //call a method that returns a random password
        this.password= randomPassword(deafaultPasswordlength);
        System.out.println("Your password is: "+this.password);

    }
    //Generate the random password
    private String randomPassword(int length){
        String passwordSet= "ABCDEFGHIGKLMNOPQRSTVWXYZ0123456789#@$%&*!_-";
        char[] password = new char[length];
        for(int i=0;i<length;i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] =passwordSet.charAt(rand);
        }return new String (password);
    }

    //Ask for the Department
        private String setDepartment(){
            System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter Department code:  ");
            Scanner in=new Scanner(System.in);
            int depChoice =in.nextInt();
            if(depChoice==1){return "Sales";}
            else if(depChoice==2){return "Development";}
            else if(depChoice==3){return "Accounting";}
            else {return" ";}
        }


    //Set the MailBoxCapacity

    //set the alternate Email

    //Change the password



}


