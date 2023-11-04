
 //  Binome :  


package sample;
import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class HomeWork {

	public static void main(String[] args) {
		
		 // ceer un Frame
        JFrame frame = new JFrame();
        
        // ajouter borderLayout
        frame.setLayout(new BorderLayout());
        frame.setTitle("Mon Dialogue");
          frame.setSize(330, 360);
          
        //creer les elements de CENTER NORTH
        JLabel nomText = new JLabel("Nom");
        JTextField nom = new JTextField();
        nom.setPreferredSize(new Dimension(230 , 30));
        JLabel prenomText = new JLabel("Prenom");
        JTextField prenom = new JTextField();
        prenom.setPreferredSize(new Dimension(230 , 30));

        //creer les elements de SOUTH
        JButton ok = new JButton("Ok");
        JButton annuler = new JButton("Annuler");

        //creer les elements de EAST
        JCheckBox tennis = new JCheckBox("Tennis");
        JCheckBox squash = new JCheckBox("Squash");
        JCheckBox natation = new JCheckBox("Natation");
        JCheckBox athletisme = new JCheckBox("Athletisme");
        JCheckBox randonnee = new JCheckBox("Randonnee");
        JCheckBox foot = new JCheckBox("Foot");
        JCheckBox basket = new JCheckBox("Basket");
        JCheckBox volley = new JCheckBox("Volley");
        JCheckBox petanque = new JCheckBox("Petanque");

        //creer les elements de CENTER SOUTH
        JLabel sexe = new JLabel("Sexe");
        ButtonGroup group = new ButtonGroup();
        JRadioButton homme = new JRadioButton("Homme");
        JRadioButton femme = new JRadioButton("Femme");
        group.add(homme);
        group.add(femme);

        //creer les elements de CENTER CENTER
        JTextField adresse = new JTextField();
        JLabel adresseText = new JLabel("Adresse");
       
        //create panels
        JPanel panelCenter = new JPanel();
        
        panelCenter.setBorder(new EmptyBorder(10,10,10,10));
       
        
        // ajouter borderLayout
        panelCenter.setLayout(new BorderLayout());
        panelCenter.setPreferredSize(new Dimension(230 , 310));
        
        // creer les panels et ajouter leurs elemets
        JPanel panelEast = new JPanel();
        panelEast.setPreferredSize(new Dimension(100 , 310));
        
        // ajouter GridLayout
        panelEast.setLayout(new GridLayout(0,1));
        panelEast.add(tennis);
        panelEast.add(squash);
        panelEast.add(natation);
        panelEast.add(athletisme);
        panelEast.add(randonnee);
        panelEast.add(foot);
        panelEast.add(basket);
        panelEast.add(volley);
        panelEast.add(petanque);

        JPanel panelSouth = new JPanel();
      
        //ajouter flowLayout
        panelSouth.setLayout(new FlowLayout());
        panelSouth.add(ok);
        panelSouth.add(annuler);

        JPanel panelCenter2 = new JPanel();
        panelCenter2.setPreferredSize(new Dimension(230 ,120));
        
        // ne pas ajouter un layout
        panelCenter2.setLayout(null);
        panelCenter2.add(adresseText);
        panelCenter2.add(adresse);
        adresseText.setBounds(0,0,230,30);
        adresse.setBounds(0 , 25 , 195 , 85);

        JPanel panelNorth = new JPanel();
      
        // ajouter GridLayout
        panelNorth.setLayout(new GridLayout(0,1));
        panelNorth.add(nomText);
        panelNorth.add(nom);
        panelNorth.add(prenomText);
        panelNorth.add(prenom);
        
        JPanel panelSouth2 = new JPanel();
       
       
        // ajouter flowLayout
        
        panelSouth2.setLayout(new FlowLayout(3));
        panelSouth2.add(sexe);
        panelSouth2.add(homme);
        panelSouth2.add(femme);
       
        // ajouter les panels et leurs orientations au panel CENTER
        panelCenter.add(panelNorth , BorderLayout.NORTH);
        panelCenter.add(panelCenter2 , BorderLayout.CENTER);
        panelCenter.add(panelSouth2 , BorderLayout.SOUTH);

        // ajouter les panels au frame
        frame.add(panelCenter , BorderLayout.CENTER);
        frame.add(panelEast , BorderLayout.EAST);
        frame.add(panelSouth , BorderLayout.SOUTH);

        // frame visible
        frame.setVisible(true);
        frame.setResizable(false);
       
    }


	

}
