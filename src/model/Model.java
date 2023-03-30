package model;

import enums.Category;

import java.time.LocalDate;

public  class Model {
    private  long id;
    private String name;
    private int article;
    private  String CPU;
    private  int price;
    private  int discount;
    private LocalDate dateOfMade;
    private Category category;

    public Model(long id, String name, int article, String CPU,
                 int price, int discount, LocalDate dateOfMade, Category category) {
        this.id = id;
        this.name = name;
        this.article = article;
        this.CPU = CPU;
        this.price = price;
        this.discount = discount;
        this.dateOfMade = dateOfMade;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public LocalDate getDateOfMade() {
        return dateOfMade;
    }

    public void setDateOfMade(LocalDate dateOfMade) {
        this.dateOfMade = dateOfMade;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Model: " +"\n"+
                "id: " + id +"\n"+
                "name: "  + name + "\n"+
                "article: " + article + "\n"+
                "CPU: " + CPU + "\n"+
                "price: " + price +"\n"+
                "discount: " + discount +"\n"+
                "dateOfMade: " + dateOfMade +"\n"+
                "category: " + category;
    }

}
