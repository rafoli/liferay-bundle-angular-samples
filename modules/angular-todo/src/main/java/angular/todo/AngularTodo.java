package angular.todo;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

@Component(
	immediate = true,
	property = {
	},
	service = Portlet.class
)
public class AngularTodo extends MVCPortlet {


}
