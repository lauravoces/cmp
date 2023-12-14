/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laura.componente;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author laura
 */
public class Componente extends JPanel implements Serializable{
    //Aqui van variables que actuan como opciones del jpnael
    // private File rutaImg;
    //mas propiedades
    private ImagenFondo imagenFondo;
    // por cada una un getter y un setter

    public ImagenFondo getImagenFondo() {
        return imagenFondo;
    }

    public void setImagenFondo(ImagenFondo imagenFondo) {
        this.imagenFondo = imagenFondo;
    }
  

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        if(imagenFondo!=null){
       if(imagenFondo.getRutaImagen()!=null&& imagenFondo.getRutaImagen().exists()){
        ImageIcon imageIcon = new ImageIcon(imagenFondo.getRutaImagen().getAbsolutePath());
        Graphics2D g2d =(Graphics2D)g;
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, imagenFondo.getOpacidad()));
        g.drawImage(imageIcon.getImage(), 0, 0, this);
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));

    } 
    }
} 
    
}
