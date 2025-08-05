package com.taobao.android.linkback;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static List<e> f13302a = new CopyOnWriteArrayList();

    public static /* synthetic */ List a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[0]) : f13302a;
    }

    public static boolean a(Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7efd347", new Object[]{intent, context})).booleanValue();
        }
        if (intent == null || context == null) {
            return false;
        }
        if (intent.getData() == null) {
            TLog.loge("LinkBack", (String) null, "uri or context is null");
            return false;
        }
        return a(intent.getData(), context);
    }

    public static boolean a(Uri uri, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcb0ecd", new Object[]{uri, context})).booleanValue();
        }
        if (uri != null && context != null) {
            return new c(uri, context).a();
        }
        return false;
    }

    public static void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96e678f", new Object[]{eVar});
        } else if (eVar == null) {
        } else {
            f13302a.add(eVar);
        }
    }

    public static void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            i.b.a(new Runnable() { // from class: com.taobao.android.linkback.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    for (e eVar : f.a()) {
                        try {
                            eVar.a(str);
                        } catch (Throwable th) {
                            TLog.loge("LinkBack", "notifyUrlUpdateEvent error for some reason : ", th);
                        }
                    }
                }
            });
        }
    }
}
