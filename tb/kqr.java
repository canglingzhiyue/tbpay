package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.taolive.sdk.utils.m;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public class kqr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;

    /* renamed from: a  reason: collision with root package name */
    private static kqr f30239a;
    private WeakReference<soe> b;

    static {
        kge.a(649858359);
        TAG = kqr.class.getSimpleName();
    }

    public static kqr a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqr) ipChange.ipc$dispatch("f06fed2", new Object[0]);
        }
        if (f30239a == null) {
            f30239a = new kqr();
        }
        return f30239a;
    }

    public void a(soe soeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff1d58af", new Object[]{this, soeVar});
            return;
        }
        a("markWarmUp liveRoomWarmManager = " + soeVar);
        this.b = new WeakReference<>(soeVar);
    }

    public soe b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (soe) ipChange.ipc$dispatch("16bc3e14", new Object[]{this});
        }
        WeakReference<soe> weakReference = this.b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void b(soe soeVar) {
        soe soeVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda05f30", new Object[]{this, soeVar});
            return;
        }
        a(a.ATOM_EXT_clear);
        WeakReference<soe> weakReference = this.b;
        if (weakReference == null || (soeVar2 = weakReference.get()) == null || soeVar2 != soeVar) {
            return;
        }
        this.b.clear();
        this.b = null;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            m.a(TAG, str);
        }
    }
}
