import Packet1.PersonPacket1;

class Test1 extends PersonPacket1 {
//    public int id;
    //public static void main(String[] args) {

        // public - accessible within the entire project
        // private - accessible within the class where it is declared
        // default - доступно в пределах этого пакета
        // protected - доступны в пределах одного пакета доступны всем подклассам, даже если эти подклассы вне пакета
        // access to protected value, class, method from outside the packet can be got through extends to the class in the packet

//    private void technicalMethod(){
//    }
    public  Test1(){
        name = "Toth";
    }
//        PersonPacket1 person5  = new PersonPacket1();
//        System.out.println(person5.name); // error because name value is protected
}


//class ModificatorsAccessTest2 {
//
//}

