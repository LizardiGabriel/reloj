import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;

public class RealTimeClock extends JFrame {
    private JLabel timeLabel;

    public RealTimeClock() {
        setTitle("Real Time Clock");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;

        setSize(width, height);
        setLocationRelativeTo(null);

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Times New Roman", Font.BOLD, 200));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        timeLabel.setForeground(Color.white);
        getContentPane().setBackground(Color.BLACK);

        updateTime();

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(timeLabel, BorderLayout.CENTER);

        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();
    }

    private void updateTime() {
        LocalTime currentTime = LocalTime.now();
        String formattedTime = String.format("%02d:%02d:%02d",
                currentTime.getHour(), currentTime.getMinute(), currentTime.getSecond());
        timeLabel.setText(formattedTime);
    }

}
