public class objState {
    int state = 0;
    int index = 0;
    public int getState(){
        return state;
    }
    public void setState(int astate){
        state = astate;  
    }
    public void stateOn(){
        state = 1;
    }
    public void stateOff(){
        state = 0;
    }
    public void setIndex(int aindex){
        index = aindex;
    }
    public int getIndex(){
        return index;
    }

}
