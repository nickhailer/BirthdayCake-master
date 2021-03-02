package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private CakeView cakeViewObj;
    private CakeModel cakeModelObj;

    public CakeController(CakeView newCakeViewObj) {
        this.cakeViewObj = newCakeViewObj;
        this.cakeModelObj = newCakeViewObj.getCakeModelObj();
    }

    public void onClick (View v){
        Log.d("CakeController", "onClick working!!!!");

        cakeModelObj.candlesLit = false;
        cakeViewObj.invalidate();
    }

    public void onCheckedChanged (CompoundButton buttonView, boolean isChecked){
        Log.d("CakeController", "onCheckedChanged working!!!");

        if (cakeModelObj.hasCandles) {
            cakeModelObj.hasCandles = false;
        } else {
            cakeModelObj.hasCandles = true;
        }
        cakeViewObj.invalidate();
    }



}
