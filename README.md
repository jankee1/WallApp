# WallApp

* Required methods implementation are provided [here](https://github.com/jankee1/WallApp/blob/master/src/main/java/com/wallapp/WallApp/model/wall/Wall.java). See also [this folder](https://github.com/jankee1/WallApp/tree/master/src/main/java/com/wallapp/WallApp/model/block) to find out more about Block and CompositeBlock interfaces implementation.
* Based on the task requirements I utilized Spring Boot in order to create simple API. Controller-Service-Repository design pattern was utilized and 3 endpoints with mocked data retrival were implemented:
  * /wall/total - consumes count() method from task requirement
  * /wall/color/{colorName} - consumes findBlockByColor() method from task requirement
  * /wall//material/{materialName} - consumes findBlocksByMaterial() method from task requirement
* Tests were added for Wall class methods
* Application can be run in Docker. Clon the repository and in the application directory run:
  * mvn clean package
  * docker build -t wallapp . 
  * docker run -p 8080:8080 wallapp   
