public class ArrayOps{

    public static int sum(int[] arr){
	if (arr.length==0) return 0;
	int sum=0;
	for (int i=0; i<arr.length; i++){
	    sum+=arr[i];
	}
	return sum;
    }

    public static int largest(int[] arr){
	int largest=0;
	for (int i=0; i<arr.length; i++){
	    if (arr[i]>largest) largest=arr[i];
	}
	return largest;
    }

    public static int[] sumRows(int[][] matrix){
	int[] sumrows = new int[matrix.length];
	for (int i=0; i<matrix.length; i++){
	    sumrows[i]=sum(matrix[i]);
	}
	return sumrows;
    }

}
