package com.umashankar.visitor.pattern;

public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}
