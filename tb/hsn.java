package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class hsn implements hso {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2009247106);
        kge.a(1510926954);
    }

    @Override // tb.hso
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            hsk.b(str, str2);
        }
    }

    @Override // tb.hso
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            hsk.c(str, str2);
        }
    }
}
