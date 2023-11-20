class OuterClass {
    private final int outerVar = 20;
    public void outerMethod(){
        System.out.println("Method from outer class " + outerVar);
    }

    // A class that is defined inside a method is called local inner class
    public void methodInnerClass(){
        class LocalInnerClass {
            private final int methodInnerVar = 100;
            public void classInnerMethod(){
                System.out.println("Method from method inner class " + methodInnerVar);
            }
        }

        // Has to be initialized and operated in the method itself.
        LocalInnerClass mic = new LocalInnerClass();
        mic.classInnerMethod();
    }

    class InnerClass {
        private final int innerVar = 40;
        public void innerMethod(){
            System.out.println("Method from inner class " + innerVar);
        }
    }

    static class InnerClassV1 {
        private final int innerVarV1 = 60;
        public void innerMethodM1(){
            System.out.println("Method from static inner class " + innerVarV1);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        out.outerMethod();
        out.methodInnerClass();

        OuterClass.InnerClass in = out.new InnerClass();
        in.innerMethod();

        OuterClass.InnerClassV1 in1 = new OuterClass.InnerClassV1();
        in1.innerMethodM1();
    }
}