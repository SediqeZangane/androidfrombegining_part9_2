package android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class androidpart51Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_androidpart51);
        Toast.makeText(this,"btnandroidpart51_onCreate",Toast.LENGTH_LONG).show();
        Intent TRANSFER=getIntent();
        person per= (person) TRANSFER.getSerializableExtra("transfer per");
        String NAME= (String) TRANSFER.getSerializableExtra("transfer full name");
        Toast.makeText(this,"person name",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"per.name",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"per.family",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"per.type",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
     //   Toast.makeText(this,"btnandroidpart51_onStart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
     //   Toast.makeText(this,"btnandroidpart51_onResume",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
     //   Toast.makeText(this,"btnandroidpart51_onPause",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
     //   Toast.makeText(this,"btnandroidpart51_onStop",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    //    Toast.makeText(this,"btnandroidpart51_onDestroy",Toast.LENGTH_LONG).show();

    }
}