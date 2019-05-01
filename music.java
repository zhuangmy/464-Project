import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class music{
	//======================================================== Properties
	private int musicId;
	private double grade;
	private String musName ;
	private String artist;
	private String type;
	
	//======================================================== Constructors
	public music() {
	this(0,"","","",1);
}
	
	public music(int musicId, String musName, String artist, String type, double grade) {
		super();
		this.musicId = musicId;
		this.musName = musName;
		this.artist = artist;
		this.type = type;
		this.grade = grade;
	}
	
	public music(Scanner fin) {
		load(fin);
	}
	//======================================================== Methods
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof music) {
			music c = (music)obj;
			return	musName.equals(c.musName) &&
					artist.equals(c.artist) &&
					musicId == c.musicId &&
					grade == c.grade &&
					type.equals(c.type);
		}
		return false;
	}
	
	public void load(Scanner fin) {
		String[] parts = fin.nextLine().split("\t");
		setMusicId(Integer.parseInt(parts[0]));
		setMusName(parts[1]);
		setArtist(parts[2]);
		setType(parts[3]);
		setGrade(Double.parseDouble(parts[4]));
	}


	public void save(PrintWriter pw) {
		pw.printf("%s\t%s\t%s\t%s\t%s\n", musicId, musName, artist, type, grade);
	}

	@Override
	public String toString() {
		return "music [musicId=" + musicId + ", grade=" + grade + ", musName=" + musName + ", artist=" + artist
				+ ", type=" + type + "]";
	}




	//======================================================== Getters/Setters



	public int getMusicId() {
		return musicId;
	}

	public void setMusicId(int musicId) {
		this.musicId = musicId;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String getMusName() {
		return musName;
	}

	public void setMusName(String musName) {
		this.musName = musName;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	






}
