import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;



public class dormBox extends JFrame implements ActionListener{
    JFrame aFrame = new JFrame();
    JTextArea aTextArea = new JTextArea(60, 1);
    static ArrayList<String> selections = new ArrayList<String>();
    String delemeter = ", ";
    objState privRoom = new objState();
    objState Internet = new objState();
    objState fridge = new objState();
    objState Couch = new objState();
    objState Cable = new objState();
    objState Microwave = new objState();
    objState Mattress = new objState();
    objState Coffee = new objState();
    JLabel lbl = new JLabel();
    
    public dormBox() {
        super();

        /* frame options */ {
            this.setSize(400, 250);
            
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setTitle("Dorm Selection");
            this.setLayout(new GridBagLayout());
            this.setResizable(false);
            this.add(lbl);
            
        }
        /* label options */ {
            GridBagConstraints c = new GridBagConstraints();
            c.anchor = GridBagConstraints.WEST;
            c.fill = GridBagConstraints.HORIZONTAL;
            c.weightx = 1;
            c.weighty = 1;
            c.gridx = 0;
            c.gridy = 0;
            lbl.setText("Select Your Ammenities");
        }

        /* Private Room */ {
            JCheckBox checkbox = new JCheckBox("Private Room");



            GridBagConstraints c = new GridBagConstraints();
            c.anchor = GridBagConstraints.NORTH;
            c.fill = GridBagConstraints.WEST;
            c.weightx = 0.5;
            c.weighty = 0.5;
            c.gridx = 0;
            c.gridy = 1;

            
            checkbox.addActionListener(this);
            this.add(checkbox, c);

        }
        /* Internet Room */ {
            JCheckBox checkbox = new JCheckBox("Internet Connection");
            GridBagConstraints c = new GridBagConstraints();
            c.anchor = GridBagConstraints.NORTH;
            c.fill = GridBagConstraints.WEST;
            c.weightx = 1;
            c.weighty = 1;
            c.gridx = 0;
            c.gridy = 2;
            checkbox.addActionListener(this);
            this.add(checkbox, c);
        }
        /* fridge */ {
            JCheckBox checkbox = new JCheckBox("Refrigerator");
            GridBagConstraints c = new GridBagConstraints();
            c.anchor = GridBagConstraints.NORTH;
            c.fill = GridBagConstraints.WEST;
            c.weightx = 0.5;
            c.weighty = 0.5;
            c.gridx = 0;
            c.gridy = 3;
            checkbox.addActionListener(this);
            this.add(checkbox, c);
        }
        /* Couch */ {
            JCheckBox checkbox = new JCheckBox("Couch");
            GridBagConstraints c = new GridBagConstraints();
            c.anchor = GridBagConstraints.NORTH;
            c.fill = GridBagConstraints.WEST;
            c.weightx = 0.5;
            c.weighty = 0.5;
            c.gridx = 0;
            c.gridy = 4;
            checkbox.addActionListener(this);
            this.add(checkbox, c);
        }
        /* Cable TV */ {
            JCheckBox checkbox = new JCheckBox("Cable TV");
            GridBagConstraints c = new GridBagConstraints();
            c.anchor = GridBagConstraints.NORTH;
            c.fill = GridBagConstraints.WEST;
            c.weightx = 0.5;
            c.weighty = 0.5;
            c.gridx = 1;
            c.gridy = 1;
            checkbox.addActionListener(this);
            this.add(checkbox, c);
        }
        /* microwave */ {
            JCheckBox checkbox = new JCheckBox("Microwave");
            GridBagConstraints c = new GridBagConstraints();
            c.anchor = GridBagConstraints.NORTH;
            c.fill = GridBagConstraints.WEST;
            c.weightx = 0.5;
            c.weighty = 0.5;
            c.gridx = 1;
            c.gridy = 2;
            checkbox.addActionListener(this);
            this.add(checkbox, c);
        }
        /* Mattress */ {
            JCheckBox checkbox = new JCheckBox("Mattress");
            GridBagConstraints c = new GridBagConstraints();
            c.anchor = GridBagConstraints.NORTH;
            c.fill = GridBagConstraints.WEST;
            c.weightx = 0.5;
            c.weighty = 0.5;
            c.gridx = 1;
            c.gridy = 3;
            checkbox.addActionListener(this);
            this.add(checkbox, c);
        }
        /* Coffee Table */ {
            JCheckBox checkbox = new JCheckBox("Coffee Table");
            GridBagConstraints c = new GridBagConstraints();
            c.anchor = GridBagConstraints.NORTH;
            c.fill = GridBagConstraints.WEST;
            c.weightx = 0.5;
            c.weighty = 0.5;
            c.gridx = 1;
            c.gridy = 4;
            checkbox.addActionListener(this);
            this.add(checkbox, c);
        }
        /* Text Area */ {
            aTextArea.setEditable(false);
            aTextArea.setEnabled(true);
            aTextArea.setBackground(Color.WHITE);

            aTextArea.setText(toStringbetter(selections));
            GridBagConstraints c = new GridBagConstraints();
            c.anchor = GridBagConstraints.NORTH;
            c.fill = GridBagConstraints.WEST;
            c.weightx = 0.5;
            c.weighty = 0.5;
            c.gridx = 0;
            c.gridy = 5;
            this.add(aTextArea, c);
            
        }
    }

