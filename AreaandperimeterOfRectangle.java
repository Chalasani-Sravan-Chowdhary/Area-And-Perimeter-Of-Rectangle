public class AreaandperimeterOfRectangle {
    public static void main(String[] args){
        int lengthInt= 30;
        int breadthInt=20;
        int areaInt=lengthInt*breadthInt;
        int perimeterInt=2*(lengthInt + breadthInt);
        System.out.println("Area of Rectangle using INT:"+areaInt);
        System.out.println("Perimeter of Rectangle using INT:"+perimeterInt);

        
        float lengthfloat=30.5f;
        float breadthfloat=20.5f;
        float areafloat=lengthfloat*breadthfloat;
        float perimeterfloat=2*(lengthfloat + breadthfloat);
        System.out.println("The area of Rectangle using Float :"+areafloat);
        System.out.println("perimeter of Rectangle using Float :"+perimeterfloat);

    }
}
