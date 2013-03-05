/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package avenue;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import model.Color;

/**
 *
 * @author Aggelos
 */
public class ColorBoxRenderer extends DefaultListCellRenderer{
    @Override
           public Component getListCellRendererComponent(
                   JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
               super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
               if (value instanceof Color) {
                   Color s = (Color)value;
                   setText(s.getId() + "-" + s.getDescription());
               }
               return this;
           }
}

