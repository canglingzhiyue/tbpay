package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class fwz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f28177a;

    static {
        kge.a(1227084060);
    }

    public boolean a(String str, int i, fwr fwrVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb098524", new Object[]{this, str, new Integer(i), fwrVar})).booleanValue();
        }
        if (!fwrVar.b(i)) {
            Log.e("UiCodeLoader_TMTEST", "seekBy error:" + i);
        } else {
            z = true;
        }
        this.f28177a = fwrVar.b();
        return z;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f28177a;
    }
}
