package tw.edu.ntut.csie.game.state;

import tw.edu.ntut.csie.game.GameObject;
import tw.edu.ntut.csie.game.R;
import tw.edu.ntut.csie.game.core.MovingBitmap;

public class Torch implements GameObject {
    private MovingBitmap _torch1;
    private MovingBitmap _torch2;
    private MovingBitmap _torch3;
    private MovingBitmap _torch4;
    private int px, py;
    private int px1, py1;
    private int px2, py2;
    private int px3, py3;
    public Torch(){
        px=320;
        py=57;

        px1=181;
        py1=198;

        px2=218;
        py2=94;

        px3=428;
        py3=181;
    }
    public void initialize(){
        _torch1= new MovingBitmap(R.drawable.torch111);
        _torch1.setLocation(px,py);

        _torch2= new MovingBitmap(R.drawable.torch2);
        _torch2.setLocation(px1,py1);

        _torch3= new MovingBitmap(R.drawable.torch3);
        _torch3.setLocation(px2,py2);

        _torch4= new MovingBitmap(R.drawable.torch4);
        _torch4.setLocation(px3,py3);
    }

    @Override
    public void release(){
        _torch1.release();
        _torch1=null;

        _torch2.release();
        _torch2=null;

        _torch3.release();
        _torch3=null;

        _torch4.release();
        _torch4=null;
    }

    @Override
    public void move() {
    }

    @Override
    public void show(){
        _torch1.show();
        _torch2.show();
        _torch3.show();
        _torch4.show();
    }
}