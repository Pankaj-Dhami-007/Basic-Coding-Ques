class Parent{
      void show(){
        System.out.println("Parent show()");
      }

      void print(){
        for(int i =1; i<10; i++){
            System.out.print(i+" ");
        }
        System.out.println();
      }
}

class Child extends Parent{
    @Override
    void show(){
        System.out.println("CHild show()");
    }

    int add(){
          return 100;
    }
}

// class ParentClass{
//     static void show(){
//         System.out.println("Parent show()");
//     }
// }

// class ChildClass extends  ParentClass{
//     static void show(){
//         System.out.println("Child show()");
//     }
// }

class ParentChildQ{
    public static void main(String[] args) {
        //ParentClass obj = new ChildClass();
        //obj.show();

        Parent objParent = new Child();// upcasting
        objParent.show();
        objParent.print();
        Parent objParent2 = new Child();
        //down casting
         Child c = (Child)objParent2;
        objParent2.show();
        objParent2.print();
        
        System.out.println(c.add());
    }
}