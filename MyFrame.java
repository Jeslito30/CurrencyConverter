package currency;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.io.File;
import javax.sound.sampled.*;

public class MyFrame implements ActionListener {
    JFrame frame;
    JButton convert;
    JTextField currentCurrency;
    JTextField convertCurrency;
    JTextField result;
    ImageIcon background;
    ImageIcon logo;
    JComboBox listOfConvertCurrency;
    JComboBox listOfCurrentCurrency;
    JLabel  label;
    JLabel title;
    JPanel header;
    JPanel footer;
    ImageIcon convertIcon;
    JLabel icon;
    ImageIcon coin;
    JLabel coinLabel;



    MyFrame(){
        
        convertIcon = new ImageIcon("Pictures/Convert-Icon.png");
        background = new ImageIcon("Pictures/coin-background.png");
        logo = new ImageIcon("Pictures/logo.png");
        icon = new JLabel();

        coinLabel = new JLabel();
        coinLabel.setIcon(coin);
        coinLabel.setBounds(250,250,50,50);;
        coinLabel.setBackground(Color.black);

        icon.setIcon(convertIcon);
        icon.setBounds(225, 190, 50, 50);
        
        title = new JLabel("Currency Converter");
        title.setBounds(110, -25, 400, 100);
        title.setFont(new Font("Sans", Font.BOLD,  30));
        title.setForeground(new Color(238, 237, 237));

        
        convert = new JButton("CONVERT");
        convert.setBounds(200, 300, 100, 30);
        convert.setFocusable(false);
        convert.addActionListener(this);
        convert.setBackground(new Color(20, 33, 61));
        convert.setForeground(new Color(255, 255, 255));
        
        
       header = new JPanel();
       header.setBackground(new Color(20, 33, 61));
       header.setBounds(0,0,520,50);

       footer = new JPanel();
       footer.setBackground(new Color(20, 33, 61));
       footer.setBounds(0,420,520,50);
        
        String [] currencies = { "PHP",  "KWD", "BHD", "OMR", "JOD", "GIP", "GBP", "KYD","EUR", "USD"};
        listOfCurrentCurrency  = new JComboBox(currencies);
        // listOfCurrentCurrency.setBounds(275, 200, 75, 30);
        listOfCurrentCurrency.setBounds(125, 200, 75, 30);
        listOfCurrentCurrency.setBackground(new Color(20, 33, 61));
        listOfCurrentCurrency.setForeground(new Color(255, 255, 255));
        

        listOfConvertCurrency  = new JComboBox(currencies);
        listOfConvertCurrency.setBounds(375, 200, 75, 30);
        listOfConvertCurrency.setBackground(new Color(20, 33, 61));
        listOfConvertCurrency.setForeground(new Color(255, 255, 255));
        

        currentCurrency = new JTextField();
        // currentCurrency.setBounds(200,200,150,30);
        currentCurrency.setBounds(50,200,150,30);
        currentCurrency.setFont(new Font("Sans", Font.BOLD,  15));
        

        convertCurrency = new JTextField();
        // convertCurrency.setBounds(450,200,150,30);
        convertCurrency.setBounds(300,200,150,30);
        convertCurrency.setFont(new Font("Sans", Font.BOLD,  15));

        label = new JLabel();
        label.setIcon(background);
        label.setSize(520,500);
        
        
        label.add(coinLabel);
        label.add(icon);
        label.add(title);
        label.add(listOfCurrentCurrency);
        label.add(currentCurrency);
        label.add(listOfConvertCurrency);
        label.add(convertCurrency);
        label.add(convert);
        label.add(header);
        label.add(footer);
        
        

        label.setLayout(null);
        

        frame = new JFrame("Currency Converter v2.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        // frame.setSize(825, 500);
        frame.setSize(520,500);
        frame.setIconImage(logo.getImage());
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null); 
        frame.getContentPane().setBackground(new Color(252,163,17));
        frame.add(label);
        frame.add(coinLabel);
        
        frame.setVisible(true);
        
        


        
    }
    public static void playSound(String soundFile) {
        try {
            
            File file = new File("Wav/coin.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start(); 
        } catch (Exception ex) {
            System.out.println("Error playing sound: " + ex.getMessage());
        }
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==convert){
            playSound("button-click.wav"); 
            String c1 = (String) listOfCurrentCurrency.getSelectedItem();
            String c2 = (String) listOfConvertCurrency.getSelectedItem();

            Currency c = new Currency();
            c.currencyConversion(c1, c2, currentCurrency, convertCurrency);

        }
    }
    
    }


