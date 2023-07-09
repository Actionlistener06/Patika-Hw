import java.util.ArrayList;


public class Category extends Main {
    private String name;

    private ArrayList<Movie> movieArrayList;
     ArrayList<Category> categoryArrayList=new ArrayList<>();


    public Category(String name, ArrayList<Movie> movieArrayList) {
        this.name = name;
        this.movieArrayList = movieArrayList;
    }


    public void addMovieToCategory(Movie movie,String category){
        getCategorybyName(category).getMovieArrayList().add(movie);
    }
    public void addCategory(Category category){
        categoryArrayList.add(category);
    }

    public Category getCategorybyName(String name){
        for(Category category: categoryArrayList){
            if(category.name.equals(name)){
                return category;
            }
        }
        return null;
    }

    public ArrayList<Movie> getMovieArrayList() {
        return movieArrayList;
    }

    public ArrayList<Category> getCategoryArrayList() {
        return categoryArrayList;
    }

    public Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
}