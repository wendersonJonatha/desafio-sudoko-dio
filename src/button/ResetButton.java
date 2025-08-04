package button;


import javax.swing.JButton;
import java.awt.event.ActionListener;

public class ResetButton  extends JButton {
    public ResetButton(final ActionListener actionListener){
        this.setText("Reiniciar game");
        this.addActionListener(actionListener);
    }
}
