package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {
    // TODO -- Fill in your code here
    public static final int IN = 1;
    public static final int OUT = -1;
    public static final int CLOSED = 0;
    private int mSwing;

    public Gate(){
        mSwing = CLOSED;
    }

    public int getSwingDirection(){
        return mSwing;
    }

    public boolean setSwing(int direction){
        if(direction == 1 || direction == -1 || direction == 0){
            return true;
        }
        else return false;
    }

    public boolean open(int direction){
        if(direction == 1 || direction == -1){
            return setSwing(direction);
        }
        else
            return false;
    }

    public int thru(int count){
        if(mSwing == IN){
            return count;
        }
        else if(mSwing == OUT){
            return -(count);
        }
        else
            return 0;
    }

    public String toString(){
        if(mSwing == IN){
            return ("This gate is open and swings to enter the pen only");
        }
        if(mSwing == OUT){
            return ("This gate is open and swings to exit the pen only");
        }
        if(mSwing == CLOSED){
            return ("This gate is closed");
        }
        else
            return ("This gate has an invalid swing direction");
    }

    public void close(){
        setSwing(CLOSED);
    }
}
