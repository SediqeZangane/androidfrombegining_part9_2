package android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class androidpart5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_androidpart5);
//        Toast.makeText(this,"btnandroidpart5_onCreate",Toast.LENGTH_LONG).show();
//
//
//        Button btnandroidpart51 = (Button) findViewById(R.id.button_androidpart51);
//        btnandroidpart51.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                person per=new person("ali","ahmadi","student");
//                String NAME=per.getName();
//                Intent transfer = new Intent(androidpart5Activity.this, androidpart51Activity.class);
//                androidpart5Activity.this.startActivity(transfer);
//                transfer.putExtra("transferNAME",NAME);
//                transfer.putExtra("transfer per",per);
//
//            }
//        });

    }

    @Override
    protected void onStart() {
        super.onStart();
       // Toast.makeText(this,"btnandroidpart5_onStart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
     //   Toast.makeText(this,"btnandroidpart5_onResume",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
     //   Toast.makeText(this,"btnandroidpart5_onPause",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
   //     Toast.makeText(this,"btnandroidpart5_onStop",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
   //     Toast.makeText(this,"btnandroidpart5_onDestroy",Toast.LENGTH_LONG).show();

    }
}