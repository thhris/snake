import javax.swing.*;
import java.awt.*;

public class Main {
    private static View view;

    public static void main(String[] args) {
        createAndInitView();
    }

    private static void createAndInitView(){
        view = View.getView();
        view.init();
    }
}