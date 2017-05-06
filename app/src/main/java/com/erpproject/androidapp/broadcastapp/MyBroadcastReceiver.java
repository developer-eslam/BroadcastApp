package com.erpproject.androidapp.broadcastapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.Toast;

/**
 * Created by Eslam on 5/6/2017.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle bundle = intent.getExtras();
        if(bundle!=null){
            String phonestate = bundle.getString(TelephonyManager.EXTRA_STATE);
            if(phonestate.equals(TelephonyManager.EXTRA_STATE_RINGING)){
                //get phone number

                //بيجيب ليا ال رقم تليفون بشخص المصل
                String getphonenumber  = bundle.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);

                Toast.makeText(context.getApplicationContext(),getphonenumber,Toast.LENGTH_LONG).show();
        }
        }

    }
}
