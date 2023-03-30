package dao;

import database.Database;
import enums.Category;
import model.Model;
import service.ModelService;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ModelDaoImpl implements ModelService {
   Database database = new Database();
    @Override
    public List<Model> addModel(Model model) {
        database.getModels().add(model);
        return null;
    }

    @Override
    public List<Model> getAllModel() {
        return database.getModels();
    }

    @Override
    public void deleteModelsById(int id) {
      Model model = database.getModels().stream()
              .filter(x -> x.getId()==id).findFirst().get();
      database.getModels().remove(model);
        System.out.println("Модель данным ID "+id+" успешно удалена");


    }

    @Override
    public Model searchArticle(int article) {
        for (Model m : database.getModels()) {
            if (m.getArticle() == article) {
                System.out.println(m);
            }
        }
        return null;
    }

    @Override
    public Model categoryChoice(String category) {
        for (Model s:database.getModels()){
            if (s.getCategory().name().equals(category)){
                System.out.println(s);
            }
        }
        return null;
    }

    @Override
    public List<Model> sortByPrice(int a) {
        if(1==a){
       return database.getModels().stream().sorted(Comparator.comparing(Model::getPrice)).toList();
        }
        else if(2==a){
          return database.getModels().stream().sorted(Comparator.comparing(Model::getPrice).reversed()).toList();
        }
        return null;
    }

    @Override
    public List<Model> filter(int num) {
        if(num==1) {
            return database.getModels().stream().filter(model -> model.getDiscount() >= 50).toList();
        }else if (num==2){
            return database.getModels().stream().filter(model -> model.getDiscount() <= 50).toList();
        }
        return null;
    }
}
