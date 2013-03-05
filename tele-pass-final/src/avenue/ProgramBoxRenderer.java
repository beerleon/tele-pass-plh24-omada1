/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package avenue;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import model.Program;

/**
 *
 * @author Aggelos
 */
public class ProgramBoxRenderer extends DefaultListCellRenderer{
    @Override
    public Component getListCellRendererComponent(
                     JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
               super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
               if (value instanceof Program) {
                   Program p = (Program)value;
                   setText(p.getId() + "-" + p.getDescription());
               }
               return this;
           }
}

