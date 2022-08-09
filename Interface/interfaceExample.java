public class interfaceExample {
    public static void main(String[] args) {
        Student monish = new Student();
        monish.study();
        Teacher ravi = new Teacher();
        ravi.teach();
        ravi.study();
    }

}

class Student implements Study {

    @Override
    public void study() {
        System.out.println("I am studying");
    }
}
interface Study { //interface
    void study();
}


class Teacher implements Teach,Study {

    @Override
    public void teach() {
        System.out.println("I am teaching");
    }

    @Override
    public void study() {
        System.out.println("Though I am teacher I am studying too");
    }
}
interface Teach {
    void teach();
}