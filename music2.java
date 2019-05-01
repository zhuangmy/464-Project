import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

	
public class music2{
	//======================================================== Properties
	private String song1, song2, song3, song4, song5, song6, song7, song8, song9, song10;
	private String song11, song12, song13, song14, song15, song16, song17, song18, song19, song20;
	private int common;
	//======================================================== Constructors
	public music2() {
	this("","","","","","","","","","","","","","","","","","","","",0);
	}
	
	public music2(String song1, String song2, String song3, String song4, String song5, String song6, String song7, String song8, String song9, String song10, String song11, String song12, String song13, String song14, String song15, String song16, String song17, String song18, String song19, String song20, int common) {
		super();
		this.song1 = song1;
		this.song2 = song2;
		this.song3 = song3;
		this.song4 = song4;
		this.song5 = song5;
		this.song6 = song6;
		this.song7 = song7;
		this.song8 = song8;
		this.song9 = song9;
		this.song10 = song10;
		this.song11 = song11;
		this.song12 = song12;
		this.song13 = song13;
		this.song14 = song14;
		this.song15 = song15;
		this.song16 = song16;
		this.song17 = song17;
		this.song18 = song18;
		this.song19 = song19;
		this.song20 = song20;
		this.common = common;
	}
	
	public music2(Scanner fin) {
		load(fin);
	}
	//======================================================== Methods
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof music2) {
				music2 c = (music2)obj;
				return	song1.equals(c.song1) &&
						song2.equals(c.song2) &&
						song3.equals(c.song3) &&
						song4.equals(c.song4) &&
						song5.equals(c.song5) &&
						song6.equals(c.song6) &&
						song7.equals(c.song7) &&
						song8.equals(c.song8) &&
						song9.equals(c.song9) &&
						song10.equals(c.song10) &&
						song11.equals(c.song11) &&
						song12.equals(c.song12) &&
						song13.equals(c.song13) &&
						song14.equals(c.song14) &&
						song15.equals(c.song15) &&
						song16.equals(c.song16) &&
						song17.equals(c.song17) &&
						song18.equals(c.song18) &&
						song19.equals(c.song19) &&
						song20.equals(c.song20) &&
						common == c.common;
			}
			return false;
		}
		
		public void load(Scanner fin) {
			String[] parts = fin.nextLine().split("\t");
			setSong1(parts[0]);
			setSong2(parts[1]);
			setSong3(parts[2]);
			setSong4(parts[3]);
			setSong5(parts[4]);
			setSong6(parts[5]);
			setSong7(parts[6]);
			setSong8(parts[7]);
			setSong9(parts[8]);
			setSong10(parts[9]);
			setSong11(parts[10]);
			setSong12(parts[11]);
			setSong13(parts[12]);
			setSong14(parts[13]);
			setSong15(parts[14]);
			setSong16(parts[15]);
			setSong17(parts[16]);
			setSong18(parts[17]);
			setSong19(parts[18]);
			setSong20(parts[19]);
			setCommon(Integer.parseInt(parts[20]));
		}


		public void save(PrintWriter pw) {
			pw.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n", 
					song1, song2, song3, song4, song5, song6, song7, song8, song9, song10,
					song11, song12, song13, song14, song15, song16, song17, song18, song19, song20, common);
		}
		
		

		@Override
		public String toString() {
			return "music2 [song1=" + song1 + ", song2=" + song2 + ", song3=" + song3 + ", song4=" + song4 + ", song5="
					+ song5 + ", song6=" + song6 + ", song7=" + song7 + ", song8=" + song8 + ", song9=" + song9
					+ ", song10=" + song10 + ", song11=" + song11 + ", song12=" + song12 + ", song13=" + song13
					+ ", song14=" + song14 + ", song15=" + song15 + ", song16=" + song16 + ", song17=" + song17
					+ ", song18=" + song18 + ", song19=" + song19 + ", song20=" + song20 + ", common=" + common + "]";
		}

		//======================================================== Getters/Setters
		public String getSong1() {
			return song1;
		}

		public void setSong1(String song1) {
			this.song1 = song1;
		}

		public String getSong2() {
			return song2;
		}

		public void setSong2(String song2) {
			this.song2 = song2;
		}

		public String getSong3() {
			return song3;
		}

		public void setSong3(String song3) {
			this.song3 = song3;
		}

		public String getSong4() {
			return song4;
		}

		public void setSong4(String song4) {
			this.song4 = song4;
		}

		public String getSong5() {
			return song5;
		}

		public void setSong5(String song5) {
			this.song5 = song5;
		}

		public String getSong6() {
			return song6;
		}

		public void setSong6(String song6) {
			this.song6 = song6;
		}

		public String getSong7() {
			return song7;
		}

		public void setSong7(String song7) {
			this.song7 = song7;
		}

		public String getSong8() {
			return song8;
		}

		public void setSong8(String song8) {
			this.song8 = song8;
		}

		public String getSong9() {
			return song9;
		}

		public void setSong9(String song9) {
			this.song9 = song9;
		}

		public String getSong10() {
			return song10;
		}

		public void setSong10(String song10) {
			this.song10 = song10;
		}

		public String getSong11() {
			return song11;
		}

		public void setSong11(String song11) {
			this.song11 = song11;
		}

		public String getSong12() {
			return song12;
		}

		public void setSong12(String song12) {
			this.song12 = song12;
		}

		public String getSong13() {
			return song13;
		}

		public void setSong13(String song13) {
			this.song13 = song13;
		}

		public String getSong14() {
			return song14;
		}

		public void setSong14(String song14) {
			this.song14 = song14;
		}

		public String getSong15() {
			return song15;
		}

		public void setSong15(String song15) {
			this.song15 = song15;
		}

		public String getSong16() {
			return song16;
		}

		public void setSong16(String song16) {
			this.song16 = song16;
		}

		public String getSong17() {
			return song17;
		}

		public void setSong17(String song17) {
			this.song17 = song17;
		}

		public String getSong18() {
			return song18;
		}

		public void setSong18(String song18) {
			this.song18 = song18;
		}

		public String getSong19() {
			return song19;
		}

		public void setSong19(String song19) {
			this.song19 = song19;
		}

		public String getSong20() {
			return song20;
		}

		public void setSong20(String song20) {
			this.song20 = song20;
		}

		public int getCommon() {
			return common;
		}

		public void setCommon(int common) {
			this.common = common;
		}
		

		
}