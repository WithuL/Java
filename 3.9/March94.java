public static void int max2 ( int a , int b ) {
	return a > b ? a : b ;
}
public static void int max3 ( int a , int b , int c ) {
	return c > max( a , b ) ? c :  max( a , b );
}