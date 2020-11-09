package shapes

class MaxAreaInfo implements ShapeInfo {
  void displayInfo(Shape2 s1, Shape2 s2) {
    print "The shape with the biggest area is: "
    println s1.area() > s2.area() ? s1.class.simpleName : s2.class.simpleName
  }
}
