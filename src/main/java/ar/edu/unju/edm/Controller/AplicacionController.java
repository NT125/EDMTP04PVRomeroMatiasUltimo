package ar.edu.unju.edm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AplicacionController {
	@GetMapping("/home")
	public String iniciarAplicacion() {
		return "Index";
	}
	@GetMapping("/fixture")
	public String iniciarFixture() {
		return "fixture";
	}
	@GetMapping("/equipos")
	public String iniciarEquipo() {
		return "equipos";
	}
}