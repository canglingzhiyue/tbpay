package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class crk extends crl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Integer f26472a;
    private String b;

    static {
        kge.a(-1707769832);
    }

    public final Integer a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("5e2c18f", new Object[]{this}) : this.f26472a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public crk(String str, Integer num, String str2) {
        super(str, -1);
        this.f26472a = num;
        this.b = str2;
    }
}
