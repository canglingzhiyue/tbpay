package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class Ga {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Ga> f3241a = new HashMap();
    public final Map<String, BaseActionPerform> b = new HashMap();
    public final Ha c = new Ha();

    public Ga(String str) {
        b(str);
    }

    private synchronized void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            f3241a.put(str, this);
        }
    }

    public void a(BaseActionPerform baseActionPerform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd4f11f6", new Object[]{this, baseActionPerform});
            return;
        }
        if (!this.b.containsKey(baseActionPerform.actionPerformCode())) {
            this.b.put(baseActionPerform.actionPerformCode(), baseActionPerform);
        }
        this.c.a(baseActionPerform.actionPerformCode());
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (BaseActionPerform baseActionPerform : this.b.values()) {
            baseActionPerform.release();
        }
    }

    public static synchronized Ga a(String str) {
        synchronized (Ga.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Ga) ipChange.ipc$dispatch("69eb01ce", new Object[]{str});
            }
            return f3241a.get(str);
        }
    }

    public Collection<BaseActionPerform> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("66d215f", new Object[]{this}) : this.b.values();
    }

    public void a(String str, CcrcService.Config config, B b, Mb mb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f162fde4", new Object[]{this, str, config, b, mb});
            return;
        }
        for (BaseActionPerform baseActionPerform : this.b.values()) {
            baseActionPerform.activate(str, config, b, mb);
        }
    }
}
