package next.controller;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RequestMapping {
    private final Map<String, Controller> mappingUrls = new ConcurrentHashMap<>();

    public RequestMapping() {
    }

    public void initialize() {
        mappingUrls.put("/", new HomeController());
        mappingUrls.put("/users/form", new ForwardController("/user/form.jsp"));
        mappingUrls.put("/users/loginForm", new ForwardController("/user/login.jsp"));
        mappingUrls.put("/users/list", new ListUserController());
        mappingUrls.put("/users/login", new LoginController());
        mappingUrls.put("/users/profile", new ProfileController());
        mappingUrls.put("/users/logout", new LoginController());
        mappingUrls.put("/users/update", new UpdateUserController());
        mappingUrls.put("/users/updateForm", new UpdateUserController());
        mappingUrls.put("/users/create", new CreateUserController());
    }

    public Controller get(String servletPath) {
        return mappingUrls.get(servletPath);
    }
}
