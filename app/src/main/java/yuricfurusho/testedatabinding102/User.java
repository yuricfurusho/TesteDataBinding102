package yuricfurusho.testedatabinding102;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

/**
 * Created by live on 13/10/15.
 */
public class User extends BaseObservable {
    public String firstName;
    public String lastName;
    public String email;
    public int lastNameColor;
    public boolean status;

    public User(Context context, String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.status = true;
    }

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(yuricfurusho.testedatabinding102.BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(yuricfurusho.testedatabinding102.BR.lastName);
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Bindable
    public int getLastNameColor() {
        return this.lastNameColor;
    }

    @Bindable
    public boolean getStatus() {
        return this.status;
    }

    public void onClickLastName(View view) {
        flipStatus();
    }

    public void flipStatus() {
        this.status = !this.status;
        notifyPropertyChanged(yuricfurusho.testedatabinding102.BR.status);
    }
}
