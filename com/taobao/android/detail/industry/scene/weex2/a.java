package com.taobao.android.detail.industry.scene.weex2;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.tool.DIComponentProtocol;
import java.util.HashMap;
import tb.aqs;
import tb.bag;
import tb.bak;
import tb.emu;
import tb.etg;
import tb.kge;

@AURAExtensionImpl(code = "industryDetail.impl.component.weex2.lifecycle")
/* loaded from: classes4.dex */
public final class a implements bak {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AURAGlobalData f10114a;
    public q b;
    public f c;
    public aqs d;

    static {
        kge.a(-1744289700);
        kge.a(-1015441703);
    }

    @Override // tb.bak
    public void a(bag bagVar, AURARenderComponent aURARenderComponent, ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54023f99", new Object[]{this, bagVar, aURARenderComponent, viewGroup, new Integer(i)});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public a() {
        emu.a("com.taobao.android.detail.industry.scene.weex2.DIWeex2RenderStageExtensionImpl");
    }

    @Override // tb.bak
    public com.alibaba.android.aura.taobao.adapter.extension.weex2.model.a a(AURARenderComponent aURARenderComponent, ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.aura.taobao.adapter.extension.weex2.model.a) ipChange.ipc$dispatch("ca08bbab", new Object[]{this, aURARenderComponent, viewGroup, new Integer(i)});
        }
        DIComponentProtocol a2 = b.a(aURARenderComponent);
        if (a2 == null) {
            return null;
        }
        String a3 = b.a(a2, aURARenderComponent);
        JSONObject b = b.b(a2, aURARenderComponent);
        com.alibaba.android.aura.taobao.adapter.extension.weex2.model.a aVar = new com.alibaba.android.aura.taobao.adapter.extension.weex2.model.a(a3);
        aVar.a(b);
        HashMap hashMap = new HashMap();
        b.a(a2, aURARenderComponent, hashMap);
        aVar.a(hashMap);
        HashMap hashMap2 = new HashMap();
        b.b(a2, aURARenderComponent, hashMap2);
        aVar.b(hashMap2);
        aVar.a(b.a(a2, aURARenderComponent, viewGroup.getContext()));
        return aVar;
    }

    @Override // tb.bak
    public void a(bag bagVar, ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("965e3663", new Object[]{this, bagVar, viewGroup, view});
            return;
        }
        DIComponentProtocol a2 = b.a(bagVar.d());
        if (a2 == null) {
            return;
        }
        bagVar.a(new d(a2));
    }

    @Override // tb.bak
    public void a(bag bagVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15695d0", new Object[]{this, bagVar});
        } else if (b.a(bagVar.d()) == null) {
        } else {
            etg.a(new c(this.f10114a, this.b, this.c, this.d, bagVar), bagVar.c());
            com.taobao.android.detail.industry.tool.monitor.b a2 = com.taobao.android.detail.industry.tool.monitor.a.a(this.b.e(), bagVar.c());
            if (a2 == null) {
                return;
            }
            a2.b(bagVar.d(), bagVar.a());
        }
    }

    @Override // tb.bak
    public void a(bag bagVar, int i, String str, boolean z) {
        com.taobao.android.detail.industry.tool.monitor.b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d948037", new Object[]{this, bagVar, new Integer(i), str, new Boolean(z)});
        } else if (b.a(bagVar.d()) == null || (a2 = com.taobao.android.detail.industry.tool.monitor.a.a(this.b.e(), bagVar.c())) == null) {
        } else {
            a2.c(bagVar.d(), bagVar.a());
        }
    }

    @Override // tb.bak
    public boolean a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca7f23d7", new Object[]{this, aURARenderComponent})).booleanValue();
        }
        DIComponentProtocol a2 = b.a(aURARenderComponent);
        if (a2 != null) {
            return com.taobao.android.detail.industry.tool.b.b(a2.bizCode);
        }
        return false;
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        this.f10114a = aURAGlobalData;
        this.d = aqsVar;
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        this.b = qVar;
        this.c = fVar;
    }
}
