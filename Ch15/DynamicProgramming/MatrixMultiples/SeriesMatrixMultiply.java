package com.ITA.Ch15.DynamicProgramming.MatrixMultiples;

import java.util.ArrayList;
import java.util.List;

public class SeriesMatrixMultiply {

	double[][] results;
	int[][] times;
	int size=0;
	List<Matrix> matrixList;
	
	public SeriesMatrixMultiply(){
		matrixList=new ArrayList<Matrix>();
	}
	
	public SeriesMatrixMultiply(int size){
		this.size=size;
		matrixList=new ArrayList<Matrix>();
//		results=new double[size][size];
		times=new int[size][size];
	}
	
	public void insertMatrix(Matrix matrix){
		if(size>=0 && matrixList.size()<size){
			matrixList.add(matrix);
		}else{
			System.err.println("the matrix list is full");
		}
	}
	
	public void removeMatrix(){
		matrixList.remove(matrixList.size()-1);
	}
	
	public boolean isMultiplable(){
		for(int i=0;i<matrixList.size()-1;i++){
			//to test if the matrix series could be multiplied
			if(!new MatrixMultiply().multiplable(matrixList.get(i),matrixList.get(i+1))){
				System.out.println("the matrix pair number: "+(i+1)+" is not multiplable!");
				return false;
			}
		}
		System.out.println("all matrix are multiplable, go ahead!");
		return true;
	}
	
//	private static int countTime(Matrix matrixA,Matrix matrixB){
//		return matrixA.getRowSize()*matrixB.getRowSize()*matrixB.getColumnSize();
//	}
	
	public void seriesMultiply(){
		if(matrixList==null){
			System.out.println("empty matrix");
		}else if(matrixList.size()==1){
			System.out.println("only one matrix");
		}

		//initiate the results and times matrixes.
		//if the index i == j, means the only one array, the time consuming is 0.
		//if more than one multiply, preset the value as maximum then estimate the real time.
		for(int i=0;i<matrixList.size();i++){
			for(int j=0;j<matrixList.size();j++){
//				results[i][j]=0.0;
				if(i==j){
					times[i][j]=0;
				}else{
					times[i][j]=Integer.MAX_VALUE;
				}
			}
		}
		
		//remark every optimized calculation time to submatrix
		//variable length: the number of matrix in the multiplication
		//
		for(int length=2;length<=matrixList.size();length++){				//define the length of submatrix
			for(int start=0;start<matrixList.size()-length+1;start++){
				for(int k=start;k<start+length-1;k++){
					int time=times[start][k]+matrixList.get(k).getRowSize()*matrixList.get(k).getColumnSize()*matrixList.get(k+1).getColumnSize()+times[k+1][start+length-1];
					times[start][start+length-1]=Math.min(times[start][start+length-1], time);
				}
			}
		}
	}
	
	public void printTimeTable(){
		for(int i=0;i<times.length;i++){
			for(int j=0;j<times[i].length;j++){
				System.out.print(times[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	//setters and getters
	public List<Matrix> getMatrixList(){
		return matrixList;
	}
	
	public int[][] getTimes(){
		return times;
	}
}
