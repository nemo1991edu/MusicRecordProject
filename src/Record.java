
public class Record {

		private int id;
		private String title;
		private String singerName;
		private double length;
		private int rank;
		
		public Record(String title, String sigerName, double length, int rank) {
			setId();
			setTitle(title);
			setSingerName(sigerName);
			setLength(length);
			setRank(rank);
			
		}
		
		public int getId() {
			return this.id;
		}
		
		public String getTitle() {
			return this.title;
		}
		
		public String getSingerName() {
			return this.singerName;
		}
		
		public double getLength() {
			return this.length;
		}
		
		public int getRank() {
			return this.rank;
		}
		
		public void setId() {
			int randomtNumber = (int)((Math.random() * 9901) + 100);
			this.id = randomtNumber;
		}
		
		public void setTitle(String title) {
			if(!title.isEmpty() || !title.equalsIgnoreCase(null)) {
				this.title = title;
			}
		}
		
		public void setSingerName(String singerName) {
			if(!singerName.isEmpty() || !singerName.equalsIgnoreCase(null)) {
				this.singerName = singerName;
			}
		}
		
		public void setLength(double length) {
			if(length > 0) {
				this.length = length;
			}
		}
		
		public void setRank(int rank) {
			if(rank > 0 && rank < 6) {
				this.rank = rank;
			}
		}	
}
