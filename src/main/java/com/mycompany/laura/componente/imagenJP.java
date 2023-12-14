/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.laura.componente;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author laura
 */
public class imagenJP extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public imagenJP() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jruta = new javax.swing.JTextField();
        jbruta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jsOpacidad = new javax.swing.JSlider();

        jLabel1.setText("Img:");

        jruta.setEditable(false);
        jruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrutaActionPerformed(evt);
            }
        });

        jbruta.setText("jButton1");
        jbruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbrutaActionPerformed(evt);
            }
        });

        jLabel2.setText("opacidad:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jsOpacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbruta)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbruta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jsOpacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(199, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrutaActionPerformed

    private void jbrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbrutaActionPerformed
      JFileChooser fileChoose = new JFileChooser();
      int resultado=fileChoose.showOpenDialog(this);
      if(resultado==JFileChooser.APPROVE_OPTION){
         File file = fileChoose.getSelectedFile();
         jruta.setText(file.getAbsolutePath());
      }
    }//GEN-LAST:event_jbrutaActionPerformed
public ImagenFondo getSelectedValud(){
    //metodo para devolver la propiedad del componente
    File rru = new File(jruta.getText());
    Float opa= jsOpacidad.getValue()/100f;
        return new ImagenFondo(rru, opa);
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbruta;
    private javax.swing.JTextField jruta;
    private javax.swing.JSlider jsOpacidad;
    // End of variables declaration//GEN-END:variables
}