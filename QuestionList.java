public class QuestionList {
    
    public static Question[] getQuestionList(){
        Question[] list = new Question[10];
        list[0] = new Question(1, "Our national animal is ___________.", new String[]{"Tiger", "Lion", "Cow", "Elephant"}, "Tiger");
        list[1] = new Question(2, "Size of int is _____.", new String[]{"2", "4", "6", "8"}, "4");
        list[2] = new Question(3, "The sun sets in the ________.", new String[]{"North", "South", "East", "West"}, "West");
        list[3] = new Question(4, "The colour of Lotus is ___________.", new String[]{"Yellow", "Pink", "Red", "Green"}, "Pink");
        list[4] = new Question(5, "Our country India got independent on ___________.", new String[]{"1947", "1948", "1949", "1950"}, "1947");
        list[5] = new Question(6, "Our national bird is ___________.", new String[]{"Parrot", "Peacock", "Eagle", "Sparrow"}, "Peacock");
        list[6] = new Question(7, "Size of long is _____.", new String[]{"2", "4", "6", "8"}, "8");
        list[7] = new Question(8, "The sun rises in the ________.", new String[]{"North", "South", "East", "West"}, "East");
        list[8] = new Question(9, "The number of planets is ___________.", new String[]{"3", "7", "9", "4"}, "9");
        list[9] = new Question(10, "The largest continent is ___________.", new String[]{"Asia", "Africa", "America", "Europe"}, "Asia");

        return list;
    }
}
