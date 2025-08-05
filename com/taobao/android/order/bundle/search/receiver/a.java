package com.taobao.android.order.bundle.search.receiver;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.helper.b;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HISTORY_KEY_CHANGE = 2;

    /* renamed from: a  reason: collision with root package name */
    public static String f14571a;
    public static String b;

    static {
        kge.a(-731011156);
        f14571a = "historyKeyChange";
        b = "inputSearchKey";
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null) {
        } else {
            Intent intent = new Intent();
            intent.setAction(b.ORDER_ACTION);
            intent.putExtra(f14571a, true);
            context.sendBroadcast(intent);
        }
    }
}
