import java.util.*;
// import java.lang.*;

public class demo {

    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        HashSet<Integer> sets = new HashSet<>();

        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(3);

        // ListIterator<Integer> litr = arr.listIterator(6);
        // while (litr.hasPrevious()) {
        // int element = litr.previous();
        // System.out.println(element);
        // sets.add(element);

        // }
        // Integer[] sar = new Integer[sets.size()];
        // sar = sets.toArray(sar);
        // System.out.println(" ");

        // for (Integer x : sar)
        // System.out.println(x);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Himanshu");
        map.put(1, "shu");
        map.put(2, "Chhavi");
        map.put(3, "Chahat");
        String name;
        // String name = map.get(1);
        // System.out.println(name);
        if (map.containsKey(1)) {
            String name2 = map.get(1);
            name2 = "himan" + name2;
            map.put(1, name2);
        }

        // name = map.get(1);
        // System.out.println(name);
        // for (Map.Entry<Integer, String> e : map.entrySet()) {
        // Integer key = e.getKey();
        // String value = e.getValue();
        // System.out.println(key + " : " + value);
        // System.out.println(" ");
        // System.out.println("");

        ArrayList<Integer> valu = new ArrayList<>(map.keySet());
        ArrayList<String> key = new ArrayList<>(map.values());

        Integer[] ark = new Integer[valu.size()];
        ark = valu.toArray(ark);
        System.out.println("values in the array are");
        for (Integer x : ark) {
            System.out.println(x);

        }
        for (Integer x : valu) {
            System.out.println(x);
        }
        System.out.println(" values");
        for (String x : key) {

            System.out.println(x);
        }
    }
}
