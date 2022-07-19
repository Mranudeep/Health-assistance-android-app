package cse.pec.sharon.project;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.os.Binder;
import java.util.Random;

public class MyService2 extends Service {

    public final IBinder iBinder = new LocalBinder();
    public final Random mGenerator = new Random();

    public class LocalBinder extends Binder
    {
        MyService2 getService()
        {
            return MyService2.this;
        }
    }

    public MyService2()
    {

    }

    @Override
    public IBinder onBind(Intent intn)
    {
        return iBinder;
    }

    public int getRandom()
    {
        return mGenerator.nextInt(200);
    }


}