import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {


        JFrame jf = new JFrame();
        jf.setTitle("X BANKASI");
        jf.setSize(500, 600);
        jf.setLocation(100,200);

        jf.getContentPane().setLayout(new FlowLayout());
        JTextField text1 = new JTextField(10);
        //JTextField text2 = new JTextField(10);
        JPasswordField pass = new JPasswordField(10);
        JButton buton1 = new JButton("Giriş");
        JLabel  label1= new JLabel("userName: ");
        JLabel label2= new JLabel("password: ");

        jf.getContentPane().add(label1);
        jf.getContentPane().add(text1);
        jf.getContentPane().add(label2);
        jf.getContentPane().add(pass);
        jf.getContentPane().add(buton1);

        buton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 ="blue";
                String s2 = "shine";
                int bakiye =1000;
                if (text1.getText().equals(s1)) {
                    if (pass.getText().equals(s2)) {
                        int islem = Integer.parseInt(JOptionPane.showInputDialog("1-Para Yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgulama\n" + "4-Çıkış Yap"));


                        switch (islem){

                            case 1:

                                int tutar = Integer.parseInt(JOptionPane.showInputDialog("Yatırmak istediğiniz tutar:"));
                                bakiye += tutar;
                                JOptionPane.showMessageDialog(null,"yeni bakiye"+ bakiye);
                                break;
                            case 2:

                                int cekilem  = Integer.parseInt(JOptionPane.showInputDialog("bakiyeniz "+ bakiye +" ne kadar çekilsin?"));
                                if(cekilem > bakiye){
                                    JOptionPane.showMessageDialog(null, "Yetersiz bakiye");
                                }else{
                                    JOptionPane.showMessageDialog(null,"Paranızı alınız");
                                }
                                break;
                            case 3:

                                JOptionPane.showMessageDialog(null, "Bakiyeniz:" + bakiye );
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "Kartınızı alnız");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,"Yanlış işlem seçtiniz");

                        }


                    } else {
                        JOptionPane.showMessageDialog(null, "Kullanıcı adı ve ya şifre hatalıdır");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Kullanıcı adı ve ya şifre hatalıdır");
                }

            }
        });

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setVisible(true);
    }
}