package Restaurant;

import java.util.Comparator;

public class Name implements Comparator<Menu> {

	@Override
	public int compare(Menu o1, Menu o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareToIgnoreCase(o2.getName());
	}

}
