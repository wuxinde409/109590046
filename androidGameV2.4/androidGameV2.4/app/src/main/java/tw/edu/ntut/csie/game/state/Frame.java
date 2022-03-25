package tw.edu.ntut.csie.game.state;

import tw.edu.ntut.csie.game.GameObject;
import tw.edu.ntut.csie.game.R;
import tw.edu.ntut.csie.game.extend.Animation;

public class Frame implements GameObject {
    private Animation _frame1;
    private Animation _frame2;
    private int px, py;
    private int px1, py1;
    public Frame(){
        px=222;
        py=88;

        px1=432;
        py1=175;

    }
    public void initialize(){
        _frame1 = new Animation();
        _frame1.setLocation(px, py);
        _frame1.addFrame(R.drawable.frame1);
        _frame1.addFrame(R.drawable.frame2);
        _frame1.addFrame(R.drawable.frame3);
        _frame1.addFrame(R.drawable.frame4);
        _frame1.addFrame(R.drawable.frame5);
        _frame1.addFrame(R.drawable.frame6);
        _frame1.addFrame(R.drawable.frame7);
        _frame1.addFrame(R.drawable.frame8);
        _frame1.addFrame(R.drawable.frame9);
        _frame1.addFrame(R.drawable.frame10);
        _frame1.addFrame(R.drawable.frame11);
        _frame1.addFrame(R.drawable.frame12);
        _frame1.setDelay(1);

        _frame2 = new Animation();
        _frame2.setLocation(px1, py1);
        _frame2.addFrame(R.drawable.frame1);
        _frame2.addFrame(R.drawable.frame2);
        _frame2.addFrame(R.drawable.frame3);
        _frame2.addFrame(R.drawable.frame4);
        _frame2.addFrame(R.drawable.frame5);
        _frame2.addFrame(R.drawable.frame6);
        _frame2.addFrame(R.drawable.frame7);
        _frame2.addFrame(R.drawable.frame8);
        _frame2.addFrame(R.drawable.frame9);
        _frame2.addFrame(R.drawable.frame10);
        _frame2.addFrame(R.drawable.frame11);
        _frame2.addFrame(R.drawable.frame12);
        _frame2.setDelay(1);

    }

    @Override
    public void release(){
        _frame1.release();
        _frame1=null;

        _frame2.release();
        _frame2=null;

    }

    @Override
    public void move() {
        _frame1.move();
        _frame2.move();
    }

    @Override
    public void show(){
        _frame1.show();
        _frame2.show();
    }
}