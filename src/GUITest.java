import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GUITest {

    GUI gui=new GUI();


    @Test
    public void initGUI() {
        gui.initGUI();
        boolean flag=false;
        if((gui.get_btnRandomInit()).equals("随机初始化")&&gui.get_num()==20){
            flag=true;
        }
        assertEquals(true,flag);

    }

    @Test
    public void actionPerformed() {
    }

    @Test
    public void makeNextGeneration() {
    }
}