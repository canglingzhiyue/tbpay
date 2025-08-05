package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class iso {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f29281a;
    public final int b;
    public final boolean c;

    static {
        kge.a(421284529);
    }

    private iso(int i, int i2, boolean z) {
        this.f29281a = i;
        this.b = i2;
        this.c = z;
    }

    public static iso a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iso) ipChange.ipc$dispatch("faa34ad9", new Object[]{new Integer(i), new Integer(i2)}) : new iso(i, i2, true);
    }

    public static iso b(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iso) ipChange.ipc$dispatch("dc811478", new Object[]{new Integer(i), new Integer(i2)}) : new iso(i, i2, false);
    }
}
