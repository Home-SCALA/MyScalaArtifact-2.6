package app.basePackage

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class MainController {
  	@RequestMapping(value=Array("/"), method=Array(RequestMethod.GET))
	def home1():String ={
	println("Go to home")
		return "home"; 
	}
}