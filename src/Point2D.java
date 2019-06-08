

public class Point2D {
    private float x =0.0f;
    private float y =0.0f;

    public Point2D(){
    }

    public Point2D(float x,float y){
        this.x =x;
        this.y =y;
    }

    public float getX(){
        return this.x;
    }

    public float getY(){
        return this.y;
    }

    public void setX(float x){
        this.x =x;
    }

    public void setY(float y){
        this.y = y;
    }

    public void  setXY(float x,float y){
        setX(x);
        setY(y);
    }

    public String getXY(){
        return "Array of {"+ this.x +","+this.y+")";
    }
    @Override

    public String toString(){
        return "("
                +this.x
                +","
                +this.y
                +")"
                +" "
                +"and"
                +"\n"
                +getXY();
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(1,2);
        System.out.println(point2D);
        point2D.setXY(8,5);
        System.out.println(point2D);
    }
}
