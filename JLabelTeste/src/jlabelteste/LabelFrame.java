package jlabelteste;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame{
    
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    
    public LabelFrame(){
        super("Testando Jlabel");
        setLayout (new FlowLayout());
        
        label1 = new JLabel("Caixa de texto");
        label1.setToolTipText("Este é o Label 1");
        add(label1);
        
        Icon Bug = new ImageIcon(getClass().getResource("download.jpg"));
        label2 = new JLabel ("Caixa de texto com incone", Bug 
                ,SwingConstants.LEFT);
        label2.setToolTipText("Este é o Label 2");
        add(label2);
        
        label3 = new JLabel();
        label3.setText("Caixa de texto com Imagem e com Botam ");
        label3.setIcon(Bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("Este é o Label 3");
        add(label3);
        
    }
}
