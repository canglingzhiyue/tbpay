package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class beg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f25832a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;
    public static String g;
    public static String h;
    public static String i;

    static {
        kge.a(-1003895203);
        f25832a = "cartRefreshData";
        b = "cartInstanceId";
        c = "itemCountChanged";
        d = "itemCount";
        e = "cartBroadcastFrom";
        f = "fromCheck";
        g = "modalBuyCreateOrder";
        h = "updateBeforeRequest";
        i = "updateAfterResponse";
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null) {
        } else {
            Intent intent = new Intent(f25832a);
            intent.putExtra(b, context.hashCode());
            intent.putExtra(c, false);
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        }
    }

    public static void a(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f53e474", new Object[]{context, bundle});
        } else if (context == null) {
        } else {
            Intent intent = new Intent(f25832a);
            intent.putExtra(b, context.hashCode());
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        }
    }
}
