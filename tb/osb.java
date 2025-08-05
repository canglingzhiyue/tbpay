package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public abstract class osb implements osc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean b = false;

    static {
        kge.a(473856112);
        kge.a(-1935612209);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }
}
