public class ArrayOps{
    public static int sum(int[] arr){
	if (arr.length==0) return 0;
	int sum=0;
	for (int i=0; i<arr.length; i++){
	    sum+=arr[i];
	}
	return sum;
    }
}
