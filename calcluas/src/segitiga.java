class segitiga extends bangundatar{
    private int alas = 1;
    private int tinggi = 1;

	segitiga(int a, int t)
	{	alas = a;
         	tinggi = t;
        }

	double luas()
	{	return (alas * tinggi) / 2;	}
}