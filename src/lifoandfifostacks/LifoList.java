/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lifoandfifostacks;

import java.util.LinkedList;

/**
 *
 * @author Mateusz
 */
public class LifoList extends LinkedList<Message> implements StackListInterface{
     @Override
     public void add(String title, String description, String priority){
        this.add(new Message(title, description, priority));
        
    }
     @Override
     public Message getMessage(){
         return this.getLast();
     }
     @Override
     public void removeMessage(){
         this.removeLast();
     }
     
}
