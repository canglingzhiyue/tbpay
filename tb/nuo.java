package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public abstract class nuo extends irv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1552999399);
    }

    public final int a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d16211b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).intValue();
        }
        if (i3 <= i && i4 >= i2) {
            return i2 - i;
        }
        if (i3 >= i && i4 <= i2) {
            return i4 - i3;
        }
        if (i3 >= i) {
            return i2 - i3;
        }
        if (i4 > i2) {
            return 0;
        }
        return i4 - i;
    }

    @Override // tb.irv
    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue();
        }
        return 0.75f;
    }
}
