package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.pha.core.h;
import com.taobao.pha.core.manifest.e;
import com.taobao.pha.core.p;
import java.util.Map;

/* loaded from: classes.dex */
public class neg extends h.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1777351150);
        OrangeConfig.getInstance().registerListener(new String[]{"pha_tab_config"}, new d() { // from class: tb.neg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str, Map<String, String> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                } else {
                    p.c().a();
                }
            }
        }, true);
    }

    @Override // com.taobao.pha.core.h.a, com.taobao.pha.core.h
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!p.d() || !b()) {
        } else {
            e.a().b();
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : ngt.a(p.e());
    }

    @Override // com.taobao.pha.core.h.a, com.taobao.pha.core.h
    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : OrangeConfig.getInstance().getConfig("pha_tab_config", str, "");
    }
}
