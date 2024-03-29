package pacman;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter {
	Pacman p;
	PacFrame f;
	boolean ingame=true;
	KeyListener(Pacman pp,PacFrame fr){p=pp; f=fr;}
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (ingame) {
            if (key == KeyEvent.VK_LEFT) {
                p.setD(2);
            } else if (key == KeyEvent.VK_RIGHT) {
                p.setD(3);
            } else if (key == KeyEvent.VK_UP) {
                p.setD(1);
            } else if (key == KeyEvent.VK_DOWN) {
                p.setD(4);
            }else if(key == KeyEvent.VK_SPACE && p.getDead()) {
            	f.dispose();
            	new Menu();
            }
        }
    }
}
