package tw.edu.ntut.csie.game.state;

import tw.edu.ntut.csie.game.GameObject;
import tw.edu.ntut.csie.game.R;
import tw.edu.ntut.csie.game.core.MovingBitmap;
import tw.edu.ntut.csie.game.extend.Animation;

public class Open implements GameObject {
    private Animation _open;

    public void initialize(){

        _open = new Animation();
        _open.setLocation(0,0);
        _open.addFrame(R.drawable.t1);
        _open.addFrame(R.drawable.t2);
        _open.addFrame(R.drawable.t3);
        _open.addFrame(R.drawable.t4);
        _open.addFrame(R.drawable.t5);
        _open.addFrame(R.drawable.t6);
        _open.addFrame(R.drawable.t7);
        _open.addFrame(R.drawable.t8);
        _open.addFrame(R.drawable.t9);
        _open.addFrame(R.drawable.t10);
        _open.addFrame(R.drawable.t11);
        _open.addFrame(R.drawable.t12);
        _open.addFrame(R.drawable.t13);
        _open.addFrame(R.drawable.t14);
        _open.addFrame(R.drawable.t15);
        _open.addFrame(R.drawable.t16);
        _open.addFrame(R.drawable.t17);
        _open.addFrame(R.drawable.t18);
        _open.addFrame(R.drawable.t19);
        _open.addFrame(R.drawable.t20);
        _open.addFrame(R.drawable.t21);
        _open.addFrame(R.drawable.t22);
        _open.addFrame(R.drawable.t23);
        _open.addFrame(R.drawable.t24);
        _open.addFrame(R.drawable.t25);
        _open.addFrame(R.drawable.t26);
        _open.addFrame(R.drawable.t27);
        _open.addFrame(R.drawable.t28);
        _open.addFrame(R.drawable.t29);
        _open.setRepeating(false);
        _open.setDelay(1);
    }

    @Override
    public void release(){
        _open.release();
        _open=null;
    }


    @Override
    public void move() {
        _open.move();
    }

    @Override
    public void show(){
        _open.show();
    }
}
