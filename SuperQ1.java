/*
    Super keyword allows us to refer to base class. There are three major use cases of
    super keyword. 1) we can invoke base class constructor 2) we can call base class
    methods. 3) we can access base class methods
*/
public class SuperQ1 {
    protected String Industry;

    SuperQ1(String industryName){
        this.Industry = industryName;
    }

    public void usage(){
        System.out.println(this.Industry + " Helps to generate revenue");
    }
}

class SubQ1 extends SuperQ1 {
    SubQ1(String industryName){
        super(industryName);
    }

    public void Msg(){
        super.usage();
        System.out.println("Industry in parent class is " + super.Industry);
    }

    public static void main(String[] args) {
        SubQ1 q1 = new SubQ1("Cinema");
        q1.Msg();
    }
}
