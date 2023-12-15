/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laura.componente;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author laura
 */
public class ImagenFondoEditorProperties extends PropertyEditorSupport{
private imagenJP img = new imagenJP();
    @Override
    public boolean supportsCustomEditor() {
        return true; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Component getCustomEditor() {
        //lo que hay que insertar
        return img; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getJavaInitializationString() {
        return super.getJavaInitializationString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Object getValue() {
        //devolver tras mostrar el panel y aceptar
        
        return img.getSelectedValue(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
