import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;

public class Temp{
    public static void main(String[] args) {
        
        //label
        JLabel label=new JLabel();
        label.setForeground(Color.WHITE);
        label.setVerticalTextPosition((int) JLabel.BOTTOM_ALIGNMENT);
        label.setFont(new Font("MV Boli", Font.PLAIN, 15));
        // label.setIconTextGap(100);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        //tf7 for division right
        JTextField tf7 = new JTextField();
        tf7.setPreferredSize(new Dimension(120, 25));
        //tf6 for division lft
        JTextField tf6 = new JTextField();
        tf6.setPreferredSize(new Dimension(120, 25));
        //tf5 for multiply right
        JTextField tf5=new JTextField();
        tf5.setPreferredSize(new Dimension(120, 25));
        //tf4 for multiply lft
        JTextField tf4=new JTextField();
        tf4.setPreferredSize(new Dimension(120, 25));
        //tf3 for subtraction right
        JTextField tf3=new JTextField();
        tf3.setPreferredSize(new Dimension(120, 25));
        //tf2 for subttraction lft
        JTextField tf2=new JTextField();
        tf2.setPreferredSize(new Dimension(120, 25));
        //textfieled1 for addition right
        JTextField tf = new JTextField();
        tf.setPreferredSize(new Dimension(120, 25));
        //textfield for addition lft
        JTextField text=new JTextField();
        text.setPreferredSize(new Dimension(120, 25));
        //multiply
        JButton multiply =new JButton();
        multiply.setFocusable(false);
        multiply.setText("Multiply");
        multiply.setPreferredSize(new Dimension(120, 25));
        multiply.addActionListener(e ->{
            String mulin=tf4.getText();
            String mulin2=tf5.getText();
            try {
                double mulint=Double.parseDouble(mulin);
                double mulint1=Double.parseDouble(mulin2);
                double mulout=mulint*mulint1;
                label.setText("Total: "+mulout);
            } catch (Exception exxy) {
                label.setText("Invalid input. Please enter a valid integer.");
            }
        });
        //SUbtract
        JButton Subtraction = new JButton("Subtract");
        Subtraction.setFocusable(false);
        Subtraction.setPreferredSize(new Dimension(120, 25));
        Subtraction.addActionListener(e ->{
            String subin=tf2.getText();
            String subin2=tf3.getText();
            try {
                double subint=Double.parseDouble(subin);
                double subint1=Double.parseDouble(subin2);
                double subout=subint-subint1;
                label.setText("Total: "+subout);
            } catch (Exception exx) {
                label.setText("Invalid input. Please enter a valid integer.");
            }
        });
        // division button
        JButton Divide=new JButton();
        Divide.setFocusable(false);
        Divide.setPreferredSize(new Dimension(120, 25));
        Divide.setText("Divide");
        Divide.addActionListener(e ->{
            String divin=tf6.getText();
            String divin2=tf7.getText();
            try {
                Double divint=Double.parseDouble(divin);
                Double divint1=Double.parseDouble(divin2);
                Double divout=divint/divint1;
                label.setText("Total: "+divout);
            } catch (Exception exx) {
                label.setText("Invalid input. Please enter a valid integer.");
            }
        });
        //AC button
        JButton ac=new JButton();
        ac.setFocusable(false);
        ac.setText("AC");
        ac.setPreferredSize(new Dimension(120, 25));
        ac.addActionListener(e ->{
            tf.setText("");
            text.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            tf6.setText("");
            tf7.setText("");
            label.setText("");
        } );
        //Add button
        JButton Addition =new JButton();
        Addition.setFocusable(false);
        Addition.setText("Add");
        Addition.setPreferredSize(new Dimension(120, 25));
        Addition.addActionListener(e -> {
            String inputText = text.getText();
            String input=tf.getText();
            try {
                double intValue = Double.parseDouble(input);
                double intval=Double.parseDouble(inputText);
                double sum=intValue+intval;
                label.setText("Total : "+sum);
            } catch (NumberFormatException ex) {
                label.setText("Invalid input. Please enter a valid integer.");
            }
        });
        //Total
        JButton total=new JButton();
        total.setFocusable(false);
        total.setText("Total");
        total.setPreferredSize(new Dimension(120, 25));
        total.addActionListener(e ->{
            String tott=text.getText();
            String tot=tf.getText();
            String tot2=tf2.getText();
            String tot3=tf3.getText();
            String tot4=tf4.getText();
            String tot5=tf5.getText();
            String tot6=tf6.getText();
            String tot7=tf7.getText();
            try {
                double dblVal = Double.parseDouble(tott);
                double dblVal1 = Double.parseDouble(tot);
                double dblVal2 = Double.parseDouble(tot2);
                double dblVal3 = Double.parseDouble(tot3);
                double dblVal4 = Double.parseDouble(tot4);
                double dblVal5 = Double.parseDouble(tot5);
                double dblVal6 = Double.parseDouble(tot6);
                double dblVal7 = Double.parseDouble(tot7);
                double summ=dblVal+dblVal1-dblVal2-dblVal3*dblVal4*dblVal5/dblVal6/dblVal7;
                label.setText("Total of all : "+summ);
           } catch (Exception ea) {
                label.setText("fields cannot be empty");
            }
            
        });
        //panel for Addition 
        JPanel panl=new JPanel();
        panl.setFocusable(false);
        panl.setLayout(new FlowLayout());
        panl.setBackground(Color.darkGray);
        panl.add(Addition);
        panl.add(text);
        panl.add(tf);
        //panel for subtraction
        JPanel panelsub=new JPanel();
        panelsub.setFocusable(false);
        panelsub.setLayout(new FlowLayout());
        panelsub.setBackground(Color.darkGray);
        // panel.setLayout(new FlowLayout());
        panelsub.add(Subtraction);
        panelsub.add(tf2);
        panelsub.add(tf3);
        
        //panel2 for multiply
        JPanel panelm =new JPanel();
        panelm.setFocusable(false);
        panelm.setLayout(new FlowLayout());
        panelm.setBackground(Color.darkGray);
        panelm.add(multiply);
        panelm.add(tf4);
        panelm.add(tf5);

        //panel for division 
        JPanel paneldiv= new JPanel();
        paneldiv.setFocusable(false);
        paneldiv.setLayout(new FlowLayout());
        paneldiv.setBackground(Color.darkGray);
        paneldiv.add(Divide);
        paneldiv.add(tf6);
        paneldiv.add(tf7);


        //panl for AC total and clar button
        JPanel panlforBtn= new JPanel();
        panlforBtn.setFocusable(false);
        panlforBtn.setBackground(Color.darkGray);
        panlforBtn.add(ac);
        panlforBtn.add(total);

        //empty
        JLabel empty=new JLabel();
        empty.setText("                             ");
        //panlfor label
        // JPanel lbl=new JPanel();
        // lbl.setBackground(Color.darkGray);
        // lbl.add(label);
        //frame
        JFrame frame =new JFrame();
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setSize(500, 500);
        frame.add(panl);
        frame.add(panelsub);
        frame.add(panelm);
        frame.add(paneldiv);
        frame.add(empty);
        frame.add(panlforBtn);
        frame.add(empty);
        frame.add(empty);
        frame.add(label);
        frame.setLayout(new FlowLayout());
    }
    
}