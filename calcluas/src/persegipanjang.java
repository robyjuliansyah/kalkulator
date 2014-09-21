class persegipanjang extends bangundatar{
    private int panjang = 1;
    private int lebar = 1;

	persegipanjang(int p, int l)
	{	panjang = p;
         	lebar = l;
        }

	double luas()
	{	return panjang * lebar;	}
}