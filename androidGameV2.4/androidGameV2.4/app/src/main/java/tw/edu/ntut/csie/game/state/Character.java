package tw.edu.ntut.csie.game.state;

import tw.edu.ntut.csie.game.GameObject;
import tw.edu.ntut.csie.game.R;
import tw.edu.ntut.csie.game.core.MovingBitmap;
import tw.edu.ntut.csie.game.extend.Animation;

public class Character implements GameObject {
    private Animation _basic;
    private int px, py;

    public Character(){
        px=387;
        py=63;
    }
    public void initialize(){

        _basic = new Animation();
        _basic.setLocation(px, py);
        _basic.addFrame(R.drawable.basic1);
        _basic.addFrame(R.drawable.basic2);
        _basic.addFrame(R.drawable.basic3);
        _basic.addFrame(R.drawable.basic4);
        _basic.addFrame(R.drawable.basic3);
        _basic.addFrame(R.drawable.basic2);
        _basic.addFrame(R.drawable.basic1);
        _basic.addFrame(R.drawable.basic5);
        _basic.addFrame(R.drawable.basic6);
        _basic.addFrame(R.drawable.basic7);
        _basic.addFrame(R.drawable.basic6);
        _basic.addFrame(R.drawable.basic5);
        _basic.setDelay(1);
    }

    @Override
    public void release(){
        _basic.release();
        _basic=null;
    }

    @Override
    public void move() {
        _basic.move();
    }

    @Override
    public void show(){

        _basic.show();
    }
}
