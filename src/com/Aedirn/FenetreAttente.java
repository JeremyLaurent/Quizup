package com.Aedirn;

import javax.swing.*;
import java.awt.*;

/**
 * Created by jeremy on 30/05/2016.
 */
public class FenetreAttente extends Container {



    public FenetreAttente(QuizzUpClient quizzUpClient, String pseudo)
    {


        JLabel affichePseudo = new JLabel("Votre pseudo est : "+pseudo);
        JLabel text = new JLabel("En attente de l'autre joueur ...");
        this.setLayout(new GridLayout(6,1));
        this.add(affichePseudo);
        this.add(text);
    }



}
