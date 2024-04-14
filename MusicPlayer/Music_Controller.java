package MusicPlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Music_Controller {
public static void main(String[] args) {
	List<Song> s=new ArrayList<Song>();
     s.add(new Song("Ram Ayaenge", "Yachna", 3, "12-10-2023"));
     s.add(new Song("hanuman chalisa", "bhushan kumar", 7, "12-10-2009"));
     s.add(new Song("chhati maiya", "pavan kumar", 7, "12-10-2023"));
	
	MusicMager mm= new MusicMager();
	Scanner sc =new Scanner(System.in);
	int input;
	do {
		System.out.println(" Enter The Choice  ");
		System.out.println(" 1 For The Add Music  !!!"
				+ "");
		System.out.println(" 2 For The Display  Song in The ");
		System.out.println(" 3 For The Remoove Music  ");
		System.out.println(" 4 For The Search Song serach By SingerName  ");
		
		System.out.println(" 0 For the Exit");
		input=sc.nextInt();
		
		switch (input) {
		case 1:{
			mm.addSong(s);
			break;
		}
		case 2:{
			mm.dispalySong(s);
			break;
		}
		case 3:{
		mm.removeSong(s);
			break;
		}
		case 4:{
			mm.serachSingerName(s);
				break;
			}

		default:
			break;
		}
		
	} while (input!=0);
}
}
