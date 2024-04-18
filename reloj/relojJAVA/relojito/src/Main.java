import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;

public class Main extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RealTimeClock clock = new RealTimeClock();
            clock.setVisible(true);
        });
    }
}
