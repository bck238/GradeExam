public class GradTest {
	public static void main(String[] args) {
		int[][]grade={
				{1,3,2,4,3,1,4,2,2,1},
				{3,2,4,2,2,1,1,3,4,1},
				{2,4,3,2,1,2,1,3,3,4},
				{2,3,3,1,1,3,2,2,4,4},
				{3,1,1,2,4,1,2,3,1,3}};
		int []answer={1,3,4,2,3,4,1,2,2,3};
		String []ox=new String[10];
		double []angrade={13.5,4,11.1,11.4,7,9.9,8.3,10,9.8,15};
		double sum=0;
		for(int i=0;i<5;i++){
			System.out.print("학생"+(i+1));
			for(int j=0; j<10; j++){
				System.out.print(" "+grade[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.print("정답 : ");
		for(int i=0; i<args.length; i++){
			System.out.print(args[i]+" ");
			answer[i]=Integer.parseInt(args[i]);
		}
		System.out.println();
		
		for(int i=0;i<5;i++){
			System.out.print("학생"+(i+1)+"의 점수 : ");
			for(int j=0; j<10; j++){
				if(grade[i][j]==answer[j]){
					sum=sum+angrade[j];
					ox[j]="O";
				}else{
					sum=sum;
					ox[j]="X";
				}
			}
			System.out.print(sum+"점");
			System.out.println();
			sum=0;
			for(int k=0;k<10;k++)
				System.out.print(ox[k]);
			System.out.println();
		}

	}
}