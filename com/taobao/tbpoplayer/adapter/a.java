package com.taobao.tbpoplayer.adapter;

import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.alibaba.poplayer.utils.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.AccsPopLayerService;
import tb.caa;
import tb.kge;
import tb.qnr;

/* loaded from: classes.dex */
public class a implements a.InterfaceC0119a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.tbpoplayer.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0918a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final a f22199a;

        static {
            kge.a(-505655980);
            f22199a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3e84a166", new Object[0]) : f22199a;
        }
    }

    static {
        kge.a(-302528895);
        kge.a(689615085);
    }

    public static a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("65d44868", new Object[0]) : C0918a.a();
    }

    @Override // com.alibaba.poplayer.utils.a.InterfaceC0119a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!qnr.a()) {
        } else {
            com.alibaba.poplayer.utils.c.c("sdkLifeCycle", "", "UCPFirstPageSwitchTrack.from=onFirstPageAndConfigReady.");
            caa.a(InternalTriggerController.d());
            com.alibaba.poplayer.utils.a.a().h();
        }
    }

    @Override // com.alibaba.poplayer.utils.a.InterfaceC0119a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!qnr.a()) {
        } else {
            AccsPopLayerService.a(PopLayer.getReference().getApp());
        }
    }
}
