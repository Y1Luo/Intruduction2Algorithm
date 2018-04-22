package com.ITA.Ch15.DynamicProgramming.MatrixMultiples;

public class Matrix {

	private int rowSize;
	private int columnSize;
	double[][] matrix;
	

	/*
	 * constructors
	 */
	public Matrix(int rowSize, int columnSize){
		matrix=new double[rowSize][columnSize];
		this.rowSize=rowSize;
		this.columnSize=columnSize;
	}
	
	public Matrix(double[][] matrix){
		this.matrix=matrix;
		if(matrix!=null){
			rowSize=matrix.length;
			columnSize=matrix[0].length;			
		}
	}

	
	/*
	 * matrix operations
	 */
	//insert elements by array to a matrix with defined dimension
	public void insertElements(double[] elements){
		int row=0, column=0, anchor=0;
		int elementNumber=(int)(rowSize*columnSize);
		while(anchor<elementNumber){
			matrix[row][column]=elements[anchor];
			column++;
			if(column==columnSize){
				column=0;
				row++;
			}
			anchor++;
		}		
	}
	
	//insert an element to an exact position of the matrix
	public void insertElement(int row, int column, double element){
		if(row>rowSize||column>columnSize){
			System.err.println("input beyond matrix size!");
			return;
		}
		matrix[column-1][row-1]=element;
	}
	
	//print the matrix by rows and columns
	public void printMatrix(){
		for(int i=0;i<this.rowSize;i++){
			for(int j=0;j<this.columnSize;j++){
				System.out.print(matrix[i][j]+", ");
			}
			System.out.println();
		}
	}
	//getters and setters
	public double getElement(int row,int column){
		if(row>rowSize||column>columnSize){
			return Double.MIN_VALUE;
		}
		return matrix[row-1][column-1];
	}
	
	public int getColumnSize(){
		return columnSize;
	}
	
	public int getRowSize(){
		return rowSize;
	}

	public double[][] getMatrix() {
		return matrix;
	}
	
}
