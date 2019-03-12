package Logic2;

public class Soal3 {
	
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
		
		int index = n * 2 - 2;
		int index2 = 1;
		for (int i = 0; i < this.baris; i++) {
			int local = 1;
			for (int j = 0; j < this.kolom; j++) {
				if(i == j) {
					this.matrix[i][j] = index2 + "";
				}else if(+i +j == this.baris - 1) {
					//this.matrix[this.baris - 1 - i][this.kolom - 1 - j] = index+"";
					this.matrix[i][j] = index + "";
				}
				local = local + 2;
			}
			index = index - 2;
			index2 = index2 + 2;
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
		Soal3 jawab = new Soal3();
		jawab.setMatrix(9);
		jawab.showMatrix();
	}

}
