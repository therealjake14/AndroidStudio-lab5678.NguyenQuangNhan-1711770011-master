package nhannguyen.code.admin.lab4nguyenquangnhan_1711770011;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private List<Restaurant> restaurantList = new ArrayList<Restaurant>();
    private ArrayAdapter<Restaurant> adapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button save = (Button)findViewById(R.id.save);
        save.setOnClickListener(onSave);
        ListView list = (ListView)findViewById(R.id.restaurants);

        adapter = new ArrayAdapter<Restaurant>(this,android.R.layout.simple_list_item_1, restaurantList);
        list.setAdapter(adapter);
    }


    private View.OnClickListener onSave = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Restaurant r = new Restaurant();

            EditText name = (EditText)findViewById(R.id.name);
            EditText address = (EditText)findViewById(R.id.addr);

            r.setName(name.getText().toString());
            r.setAddress(address.getText().toString());

            RadioGroup type =(RadioGroup)findViewById(R.id.type);


            switch (type.getCheckedRadioButtonId()){
                case R.id.take_out:
                    r.setType("Take out");
                    Toast.makeText(MainActivity.this, name.getText().toString()+" "+address.getText().toString()+" Take out",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.sit_down:
                    r.setType("Sit down");
                    Toast.makeText(MainActivity.this, name.getText().toString()+" "+address.getText().toString()+" Sit down",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.delivery:
                    r.setType("Delivery");
                    Toast.makeText(MainActivity.this, name.getText().toString()+" "+address.getText().toString()+" Delivery",Toast.LENGTH_SHORT).show();
                    break;
            }
            restaurantList.add(r);
        }
    };
}
