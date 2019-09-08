package com.visitor.pattern;

public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}
