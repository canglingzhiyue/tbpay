package com.taobao.android.detail.industry.scene.weex2;

import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.tool.DIConstants;
import com.uc.webview.export.media.MessageID;
import tb.aqs;
import tb.bag;
import tb.emu;
import tb.etf;
import tb.kge;

/* loaded from: classes4.dex */
public class c extends etf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public bag e;
    private boolean f;

    static {
        kge.a(438537865);
    }

    public c(AURAGlobalData aURAGlobalData, q qVar, f fVar, aqs aqsVar, bag bagVar) {
        super(aURAGlobalData, qVar, fVar, aqsVar);
        this.f = false;
        this.e = bagVar;
        emu.a("com.taobao.android.detail.industry.scene.weex2.DIWeexLifecycleHolder");
    }

    @Override // tb.etf
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f) {
        } else {
            com.taobao.android.detail.industry.tool.a.a("DIWeexLifecycleHolder", "onAppear");
            this.e.a(DIConstants.WEXX_EVENT_MODULE, DIConstants.EVENT_NAME_LIFE_CYCLE, "onAppear");
            this.f = true;
        }
    }

    @Override // tb.etf
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.f) {
        } else {
            com.taobao.android.detail.industry.tool.a.a("DIWeexLifecycleHolder", "onDisappear");
            this.e.a(DIConstants.WEXX_EVENT_MODULE, DIConstants.EVENT_NAME_LIFE_CYCLE, "onDisappear");
            this.f = false;
        }
    }

    @Override // tb.etf
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            com.taobao.android.detail.industry.tool.a.a("DIWeexLifecycleHolder", "onStart");
        }
    }

    @Override // tb.etf
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        com.taobao.android.detail.industry.tool.a.a("DIWeexLifecycleHolder", "onResume");
        this.e.a(DIConstants.WEXX_EVENT_MODULE, DIConstants.EVENT_NAME_LIFE_CYCLE, "onResume");
    }

    @Override // tb.etf
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.taobao.android.detail.industry.tool.a.a("DIWeexLifecycleHolder", "onPause");
        this.e.a(DIConstants.WEXX_EVENT_MODULE, DIConstants.EVENT_NAME_LIFE_CYCLE, "onPause");
    }

    @Override // tb.etf
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            com.taobao.android.detail.industry.tool.a.a("DIWeexLifecycleHolder", MessageID.onStop);
        }
    }
}
