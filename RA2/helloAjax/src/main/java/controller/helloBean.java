package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author camilo
 */
@Named(value = "helloBean")
@SessionScoped
public class helloBean implements Serializable {

    private String name;

    public helloBean() {
    }

    public String getSayWelcome() {
        if ("".equals(name) || name == null) {
            return "";
        }
        return "Ajax message : Welcome " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
