/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renderer;

import bean.Unidade;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author moises
 */
public class UnidadeListCellRenderer extends DefaultListCellRenderer {
    
      public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, 
            boolean cellHasFocus) {
      super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if(value instanceof Unidade){
            Unidade u = (Unidade)value;
            setText(u.getDescricaoUnidade());
        }
        return this;
    }
    
    
}
