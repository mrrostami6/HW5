package TizPa;

public class Ratio {
    public static final int[][] TRIPPRICE = new int[5][5];
    /* zarib safar az nahiye 0 ta 4 be nahiye ta 4 */
    static {
        int[] prices = {1, 2, 2, 4, 3, 2, 1, 4, 2, 3, 3, 5, 1, 3, 2, 4, 3, 3, 1, 2, 3, 3, 2, 2, 1};
        int counter = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                TRIPPRICE[i][j] = prices[counter++];
        }
    }

    /**
     * Rows : index [0][] = egtesadi , index[1][] = vizhe , index[2][] = motor
     * Columns : index[][0] = hazineye paye , index[][1] = zarib barandegi va trafik
     * Columns : index[][2] = zarib trafik , index[][3] = zarib barandegi
     */
    public static final double[][] TRIPMETHOD = new double[3][4];
    static {
        TRIPMETHOD[0][0] = 5000;
        TRIPMETHOD[0][1] = 1.4;
        TRIPMETHOD[0][2] = 1.2;
        TRIPMETHOD[0][3] = 1.2;
        TRIPMETHOD[1][0] = 10000;
        TRIPMETHOD[1][1] = 3;
        TRIPMETHOD[1][2] = 2;
        TRIPMETHOD[1][3] = 2;
        TRIPMETHOD[2][0] = 4000;
        TRIPMETHOD[2][1] = 1.5;
        TRIPMETHOD[2][2] = 2;
        TRIPMETHOD[2][3] = 0.8;
    }
}
