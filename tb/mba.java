package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class mba implements koc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(107511241);
        kge.a(-1704456220);
    }

    @Override // tb.koc
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            gvj.a(str, str2);
        }
    }

    @Override // tb.koc
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            gvj.b(str, str2);
        }
    }
}
