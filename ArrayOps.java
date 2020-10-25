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

    public static int[] sumCols(int[][] matrix){
	int[] sumcols = new int[matrix[1].length];
	for (int i=0; i<matrix.length; i++){
	    for (int j=0; j<matrix[i].length; j++){
		sumcols[j]+=matrix[i][j];
	    }
	}
	return sumcols;
    }

    public static boolean isRowMagic(int[][] matrix){
	int t=0;
	for (int i=0; i<matrix.length; i++){
	    if (sumRows(matrix)[i]!=sumRows(matrix)[1]) t=1;
	}
	return t==0;
    }

    public static boolean isColMagic(int[][] matrix){
	int t=0;
	for (int i=0; i<matrix.length; i++){
	    if (matrix[i].length>0 && sumCols(matrix)[i]!=sumCols(matrix)[1]) t=1;
	}
	return t==0;
    }

    public static boolean isLocationMagic(int[][] matrix, int row, int col){
	return sumRows(matrix)[row]==sumCols(matrix)[col];
    }

}

