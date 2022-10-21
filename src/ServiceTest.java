import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceTest {
    private static Service service=new Service(3,3);
    @Before
    public void setUp() throws Exception {
        service.deleteAllCell();
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void update() {

       //一行的特殊情况//
        service.set_grid(2,1);
        service.set_grid(2,2);
        service.set_grid(2,3);
        service.update();
        assertEquals(0,service.get_grid(2,1));
        assertEquals(1,service.get_grid(2,2));
        assertEquals(0,service.get_grid(2,3));
        assertEquals(1,service.get_grid(1,2));
        assertEquals(1,service.get_grid(3,2));
        assertEquals(0,service.get_grid(1,1));
        assertEquals(0,service.get_grid(3,3));
        assertEquals(0,service.get_grid(1,3));
        assertEquals(0,service.get_grid(3,1));



        //边界测试全是1
       /* int i,j;
        for ( i = 1; i <= service.get_row(); i++)
        {
            for ( j = 1; j <= service.get_col() ; j++)
            {
                service.set_grid(i,j);
            }
        }
        service.update();
        for ( j = 1; j <= service.get_col() ; j++)
        {
            assertEquals(0,service.get_grid(2,j));
        }
        assertEquals(1,service.get_grid(1,1));
        assertEquals(1,service.get_grid(1,3));
        assertEquals(1,service.get_grid(3,1));
        assertEquals(1,service.get_grid(3,3));
        assertEquals(0,service.get_grid(1,2));
        assertEquals(0,service.get_grid(3,2));*/

        /*
        //田字形
        int a[][]=new int[4][4];
        int i=0,j=0;
        service.set_grid(1,1);
        service.set_grid(1,2);
        service.set_grid(2,1);
        service.set_grid(2,2);
        for(int m=1;m<4;m++)
            for(int n=1;n<4;n++){
                a[m][n]=service.get_grid(m,n);
            }
        service.update();
        boolean flag=true;
        for(i=0;i<=service.get_row();i++)
          for(j=0;j<=service.get_col();j++){
              if(a[i][j]!= service.get_grid(i,j))
                  flag=false;
          }
        assertEquals(false,flag);*/



    }
}