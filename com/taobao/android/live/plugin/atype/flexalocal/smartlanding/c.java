package com.taobao.android.live.plugin.atype.flexalocal.smartlanding;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.SmartLandingTask;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.MemoryLog;
import com.taobao.taolive.sdk.utils.q;
import java.util.List;
import tb.eoe;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f14016a;
    private String b;
    private MemoryLog c;
    private MemoryLog d;
    private com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.d e = null;
    private com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.b f = null;

    static {
        kge.a(-289588952);
        f14016a = c.class.getSimpleName();
    }

    public c(String str) {
        this.b = str;
        this.c = new MemoryLog(str);
        this.d = new MemoryLog(str);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.e == null) {
            this.e = new com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.d("taobao_live_ubee_global_persistent_log", this.b);
        }
        if (this.f != null) {
            return;
        }
        this.f = new com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.b("taobao_live_ubee_day_persistent_log", this.b);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.c.a();
        }
    }

    public com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.c a(SmartLandingTask smartLandingTask) {
        SmartLandingTask.ShowStrategy showStrategy;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.c) ipChange.ipc$dispatch("a5ec953f", new Object[]{this, smartLandingTask});
        }
        if (smartLandingTask == null || (showStrategy = smartLandingTask.showStrategy) == null) {
            return null;
        }
        if ("page".equals(showStrategy.life)) {
            return this.c;
        }
        if ("app".equals(showStrategy.life)) {
            return this.d;
        }
        if ("global".equals(showStrategy.life)) {
            return this.e;
        }
        if (!eoe.c.KEY_DAY.equals(showStrategy.life)) {
            return null;
        }
        return this.f;
    }

    public void a(List<SmartLandingTask> list) {
        com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null) {
            try {
                for (SmartLandingTask smartLandingTask : list) {
                    if (smartLandingTask != null && smartLandingTask.showStrategy != null && (a2 = a(smartLandingTask)) != null) {
                        a2.a(smartLandingTask);
                    }
                }
            } catch (Exception e) {
                q.a(f14016a, "initConfigWithShowStrategy exp", e);
            }
        }
    }
}
