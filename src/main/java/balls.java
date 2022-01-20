public class balls{
    public static final int Diameter = 10;
    private final int speed;
    private final int height;
    int x=0;
    public balls(int speed, int height) {
        this.speed = speed;
        this.height = height;
    }


    public void draw() {
        processing4Balls.processing.ellipse(x,height, Diameter,Diameter);
        x+=speed;
    }


}
