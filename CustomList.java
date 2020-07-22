// import java.util.*;

// class CustomList {
//     static ArrayList<Integer> list = new ArrayList<Integer>();

//     public static void main() {
//         System.out.println(list.size());

//     }

// }
import java.util.*;
import java.lang.*;

interface CustomListInterface { // INTERFACE CONTAINING METHODS-ADD,DELETE,FETCH,DISPLAY
    public void Display(); // interface method (does not have a body)

    public void fetch(); // interface method (does not have a body)

    public void add();

    public void display();

    Scanner sc = new Scanner(System.in);

}

class CustomList implements CustomListInterface {
    LinkedHashSet<String> linkset1 = new LinkedHashSet<String>();
    LinkedList<Object> linkset = new LinkedList<>();

    public void Display() {
        linkset.add("Ram");
        linkset.add("Shyam");
        linkset.add("Sita");
        linkset.add("Gita");
        linkset.add("Hari");
        linkset.add("Kamlesh");
        linkset.add("Sanjay");
        linkset.add("Sanju");
        linkset.add("Harish");
        linkset.add("Bjdd23345");

    }

    public void display() {

        Iterator<Object> itr = linkset.iterator();
        System.out.println("Elements in the list are:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public void fetch() {
        ArrayList<Object> list = new ArrayList<Object>(linkset);
        System.out.println(list);
        System.out.println("Enter the number of which you want to fetch");
        int n = sc.nextInt();
        System.out.println("element of the ArrayList: " + list.get(n - 1));

    }

    public void add() {
        System.out.println("Enter the data to be entered");
        String str = sc.nextLine();
        linkset.add(str);
        display();

    }

    public void delete() throws InputMismatchException {
        System.out.println("Enter the data to be entered");
        String str = sc.nextLine();
        linkset.remove(str);
        Iterator<Object> itr = linkset.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

class MyMainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomList myCustomList = new CustomList();
        myCustomList.Display();
        while (true) {

            System.out.println("*********************************************\n"+"\n 1. Display\n 2. Fetch\n 3. Add\n 4.delete \n 5. Exit\nEnter your choice :");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    myCustomList.display();
                    break;
                case 2:
                    myCustomList.fetch();
                    break;

                case 3:
                    myCustomList.add();
                    break;

                case 4:
                    myCustomList.delete();
                    break;
                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("PLease enter valid data");

            }
        }

    }
}
