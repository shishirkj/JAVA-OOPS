package javacourse;




class box
{
    double width,height,depth,length,breadth;
    box() {
        System.out.println("Default constructor");
    }
    box(double w,double h,double d){
        width = w; height = h; depth = d;
    }

    box(double len) {
        width = height = depth = len;
    }
    void rect(double x,double y) {
        length = x; breadth = y;
    }
    void rect(double x) {
        length = breadth = x;
    }
    double volume() {
        return(width * height * depth);
    }
    double area() {
        return(length * breadth);
    }
}

class AreaRctBox{
    public static void main(String args[]) {
        box mybox1 = new box(10,20,15);
        box mybox2 = new box(5);
        box rect1 = new box();
        box rect2 = new box();
        rect1.rect(10,20);
        rect2.rect(8);
        double areaR, vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 = "+vol);
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 = "+vol);
        areaR = rect1.area();
        System.out.println("Area of rect1= "+areaR);
        areaR = rect2.area();
        System.out.println("Area of rect2 ="+areaR);
    }

}




