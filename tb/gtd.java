package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launch.turbo.profile.a;
import com.taobao.android.launch.turbo.profile.j;

/* loaded from: classes.dex */
public class gtd implements gsx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1051664387);
        kge.a(-2112197540);
    }

    @Override // tb.gsx
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "PrerequisiteCheck";
    }

    @Override // tb.gsx
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce40c78", new Object[]{this, aVar});
            return;
        }
        j d = aVar.d();
        String str = aVar.c().f13013a;
        String a2 = d.a();
        int i = aVar.c().b;
        int b = d.b();
        if (StringUtils.isEmpty(str)) {
            aVar.a(new gsy(this, new IllegalArgumentException("parameters invalid"))).f();
        } else if (StringUtils.equals(str, a2) && i == b) {
            aVar.a(new gtc()).f();
        } else {
            aVar.a(new gtb()).f();
        }
    }
}
