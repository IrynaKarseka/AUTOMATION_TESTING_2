import java.util.ArrayList;
import java.util.List;

public class Team {
    public List<Developer> developers = new ArrayList<Developer>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }


    public void createProject() {
        System.out.println("Команда создает проект");
        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
