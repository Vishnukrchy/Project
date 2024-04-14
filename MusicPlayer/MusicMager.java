package MusicPlayer;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import Book.Book;

public class MusicMager {
	Scanner sc = new Scanner(System.in);

	public void addSong(List<Song> ml) {
		System.out.println(" Enter The No Of Song ");

		int no_Of_Song = sc.nextInt();

		Song s[] = new Song[no_Of_Song];
		for (int i = 0; i < s.length; i++) {
			System.out.println(" Enter " + (i + 1) + " The No Song ");

			System.out.println((i + 1) + " Enter The Song Name : ");
			String songName = sc.next();
			System.out.println((i + 1) + " Enter The Singer Name : ");
			String singerName = sc.next();
			System.out.println((i + 1) + " Enter The Song Duration :");
			int songDuration = sc.nextInt();
			System.out.println((i + 1) + " Enter The Song Release Date :");
			String songD = sc.next();

			ml.add(new Song(songName, singerName, songDuration, songD));
			System.out.println(ml);

		}
	}

	public void serachSingerName(List<Song> ml) {
		// TODO Auto-generated method stub
		System.out.println(" Enter The Singer Name");
		String name = sc.next();
		boolean found = false;
		for (Song song : ml) {
			if (song.getSinger().equalsIgnoreCase(name)) {
				found = true;
				System.out.println(song);
				break;
			}

		}
		if (!found) {
			System.out.println(" Bekar h Bhaiya mai to tut gya");
		}
	}

	public void removeSong(List<Song> ml) {
		// TODO Auto-generated method stub
		System.out.println(" Enthe the song Name U want t remove ");
		String name = sc.next();
		boolean removed=false;
		for (int i = 0; i <ml.size(); i++) {
			Song song =ml.get(i);
			if (name.equalsIgnoreCase(song.getName())) {
				removed=true;
				ml.remove(i);
				break;
				
			}
		}
		if (removed) {
			System.out.println(" Song Removed SuccesFully");
		}else {
			System.out.println(" Song Not Removed !!!");
		}

	}

	public void dispalySong(List<Song> s) {
		// TODO Auto-generated method stub

		for (Song song : s) {
			System.out.println(song);

		}

	}
}
