import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class processing4Balls extends PApplet {
    public static  PApplet processing;
    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    int no_of_balls = 4;
    List<ballDraw> balls=new ArrayList<>(no_of_balls+1);
    public static void main(String[] args) {
        PApplet.main("processing4Balls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }


    public void setup() {
        processing=this;
        int speed=0;
        for(int i=1;i<=no_of_balls;i++){
            balls.add(new ballDraw(speed+i,HEIGHT/5*i));
        }
    }



    @Override
    public void draw() {
        for(int i=0;i<no_of_balls;i++){
            balls.get(i).draw();
            balls.get(i).x_coord_speed();
        }
    }
}
