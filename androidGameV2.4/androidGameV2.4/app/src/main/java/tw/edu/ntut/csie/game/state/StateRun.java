package tw.edu.ntut.csie.game.state;

import android.util.Log;

import java.util.List;
import java.util.Map;

import tw.edu.ntut.csie.game.Game;
import tw.edu.ntut.csie.game.Pointer;
import tw.edu.ntut.csie.game.R;
import tw.edu.ntut.csie.game.core.Audio;
import tw.edu.ntut.csie.game.core.MovingBitmap;
import tw.edu.ntut.csie.game.engine.GameEngine;
import tw.edu.ntut.csie.game.extend.Animation;
import tw.edu.ntut.csie.game.extend.Integer;
public class StateRun extends GameState {
    public static final int DEFAULT_SCORE_DIGITS = 4;
    private Character _basic;
    private Enemy _enemy;
    private Evil _evil;
    private MovingBitmap mPractice;
    private MovingBitmap _background1;
    private MovingBitmap _lefttop;
    private MovingBitmap _leftdown;
    private MovingBitmap _righttop;
    private MovingBitmap _rightdown;

//    private MovingBitmap _cloud;

//    private MovingBitmap _message;

//    private Animation _flower;

//    private Integer _scores;

    private boolean _grab;
    private int _cx, _cy;

//    private Audio _music;

    public StateRun(GameEngine engine) {
        super(engine);
    }

    @Override
    public void initialize(Map<String, Object> data) {
        _basic= new Character();
        _basic.initialize();

        _enemy= new Enemy();
        _enemy.initialize();

        _evil= new Evil();
        _evil.initialize();

        mPractice= new MovingBitmap(R.drawable.ntut_csie);
        mPractice.setLocation(250,50);

        _background1 = new MovingBitmap(R.drawable.background1);
        _lefttop = new MovingBitmap(R.drawable.lefttop);
        _lefttop.setLocation(0,0);
        _righttop = new MovingBitmap(R.drawable.righttop);
        _righttop.setLocation(513,0);
        _leftdown = new MovingBitmap(R.drawable.leftdown);
        _leftdown.setLocation(0,137);
        _rightdown = new MovingBitmap(R.drawable.rightdown);
        _rightdown.setLocation(463,137);

//        _scores = new Integer(DEFAULT_SCORE_DIGITS, 50, 550, 10);

//        _flower = new Animation();
//        _flower.setLocation(560, 310);
//        _flower.addFrame(R.drawable.flower1);
//        _flower.addFrame(R.drawable.flower2);
//        _flower.addFrame(R.drawable.flower3);
//        _flower.addFrame(R.drawable.flower4);
//        _flower.addFrame(R.drawable.flower5);
//        _flower.setDelay(2);

//        _music = new Audio(R.raw.ntut);
//        _music.setRepeating(true);
//        _music.play();

        _grab = false;

    }

    @Override
    public void move() {
        _basic.move();
        _enemy.move();
        _evil.move();
//        _flower.move();
    }

    @Override
    public void show() {
        mPractice.show();
        _background1.show();
        _lefttop.show();
        _righttop.show();
        _leftdown.show();
        _rightdown.show();
//        _scores.show();
//        _flower.show();
        _basic.show();
        _enemy.show();
        _evil.show();
    }

    @Override
    public void release() {
        _background1.release();
        _lefttop.release();
        _righttop.release();
        _leftdown.release();
        _rightdown.release();
//        _scores.release();
//        _flower.release();
//        _music.release();
        mPractice.release();
        _basic.release();
        _enemy.release();
        _evil.release();
        _lefttop=null;
        _righttop=null;
        _leftdown=null;
        _rightdown=null;
        _basic=null;
        _enemy=null;
        _evil=null;
        mPractice=null;
        _background1 = null;

//        _scores = null;
//        _flower = null;
//        _music = null;
    }

    @Override
    public void keyPressed(int keyCode) {
        // TODO Auto-generated method stub
    }

    @Override
    public void keyReleased(int keyCode) {
        // TODO Auto-generated method stub
    }

    @Override
    public void orientationChanged(float pitch, float azimuth, float roll) {
//        if (roll > 15 && roll < 60 && _cx > 50)
//            _cx -= 2;
//        if (roll < -15 && roll > -60 && _cx + _cloud.getWidth() < 500)
//            _cx += 2;
    }

    @Override
    public void accelerationChanged(float dX, float dY, float dZ) {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean pointerPressed(Pointer actionPointer, List<Pointer> pointers) {
//        _message.setVisible(false);
        return true;
    }

    @Override
    public boolean pointerMoved(Pointer actionPointer, List<Pointer> pointers) {
        return false;
    }

    public void resizeAndroidIcon() {

    }

    @Override
    public boolean pointerReleased(Pointer actionPointer, List<Pointer> pointers) {
        _grab = false;
        return false;
    }

    @Override
    public void pause() {
        //_music.pause();
    }

    @Override
    public void resume() {
        //_music.resume();
    }
}
