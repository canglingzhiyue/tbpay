package com.taobao.share.core.share.interceptor;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes8.dex */
public class f extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-664945747);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.share.core.share.interceptor.c
    public void a(ArrayList<String> arrayList, TBShareContent tBShareContent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b62ec75", new Object[]{this, arrayList, tBShareContent, str});
            return;
        }
        com.taobao.android.share.resource.a a2 = com.taobao.android.share.resource.a.a();
        a2.a(com.taobao.android.share.resource.a.KEY_SHAREPANELSTATERESETPROCESSORSTART);
        WeakReference<Activity> i = com.taobao.share.globalmodel.e.b().i();
        if (i != null) {
            if (!a(com.taobao.share.copy.a.a().e(), i)) {
                com.taobao.share.globalmodel.e.b().b(false);
            }
        } else {
            com.taobao.share.globalmodel.e.b().b(false);
        }
        a2.a(com.taobao.android.share.resource.a.KEY_SHAREPANELSTATERESETPROCESSOREND);
    }

    private boolean a(WeakReference<Activity> weakReference, WeakReference<Activity> weakReference2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("931c72c", new Object[]{this, weakReference, weakReference2})).booleanValue() : (weakReference == null || weakReference2 == null || weakReference2.get() != weakReference.get()) ? false : true;
    }
}
