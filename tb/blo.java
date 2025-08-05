package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class blo extends blt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(834712875);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public boolean d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad401d7c", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return false;
    }
}
