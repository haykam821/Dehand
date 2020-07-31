package io.github.haykam821.dehand.config;

import me.shedaniel.clothconfig2.gui.entries.SelectionListEntry.Translatable;

public enum EmptyHandVisibility implements Translatable {
	ALWAYS("always"),
	WHILE_SWINGING("whileSwinging"),
	NEVER("never");

	private String name;

	private EmptyHandVisibility(String name) {
		this.name = name;
	}

	@Override
	public String getKey() {
		return "dehand.emptyHandVisibility." + this.name;
	}
}