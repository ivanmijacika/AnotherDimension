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
	//maybe account for empty?
	int[] sumrows = new int[matrix.length];
	for (int i=0; i<matrix.length; i++){
	    sumrows[i]=sum(matrix[i]);
	}
	return sumrows;
    }

    public static int[] largestInRows(int[][] matrix){
	int[] largestinrows = new int[matrix.length];
	for (int i=0; i<matrix.length; i++){
	    largestinrows[i]=largest(matrix[i]);
	}
	return largestinrows;
    }

    public static int sum(int[][] arr){
	int s = 0;
	for (int i=0; i<arr.length; i++){
	    s+=sum(arr[i]);
	}
	return s;
    }

}

