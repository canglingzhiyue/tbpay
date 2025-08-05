package com.alibaba.ut.page;

import android.app.Activity;
import com.alibaba.ut.comm.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.l;
import java.util.List;
import tb.cfh;
import tb.cfi;

/* loaded from: classes.dex */
public class a implements a.InterfaceC0160a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            com.alibaba.ut.comm.a.a().a(this);
        }
    }

    @Override // com.alibaba.ut.comm.a.InterfaceC0160a
    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        cfi.b(null, "activity", activity);
        List<VirtualPageObject> a2 = b.a(activity);
        if (a2.size() <= 0) {
            return;
        }
        for (VirtualPageObject virtualPageObject : a2) {
            try {
                l.getInstance().pageDestroyed(virtualPageObject);
            } catch (Throwable unused) {
            }
            cfh.d(virtualPageObject.b + "");
            b.a(virtualPageObject);
        }
    }
}
