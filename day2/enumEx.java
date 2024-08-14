package day2;

public class enumEx {
    enum Status{ // class
        Running,Failed,Pending,Success; // type constants
    }

    public static void main(String[] args) {
        Status s = Status.Success;
        System.out.println(s.ordinal());
//        Status[] ss= Status.values();
//        for(Status s1: ss){
//            System.out.println(ss.toString());
//        }

    }
}

//ordinal returns index values
//instead of creating an array or string and calling it again and again we can normaly create a reference and access the enum Status class
// can use if else and switch