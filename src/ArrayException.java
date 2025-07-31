public class ArrayException {

    // Use this array for your lab assignment.
    private int[] lab_array;
    private int current = 0;

    public ArrayExceptions(int size) {
        lab_array = new int[size];
    }

    public void insert(int value) {
        // Add try and catch here too.
        lab_array[current] = value;
        current++;
    }
    
    // Create your valueAt() method here.
}
