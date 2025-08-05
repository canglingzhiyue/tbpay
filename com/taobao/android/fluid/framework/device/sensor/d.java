package com.taobao.android.fluid.framework.device.sensor;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;
import tb.oec;
import tb.ohh;
import tb.sma;
import tb.spy;
import tb.spz;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ViberateHelper";

    static {
        kge.a(1990826025);
    }

    public static void a(sma smaVar, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7a92cfd", new Object[]{smaVar, context, new Boolean(z)});
            return;
        }
        ohh.b("viberate_state", Boolean.valueOf(z));
        spz.c(TAG, context + "setViberateState--" + z);
        if (smaVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enable", String.valueOf(z));
        smaVar.sendMessage(new spy("VSMSG_onVibrateSettingChange", "-1", hashMap));
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        boolean a2 = oec.a(ohh.b("viberate_state"), false);
        spz.c(TAG, context + "isViberate--" + a2);
        return a2;
    }
}
