package com.taobao.android.detail.industry.tool.monitor;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.tool.DIComponentProtocol;
import com.taobao.android.detail.industry.tool.monitor.DIMonitorUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.emf;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Boolean f10125a = null;
    public String b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    private DIComponentProtocol h;
    private List<com.alibaba.android.aura.b> i;
    private String j;

    static {
        kge.a(333522418);
    }

    public c(q qVar) {
        if (qVar != null && qVar.e() != null) {
            this.j = emf.a(qVar.e());
        }
        emu.a("com.taobao.android.detail.industry.tool.monitor.DIComponetMonitor");
    }

    public void a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
            return;
        }
        this.h = new DIComponentProtocol(aURARenderComponent);
        this.f10125a = Boolean.valueOf(this.h.isIndustryComponent());
    }

    public void a(com.alibaba.android.aura.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
            return;
        }
        if (this.i == null) {
            this.i = new ArrayList();
        }
        Boolean bool = this.f10125a;
        if (bool == null) {
            this.i.add(bVar);
        } else if (!bool.booleanValue()) {
        } else {
            b(bVar);
        }
    }

    public void b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ed2032", new Object[]{this, aURARenderComponent});
            return;
        }
        a(aURARenderComponent);
        Boolean bool = this.f10125a;
        if (bool == null || !bool.booleanValue()) {
            List<com.alibaba.android.aura.b> list = this.i;
            if (list == null) {
                return;
            }
            list.clear();
            return;
        }
        List<com.alibaba.android.aura.b> list2 = this.i;
        if (list2 == null || list2.size() == 0) {
            return;
        }
        for (com.alibaba.android.aura.b bVar : this.i) {
            b(bVar);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Boolean bool = this.f10125a;
        if (bool == null || !bool.booleanValue()) {
            List<com.alibaba.android.aura.b> list = this.i;
            if (list == null) {
                return;
            }
            list.clear();
            return;
        }
        a(DIMonitorUtil.StageType.STAGE_SYNC_RENDER, this.f - this.e);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            a(DIMonitorUtil.StageType.STAGE_ASYNC_RENDER, this.g - this.e);
        }
    }

    private void b(com.alibaba.android.aura.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3ecd81", new Object[]{this, bVar});
            return;
        }
        String a2 = bVar.a();
        String b = bVar.b();
        HashMap hashMap = new HashMap();
        Map<String, Object> c = bVar.c();
        if (c != null) {
            for (Map.Entry<String, Object> entry : c.entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        DIComponentProtocol dIComponentProtocol = this.h;
        if (dIComponentProtocol != null) {
            hashMap.put("industryCode", dIComponentProtocol.industryCode);
            hashMap.put("subBizCode", this.h.bizCode);
            hashMap.put("componentKey", this.h.componentKey);
        }
        if (!TextUtils.isEmpty(this.j)) {
            hashMap.put("itemId", this.j);
        }
        DIMonitorUtil.a(hashMap.toString(), a2, b);
    }

    private void a(DIMonitorUtil.StageType stageType, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f61c8a", new Object[]{this, stageType, new Double(d)});
            return;
        }
        DIComponentProtocol dIComponentProtocol = this.h;
        if (dIComponentProtocol == null) {
            return;
        }
        DIMonitorUtil.a(dIComponentProtocol.bizCode, this.h.componentKey, stageType.getValue(), d);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.f10125a;
        return bool != null && bool.booleanValue();
    }
}
