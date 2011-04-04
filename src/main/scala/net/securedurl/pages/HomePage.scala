package net.securedurl.pages;

import org.apache.wicket.PageParameters
import org.apache.wicket.markup.html.basic.Label
import org.apache.wicket.markup.html.WebPage
import org.apache.wicket.spring.injection.annot.SpringBean
import com.google.appengine.api.users.UserService
import com.google.appengine.api.users.UserServiceFactory

class HomePage(parameters: PageParameters) extends WebPage {
	add(new Label("message", generateWelcome))
	
	@SpringBean(name="title") val title: String = "N/A"
		
	def generateWelcome: String = {
		val userService = UserServiceFactory.getUserService
		val user = userService.getCurrentUser
		return user.getNickname
	}
		
}
