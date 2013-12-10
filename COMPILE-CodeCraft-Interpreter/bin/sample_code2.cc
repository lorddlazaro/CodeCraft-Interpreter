//Constant Declaration
absolute int SAMPLE_CONSTANT = 1337;
absolute string SAMPLE_CONSTANT = 123;

//Main Function

darkness mine(int x){

	int a;
	int b;
	string c;
	string d;
	float e;
	float d;
	
	a = 5;
	b = 3;
	c = "test";
	d = "file";
	e = 4.2;
	d = 3.34;
	
	//Addminusexpr test
	float z;
	z = 4 + 3;
	z = 4 - 3;
	z = 4.2 - 3;
	z = 4.2 + 3;
	string y;
	y = "f" + "u";
	//errors
	z = true + 2;
	z = 'c' + 2;
	y = "y" - 2;
	y = "23" - "aadf";
	
	a = (5+2)/2;
	
	a = compX(5);
	display("stuff");
	
	
	

}

int compX(int x){
	return x;
}

darkness display(string s){
	print(s);
}
