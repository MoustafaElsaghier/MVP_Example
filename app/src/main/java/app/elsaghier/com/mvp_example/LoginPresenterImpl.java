package app.elsaghier.com.mvp_example;

import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;

public class LoginPresenterImpl implements LoginPresenter {
    private MainActivity context;

    public LoginPresenterImpl(MainActivity context) {
        this.context = context;
    }

    @Override
    public void login(String email, String password) {
        if ((TextUtils.isEmpty(email) || TextUtils.isEmpty(password))) {
            Toast.makeText(context, "Please Fill Fields", Toast.LENGTH_SHORT).show();
        } else {
            if (email.equals("asd") && password.equals("123")) {
                context.startActivity(new Intent(context, HomeActivity.class));
            } else {
                Toast.makeText(context, "Wrong Data", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
