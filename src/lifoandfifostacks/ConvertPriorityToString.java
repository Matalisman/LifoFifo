/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lifoandfifostacks;

import javax.swing.JCheckBox;

/**
 *
 * @author Karola
 */
public class ConvertPriorityToString {
    String priority;
    ConvertPriorityToString(JCheckBox urgent, JCheckBox normal, JCheckBox low){
        if(urgent.isSelected()) priority = "Wysoki";
        if(normal.isSelected()) priority = "Średni";
        if(low.isSelected()) priority = "Niski";
    }
    String getPriority(){
        return priority;
    }
}
