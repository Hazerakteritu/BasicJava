package Practice1;

public class Box {
    double width;
    double height;
    double depth;

    //constructor clone of an object
    Box(Box ob) { //pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w,double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    double volume(){
        return width*height*depth;
    }
}
