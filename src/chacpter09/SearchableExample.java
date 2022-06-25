package chacpter09;

public class SearchableExample {
	public static void main(String[] args) {
		new Searchable() {
			public void search(String searchWord) {
				System.out.println(searchWord);
			}
		}.search("안녕");
	}
}
