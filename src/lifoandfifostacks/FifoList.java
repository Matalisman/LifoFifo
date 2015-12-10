/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lifoandfifostacks;

import java.util.LinkedList;

/**
 *
 * @author Karola
 */
public class FifoList extends LinkedList<Message> implements StackListInterface{
     @Override
     public void add(String title, String description, String priority){
        this.add(new Message(title, description, priority));
    }
     @Override
     public Message getMessage(){
         return this.getFirst();
     }
     @Override
     public void removeMessage(){
         this.removeFirst();
     }
     
}