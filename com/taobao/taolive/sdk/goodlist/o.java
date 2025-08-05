package com.taobao.taolive.sdk.goodlist;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_POP = "com.alibaba.poplayer.PopLayer.action.POP";
    public static final String EXTRA_KEY_EVENT = "event";
    public static final String EXTRA_KEY_PARAM = "param";

    static {
        kge.a(127106246);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (!d.e()) {
        } else {
            Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
            intent.putExtra("event", "poplayer://2020PushRecall");
            intent.putExtra("param", "poplayer://2020PushRecall");
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        }
    }
}
