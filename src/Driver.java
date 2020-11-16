import java.util.Scanner;
public class Driver {
	public static void print(Record record) {
		System.out.println("ID:\t\t" + record.getId() +
								"\nTitle:\t\t" + record.getTitle() +
								"\nSinger Name:\t" + record.getSingerName() +
								"\nLength:\t\t" + record.getLength() +
								"\nRank:\t\t" + record.getRank());
	}
		
	public static int findIndexOfTitle(Record[] records, String title) {
		for (int i = 0; i < records.length; i++) {
			if (records[i].getTitle().equalsIgnoreCase(title)) {
				return i;
			}
		}
		return -1;
	}
		
		public static double getLength(Record[] records) {
			double sum = 0.0;
			for (int i = 0; i < records.length; i++) {
				sum += records[i].getLength();
			}
			
			return sum / records.length;
		}
		
		public static double getRank(Record[] records) {
			double sum = 0.0;
			for (int i = 0; i < records.length; i++) {
				sum += records[i].getRank();
			}
			
			return sum / records.length;
		}
		
		
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			Record rec1 = new Record("thugs", "Notorius BIG", 200, 5);
			Record rec2 = new Record("change", "2pac", 200, 5);
			Record rec3 = new Record("many mans", "50 cent", 200, 5);
			Record rec4 = new Record("dang", "snoop dogg", 200, 5);
			Record rec5 = new Record("bad", "eminen", 200, 5);
			Record rec6 = new Record("ride", "Dr. Dre", 200, 5);
			Record rec7 = new Record("warning", "Notorius BIG", 200, 5);
			Record[] records = new Record[7];
			records[0] = rec1;
			records[1] = rec2;
			records[2] = rec3;
			records[3] = rec4;
			records[4] = rec5;
			records[5] = rec6;
			records[6] = rec7;
			System.out.print("Enter a title:\t");
			String titleInput = input.nextLine();
			int index = findIndexOfTitle(records, titleInput);

			if (index == -1) {
				System.err.println(titleInput + " was not found");
			} else {
				print(records[index]);
			}
			
			double lengthAverage = getLength(records);
			System.out.println("\nThe average of lengths is " + lengthAverage + "[s]");
			double rankAverage = getRank(records);
			System.out.println("The average of ranks is " + rankAverage);
			
		}
}
