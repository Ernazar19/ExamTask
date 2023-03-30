package service.impl;
import dao.ModelDaoImpl;
import enums.Category;
import model.Model;
import service.ModelService;
import java.util.List;
public class ModelServiceImpl implements ModelService {
    ModelDaoImpl modelDao = new ModelDaoImpl();
    @Override
    public List<Model> addModel(Model model) {
        return modelDao.addModel(model);
    }

    @Override
    public List<Model> getAllModel() {
        return modelDao.getAllModel();
    }

    @Override
    public void deleteModelsById(int id) {
       modelDao.deleteModelsById(id);
    }

    @Override
    public Model searchArticle(int article) {
        return modelDao.searchArticle(article);
    }

    @Override
    public Model categoryChoice(String category) {
        return modelDao.categoryChoice(category);
    }

    @Override
    public List<Model> sortByPrice(int a) {
        return modelDao.sortByPrice(a);
    }

    @Override
    public List<Model> filter(int num) {
        return modelDao.filter(num);
    }
}
