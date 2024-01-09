class Outer {
    
    int x = 20;
    static int y = 30;
    
    public void printX() {
        System.out.println("Non-static method : Non-static variable : " + x);
    }
    
    public void printY() {
        System.out.println("Non-static method : static variable : "+ y);
    }
    
    //  // GENERATES ERROR 
    // public static void printx() {
    //     System.out.println("static method : Non-static variable : "+ x);
    // }
    
    public static void printy() {
        System.out.println("static method : static variable : "+ y);
    }
    
    public void localInnerClass(){
        class inner0 {
            int a;
            inner0(int x){
                this.a = x;
            }
            
            private void printA(){
                System.out.println(a);
            }
        }
        
        inner0 in0 = new inner0(2);
        in0.printA();
    }
    
    
    public static class inner1 {
        public void intro(){
            System.out.println("This is a static inner class");
        }
    }
    
    public class inner2 {
        public void intro(){
            System.out.println("This is a non-static inner class");
        }
    }
}


class Demo {
    public static void main(String[] args){
        Outer obj = new Outer();
        obj.printX();
        obj.printY();
        Outer.printy();
        obj.localInnerClass();
        Outer.inner1 inner1Obj= new Outer.inner1();
        inner1Obj.intro();
        Outer.inner2 inner2Obj = obj.new inner2();
        inner2Obj.intro();
    }
}
