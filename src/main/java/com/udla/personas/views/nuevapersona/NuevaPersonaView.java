package com.udla.personas.views.nuevapersona;

import com.udla.personas.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("Nueva Persona")
@Route(value = "nueva-persona", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Uses(Icon.class)
public class NuevaPersonaView extends Composite<VerticalLayout> {

    public NuevaPersonaView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        Checkbox checkbox = new Checkbox();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonSecondary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("min-content");
        layoutRow.setHeight("min-content");
        textField.setLabel("NOMBRE");
        textField.setWidth("192px");
        textField.setHeight("50px");
        textField2.setLabel("EDAD");
        textField2.setWidth("min-content");
        textField2.setHeight("50px");
        checkbox.setLabel("Checkbox");
        checkbox.setWidth("min-content");
        checkbox.setHeight("50px");
        layoutColumn2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutRow2.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        buttonPrimary.setText("Aceptar");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Cancelar");
        buttonSecondary.setWidth("min-content");
        getContent().add(layoutRow);
        layoutRow.add(textField);
        layoutRow.add(textField2);
        layoutRow.add(checkbox);
        getContent().add(layoutColumn2);
        layoutColumn2.add(layoutRow2);
        layoutRow2.add(buttonPrimary);
        layoutRow2.add(buttonSecondary);
    }
}
