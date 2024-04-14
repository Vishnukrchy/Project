package MusicPlayer;

public class Song {
private String name;
private String singer;
private double duration;
private String date;

public Song() {
	// TODO Auto-generated constructor stub
}

public Song(String name, String singer, double duration, String date) {
	super();
	this.name = name;
	this.singer = singer;
	this.duration = duration;
	this.date = date;
}

@Override
public String toString() {
	return "Song [name=" + name + ", Singer=" + singer + ", duration=" + duration + ", date=" + date +"]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSinger() {
	return singer;
}

public void setSinger(String singer) {
	singer = singer;
}

public double getDuration() {
	return duration;
}

public void setDuration(double duration) {
	this.duration = duration;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}



}
