package misc;

import java.util.TreeMap;

public class Settings {

    public static int width = 9, height = 4;
    public static int iconWidth = 82, iconHeight = 96;
    public static int shadeX = 7, shadeY = 80;
    static Integer[][] coordY = {{81, 81}, {298, 298}};
    static Integer[][] coordX = {{283, 921}, {230, 976}};

    public static IntPair getCoordinate(int i, int j) {
        int y = i * (coordY[1][0] - coordY[0][0]) / (height - 1) + coordY[0][0];
        int xl = i * (coordX[1][0] - coordX[0][0]) / (height - 1) + coordX[0][0];
        int xr = i * (coordX[1][1] - coordX[0][1]) / (height - 1) + coordX[0][1];
        int x = j * (xr - xl) / (width - 1) + xl;
        return new IntPair(x, y);
    }
}
