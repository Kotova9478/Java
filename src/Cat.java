public class Cat {

   private String name;
   private int age;
   //incapsulation
    // constructor class
    public Cat(String name, int age) {

        this.name = name;
        this.age = age;

    }
    public void voice() {

        System.out.println("Mau");
    }
    public void jump(){
        System.out.println("Jump");



    }
    public String getName() {
        return name;

        
    }
}
