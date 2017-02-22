package service.auth.shared.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.core.env.Environment;

import core.service.action.CRUDServiceAction;
import core.service.invoke.ServiceHelper;
import core.service.invoke.ServiceResult;

public class AuthServiceAction extends CRUDServiceAction {

	public AuthServiceAction(Environment env) {
		super(env);
	}

	@Override
	protected String getServiceName() {
		return "service.auth";
	}
	
	public ServiceResult getAccountByName(String name) {
		String url = createRequestUrl(AuthServiceActionConst.GET_ACCOUNT_BY_NAME);
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put(AuthServiceActionConst.GET_ACCOUNT_BY_NAME__NAME, name);
		return ServiceHelper.get(url, params);
	}

}
