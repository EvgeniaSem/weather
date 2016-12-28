public class SmartRobot extends Robot{
    public Robot(int x, int y, Direction dir){
        super(x, y, dir);
    }
    public String toString(){
        return "robot. x = " + x + ", y = " + y + ", dir = " + dir;
    }
    public void moveRobot(int toX, int toY){

        if (x < toX) {
            while (dir != Direction.RIGHT)
                if (dir == Direction.DOWN)
                    turnLeft();
                else
                    turnRight();
            while (x < toX) {
                stepForward();
            }
        }

        else {
            while (dir != Direction.LEFT)
                if (dir == Direction.DOWN)
                    turnRight();
                else
                    turnLeft();
            while (x < toX) {
                stepForward();
            }
        }

            if (y < toY) {
                while (dir != Direction.UP)
                    if (dir == Direction.RIGHT)
                        turnLeft();
                    else
                        turnRight();
                while (y < toY) {
                    stepForward();
                }
            }

            else {
                while (dir != Direction.DOWN)
                    if (dir == Direction.RIGHT)
                        turnRight();
                    else
                        turnLeft();
                while (y < toY) {
                    stepForward();
                }
            }
    }
}