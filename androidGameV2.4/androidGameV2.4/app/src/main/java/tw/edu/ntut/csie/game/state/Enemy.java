package tw.edu.ntut.csie.game.state;

import tw.edu.ntut.csie.game.GameObject;
import tw.edu.ntut.csie.game.R;
import tw.edu.ntut.csie.game.extend.Animation;

public class Enemy implements GameObject {
    public Animation _enemy1;
    public Animation _enemy2;
    public Animation _enemy3;
    private int px, py;
    private int px1, py1;
    private int px2, py2;
    public Enemy(){
        px=318;
        py=98;

        px1=351;
        py1=133;

        px2=283;
        py2=133;
    }
    public void initialize(){
        _enemy1 = new Animation();
        _enemy1.setLocation(px, py);
        _enemy1.addFrame(R.drawable.enemy1);
        _enemy1.addFrame(R.drawable.enemy2);
        _enemy1.addFrame(R.drawable.enemy3_1);
        _enemy1.addFrame(R.drawable.enemy4);
        _enemy1.addFrame(R.drawable.enemy3_1);
        _enemy1.addFrame(R.drawable.enemy2);
        _enemy1.addFrame(R.drawable.enemy1);
        _enemy1.addFrame(R.drawable.enemy5);
        _enemy1.addFrame(R.drawable.enemy6);
        _enemy1.addFrame(R.drawable.enemy7);
        _enemy1.addFrame(R.drawable.enemy6);
        _enemy1.addFrame(R.drawable.enemy5);
        _enemy1.setDelay(1);

        _enemy2 = new Animation();
        _enemy2.setLocation(px1, py1);
        _enemy2.addFrame(R.drawable.enemy1);
        _enemy2.addFrame(R.drawable.enemy2);
        _enemy2.addFrame(R.drawable.enemy3_1);
        _enemy2.addFrame(R.drawable.enemy4);
        _enemy2.addFrame(R.drawable.enemy3_1);
        _enemy2.addFrame(R.drawable.enemy2);
        _enemy2.addFrame(R.drawable.enemy1);
        _enemy2.addFrame(R.drawable.enemy5);
        _enemy2.addFrame(R.drawable.enemy6);
        _enemy2.addFrame(R.drawable.enemy7);
        _enemy2.addFrame(R.drawable.enemy6);
        _enemy2.addFrame(R.drawable.enemy5);
        _enemy2.setDelay(1);

        _enemy3 = new Animation();
        _enemy3.setLocation(px2, py2);
        _enemy3.addFrame(R.drawable.enemy1);
        _enemy3.addFrame(R.drawable.enemy2);
        _enemy3.addFrame(R.drawable.enemy3_1);
        _enemy3.addFrame(R.drawable.enemy4);
        _enemy3.addFrame(R.drawable.enemy3_1);
        _enemy3.addFrame(R.drawable.enemy2);
        _enemy3.addFrame(R.drawable.enemy1);
        _enemy3.addFrame(R.drawable.enemy5);
        _enemy3.addFrame(R.drawable.enemy6);
        _enemy3.addFrame(R.drawable.enemy7);
        _enemy3.addFrame(R.drawable.enemy6);
        _enemy3.addFrame(R.drawable.enemy5);
        _enemy3.setDelay(1);
    }

    @Override
    public void release(){
        _enemy1.release();
        _enemy1=null;

        _enemy2.release();
        _enemy2=null;

        _enemy3.release();
        _enemy3=null;
    }

    @Override
    public void move() {
        _enemy1.move();

        _enemy2.move();

        _enemy3.move();
    }

    @Override
    public void show(){
        _enemy1.show();

        _enemy2.show();

        _enemy3.show();
    }
}