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
import tw.edu.ntut.csie.game.extend.BitmapButton;
import tw.edu.ntut.csie.game.extend.ButtonEventHandler;
import tw.edu.ntut.csie.game.extend.Integer;
public class StateRun extends AbstractGameState {
    public Open _open;
    public static final int DEFAULT_SCORE_DIGITS = 4;
    private Character _basic;
    private Enemy _enemy;
    private Evil _evil;
    private Stone _stone;
    private Torch _torch;
    private Frame _frame;

    private GameMap gameMap = new GameMap();

    private BitmapButton _up;
    private BitmapButton _down;
    private BitmapButton _left;
    private BitmapButton _right;
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
//    private boolean _grab;

    private int px=387, py=63;

//    private Audio _music;

    public StateRun(GameEngine engine) {
        super(engine);
    }

    @Override
    public void initialize(Map<String, Object> data) {
        initializeUp();
        initializeDown();
        initializeRight();
        initializeLeft();

        _open= new Open();
        _open.initialize();

        _basic= new Character();
        _basic.initialize();

        _enemy= new Enemy();
        _enemy.initialize();

        _evil= new Evil();
        _evil.initialize();

        _stone= new Stone();
        _stone.initialize();

        _torch= new Torch();
        _torch.initialize();

        _frame= new Frame();
        _frame.initialize();

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

//        _music = new Audio(R.raw.ntut);
//        _music.setRepeating(true);
//        _music.play();

//        _grab = false;

    }

    public void initializeUp(){
        _up = new BitmapButton(R.drawable.up,58,250);
        addGameObject(_up);
        _up.addButtonEventHandler(button -> _basic._basic.setLocation(px, py=py-35));
        addPointerEventHandler(_up);
    }
    public void initializeDown(){
        _down = new BitmapButton(R.drawable.down,58,290);
        addGameObject(_down);
        _down.addButtonEventHandler(button -> _basic._basic.setLocation(px, py=py+35));
        addPointerEventHandler(_down);
    }
    public void initializeRight(){
        _right = new BitmapButton(R.drawable.right,93,290);
        addGameObject(_right);
        _right.addButtonEventHandler(button -> _basic._basic.setLocation(px=px+35, py));
        addPointerEventHandler(_right);
    }
    public void initializeLeft(){
        _left = new BitmapButton(R.drawable.left,23,290);
        addGameObject(_left);
        _left.addButtonEventHandler(button -> _basic._basic.setLocation(px=px-35, py));
        addPointerEventHandler(_left);
    }

    @Override
    public void move() {
        _basic.move();
        _enemy.move();
        _evil.move();
        _frame.move();
        _open.move();
//      _flower.move();
//      Log.d("d","dd");
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
        _basic._basic.show();
        _enemy.show();
        _evil.show();
        _stone.show();
        _torch.show();
        _frame.show();
        _up.show();
        _down.show();
        _right.show();
        _left.show();

        gameMap.show();
        _open.show();
    }

    @Override
    public void release() {
        _open.release();
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
        _stone.release();
        _torch.release();
        _frame.release();
        _up.release();
        _down.release();
        _right.release();
        _left.release();
        gameMap.release();
        _lefttop=null;
        _righttop=null;
        _leftdown=null;
        _rightdown=null;
        _basic=null;
        _enemy=null;
        _evil=null;
        _stone=null;
        _torch=null;
        _frame=null;
        mPractice=null;
        _background1 = null;
        _up=null;
        _down=null;
        _left=null;
        _right=null;
        _open = null;

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

//    @Override
//    public boolean pointerPressed(Pointer actionPointer, List<Pointer> pointers) {
////        _message.setVisible(false);
//        return true;
//    }
//
//    @Override
//    public boolean pointerMoved(Pointer actionPointer, List<Pointer> pointers) {
//        return false;
//    }
//
//    public void resizeAndroidIcon() {
//
//    }
//
//    @Override
//    public boolean pointerReleased(Pointer actionPointer, List<Pointer> pointers) {
////        _grab = false;
//        return false;
//    }

    @Override
    public void pause() {
        //_music.pause();
    }

    @Override
    public void resume() {
        //_music.resume();
    }
}
