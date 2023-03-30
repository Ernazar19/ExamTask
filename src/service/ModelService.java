package service;

import enums.Category;
import model.Model;

import java.util.List;

public interface ModelService {
    List<Model> addModel(Model model);

    List<Model> getAllModel();

    public void deleteModelsById(int id);

    Model searchArticle(int article);

    Model categoryChoice(String category );

    List<Model> sortByPrice(int a);

    List<Model> filter(int num);

}
