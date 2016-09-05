package Vieuw;

import Controller.KassaController;
import Logic.Employee;
import Model.KassaModel;

import javax.swing.*;
import javax.swing.text.html.ListView;

/**
 * Created by RonOS on 9/4/2016.
 */
public class KassaView extends JPanel{
    //TODO Create views and add listeners to controller.
    //TODO HET VINCENT, TODO HET.

    protected KassaModel model;
    protected KassaController controller;


    private DefaultListModel<Employee> employeeDefaultListModel = new DefaultListModel<Employee>();
    private JList employeeListView = new JList(employeeDefaultListModel);


    public KassaView(KassaModel model, KassaController controller){
        this.model = model;
        this.controller = controller;
        employeeDefaultListModel.addElement(new Employee(1, "vincent"));

        employeeListView.repaint();
        repaint();
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
