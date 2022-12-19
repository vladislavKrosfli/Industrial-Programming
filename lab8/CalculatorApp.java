import javax.swing.JFrame;
import java.awt.*;

public class CalculatorApp extends JFrame  {
    public CalculatorApp() {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int sizeWidth = 270;
        int sizeHeight = 435;
        int locationX = (screenSize.width - sizeWidth) / 2;
        int locationY = (screenSize.height - sizeHeight) / 2;

        JFrame frame = new JFrame();

        setBounds(locationX , locationY, sizeWidth, sizeHeight);

        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new Panel());

        setResizable(false);
        setVisible(true);
    }
}