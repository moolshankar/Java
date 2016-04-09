
public class mainShow {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[4];
		students[0] = new Student("Student4",004,"std4","44444444","BLR4");
		students[1] = new Student("Student2",002,"std2","22222222","BLR2");
		students[2] = new Student("Student1",001,"std1","11111111","BLR1");
		students[3] = new Student("Student3",003,"std3","33333333","BLR3");
		Student tempStu = null;
		for (int i=0;i<4;i++){
			
			for(int k=i+1;k<4;k++){
				if (students[i].getName().compareTo(students[k].getName())>0)
					{
						tempStu = students[i];
						students[i] = students[k];
						students[k] = tempStu;
					}	 
			}
			
		}
		
		for (int j=0;j<4;j++){
			System.out.println(j+"------------------------------------");
			System.out.println(students[j].getName());
			System.out.println(students[j].getRollNo());
			System.out.println(students[j].getStandard());
			System.out.println(students[j].getPhone());
			System.out.println(students[j].getCity());
			
		}
		

	}

}
