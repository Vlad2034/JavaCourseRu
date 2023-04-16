public class FinalKeyWord{

    public static void main(String[] args){
        final int X = 10;
        System.out.println(X);
        // X = 5; // НЕ РАБОТАЕТ мы не можем поменять константу после инициализации
    }
}

class Test{
    //Final обозначает CONSTANT value (большими буквами) которая не может изменяться
    //public final int CONSTANT;
    public static final int CONSTANT = 0;

    // со static конструктор не работает - нужно иницилизировать через имя класса
//    public Test(int CONSTANT){
//        this.CONSTANT = CONSTANT;
//    }

    // doesn't work because constant value cannot be changed after the first assigning
    // setters dont work for constants
//    public void setCONSTANT(int x){
//        this.CONSTANT = x;
//    }



}
