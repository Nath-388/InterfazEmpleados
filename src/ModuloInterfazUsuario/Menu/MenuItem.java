/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModuloInterfazUsuario.Menu;

import javax.swing.JButton;

/**
 *
 * @author nath_
 */
public class MenuItem extends JButton{
    private int index;
    private boolean subMenuAble;
    private int subMenuIndex;
    private int length;
    
    public MenuItem(String name, int index, boolean subMenuAble){
        super(name);
        this.index=index;
        this.subMenuAble=subMenuAble;
    }
    public void initSubMenu(int subMenuIndex, int length){
        this.subMenuIndex=subMenuIndex;
        this.length=length;
    }
    
}
