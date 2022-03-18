package tw.edu.ntut.csie.game.state;

import tw.edu.ntut.csie.game.GameObject;
import tw.edu.ntut.csie.game.R;
import tw.edu.ntut.csie.game.core.MovingBitmap;

public class Character implements GameObject {
    private MovingBitmap _basic;
    private int px, py;

    public Character(){
        _basic = new MovingBitmap(R.drawable.basic);
        px=250;
        py=100;
    }
    public void initialize(){
        _basic.setLocation(px,py);
    }

    @Override
    public void release(){
        _basic.release();
        _basic=null;
    }

    @Override
    public void move() {

    }

    @Override
    public void show(){
        _basic.show();
    }
}
