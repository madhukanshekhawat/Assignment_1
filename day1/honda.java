package day1;

class honda extends a {
    @Override
    void model() {
        System.out.println(" model is Honda4");
    }

    public static void main(String[] args) {
        honda h = new honda();
        h.model();
        h.wheels();
    }
}