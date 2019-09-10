import java.util.*;
public class Set_example
{
    public static void main(String[] args)
    {
        // Set deonstration using HashSet
        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");
        System.out.print("Set output without the duplicates");
 
        System.out.println(hash_Set);
 
        // Set deonstration using TreeSet
        System.out.print("Sorted Set after passing into TreeSet");
        Set<String> tree_Set = new TreeSet<String>(hash_Set);
        System.out.println(tree_Set);
    }
}
/*
    Set is an interface which extends Collection. It is an unordered collection of objects in which duplicate values cannot be stored.
    Basically, Set is implemented by HashSet, LinkedSet or TreeSet (sorted representation).
    Set has various methods to add, remove clear, size, etc to enhance the usage of this interface
Union
In this, we could simply add one Set with other. Since the Set will itself not allow any duplicate entries, we need not take care of the common values.

Expected Output:

Union : [0, 1, 2, 3, 4, 5, 7, 8, 9]

 
Intersection
We just need to retain the common values from both Sets.

Expected Output:

Intersection : [0, 1, 3, 4]

 
Difference
We just need to remove tall the values of one Set from the other.

Expected Output:

Difference : [2, 8, 9]
*/
