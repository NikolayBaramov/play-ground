package Task19_Animals_SU;

public abstract class Animal {
    private String name;
    private String favouriteFood;

    public Animal(String name,String favouriteFood){
        this.setName(name);
        this.setFavouriteFood(favouriteFood);
    }

    public String getName(){
        return this.name;
    }

    public String getFavouriteFood(){
        return this.favouriteFood;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setFavouriteFood(String favouriteFood){
        this.favouriteFood = favouriteFood;
    }

    protected abstract String explainSelf();

}
