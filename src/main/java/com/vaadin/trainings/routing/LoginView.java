/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vaadin.trainings.routing;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;
import java.util.Optional;

/**
 *
 * @author User
 */
@Route("login")
public class LoginView extends Composite<Div> implements HasComponents{
    
    public LoginView(){
        add(new Button("Login", e -> {
            VaadinSession.getCurrent().setAttribute("userLoggedIn", true);
            Object intendedPath = VaadinSession.getCurrent().getAttribute("intendedPath");
            UI.getCurrent().navigate(Optional.ofNullable(intendedPath).map(Object::toString).orElse(""));
        }));
    }
    
}
