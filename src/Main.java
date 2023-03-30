import enums.Category;
import model.Model;
import service.impl.ModelServiceImpl;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ModelServiceImpl service = new ModelServiceImpl();
        Model model = new Model(1, "IPHONE-14 PRO", 12456,
                " CPU-5", 130000, 20, LocalDate.of(2022, 9, 15), Category.PHONE);
        Model model1 = new Model(2, "Mack-Book pro",
                12345633, "M-1 CHIP", 135000, 20, LocalDate.of(2020, 4, 11), Category.LAPTOP);
        Model model2 = new Model(3, "Acer", 1234,
                "CORE-I5", 50000, 30, LocalDate.of(2019, 2, 3), Category.LAPTOP);
        List<Model> models = new ArrayList<>(List.of(model, model1, model2));

       while (true ){
           System.out.println("""
                   1.add model
                   2.get all model
                   3.delete model by id
                   4.search Article
                   5.categoryChoice
                   6.sortByPrice
                   7.filter 
                   """);
           int a = new Scanner(System.in).nextInt();
           switch (a){
               case 1 -> {
                   for (Model m:models) {
                       System.out.println(  service.addModel(m));
                   }
               }
               case  2 -> System.out.println(service.getAllModel());
               case 3 -> {
                   System.out.println("Enter by id: ");
                   int id = new Scanner(System.in).nextInt();
                   service.deleteModelsById(id);
               }
               case 4 -> {
                   System.out.print("Enter article: ");
                   int article = new Scanner(System.in).nextInt();
                   System.out.println(service.searchArticle(article));
               }
               case 5 -> {
                   System.out.print("Enter category choice: ");
                   String category=new Scanner(System.in).nextLine();
                   System.out.println(service.categoryChoice(category));
               }
               case 6 -> {
                   System.out.print("Enter numbers 1 on 2: ");
                   int n = new Scanner(System.in).nextInt();
                   System.out.println(service.sortByPrice(n));

               }
               case 7 -> {
                   System.out.print("Enter  numbers 1 on 2: ");
                   int m = new Scanner(System.in).nextInt();
                   System.out.println(service.filter(m));
               }
           }
       }
    }
}