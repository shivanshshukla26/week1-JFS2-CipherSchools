
abstract class Doctor {
    abstract void treatPatient();
}

class Physician extends Polymorphism_1{
    void treatPatient(){
        System.out.println("Hi I am Pysician \nI treat patients using medicines");
    }
}

class Surgeon extends Polymorphism_1{
    void treatPatient(){
        System.out.println("Hi I am Surgoen \nI treat patients using surgery");
    }
}

class Dentist extends Polymorphism_1{
    void treatPatient(){
        System.out.println("Hi I am Dentist \nI treat patients using patients teeth");
    }
}

public class Polymorphism_2{
    public static void main(String[] args) {
        System.out.println("Hi! I am Lucy! Receptionist at Max care");
        System.out.println("Who are looking for ?");
        System.out.println("Press 1. Physician\n2. Surgeon \n3. Dentist");

        int choice = new java.util.Scanner(System.in).nextInt();

        Doctor doc = null;

        switch (choice){
            case 1:
                doc = new Physician();
            break;
            case 2:
                doc = new Surgeon();
            break;
            case 3:
                doc = new Dentist();
            break;

            default:
                System.out.println("Invalid choice");
                break;
        }
        if(choice <0 || choice >3){
            System.exit(0);
        }
        else{
            doc.treatPatient();
        }
    }
}