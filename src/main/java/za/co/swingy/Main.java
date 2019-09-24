package za.co.swingy;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public static void main(String[] args) {
        new Main();
    }

    public Main () {
        this.setSize(400,400);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimension = tk.getScreenSize();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
