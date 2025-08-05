package com.taobao.share.wvapi.servicebrige;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.service.Services;
import com.taobao.share.aidl.ISharePassword;
import tb.kge;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SharePassword";

    static {
        kge.a(-1201777884);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.share.wvapi.servicebrige.c$1] */
    public static boolean a(final Context context, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18de978", new Object[]{context, str, str2})).booleanValue();
        }
        if (context == null || !(context instanceof Activity)) {
            return false;
        }
        new AsyncTask<Void, Void, Void>() { // from class: com.taobao.share.wvapi.servicebrige.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
            @Override // android.os.AsyncTask
            public /* synthetic */ Void doInBackground(Void[] voidArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
            }

            public Void a(Void... voidArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                }
                try {
                    ISharePassword iSharePassword = (ISharePassword) Services.get(context, ISharePassword.class);
                    if (iSharePassword == null) {
                        return null;
                    }
                    iSharePassword.putPassworToHistory(str, str2);
                    return null;
                } finally {
                }
            }
        }.execute(new Void[0]);
        return true;
    }
}
