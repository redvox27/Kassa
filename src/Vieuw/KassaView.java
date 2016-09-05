package Vieuw;

import Controller.KassaController;
import Model.KassaModel;

import javax.swing.*;

/**
 * Created by RonOS on 9/4/2016.
 */
public class KassaView extends JFrame{
    //TODO Create views and add listeners to controller.
    //TODO HET VINCENT, TODO HET.

    protected KassaModel model;
    protected KassaController controller;


    public KassaView(KassaModel model, KassaController controller){
        this.model = model;
        this.controller = controller;
    }

    public KassaModel getModel(){
        return model;
    }

    public KassaController getController() {
        return controller;
    }

    public void updateView(){
        repaint();
    }
}
