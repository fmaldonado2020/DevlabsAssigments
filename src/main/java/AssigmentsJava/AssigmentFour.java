package AssigmentsJava;

import java.util.*;

public class AssigmentFour {
    public static void main(String[] args) {
        //1. Find duplicate characters with their occurrences count using HashMap.
        countDuplicateCharacters("My name is Fernando");

        //2. Reverse an Arraylist.
        reverseArrayList();

        //3. Check if a particular key exists in HashMap.
        //4. Convert keys of a map to a list.
        checkKeyAndCreateList();

        //5. Copy all elements of a HashSet to an Object array.
        hashToObject();

        //6. Get highest and lowest value stored in TreeSet
        maxAndMinValueTreeSet();

        //7. Sort ArrayList of Strings alphabetically.
        sortArrayList();

        //8. Get Set view of keys from HashTable.
        getViewsHashTable();

    }

    public static void countDuplicateCharacters(String str)
    {
        Map<Character, Integer> map
                = new HashMap<Character, Integer>();

        char[] charArray = str.toCharArray();
        for (char c : charArray) {

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry :
                map.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println(entry.getKey()
                        + " : "
                        + entry.getValue());
            }
        }
    }

    public static void reverseArrayList(){
        ArrayList aList = new ArrayList();
        aList.add("1");
        aList.add("2");
        aList.add("3");
        aList.add("4");
        aList.add("5");
        Collections.reverse(aList);
        System.out.println("After Reverse Order, ArrayList Contains : " + aList);
    }

    public static void checkKeyAndCreateList(){
        HashMap<Integer, String> map = new HashMap<>();
        List myList = new ArrayList();

        map.put(1, "Devlabs");
        map.put(2, "Fernando");
        map.put(3, "Exam");

        int keyToBeChecked = 2;

        System.out.println("HashMap: " + map);

        Iterator<Map.Entry<Integer, String> > iterator = map.entrySet().iterator();

        boolean isKeyPresent = false;

        while (iterator.hasNext()) {

            Map.Entry<Integer, String> entry = iterator.next();
            myList.add(entry.getValue());

            if (keyToBeChecked == entry.getKey()) {
                isKeyPresent = true;
            }
        }

        System.out.println("Does key " + keyToBeChecked + " exists: " + isKeyPresent);
        System.out.println("My list: " + myList);
    }

    public static void hashToObject(){
        Set<Integer> hs = new HashSet<Integer>();
        hs.add(15);
        hs.add(71);
        hs.add(82);
        hs.add(89);
        hs.add(91);
        hs.add(93);
        hs.add(97);
        hs.add(99);
        System.out.println("Elements in set = "+hs);
        System.out.println("Copying all elements...");
        Object[] obArr = hs.toArray();
        for (Object ob : obArr)
            System.out.println(ob);
    }

    public static void maxAndMinValueTreeSet(){
        TreeSet tSet = new TreeSet();

        tSet.add("1");
        tSet.add("3");
        tSet.add("2");
        tSet.add("5");
        tSet.add("4");

        System.out.println("Lowest value Stored in Java TreeSet is : " + tSet.first());
        System.out.println("Highest value Stored in Java TreeSet is : " + tSet.last());
    }

    public static void sortArrayList(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Fer");
        names.add("Jose");
        names.add("Alfredo");
        Collections.sort(names);
        System.out.println(names);
    }

    public static void getViewsHashTable(){
        Hashtable ht = new Hashtable();
        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");
        Enumeration e = ht.keys();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }

}



