import java.util.ArrayList;

public class Platform extends Main {
    private String name;

    private ArrayList<Category> categoryArrayList;

    ArrayList<Platform> platformArrayList= new ArrayList<>();


    public void addPlatform(Platform platform){
        platformArrayList.add(platform);
    }

    public void addCategorytoPlatform(Category category,String platform){
        getPlatfrombyName(platform).getCategoryArrayList().add(category);
    }


    public ArrayList<Platform> getPlatformArrayList() {
        return platformArrayList;
    }

    public Platform getPlatfrombyName(String name){
        for(Platform platform : platformArrayList){
           if(platform.getName().equals(name)){
               return platform;
           }
        }
        return null;
    }
    public Category getCategoryByName(String name,String platform){

        for(Category category : this.getPlatfrombyName(platform).getCategoryArrayList()){
            if(category.getName().equals(name)){
                return category;
            }
        }
        return null;

    }
    public Movie getMovieByName(String name,String platform,String category){
        for(Movie movie:this.getCategoryByName(category,platform).getMovieArrayList() ){
            if(movie.getName().equals(name)){
                return movie;
            }
        }
        return null;
    }
    public Platform() {
    }

    public Platform(String name, ArrayList<Category> categoryArrayList) {
        this.name = name;
        this.categoryArrayList = categoryArrayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Category> getCategoryArrayList() {
        return categoryArrayList;
    }

    public void setCategoryArrayList(ArrayList<Category> categoryArrayList) {
        this.categoryArrayList = categoryArrayList;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "name='" + name + '\'' +
                '}';
    }
}