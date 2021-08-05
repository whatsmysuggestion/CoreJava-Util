import java.util.ArrayList;

public class Program {

    public static boolean hasDuplicates(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            // Loop over all following elements.
            for (int x = i + 1; x < list.size(); x++) {
                // If two elements equal, there is a duplicate.
                if (list.get(i) == list.get(x)) {
                    return true;
                }
            }
        }
        // No duplicates found.
        return false;
    }

    public static void main(String[] args) {

        // This ArrayList has a duplicate.
        ArrayList<String> values = new ArrayList<>();
        values.add("green");
        values.add("blue");
        values.add("red");
        values.add("pink");
        values.add("pink");

        // See if duplicates exist.
        if (hasDuplicates(values)) {
            System.out.println(true);
        }
 
/*        values.removeIf(element -> element == "pink");*/
 
        System.out.println(hasDuplicates(values));
    }
}