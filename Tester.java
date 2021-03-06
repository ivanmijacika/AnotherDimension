import java.util.Arrays;
public class Tester{
    public static void main(String[] args){
	int[] a = new int[]{1,2,3};
	int[] empty = new int[]{};
	int[][] b = new int[][]{{9,-5,7},{3,8,4}};
	int[][] empty2 = new int[][]{{},{}};
	int[][] empty3 = new int[][]{};
	int[][] b2 = new int[][]{{1},{0},{-1},{2}};
        System.out.println(ArrayOps.sum(a));
	System.out.println(ArrayOps.sum(empty));
	System.out.println(ArrayOps.largest(a));
	System.out.println(Arrays.toString(ArrayOps.sumRows(b)));
	System.out.println(Arrays.toString(ArrayOps.sumRows(empty2)));
	System.out.println(Arrays.toString(ArrayOps.largestInRows(b)));
	System.out.println(ArrayOps.sum(b));
	System.out.println(Arrays.toString(ArrayOps.sumCols(b)));
	System.out.println(Arrays.toString(ArrayOps.sumCols(empty2)));
	System.out.println(ArrayOps.isRowMagic(b));
	System.out.println(ArrayOps.isRowMagic(empty2));
	System.out.println(ArrayOps.isRowMagic(empty3));
	System.out.println(ArrayOps.isColMagic(b));
	System.out.println(ArrayOps.isColMagic(empty2));
	System.out.println(ArrayOps.isColMagic(empty3));
        System.out.println(ArrayOps.isLocationMagic(b,0,2));
	System.out.println(ArrayOps.isLocationMagic(b,1,2));
	System.out.println(ArrayOps.isColMagic(b2));
        }
}
