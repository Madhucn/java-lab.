package demo;

public class Matrixmultiplicaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating two matrices    
			int a[][]={{5,5,5},{6,6,6},{7,7,7}};    
			int b[][]={{5,5,5},{6,6,6},{7,7,7}};    
			    
			//creating another matrix to store the multiplication of two matrices    
			int c[][]=new int[3][3];  //3 rows and 3 columns  
			    
			//multiplying and printing multiplication of 2 matrices    
			for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
			c[i][j]=0;      
			for(int m=0;m<3;m++)      
			{      
			c[i][j]+=a[i][m]*b[m][j];      
			}//end of m loop  
			System.out.print(c[i][j]+" ");  //printing matrix element  
			}//end of j loop  
			System.out.println();//new line    
			}    
		}
	}  
