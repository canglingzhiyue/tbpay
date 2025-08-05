package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.plugin.BaseWuKongContentRiskPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class U {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, BaseWuKongContentRiskPlugin> f3278a = new HashMap();

    public void a(BaseWuKongContentRiskPlugin baseWuKongContentRiskPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef3e04be", new Object[]{this, baseWuKongContentRiskPlugin});
        } else if (this.f3278a.containsKey(baseWuKongContentRiskPlugin.name())) {
        } else {
            this.f3278a.put(baseWuKongContentRiskPlugin.name(), baseWuKongContentRiskPlugin);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (BaseWuKongContentRiskPlugin baseWuKongContentRiskPlugin : this.f3278a.values()) {
            baseWuKongContentRiskPlugin.deactivate();
        }
    }

    public boolean a(String str, CcrcService.Config config, A a2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b36ab77a", new Object[]{this, str, config, a2})).booleanValue();
        }
        for (BaseWuKongContentRiskPlugin baseWuKongContentRiskPlugin : this.f3278a.values()) {
            if (!baseWuKongContentRiskPlugin.activate(str, config, a2)) {
                z = false;
            }
        }
        return z;
    }

    public void a(List<? extends BaseWuKongContentRiskPlugin> list, G g) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f6d020c", new Object[]{this, list, g});
            return;
        }
        for (BaseWuKongContentRiskPlugin baseWuKongContentRiskPlugin : list) {
            baseWuKongContentRiskPlugin.setAlgoWatcher(g);
            a(baseWuKongContentRiskPlugin);
        }
    }

    public Collection<BaseWuKongContentRiskPlugin> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("66d215f", new Object[]{this}) : this.f3278a.values();
    }
}
