
package yan.swing;

import javax.swing.JPanel;
import java.awt.*;

public class PanelTrans extends JPanel{ 

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }
    private float alpha=1f;
    public PanelTrans(){
        setOpaque(false);
    }
    @Override
        public void paint(Graphics graphic){
            Graphics2D g2=(Graphics2D)graphic; 
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,alpha));
            super.paint(graphic);
        }
}

