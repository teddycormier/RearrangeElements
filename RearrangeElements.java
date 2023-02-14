import java.util.ArrayList;

public class RearrangeElements {

    public static void sortList(ArrayList<Integer> my_list) {
        System.out.println("Your Starting List:");
        int n = my_list.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (my_list.get(j) > my_list.get(j + 1)) {
                    int temp = my_list.get(j);
                    my_list.set(j, my_list.get(j + 1));
                    my_list.set(j + 1, temp);
                }
            }
        }
    }

    public static void rearrangeList(ArrayList<Integer> my_list) {
        System.out.println("Your Ending List:");
        int n = my_list.size();
        int temp;

        for (int i = 1; i < n - 1; i += 2) {
            temp = my_list.get(i);
            my_list.set(i, my_list.get(i + 1));
            my_list.set(i + 1, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> my_list = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            my_list.add(i);
        }

        sortList(my_list);
        System.out.println(my_list);
        rearrangeList(my_list);
        System.out.println(my_list);
    }

}
