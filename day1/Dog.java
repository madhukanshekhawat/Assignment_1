package day1;

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("berks");
    }

    @Override
    public void eat() {
        System.out.println("eats day1.dog food");
    }
    public static void main(String[] args) {
      Dog d1= new Dog();
     d1.eat();
     d1.sound();
    }

}
