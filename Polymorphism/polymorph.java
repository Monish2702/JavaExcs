import java.util.Scanner;

public class polymorph {
    public static void main(String[] args) {
        Army army = new Army();
        AirForce airForce = new AirForce();
        Navy navy = new Navy();

        ArmedForces defenders[] = {army, airForce, navy};
        for(ArmedForces a : defenders) { //to avoid writing the same code for each object
            a.attack();
        }

        //time for runtime polymorphism
        Scanner sc = new Scanner(System.in);
        System.out.println("*****\nRuntime polymorphism\n*****\nEnter the mode of attack 1-ground 2-air 3-water");
        int mode = sc.nextInt();
        ArmedForces a = null;
        switch(mode) {
            case 1:
                a = new Army();
                a.attack();
                break;
            case 2:
                a = new AirForce();
                a.attack();
                break;
            case 3:
                a = new Navy();
                a.attack();
                break;
            default:
                System.out.println("Invalid mode");
                break;
        }
        sc.close();
    }
}

class ArmedForces {
    public void attack() {
    }
}

class Army extends ArmedForces {
    @Override
    public void attack() {
        System.out.println("Army attacks from ground");
    }
}

class AirForce extends ArmedForces {
    @Override
    public void attack() {
        System.out.println("AirForce attacks from air");
    }
}

class Navy extends ArmedForces {
    @Override
    public void attack() {
        System.out.println("Navy attacks from sea");
    }
}