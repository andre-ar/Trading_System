package beans;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controll {

	String execute(HttpServletRequest request, HttpServletResponse response);

}
