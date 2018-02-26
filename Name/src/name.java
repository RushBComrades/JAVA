
public class name {
	private String first;
	private String last;
	private static int members = 0;
	public name(String fn, String ln) {
		first = fn;
		last = ln;
		members++;
		System.out.println(first+" "+last+" "+members);
	}
	public String getFirst() {
		return first;
	}
	public String getLast() {
		return last;
	}
	public static int getMembers() {
		return members;
	}
}
