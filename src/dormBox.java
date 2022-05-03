import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class dormBox extends JFrame implements ActionListener{
    JFrame aFrame = new JFrame();
    ArrayList<String> selections = new ArrayList<String>();
    
    
    JLabel lbl = new JLabel();


    public dormBox(){
        super();
      
    /* frame options */    {
        this.setSize(400, 150);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Dorm Selection");
        this.setLayout(new GridLayout(4, 4));
        
        this.add(lbl);
        

        }
        /* label options */{
            selections.add("oogabooga");
            lbl.setText(toStringbetter(selections));
        }



    }











    public static String toStringbetter(ArrayList<String> list){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < list.size(); i++){
            sb.append(list.get(i));
        }


        return(sb.toString());
    }






    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
