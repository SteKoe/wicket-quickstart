package de.stekoe.c4.wicket.quickstart;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.AbstractLink;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class BasePage extends WebPage {
	private static final long serialVersionUID = 4703212991485587319L;

	public BasePage(final PageParameters pageParameters) {
		super(pageParameters);
		
		add(new BookmarkablePageLink("homePageLink", HomePage.class));
		add(new BookmarkablePageLink("contactPageLink", ContactPage.class));
	}
	
}
