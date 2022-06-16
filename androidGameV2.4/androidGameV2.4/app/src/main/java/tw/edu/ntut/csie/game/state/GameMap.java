package tw.edu.ntut.csie.game.state;

import tw.edu.ntut.csie.game.GameObject;
import tw.edu.ntut.csie.game.R;
import tw.edu.ntut.csie.game.core.MovingBitmap;

public class GameMap implements GameObject {
    private MovingBitmap blue;
    private MovingBitmap green;
    private int[][] map = {{1,2,1,2,1,2,1,2,1},{2,1,2,1,2,1,2,1,2},{1,2,1,2,1,2,1,2,1},{2,1,2,1,2,1,2,1,2},{1,2,1,2,1,2,1,2,1},{2,1,2,1,2,1,2,1,2}};
    private final int X = 179;
    private final int Y = 85;
    private final int MW = 34;
    private final int MH = 34;

    public GameMap(){
        blue = new MovingBitmap(R.drawable.blue);
        blue.resize(34,34);
        green = new MovingBitmap(R.drawable.green);
        green.resize(34,34);
    }

    @Override
    public void release(){
        blue.release();
        green.release();
        blue=null;
        green=null;
    }

    @Override
    public void move(){

    }

    @Override
    public void show(){
        for(int i=0; i<1; i++){
            for (int j=0; j<1; j++){
                switch (map[i][j]){
                    case 0:
                        break;
                    case 1:
                        blue.setLocation(X+(MW*j), Y+(MH*i));
                        blue.show();
                        break;
                    case 2:
                        green.setLocation(X+(MW*j), Y+(MH*i));
                        green.show();
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
