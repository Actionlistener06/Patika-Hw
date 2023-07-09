
import java.util.ArrayList;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Platform platform= new Platform();

            int choice;
            do {
                System.out.println("-----------------");
                System.out.println("1. Admin");
                System.out.println("2. Client");
                System.out.println("0. Exit");
                System.out.println("------------------");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        adminMenu(scanner,platform);
                        break;
                    case 2:
                        clientMenu(scanner,platform);
                    case 0:
                        System.out.println("Exiting the program...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 0);
        }
        public static void adminMenu(Scanner scanner,Platform platform) {


            int choice;
            do {
                System.out.println("---------------");
                System.out.println("1-Add Platform");
                System.out.println("0-Return");
                System.out.println("---------------");

                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1 -> {
                        System.out.println("Enter platform name: ");
                        String platformForFilm = scanner.nextLine();
                        System.out.println("Enter category: ");
                        String categoryForFilm = scanner.nextLine();
                        System.out.println("Enter movie title");
                        String movieTitle = scanner.nextLine();
                        System.out.println("Enter show times with blank in format like 00:00");
                        String[] showtimes = scanner.nextLine().split(" ");
                        Movie movie1 = new Movie(movieTitle, showtimes);
                        System.out.println("Movie added successfully");
                        if (platform.getPlatfrombyName(platformForFilm) == null) {
                            ArrayList<Movie> arrcatg = new ArrayList<>();
                            arrcatg.add(movie1);
                            Category category1 = new Category(categoryForFilm, arrcatg);
                            ArrayList<Category> arrplat = new ArrayList<>();
                            arrplat.add(category1);
                            Platform platform1 = new Platform(platformForFilm, arrplat);
                            platform.addPlatform(platform1);
                            System.out.println(platform.platformArrayList.toString());
                        } else if (platform.getCategoryByName(categoryForFilm, platformForFilm) == null) {
                            ArrayList<Movie> arrcatg = new ArrayList<>();
                            arrcatg.add(movie1);
                            Category category1 = new Category(categoryForFilm, arrcatg);
                            platform.addCategorytoPlatform(category1, platformForFilm);
                        } else {
                            platform.getCategoryByName(categoryForFilm, platformForFilm).addMovieToCategory(movie1, categoryForFilm);
                        }
                    }
                    case 0 -> System.out.println("Returning to previous menu...");
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 0);
        }

        private static void clientMenu(Scanner scanner,Platform platform) {

            int choice;
            do {
                System.out.println("---------------");
                System.out.println("1-See the platform list");
                System.out.println("0-Return");


                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {

                    case 1:
                        System.out.println(platform.platformArrayList.toString());
                        System.out.print("Select Platform: ");
                        String platformSelected = scanner.nextLine();
                        System.out.println(platform.getPlatfrombyName(platformSelected).getCategoryArrayList().toString());
                        System.out.print("Select Category: ");
                        String categorySelected = scanner.nextLine();
                        System.out.println(platform.getCategoryByName(categorySelected,platformSelected).getMovieArrayList().toString());
                        System.out.println("Select movie: ");
                        String movieSelected = scanner.nextLine();
                        System.out.println(platform.getMovieByName(movieSelected,platformSelected,categorySelected).toString());
                        System.out.println("Select showtime: ");

                    case 0:
                        System.out.println("Returning to previous menu...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 0);
        }

    }

