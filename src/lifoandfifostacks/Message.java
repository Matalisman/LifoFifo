package lifoandfifostacks;

/**
 *
 * @author Mateusz
 */
public class Message {
    private String title;
    private String description;
    private String priority;
    private int id;
    Message(String title, String description, String priority){
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.id = id;
    }
    String getTitle(){
        return title;
    }
    String getDescription(){
        return description;
    }
    String getPriority(){
        return priority;
    }
}
