/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.formulariojsfcoche;

import java.util.Objects;
import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import org.primefaces.component.colorpicker.ColorPicker;


/**
 *
 * @author pryet
 */
@Model
public class ColorView {
    
    private String colorInline;
    private String colorPopup;

    public String getColorInline() {
        return colorInline;
    }

    public void setColorInline(String colorInline) {
        this.colorInline = colorInline;
    }

    public String getColorPopup() {
        return colorPopup;
    }

    public void setColorPopup(String colorPopup) {
        this.colorPopup = colorPopup;
    }

    public void onColorChange(AjaxBehaviorEvent e) {
        ColorPicker picker = (ColorPicker) e.getComponent();
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Color changed: " + picker.getValue(), null);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onPopupClosed(AjaxBehaviorEvent e) {
        ColorPicker picker = (ColorPicker) e.getComponent();
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Popup closed: " + picker.getValue(), null);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
}
