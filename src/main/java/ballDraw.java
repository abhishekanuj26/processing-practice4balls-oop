public class ballDraw{
    public static final int Diameter = 10;
    private final int speed;
    private final int height;
    int x=0;
    public ballDraw(int speed, int height) {
        this.speed = speed;
        this.height = height;
    }


    public void draw() {
        processing4Balls.processing.ellipse(x,height, Diameter,Diameter);

    }
    public void x_coord_speed() {
        x+=speed;
    }


}
