package Controller;

import Logic.Product;
import Model.KassaModel;
import Vieuw.AbstractView;
import Vieuw.KassaView;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vincent on 4-9-2016.
 */
public class KassaController {
    private KassaView view;
    private KassaModel model;
    private DatabaseController databaseController;
    private ArrayList<KassaView> views = new ArrayList<KassaView>();




    public KassaController() {

        databaseController = new DatabaseController();


        model = new KassaModel(databaseController.getEmployees());
        view = new KassaView(model,this);
    }

    public void addView(KassaView view){
        views.add(view);
    }

    public void notifyViews(){
        for(KassaView view: views){
            view.updateView();
        }
    }
}
