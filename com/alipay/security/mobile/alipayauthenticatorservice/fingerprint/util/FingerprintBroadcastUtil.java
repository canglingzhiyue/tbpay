package com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class FingerprintBroadcastUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BROADCAST_FINGERPRINTSENSOR_STATUS_ACTION = "com.alipay.security.mobile.alipayauthenticatorservice.broadcast.FINGERPRINTSENSOR_STATUS_ACTION";
    public static final String FINGERPRINTSENSOR_STATUS_VALUE = "com.alipay.security.mobile.alipayauthenticatorservice.broadcast.FINGERPRINTSENSOR_STATUS_VALUE";

    public static void sendIdentifyStatusChangeMessage(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35630653", new Object[]{context, new Integer(i)});
            return;
        }
        Intent intent = new Intent("com.alipay.security.mobile.alipayauthenticatorservice.broadcast.FINGERPRINTSENSOR_STATUS_ACTION");
        intent.putExtra("com.alipay.security.mobile.alipayauthenticatorservice.broadcast.FINGERPRINTSENSOR_STATUS_VALUE", i);
        intent.setPackage(context.getPackageName());
        context.sendBroadcast(intent);
    }

    public static IntentFilter getIdentifyChangeBroadcastFilter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntentFilter) ipChange.ipc$dispatch("2b5799cd", new Object[0]);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.alipay.security.mobile.alipayauthenticatorservice.broadcast.FINGERPRINTSENSOR_STATUS_ACTION");
        return intentFilter;
    }
}
