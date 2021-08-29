object CaseClass extends App{
  val p1=Point(1,4)
  val p2=Point(5,7)

  println("\n****Display p1 and p2 pointers****")
  println("p1 : " + p1)
  println("p2 : " + p2)

  println("\n****Add two given pointers****")
  val p3=p1+p2
  println("p1+p2: " + p3)

  println("\n****Move a point by a given distance dx and dy****")
  val p4=p1.move(3,1)
  val p5=p2.move(2,6)
  println("Move p1 by a given distance dx=3 and dy=1 : " + p4)
  println("Move p1 by a given distance dx=2 and dy=6 : " + p5)

  println("\n****Get distance between given two pointers****")
  val p6=p1.distance(p2)
  println("Distance between p1 and p2 : " + p6)

  println("\n****Get invert of given pointer(switch the x and y coordinates)****")
  val p7=p1.invert()
  println("p1\' : " + p7)

  val p8=p2.invert()
  println("p2\' : " + p8)

  case class  Point(a:Int,b:Int){
    def x:Int=a
    def y:Int=b

     def +(that:Point) = Point(this.x + that.x, this.y + that.y) //Q1)add(+) should add two given points
     def move(dx:Int=0,dy:Int=0)=Point(this.x+dx,this.y+dy) //Q2)move should move a point by a given distance dx and dy
     def distance(dis:Point)=math.sqrt(math.pow((this.x - dis.x),2) + math.pow((this.y - dis.y),2)) //Q3)distance should return the distance between two given points
     def invert()=Point(this.y,this.x) //Q4)invert should switch the x and y coordinates.

   }
}
