package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class dtk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f26964a;
    private String b;

    static {
        kge.a(-1360919407);
    }

    public static dtk a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dtk) ipChange.ipc$dispatch("f03daa3", new Object[0]) : new dtk(true, "");
    }

    public dtk(boolean z, String str) {
        this.f26964a = z;
        this.b = str;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f26964a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b;
    }
}
