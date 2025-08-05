package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.u;

/* loaded from: classes.dex */
public class fqj implements fql {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private fql f28128a = u.c();

    static {
        kge.a(1035916126);
        kge.a(905099060);
    }

    @Override // tb.fql
    public String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3});
        }
        fql fqlVar = this.f28128a;
        if (fqlVar == null) {
            return str3;
        }
        String a2 = fqlVar.a(str, str2, str3);
        if (bx.i()) {
            fuw.f("DXOrange key: " + str2 + " value： " + a2);
        }
        fxk.a(str, str2, a2);
        return a2;
    }

    @Override // tb.fql
    public void a(String[] strArr, fqk fqkVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2812f18d", new Object[]{this, strArr, fqkVar, new Boolean(z)});
            return;
        }
        fql fqlVar = this.f28128a;
        if (fqlVar == null) {
            return;
        }
        fqlVar.a(strArr, fqkVar, z);
    }
}
