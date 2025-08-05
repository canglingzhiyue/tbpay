package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class cgp implements cgq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1438357150);
        kge.a(607770874);
    }

    @Override // tb.cgq
    public void a(String str, String str2, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f39fc7", new Object[]{this, str, str2, obj, strArr});
        }
    }

    @Override // tb.cgq
    public void a(String str, String str2, String str3, String str4, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e010a68f", new Object[]{this, str, str2, str3, str4, strArr});
        }
    }

    @Override // tb.cgq
    public void a(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50031319", new Object[]{this, str, str2, str3, strArr});
        }
    }

    @Override // tb.cgq
    public void a(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("434e6e23", new Object[]{this, str, str2, strArr});
        }
    }

    @Override // tb.cgq
    public void b(String str, String str2, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef4f166", new Object[]{this, str, str2, obj, strArr});
        }
    }
}
