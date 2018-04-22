package com.ITA.Ch15.DynamicProgramming.MatrixMultiples;

public class MatrixTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int column1=3, row1=2, column2=2, row2=3, row3=3, column3=4, row4=4, column4=3;
		Matrix mt1=new Matrix(row1,column1);
		Matrix mt2=new Matrix(row2,column2);
		Matrix mt3=new Matrix(row3,column3);
		Matrix mt4=new Matrix(row4,column4);
		
		double[] elements=new double[30];
		for(int i=0;i<elements.length;i++){
			elements[i]=i+1.0;
		}

		mt1.insertElements(elements);
		mt1.printMatrix();

		System.out.println("_____________________________________________");
		
		
		mt2.insertElements(elements);
		mt2.printMatrix();
		System.out.println("_____________________________________________");		
		
		mt3.insertElements(elements);
		mt3.printMatrix();
		System.out.println("_____________________________________________");
		
		mt4.insertElements(elements);
		mt4.printMatrix();
		System.out.println("_____________________________________________");
		
		SeriesMatrixMultiply smm1=new SeriesMatrixMultiply(4);	
		smm1.insertMatrix(mt1);
		smm1.insertMatrix(mt2);
		smm1.insertMatrix(mt3);
		smm1.insertMatrix(mt4);

		System.out.println("the size is: "+smm1.getMatrixList().size());
		smm1.isMultiplable();
		smm1.seriesMultiply();
		System.out.println("_____________________________________________");
		System.out.println("optmized running time for each matrix multiplication");

		smm1.printTimeTable();
		System.out.println("_____________________________________________");
	}
}
