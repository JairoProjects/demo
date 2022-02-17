package controlador;

import org.springframework.beans.factory.annotation.Autowired;
/**
 * @author : jairo
 * @created : 2021-12-20
**/
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import modelo.Student;
import service.DabaseService;
import service.MyDatabase;

@Controller
public class MyPrimerControlador {
	@Autowired
	private DabaseService service;

	@GetMapping("/hello")
	public String hola(Student student) {
		service.insert(student);
		service.nollamar();
		System.out.println(student);
		return "fin";
	}

	@GetMapping("/")
	public ModelAndView bienvenida() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		Student student = new Student();
		student.setEdad("40");
		modelAndView.addObject("student", student);
		return modelAndView;
	}

	public MyDatabase getService() {
		return service;
	}

	public void setService(MyDatabase service) {
		this.service = service;
	}


}
