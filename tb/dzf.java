package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.b;
import com.taobao.android.detail.core.utils.n;
import tb.ego;

/* loaded from: classes4.dex */
public class dzf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1013718166);
        emu.a("com.taobao.android.detail.core.detail.kit.profile.AlertMonitor");
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            n.a(new ego.a().a("LoadChaoShi").b("80007").d("3").e(str2).f(epo.f()).g(b.b).a());
        }
    }
}
