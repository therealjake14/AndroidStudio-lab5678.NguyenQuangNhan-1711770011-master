package nhannguyen.code.admin.lab4nguyenquangnhan_1711770011;

import android.content.Context;
import android.widget.ArrayAdapter;
import nhannguyen.code.admin.lab4nguyenquangnhan_1711770011.MainActivity;

public class RestaurantAdapter extends ArrayAdapter<Restaurant> {
    public RestaurantAdapter(Context context, int textViewResourceId){
        super(context, textViewResourceId);
    }
    public RestaurantAdapter(){
        super(MainActivity.this);
    }
}
