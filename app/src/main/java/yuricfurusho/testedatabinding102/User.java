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
    public int lastNameColor;
    public boolean status;

    public User(Context context, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = true;
        updateLastNameColor(context);
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
    public int getLastNameColor() {
        return this.lastNameColor;
    }

    public void updateLastNameColor(Context context) {
        if (status) {
            this.lastNameColor = context.getResources().getColor(android.R.color.holo_green_dark);
        } else {
            this.lastNameColor = context.getResources().getColor(android.R.color.holo_red_dark);
        }
        status = !status;
        notifyPropertyChanged(yuricfurusho.testedatabinding102.BR.lastNameColor);
    }

    public void onClickLastName(View view) {
        updateLastNameColor(view.getContext());
    }
}
