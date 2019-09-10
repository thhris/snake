
public class Main {
    private static View view;
    private static CoreMechanics core;

    public static void main(String[] args) {
        // initialises singleton view class
        view = View.getView();

        core = new CoreMechanics();
        core.initialiseGame();
    }
}
