package JavaMin;
import javax.swing.*;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;

public class NotesPage {
    JFrame f;
    JTextField search;
    JLabel logo,dsa,s;
     ImageIcon img1;
     ImageIcon img,img2;
    JPanel opt,not;
    JButton bnotes,batendance,btest,bassignment,bresult,binstantNotice,back,searchicon;
    NotesPage(){

         img1 = new ImageIcon("JavaMin/img.png");
         img = new ImageIcon("JavaMin/img_2.png");
         img2 = new ImageIcon("JavaMin/img.png");

         f = new JFrame();
         f.setLayout(null);
         f.getContentPane().setBackground(new Color(0xFBC4AB));
         //f.(new Color(0xFBC4AB));
         f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

         not = new JPanel();
         not.setLayout(null);
         not.setBackground(new Color(0xFFDAB9));
         not.setBounds(350,148,1016,575);
         not.setBorder(new BorderUIResource.BevelBorderUIResource(4));

//         s = new JLabel();
//         s.setIcon(img2);
//         s.setOpaque(true);
//         s.setBounds(1275,44,57,57);

         search = new JTextField();
         search.setBounds(900,44,276,120-64);
         search.setBorder(null);
         search.setFont(new Font("MV BOLLI",Font.PLAIN,30));

         dsa = new JLabel();
         dsa.setText("DSA");
         dsa.setFont(new Font("SANS_SERIF",Font.PLAIN,70));
         dsa.setOpaque(true);
         dsa.setBackground(new Color(0xFBC4AB));
         dsa.setSize(203,76);
         dsa.setLocation(360,34);

         searchicon = new JButton("Search");
         searchicon.setBorder(null);
         searchicon.setFocusable(false);
         searchicon.setBackground(Color.pink);
         searchicon.setBounds(1193,48,50,50);
        // searchicon.setIcon(img);
        // searchicon.setBackground(new Color(0,0,0,0));
         //searchicon.setOpaque(true);

         back = new JButton("Back");
         back.setBounds(20,45,90,47);
         back.setBorder(null);
         back.setBackground(Color.pink);
         back.setIcon(img);
         back.setFocusable(false);

         logo = new JLabel();
         logo.setIcon(img1);
         logo.setOpaque(true);
         logo.setBounds(160,15,120,120);

         opt = new JPanel();
         opt.setLayout(null);
         opt.setBounds(0,148,350,575);
         opt.setBackground(new Color(0xFFDAB9));

         bnotes = new JButton("Notes");
         bassignment = new JButton("Assignment");
         batendance = new JButton("Attendance");
         btest = new JButton("Test");
         bresult = new JButton("Result");
         binstantNotice = new JButton("Instant Notice");

         bnotes.setBorderPainted(false);
         bassignment.setBorderPainted(false);
         binstantNotice.setBorderPainted(false);
         bresult.setBorderPainted(false);
         batendance.setBorderPainted(false);
         btest.setBorderPainted(false);

         bnotes.setBounds(4,5,340,90);
         batendance.setBounds(4,100,340,90);
         bassignment.setBounds(4,195,340,90);
         bresult.setBounds(4,290,340,90);
         btest.setBounds(4,385,340,90);
         binstantNotice.setBounds(4,480,340,90);

         bresult.setBackground(new Color(0xF08080));
         binstantNotice.setBackground(new Color(0xF08080));
         bassignment.setBackground(new Color(0xF08080));
         batendance.setBackground(new Color(0xF08080));
         btest.setBackground(new Color(0xF08080));
         bnotes.setBackground(new Color(0xF08080));

         bassignment.setFocusable(false);
         batendance.setFocusable(false);
         binstantNotice.setFocusable(false);
         bresult.setFocusable(false);
         btest.setFocusable(false);
         bnotes.setFocusable(false);

         opt.add(bnotes);
         opt.add(bassignment);
         opt.add(batendance);
         opt.add(btest);
         opt.add(bresult);
         opt.add(binstantNotice);

         f.setBounds(0,0,1280,760);
         f.setResizable(false);

         f.add(opt);
         f.add(back);
         f.add(logo);
         f.add(dsa);
         f.add(search);
         f.add(searchicon);
//         f.add(s);
         f.add(not);
         f.setVisible(true);

    }




}
