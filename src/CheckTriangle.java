public class CheckTriangle {

    public boolean isRightTriangle(Triangle triangle){
        double max = triangle.getA();
        double min1 = triangle.getB();
        double min2 = triangle.getC();

        if (triangle.getB()>max){
            min1 = max;
            max = triangle.getB();
        }
        if (triangle.getC()>max){
            min2=max;
            max=triangle.getC();
        }

        if (min1*min1+min2*min2==max*max){
            return true;
        } else {
            return false;
        }
    }
}
