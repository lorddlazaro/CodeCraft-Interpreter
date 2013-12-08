
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
	a=2;
	//Statement Declaration
	
	println("char x: ",x);
	
	//assignment statements
	v = 1;
	w = 2.5;
	x = 'x';
	y = "hello";
	z = true;

	//function call statement
	w = computeSomething(v,w);
	doSomething();


	//if statement
	wether(z == true){
		doSomething();
	
	}otherwise{

		//nested if statement
		wether(v > 0){
			doSomething();
		}otherwise{
			doSomething();
		}
	}

	
	//while statement
	
	v = 5;
	until(v>0){
		v = v-1;
	}

	//do while statement
	execute{
		v = v+1;
	}until(v == 5);

	//for statement

	as(v=5; v>0 ; v=v-1) {
		doSomething();
	}

	//Expressions
	//num expression

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

}

//Function Declaration

float computeSomething(int x, float w){
	doSomething();
	{
		y = 5;
	}
	reply x+w;
}

darkness doSomething(){
	// Do nothing
	doSomething();
}