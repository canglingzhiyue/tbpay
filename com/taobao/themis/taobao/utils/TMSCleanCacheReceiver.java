package com.taobao.themis.taobao.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.mug;

/* loaded from: classes9.dex */
public class TMSCleanCacheReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1210999879);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.themis.taobao.utils.TMSCleanCacheReceiver$1] */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null || intent.getAction() == null || !mug.ACTION_CLEAR_CACHE.equals(intent.getAction())) {
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: com.taobao.themis.taobao.utils.TMSCleanCacheReceiver.1
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
                    com.taobao.themis.kernel.metaInfo.appinfo.a.a().b();
                    return null;
                }
            }.execute(new Void[0]);
        }
    }
}
