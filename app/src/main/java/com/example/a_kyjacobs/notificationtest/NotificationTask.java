package com.example.a_kyjacobs.notificationtest;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;

public class NotificationTask extends AsyncTask<Activity,Integer,Integer>{
@Override
    protected Integer doInBackground(Activity... a) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        } finally {
            Notification.Builder mBuilder = new Notification.Builder(a[0]);
            mBuilder.setContentTitle("My notification");
            mBuilder.setContentText("Hello World!");
            mBuilder.setSmallIcon(R.mipmap.ic_launcher);

            NotificationManager mNotificationManager = (NotificationManager) a[0].getSystemService(Context.NOTIFICATION_SERVICE);

            mNotificationManager.notify(1, mBuilder.build());
        }

        return 0;
    }
}