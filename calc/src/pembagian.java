class pembagian extends operasihitung{
    private int kesatu = 1;
    private int kedua = 1;

	pembagian(int s, int d)
	{	kesatu = s;
		kedua = d;
	}

	double hasilhitung()
	{	return kesatu / kedua;	}
}