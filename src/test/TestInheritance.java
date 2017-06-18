package test;

import org.apache.poi.poifs.property.Child;

public class TestInheritance {
	public static void main(String args[]){
		Parent p = new Parent();
		Parent p1 = new child1();
		Parent p2=new Child2();
		child1 c1 = new child1();
		Child2 c2 = new Child2();

		p.getName();
		c1.getParent();
		c2.getParent();
		p1.getName();

		p2.getName();

		c1.getName();

		c2.getName();


	}
}
