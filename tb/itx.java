package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class itx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f29316a;
    public final String b;
    public boolean c;

    static {
        kge.a(661353598);
    }

    public itx(String str) {
        this.b = str;
        this.f29316a = null;
    }

    public itx(byte[] bArr) {
        this.b = null;
        this.f29316a = bArr;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b != null;
    }
}
