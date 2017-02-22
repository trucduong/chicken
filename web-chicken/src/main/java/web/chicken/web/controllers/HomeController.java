package web.chicken.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import core.common.exception.CommonException;
import core.web.navigation.Navigator;
import web.chicken.config.Views;

@Controller
public class HomeController {

	@Autowired
	Environment env;
	
	@RequestMapping(value = Views.HOME_PAGE_URL, method = RequestMethod.GET)
	public ModelAndView gotoHome() throws CommonException {
		ModelAndView mv = Navigator.forward(Views.HOME_PAGE);

//		AuthServiceAction action = new AuthServiceAction(env);
//		ServiceResult result = action.getAccountByName("truc duong");
//		if (result.isSuccess()) {
//			mv.addObject("account", result.getValue(result, AccountDto.class));
//		} else {
//			throw new CommonException(result.getValue());
//		}

		return mv;
	}
}
