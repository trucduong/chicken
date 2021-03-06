package web.business.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import core.common.exception.CommonException;
import core.web.navigation.Navigator;
import web.business.config.View;

@Controller
public class HomeController {

	@Autowired
	Environment env;
	
	@RequestMapping(value = View.HOME_PAGE_URL, method = RequestMethod.GET)
	public ModelAndView gotoHome() throws CommonException {
		ModelAndView mv = Navigator.create(View.HOME_PAGE);

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
