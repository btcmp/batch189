package Logic2;

import java.util.Scanner;

public class Soal7 {
	
	int baris = 0;
	int kolom = 0;
	String[][] matrix = null;
	
	//set matrix
	public void setMatrix(int n) {
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		//isi matrix
		
		// and = yang = if = &&
		// or = atau = else if = ||
		int index = 1;
		int index2 = n * 2 - 2;
		
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				if(i - j == 0) {
					this.matrix[i][j] = index + "";
				} else if(i+j == this.kolom - 1) {
					this.matrix[i][j] = index2 + "";
				} else if(i -j <= 0 && i + j <= this.kolom - 1) {
					this.matrix[i][j] = "A";
				} else if(i + j >= this.kolom - 1 && i - j >= 0) {
					this.matrix[i][j] = "B";
				}
			}
			index = index + 2;
			index2 = index2 - 2;
		}
		
	}
	
	//show matrix
	public void showMatrix() {
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				System.out.print(this.matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal7 jawab = new Soal7();
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan nilai n : >> ");
		int n = scan.nextInt();
		System.err.println();
		jawab.setMatrix(n);
		jawab.showMatrix();
	}

}
