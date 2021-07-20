package two;

import one.Parent;

public class Child extends Parent{

	public static void main (String[] args) {
		Parent p = new Parent();
		System.out.println(p.pub);
		// System.out.println(p.pro);
		// System.out.println(p.def);
		// System.out.println(p.pri);
		
		public static void main (String[] args) {
			Parent c = new Child();
			System.out.println(c.pub);
			// System.out.println(c.pro);
			// System.out.println(c.def);
			// System.out.println(c.pri);
		}
	}
}
