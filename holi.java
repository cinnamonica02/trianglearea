// Calculation of a triangles area



// RectangleArea ( class for logic )


    // methods
}


// - RectangleArea (Object  call following methods)


// a) getData()
// b) computeField()
// c) fieldDisplay()


class RectangleArea {
    private double length;
    private double width;
    private double area;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  length of the rectangle:");
        length = scanner.nextDouble();
        System.out.println("Enter  width of the rectangle:");
        width = scanner.nextDouble();
    }

    public void computeField() {
        area = length * width;
    }

    public void fieldDisplay() {
        System.out.println("The length of the rectangle is " + length);
        System.out.println("The width of the rectangle is " + width);
        System.out.println("The area of the rectangle is " + area);
    }
}

