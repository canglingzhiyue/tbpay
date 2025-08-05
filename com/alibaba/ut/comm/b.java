package com.alibaba.ut.comm;

import android.app.Activity;
import com.alibaba.ut.comm.a;
import com.alibaba.ut.d;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.cfi;
import tb.cfj;

/* loaded from: classes.dex */
public class b implements a.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static b f4226a = new b();
    private HashMap<String, Boolean> b = new HashMap<>();

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a654484b", new Object[0]) : f4226a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a.a().a(this);
        }
    }

    @Override // com.alibaba.ut.comm.a.c
    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        d a2 = cfj.a(activity);
        if (!this.b.containsKey(Integer.valueOf(activity.hashCode()))) {
            if (a2 != null) {
                a2.a(new JsBridge(a2), "UT4Aplus");
                cfi.b("hook success:", a2);
            } else {
                cfi.d(RPCDataItems.SWITCH_TAG_LOG, "cannot found webview");
            }
        }
        HashMap<String, Boolean> hashMap = this.b;
        hashMap.put(activity.hashCode() + "", true);
    }
}
