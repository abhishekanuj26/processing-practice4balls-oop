import processing.core.PApplet;
public class processing4Balls extends PApplet {
    public static  PApplet processing;
    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;

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
    }

    balls ball1 = new balls(1, HEIGHT/5);
    balls ball2 = new balls(2, HEIGHT/5*2);
    balls ball3 = new balls(3, HEIGHT/5*3);
    balls ball4 = new balls(4, HEIGHT/5*4);

    @Override
    public void draw() {
        ball1.draw();

        ball2.draw();

        ball3.draw();

        ball4.draw();
    }
}
