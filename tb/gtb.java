package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launch.turbo.profile.a;
import com.taobao.android.launch.turbo.profile.c;
import com.taobao.android.launch.turbo.profile.e;
import com.taobao.android.launch.turbo.profile.h;
import com.taobao.android.launch.turbo.profile.j;

/* loaded from: classes5.dex */
public class gtb implements gsx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(58267564);
        kge.a(-2112197540);
    }

    @Override // tb.gsx
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "LoadProfile";
    }

    @Override // tb.gsx
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce40c78", new Object[]{this, aVar});
            return;
        }
        j d = aVar.d();
        d.d();
        c c = aVar.c();
        d.a(c.f13013a, c.b);
        d.b(101);
        e a2 = h.a(aVar.e(), c.f13013a, c.b, Build.VERSION.SDK_INT);
        if (a2 == null || a2.a() <= 0) {
            aVar.a(new gsy(this, new Exception("profile load failed"))).f();
        } else {
            aVar.a(new gta(a2)).f();
        }
    }
}
