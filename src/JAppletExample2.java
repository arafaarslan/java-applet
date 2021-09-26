import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class JAppletExample2 extends Applet {

    private Font f = new Font("Times New Roman", Font.BOLD, 20);
    private String message = null;

    @Override
    public void init() {
        message = "APPLET INIT.";
        System.out.println(message);
        setBackground(Color.YELLOW);
    }

    @Override
    public void start() {
        message = "APPLET START.";
        System.out.println(message);
    }

    @Override
    public void stop() {
        message = "APPLET STOP.";
        System.out.println(message);
        setBackground(Color.RED);
    }

    @Override
    public void destroy() {
        message = "APPLET DESTROY.";
        System.out.println(message);
    }

    @Override
    public void paint(Graphics g) {
        g.setFont(f);
        g.setColor(Color.DARK_GRAY);
        g.drawString("STATE : " + message, 15, 30);
    }
}