import javax.swing.JApplet;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JAppletExample1 extends JApplet {
    
    @Override
  public void init() {
    JMenuBar jMenuBar = new JMenuBar();

    JMenu menu1 = new JMenu("Top Menu1");

    JMenuItem menu1_1 = new JMenuItem("Menu1.1");
    menu1.add(menu1_1);

    JMenuItem menu1_2 = new JMenuItem("Menu1.2");
    menu1.add(menu1_2);

    JMenuItem menu1_3 = new JMenuItem("Menu1.3");
    menu1.add(menu1_3);

    JMenu add = jMenuBar.add(menu1);

//Üst Menü2
    JMenu menu2 = new JMenu("Top Menu2");

    JMenuItem menu2_1 = new JMenuItem("Menu2.1");
    menu2.add(menu2_1);

    jMenuBar.add(menu2);

    setJMenuBar(jMenuBar);
  }
}