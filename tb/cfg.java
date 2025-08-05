package tb;

import android.app.Activity;
import com.alibaba.ut.c;
import com.alibaba.ut.comm.JsBridge;
import com.alibaba.ut.comm.a;
import com.alibaba.ut.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;

/* loaded from: classes.dex */
public class cfg implements a.b, a.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        a.a().a((a.c) this);
        a.a().a((a.b) this);
    }

    @Override // com.alibaba.ut.comm.a.c
    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else if (activity instanceof c) {
        } else {
            cfi.a((String) null, "activity", activity);
            d a2 = cfj.a(activity);
            if (a2 == null) {
                return;
            }
            JsBridge.nativeToJs(a2, "Aplus4UT.onPageShow", null);
        }
    }

    @Override // com.alibaba.ut.comm.a.b
    public void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
        } else if (activity instanceof c) {
        } else {
            cfi.a((String) null, "activity", activity);
            d a2 = cfj.a(activity);
            if (a2 == null) {
                return;
            }
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(activity);
            JsBridge.nativeToJs(a2, "Aplus4UT.onPageHide", null);
        }
    }
}
