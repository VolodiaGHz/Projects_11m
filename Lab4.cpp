// Lab4.cpp: определяет точку входа для консольного приложения.
//

#include "stdafx.h"
#include <iostream>
#include <iomanip>
#include "windows.h"
using namespace std;
const int n = 5;

class Matrix
{
private:
	int M[n][n];
public:
	void InputMatrix();
	void OutputMatrix();
	void Sort();
	int *Solution();
    int FindArithmeticAverage();
};

void Matrix::InputMatrix()
{
	for (int i = 0; i < n; i++)
		for (int j = 0; j < n; j++)
		{
			cout << "[" << i + 1 << "][" << j + 1 << "] = ";
			cin >> M[i][j];
		}
}


void Matrix::OutputMatrix()
{
	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < n; j++)
		{
			cout << "\t" << M[i][j];
		}
		cout << endl;
	}
}

void Matrix::Sort()
{
	for (int i = 0; i < n; i++)
	{
		int max = 0;
		for (int j = 0; j < n - 1; j++)
		{
			max = j;
			for (int k = j + 1; k < n; k++)
			{
				if (M[i][k] > M[i][max])
				{
					max = k;
				}
			}
			int temp = M[i][max];
			M[i][max] = M[i][j];
			M[i][j] = temp;
		}
	}
}
int *Matrix::Solution()
{
	int * results = new int[n];
	int result = 0;
	for (int j = 0; j < n; j++)
	{
		result = 1;
		for (int i = 1;  i < n; i++)
		{
			if ((i + j) >=n)
			{
				result = result * M[i][j];
			}
		}
		results[j] = result;
	}
	return results;
}

int Matrix::FindArithmeticAverage()
{
	double AritmeticAverage, sum = 0;
		for(int i=0; i<n; i++)
		{
			sum = sum + Solution()[i];
		}
		AritmeticAverage = sum / (n-1);
		return AritmeticAverage;
}


int main()
{
	Matrix matrix;
	matrix.InputMatrix();
	cout << "Matrix" << endl;
	matrix.OutputMatrix();
	matrix.Sort();
	cout << "Sorted matrix" << endl;
	matrix.OutputMatrix();
	cout << "Products in columns:" << endl;
	for (int i = 0; i < n; i++)
	{
		cout << matrix.Solution()[i] <<endl;
	}
	cout << "AritmeticAverage:" << matrix.FindArithmeticAverage() << endl;
	

	system("pause");
	return 0;
}
