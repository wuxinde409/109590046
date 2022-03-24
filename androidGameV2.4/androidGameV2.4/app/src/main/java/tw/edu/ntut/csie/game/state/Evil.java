package tw.edu.ntut.csie.game.state;

import tw.edu.ntut.csie.game.GameObject;
import tw.edu.ntut.csie.game.R;
import tw.edu.ntut.csie.game.extend.Animation;

public class Evil implements GameObject {
    private Animation _Evil;
    private int px, py;

    public Evil(){
        px=422;
        py=249;
    }
    public void initialize(){

        _Evil = new Animation();
        _Evil.setLocation(px, py);
        _Evil.addFrame(R.drawable.evil1);
        _Evil.addFrame(R.drawable.evil2);
        _Evil.addFrame(R.drawable.evil3);
        _Evil.addFrame(R.drawable.evil4);
        _Evil.addFrame(R.drawable.evil3);
        _Evil.addFrame(R.drawable.evil2);
        _Evil.addFrame(R.drawable.evil1);
        _Evil.addFrame(R.drawable.evil5);
        _Evil.addFrame(R.drawable.evil6);
        _Evil.addFrame(R.drawable.evil71);
        _Evil.addFrame(R.drawable.evil6);
        _Evil.addFrame(R.drawable.evil5);
        _Evil.setDelay(1);
    }

    @Override
    public void release(){
        _Evil.release();
        _Evil=null;
    }

    @Override
    public void move() {
        _Evil.move();
    }

    @Override
    public void show(){

        _Evil.show();
    }
}