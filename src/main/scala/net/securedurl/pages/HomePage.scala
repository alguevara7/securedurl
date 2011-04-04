package net.securedurl.pages;

import org.apache.wicket.PageParameters
import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.spring.injection.annot.SpringBean

class HomePage(parameters: PageParameters) extends WebPage {
	add(new Label("message", title))
	
	@SpringBean(name="title") val title: String = "N/A"	
		
}
