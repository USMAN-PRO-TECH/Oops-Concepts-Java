public abstract class Abstraction {
    abstract void readData();
    abstract void writeData();

}

class Admin extends Abstraction{
    @Override
    void readData(){
        System.out.println("Admin is reading data");
    }

    @Override
    void writeData(){
        System.out.println("Admin is writing data");
    }
}
