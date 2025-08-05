package com.taobao.infoflow.taobao.subservice.biz.pop.lifecycle;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.kyu;
import tb.ldf;
import tb.lko;

/* loaded from: classes7.dex */
public class a implements lko {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private kyu f17500a;

    static {
        kge.a(-770622666);
        kge.a(-1757839544);
    }

    public a(kyu kyuVar) {
        this.f17500a = kyuVar;
    }

    @Override // tb.lko
    public void onAppToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
            return;
        }
        ldf.d("PopAppLifecycleListener", "onAppToBackground");
        kyu kyuVar = this.f17500a;
        if (kyuVar == null) {
            return;
        }
        kyuVar.c().j();
    }

    @Override // tb.lko
    public void onAppToFront() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c238d3", new Object[]{this});
            return;
        }
        ldf.d("PopAppLifecycleListener", "onAppToFront");
        kyu kyuVar = this.f17500a;
        if (kyuVar == null) {
            return;
        }
        kyuVar.c().k();
    }
}
