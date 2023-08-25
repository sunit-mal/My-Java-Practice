public class DistanceP1AndP2 {
    private int x;
    private int y;

    public DistanceP1AndP2(int startx, int starty) {
        x = startx;
        y = starty;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(DistanceP1AndP2 otherPt) {
        int dx = x - otherPt.getX();
        int dy = y - otherPt.getY();
        return Math.sqrt(dx * dx + dy * dy); 
    }

    public static void main(String[] args) {
        DistanceP1AndP2 pl = new DistanceP1AndP2(3, 4);
        DistanceP1AndP2 p2 = new DistanceP1AndP2(6, 8);
        System.out.println(pl.distance(p2));
    }
}