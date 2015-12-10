/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lifoandfifostacks;

/**
 *
 * @author Karola
 */
public interface StackListInterface {
    void add(String title, String description, String priority);
    Message getMessage();
    void removeMessage();
}
