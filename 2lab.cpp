// ConsoleApplication6.cpp: определяет точку входа для консольного приложения.
//

#include "stdafx.h"
#include "math.h"


int main()
{
	double intone, inttwo, step, result, problem;
	printf_s("intone-");
	scanf_s("%lf", &intone);
	printf_s("inttwo-");
	scanf_s("%lf", &inttwo);
	printf_s("step-");
	scanf_s("%lf", &step);
	printf_s("problem-");
	scanf_s("%lf", &problem);
	printf("\nResult:\n");
	double x, sum;
	int k;
	for (x = intone; x >= intone && x<= inttwo; x = x + step)
	{
		k = 1;
		sum = 0;
			do
			{
				result = k*pow(x, k);
				sum += result;
				k++;
			} while (fabs(result) > problem);
		printf_s("%.2f  -->  %.5f\n", x, sum);
	}
	scanf_s("%s");
    return 0;
}