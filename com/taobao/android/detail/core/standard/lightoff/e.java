package com.taobao.android.detail.core.standard.lightoff;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aqs;
import tb.arc;
import tb.arp;
import tb.elq;
import tb.elr;
import tb.emu;
import tb.kge;

@AURAExtensionImpl(code = "alidetail.impl.aspect.lifecycle.preloadLightOff")
/* loaded from: classes4.dex */
public final class e implements arp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f9839a;
    private elq b;

    static {
        kge.a(-24245920);
        kge.a(-1795775593);
    }

    @Override // tb.arp
    public void afterServiceExecute(com.alibaba.android.aura.datamodel.c cVar, com.alibaba.android.aura.datamodel.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2b82a1", new Object[]{this, cVar, aVar, new Boolean(z)});
        }
    }

    @Override // tb.arp
    public void beforeFlowExecute(AURAInputData aURAInputData, com.alibaba.android.aura.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f04d21", new Object[]{this, aURAInputData, aVar});
        }
    }

    @Override // tb.arp
    public void beforeServiceExecute(AURAInputData aURAInputData, com.alibaba.android.aura.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea679858", new Object[]{this, aURAInputData, aVar});
        }
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public e() {
        emu.a("com.taobao.android.detail.core.standard.lightoff.PicGalleryLightOffPreloadExtension");
    }

    @Override // tb.arp
    public void afterFlowExecute(com.alibaba.android.aura.datamodel.c cVar, com.alibaba.android.aura.datamodel.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6cdb92", new Object[]{this, cVar, aVar, new Boolean(z)});
        } else if (z) {
            arc.a().c("PicGalleryLightOffPreloadExtension", "afterFlowExecute", "error,no need to preload light off view");
        } else {
            elq elqVar = this.b;
            if (elqVar == null) {
                arc.a().c("PicGalleryLightOffPreloadExtension", "afterFlowExecute", "mPicGalleryAuraPresenter is null");
                return;
            }
            a i = elqVar.i();
            if (i == null) {
                arc.a().c("PicGalleryLightOffPreloadExtension", "afterFlowExecute", "picGalleryLightOffManager is null");
            } else {
                i.a();
            }
        }
    }

    @Override // tb.arl
    public void onCreate(q qVar, com.alibaba.android.aura.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        this.f9839a = (String) qVar.a("token", String.class);
        this.b = elr.a(this.f9839a);
    }
}
