package superKeyword;

public class Rectangle extends Shape{
    @Override
    int getConer() {
        return 4;
    }

    int getParentConer(){
        return super.getConer();
    }

    boolean isValid(){
        return false;
    }

    String getName(){
        return "Ahmad ROni";
    }

    void sayHello(){

    }

}
