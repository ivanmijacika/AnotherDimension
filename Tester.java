public class Tester{
    public static void main(String[] args){
	int[] a = new int[]{1,2,3};
	int[] empty = new int[]{};
	int[][] b = new int[][]{{9,5,7},{3,8,4}};
	int[][] empty2 = new int[][]{{},{}};
        System.out.println(ArrayOps.sum(a));
	System.out.println(ArrayOps.sum(empty));
	System.out.println(ArrayOps.largest(a));
	System.out.println(ArrayOps.sumRows(b));
    }
}
