package com.udla.personas.views.listarpersona;

import com.udla.personas.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Listar Persona")
@Route(value = "listar-persona", layout = MainLayout.class)
@Uses(Icon.class)
public class ListarPersonaView extends Composite<VerticalLayout> {

    public ListarPersonaView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
