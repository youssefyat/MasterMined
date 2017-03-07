package MasterMined.yat.zaza;

import java.util.ArrayList;
import java.util.List;

public class MasterMined {
	protected final int MAX_SIZE = 5;
	protected List<String> colors = new ArrayList<String>();

	private final List<Integer> skipableColors = new ArrayList<Integer>();
	private final List<Integer> skipableGivenColors = new ArrayList<Integer>();

	public MasterMined(String[] colors) {
		this.colors = this.getListFromArrayString(colors);
	}

	public List<String> getListFromArrayString(String[] colors) {
		List<String> listcolors = new ArrayList<String>();
		for (String color : colors) {
			listcolors.add(color);
		}
		return listcolors;
	}

	public int rightPlace(List<String> givenCouleurs) {
		int compteur = 0;
		for (int i = 0; i < givenCouleurs.size(); i++) {
			if (givenCouleurs.get(i).equals(this.colors.get(i))) {
				this.addSkipable(i, i);
				compteur++;
			}
		}
		return compteur;
	}

	public int deferentPlace(List<String> givenCouleurs) {
		int compteur = 0;
		for (int i = 0; i < this.colors.size(); i++) {
			for (int j = 0; j < givenCouleurs.size(); j++) {
				if (this.colors.get(i).equals(givenCouleurs.get(j)) && !this.skipableColors.contains(i)
						&& !this.skipableGivenColors.contains(j)) {
					this.addSkipable(i, j);
					compteur++;
				}
			}
		}
		return compteur;
	}

	private void addSkipable(int i, int j) {
		this.skipableColors.add(i);
		this.skipableGivenColors.add(j);
	}

	private void clearSkipable() {
		this.skipableGivenColors.clear();
		this.skipableColors.clear();
	}

	public int[] compareCombinaison(String[] givenArrayCouleurs) {
		this.clearSkipable();
		List<String> givenCouleurs = this.getListFromArrayString(givenArrayCouleurs);
		return new int[] { this.rightPlace(givenCouleurs), this.deferentPlace(givenCouleurs) };
	}

}
