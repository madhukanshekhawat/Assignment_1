class dog implements animal{
    @Override
    public void sound() {
        System.out.println("berks");
    }

    @Override
    public void eat() {
        System.out.println("eats dog food");
    }
    public static void main(String[] args) {
      dog d1= new dog();
     d1.eat();
     d1.sound();
    }

}
