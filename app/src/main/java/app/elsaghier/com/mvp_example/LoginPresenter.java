package app.elsaghier.com.mvp_example;

/*
 *
 * interface to declare the methods that handle login process ( validate, load data, etc )
 * */
public interface LoginPresenter {

    /*handle click on login button*/
    void login(String email, String password);
}
