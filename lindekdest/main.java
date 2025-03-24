import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Olma");
        list.add("Banan");
        list.add("Gilos");
        System.out.println(list);

        printWithIterator(list);
        
        System.out.println(list.size());
        list.clear();
        System.out.println(list);

        list.add("A");
        list.add("B");
        list.add("C");
        printReversed(list);

        list.addFirst("Start");
        list.addLast("End");
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.remove(1);
        System.out.println(list);

        String firstRemoved = list.pollFirst();
        String lastRemoved = list.pollLast();
        System.out.println(firstRemoved);
        System.out.println(lastRemoved);
        System.out.println(list);

        list.clear();
        System.out.println(list);

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("X");
        list1.add("Y");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("A");
        list2.add("B");

        LinkedList<String> merged = mergeLists(list1, list2);
        System.out.println(merged);

        LinkedList<String> copyList = new LinkedList<>(merged);
        System.out.println(copyList);

        copyList.removeFirst();
        System.out.println(copyList);

        Collections.shuffle(copyList);
        System.out.println(copyList);

        ArrayList<String> arrayList = new ArrayList<>(copyList);
        System.out.println(arrayList);

        Collections.sort(copyList);
        System.out.println(copyList.contains("A"));
    }

    public static void printWithIterator(LinkedList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void printReversed(LinkedList<String> list) {
        Iterator<String> iterator = list.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static LinkedList<String> mergeLists(LinkedList<String> list1, LinkedList<String> list2) {
        LinkedList<String> result = new LinkedList<>(list1);
        result.addAll(list2);
        return result;
    }
}
