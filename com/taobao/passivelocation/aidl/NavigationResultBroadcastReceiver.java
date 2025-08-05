package com.taobao.passivelocation.aidl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class NavigationResultBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-664333754);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (!NaviConstants.LOCATION_RESULT_ACTION.equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
        } else {
            LocationServiceManager.sLocationDTO = (LocationDTO) extras.getParcelable(NaviConstants.LOCATION_RESULT_KEY_OBJ);
        }
    }
}
