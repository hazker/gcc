import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final Random random = new Random();
        int r=random.nextInt(10000000);
        System.out.println(r);
        while (true) {
            System.out.println("Select");
            int k = s.nextInt();
            switch (k) {
                    case 1: {
                        long l = System.currentTimeMillis();
                        LinkedList<String> link = new LinkedList<>();
                        for (int i = 0; i < 10000000; i++) {
                            link.add(i, "хах");
                            //System.out.println(list.get(i));
                        }
                        link.remove(r);
                        long l2 = System.currentTimeMillis();
                        System.out.println("LinkedList");
                        System.out.println(l2 - l);
                        break;
                    }
                    case 2: {
                        long l = System.currentTimeMillis();
                        ArrayList<String> list = new ArrayList<>();
                        for (int i = 0; i < 10000000; i++) {
                            list.add(i, "хах");
                            //System.out.println(list.get(i));
                        }
                        list.remove(r);
                        long l2 = System.currentTimeMillis();
                        System.out.println("ArrayList");
                        System.out.println(l2 - l);
                        break;
                    }
                    case 3: {
                        long l = System.currentTimeMillis();
                        TreeSet<String> set = new TreeSet<>();
                        for (int i = 0; i < 10000000; i++) {
                            set.add(String.valueOf(i));
                            //System.out.println(list.get(i));
                        }
                        set.remove(String.valueOf(r));
                        long l2 = System.currentTimeMillis();
                        System.out.println("TreeSet");
                        System.out.println(l2 - l);
                        break;
                    }
                    case 4: {
                        long l = System.currentTimeMillis();
                        HashMap<String, String> map = new HashMap<>();
                        for (int i = 0; i < 10000000; i++) {
                            map.put(String.valueOf(i), "xax");
                            //System.out.println(list.get(i));
                        }
                        map.remove(String.valueOf(r));
                        long l2 = System.currentTimeMillis();
                        System.out.println("HashMap");
                        System.out.println(l2 - l);
                        break;
                    }
                    case 5: {
                        long l = System.currentTimeMillis();
                        Map treemap = new TreeMap<>();
                        for (int i = 0; i < 10000000; i++) {
                            treemap.put(String.valueOf(i), "xax");
                            //System.out.println(list.get(i));
                        }
                        treemap.remove(String.valueOf(r));
                        long l2 = System.currentTimeMillis();
                        System.out.println("TreeMap");
                        System.out.println(l2 - l);
                        break;
                    }
                    case 6: {
                        System.out.println("StackOverflow");
                        try {
                            Stack();
                        } catch (StackOverflowError e) {
                            System.out.println(e);
                        }
                        break;
                    }
                    /*case 7: {
                                outofmem.test();
                                break;
                    }*/
                    case 0: {
                        return;
                    }
                }
             }
        }
    private static void Stack() {
        Stack();
    }
}

/*class outofmem {
        public static void test() {

        }

    }*/
