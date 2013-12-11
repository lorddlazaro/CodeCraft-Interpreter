
//Constant Declaration
absolute int SAMPLE_CONSTANT = 1337;

//Main Function

darkness mine(int x){
	//Variable Declaration
	int v;
	float w;
	char x;
	string y;
	boolean z;
	//a=2;
	//Statement Declaration
	 
	//println("char x: ",x);
	
	//assignment statements
	v = 1 * 5; // 5
	w = 1; 		// 1.0
	w = w;		// 1.0
	w = 2.5 / 2;	 //1.25
	w = 2 + 1;		//3.0
	w = 3 - 4;	//-1.0
	w = 2%5;	//2.0
	x = 'x';	
	y = "hello";
	z = true;
	
	z = 10>9;
	z = 10>=10;
	wether(z==true){
		int testing; //local test 
		v = 10;
	}
	z = v==10;
	wether(z){
		v =0;
	}otherwise{
		v=2;
	}
	
	until(v<10){
		v= v+1;
	}
	
	v=0;
	execute{
		v=v+1;
	}until(v<10);
	
	//for statement
	w=0;
	
	as(v=0; v<10 ; v=v+1) {
		w=w+1;
	}
	
	z = true;
	wether(z==true){
		v=10;
		wether(v==10){
			v =0;
			until(v<10){
				v= v+1;
				int test;
				w=0;
				as(test=0; test<10 ; test=test+1) {
					w=w+1;
				}
			}
		}otherwise{
			v=2;
		}
	}
	
	
	v = ((5 + 3)/4)-2;
	w = NULL;
	w = v / 2 % 5;

	//boolean expression;
	z = true == z;
	z = 1+5 > 3;
	z = true || false;
	z = z && true || false;
	z = (false || false) && true;
	z = (5-3 >= 2) || (5-2 >= 3);
	z = !z;
	z = !true;
	z = !(false || z);
	
	//w = computeSomething(1,2.5);
	//doSomething();

}

//Function Declaration

float computeSomething(int x, float w){
	//doSomething();
	reply x+w;
}

darkness doSomething(){
	// Do nothing
	//doSomething();
}