    public static String toStringbetter(ArrayList<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("you have selected the options:\n");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }

        return (sb.toString());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String boxon = e.toString();
        System.out.println(boxon);

        if(e.toString().contains("Private Room")){
            if(privRoom.getState() == 1){
                
                selections.remove(privRoom.getIndex());
                
                
            }
            else if(privRoom.getState() == 0){
                
                selections.add("> Private Room\n");
                privRoom.setIndex(selections.size() - 1);
                
            }
        }
        if(e.toString().contains("Internet Connection")){
            if(Internet.getState() == 1){
                Internet.stateOff();
                selections.add("> Deselected Internet Connection\n");
            }
            else if(Internet.getState() == 0){
                Internet.stateOn();
                selections.add("> Selected Internet Connection\n");
            }
        } 
        if(e.toString().contains("Refrigerator")){
            if(fridge.getState() == 1){
                fridge.stateOff();
                selections.add("> Deselected Refrigerator\n");
            }
            else if(fridge.getState() == 0){
                fridge.stateOn();
                selections.add("> Selected Refrigerator\n");
            }
        } 
        if(e.toString().contains("Couch")){
            if(Couch.getState() == 1){
                Couch.stateOff();
                selections.add("> Deselected Couch\n");
            }
            else if(Couch.getState() == 0){
                Couch.stateOn();
                selections.add("> Selected Couch\n");
            }
        }
        if(e.toString().contains("Cable TV")){
            if(Cable.getState() == 1){
                Cable.stateOff();
                selections.add("> Deselected Cable TV\n");
            }
            else if(Cable.getState() == 0){
                Cable.stateOn();
                selections.add("> Selected Cable TV\n");
            }
        }
        if(e.toString().contains("Microwave")){
            if(Microwave.getState() == 1){
                Microwave.stateOff();
                selections.add("> Deselected Microwave\n");
            }
            else if(Microwave.getState() == 0){
                Microwave.stateOn();
                selections.add("> Selected Microwave\n");
            }
        }
        if(e.toString().contains("Mattress")){
            if(Mattress.getState() == 1){
                Mattress.stateOff();
                selections.add("> Deselected Mattress\n");
            }
            else if(Mattress.getState() == 0){
                Mattress.stateOn();
                selections.add("> Selected Mattress\n");
            }
        }
        if(e.toString().contains("Coffee Table")){
            if(Coffee.getState() == 1){
                Coffee.stateOff();
                selections.add("> Deselected Coffee\n");
            }
            else if(Coffee.getState() == 0){
                Coffee.stateOn();
                selections.add("> Selected Coffee\n");
            }
        }
        

        aTextArea.setText(toStringbetter(selections));
        

    }



}
