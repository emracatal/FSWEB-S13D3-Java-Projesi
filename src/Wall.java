

public class Wall {
    double width;
    double height;

    public Wall(double width, double height) {
        this.width = width;//sınıf değişkenine gelen width atar
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    //setter metodlarıı void
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return this.width * this.height;
        //return getHeight()*getWidth(); böyle de olurdu.
    }
}
