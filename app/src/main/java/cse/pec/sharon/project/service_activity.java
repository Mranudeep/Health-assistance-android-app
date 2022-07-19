package cse.pec.sharon.project;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class service_activity extends AppCompatActivity implements View.OnClickListener {

    private Button start, stop,Broad;
    private Button BS;
    MyService2 myService2;
    boolean isBound = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        Intent intn = new Intent(this,MyService2.class);
        bindService(intn,serviceConnection, Context.BIND_AUTO_CREATE);
        start = (Button) findViewById(R.id.startButton);
        stop = (Button) findViewById(R.id.stopButton);
        Broad = (Button) findViewById(R.id.Broad);
        Broad.setOnClickListener(this);
        start.setOnClickListener(this);
        stop.setOnClickListener(this);
        BS=(Button) findViewById(R.id.BS);
        BS.setOnClickListener(this);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null)
        {

            if(bundle.getString("some") != null)
            {
                Toast.makeText(getApplicationContext(), "About us " + bundle.getString("some"), Toast.LENGTH_SHORT).show();
            }



        }


    }

    public void onClick(View view) {

        if(view == start){
            Toast.makeText(getApplicationContext(), "music started", Toast.LENGTH_SHORT).show();

            startService(new Intent( this, MyService.class ) );
        }


        else if (view == stop){
            Toast.makeText(getApplicationContext(),"music stopped",Toast.LENGTH_SHORT).show();
            stopService(new Intent( this, MyService.class ) );
            Intent intent =new Intent(getApplicationContext(),HomeActivity.class);
            startActivity(intent);


        }
        else if (view == BS){
            TextView tv = (TextView) findViewById(R.id.textView3);
            tv.setText("Congratulations!! on winning " + Integer.toString(myService2.getRandom())+"coupon points");

        }
    }
    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder service) {
            MyService2.LocalBinder binder =(MyService2.LocalBinder)service;
            myService2= binder.getService();
            isBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            isBound = false;
        }
    };

}
