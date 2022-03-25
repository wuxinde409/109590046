package tw.edu.ntut.csie.game.state;

import tw.edu.ntut.csie.game.GameObject;
import tw.edu.ntut.csie.game.R;
import tw.edu.ntut.csie.game.core.MovingBitmap;
import tw.edu.ntut.csie.game.extend.Animation;

public class Stone implements GameObject {
    private MovingBitmap _stone1;
    private MovingBitmap _stone2;
    private MovingBitmap _stone3;
    private MovingBitmap _stone4;
    private int px, py;
    private int px1, py1;
    private int px2, py2;
    private int px3, py3;
    public Stone(){
        px=247;
        py=217;

        px1=247;
        py1=251;

        px2=352;
        py2=217;

        px3=318;
        py3=251;
    }
    public void initialize(){
        _stone1= new MovingBitmap(R.drawable.stone1);
        _stone1.setLocation(px,py);

        _stone2= new MovingBitmap(R.drawable.stone2);
        _stone2.setLocation(px1,py1);

        _stone3= new MovingBitmap(R.drawable.stone3);
        _stone3.setLocation(px2,py2);

        _stone4= new MovingBitmap(R.drawable.stone4);
        _stone4.setLocation(px3,py3);
    }

    @Override
    public void release(){
        _stone1.release();
        _stone1=null;

        _stone2.release();
        _stone2=null;

        _stone3.release();
        _stone3=null;

        _stone4.release();
        _stone4=null;
    }

    @Override
    public void move() {
    }

    @Override
    public void show(){
        _stone1.show();
        _stone2.show();
        _stone3.show();
        _stone4.show();
    }
}