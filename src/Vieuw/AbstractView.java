package Vieuw;

import javax.swing.*;

import Controller.KassaController;
import Logic.*;
import Model.*;

/**
 * Created by Gebruiker on 5-9-2016.
 */
public abstract class AbstractView extends JPanel {
    protected KassaModel model;
    protected KassaController controller;

    public AbstractView(KassaModel model, KassaController controller){
        this.model = model;
        this.controller = controller;
    }

    public KassaModel getModel(){
        return model;
    }

    public KassaController getController() {
        return controller;
    }
}
