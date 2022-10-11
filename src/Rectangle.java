public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {}
    public Rectangle(float length,float width)
    {
        this.length = length;
        this.width = width;
    }
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public double getArea(){
        return length * width ;
    }

}
