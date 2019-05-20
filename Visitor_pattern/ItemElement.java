package Visitor_pattern;


public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}
