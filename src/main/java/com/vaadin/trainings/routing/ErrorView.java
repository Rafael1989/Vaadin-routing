/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vaadin.trainings.routing;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.ErrorParameter;
import com.vaadin.flow.router.HasErrorParameter;
import com.vaadin.flow.router.ParentLayout;

/**
 *
 * @author User
 */
@ParentLayout(MainLayout.class)
public class ErrorView extends Div implements HasErrorParameter<InvalidValueExeption>{

    @Override
    public int setErrorParameter(BeforeEnterEvent event, ErrorParameter<InvalidValueExeption> parameter) {
        setText("Ooops, seems it's an invalid number");
        return 500;
    }
    
}
