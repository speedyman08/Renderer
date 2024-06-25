import javax.swing.*;
import java.awt.*;

public class Renderer extends Canvas {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    Renderer() {

    }

    public static void main(String[] args) {
        Renderer renderer = new Renderer();
        JFrame frame = new JFrame();

        frame.add(renderer);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);

    }
}