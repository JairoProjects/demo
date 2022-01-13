package controlador;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;

/**
 * @author : jairo
 * @created : 2021-12-20
**/

import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ErrorControlador implements ErrorController {

//	@RequestMapping(path = "/error", method = RequestMethod.GET)
	@GetMapping(path = "/error")
	public String handleError() {
		return "error";

	}

}
