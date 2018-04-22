package com.ITA.Ch15.DynamicProgramming.MatrixMultiples;


public class MatrixMultiply {
	
	private double[][] matrix;
	private int rowSize;
	private int columnSize;
	private Matrix matrixC;
	
	public MatrixMultiply(){
		
	}
	
	public MatrixMultiply(Matrix matrixA,Matrix matrixB){
		matrix=multiply(matrixA,matrixB);
		matrixC=new Matrix(matrix);
	}
	
	public boolean multiplable(Matrix matrixA,Matrix matrixB){
		if(matrixA.getColumnSize()!=matrixB.getRowSize()){
			return false;
		}
		return true;
	}
	
	private double[][] multiply(Matrix matrixA,Matrix matrixB){
		if(!multiplable(matrixA, matrixB)){
			return null;
		}
		double[][] matrixC=new double[matrixA.getRowSize()][matrixB.getColumnSize()];
		for(int i=0;i<matrixA.getRowSize();i++){
			for(int j=0;j<matrixB.getColumnSize();j++){
				double sum=0;
				for(int k=0;k<matrixA.getColumnSize();k++){
					sum+=matrixA.getMatrix()[i][k]*matrixB.getMatrix()[k][j];
				}
				matrixC[i][j]=sum;
			}
		}
		return matrixC;
	}
	
	public int getRowSize(){
		return rowSize;
	}
	
	public int getColumnSize(){
		return columnSize;
	}
	
	public Matrix getMatrixC(){
		return matrixC;
	}
	
	public int MultiplyTime(Matrix matrixA,Matrix matrixB){
		return matrixA.getRowSize()*matrixA.getColumnSize()*matrixB.getColumnSize();
	}
}
