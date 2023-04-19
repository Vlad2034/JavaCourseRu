import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListRedRover {

    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
//
//        list.add("Elem 4");
//        list.add("Elem 1");
//        list.add("Elem 3");
//        String e = "Elem 2";
//        list.add(e);
//
//        printList(list);
//
//        System.out.println(list.size());
//
//        //System.out.println(list.get(1));
//
//        list.remove(1);
//        list.remove("Elem 1");
//        list.remove("Elem 4");

        List<EmployeeList> list = new ArrayList<>();
        list.add(new EmployeeList("John", 200));
        list.add(new EmployeeList("Sally", 210));
        list.add(new EmployeeList("Mark", 150));
        list.sort(new EmployeeCorparator());

        printList(list);

        System.out.println(list.size());
    }

    static class EmployeeList{

        private String name;
        private int salary;

        public EmployeeList(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getSalary() {
            return salary;
        }
    }

    static class EmployeeCorparator implements Comparator<EmployeeList> {

        @Override
        public int compare(EmployeeList o1, EmployeeList o2) {
            return o1.getSalary() - o2.getSalary();
        }
    }

    public static void printList(List<EmployeeList> list){
        for (EmployeeList s : list){
            System.out.println(s.getName() + ": " + s.getSalary());
        }
        System.out.println("-----------");
    }


}
