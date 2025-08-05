package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public abstract class elf implements eld {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1447467367);
        kge.a(1225681591);
    }

    @Override // tb.eld
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.eld
    public void a(int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26196df8", new Object[]{this, new Integer(i), new Integer(i2), new Float(f)});
        }
    }
}
