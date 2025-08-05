package com.alibaba.security.ccrc.service.build;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* renamed from: com.alibaba.security.ccrc.service.build.ga  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1212ga implements InterfaceC1203da {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WVCallBackContext f3305a;
    public final /* synthetic */ C1215ha b;

    public C1212ga(C1215ha c1215ha, WVCallBackContext wVCallBackContext) {
        this.b = c1215ha;
        this.f3305a = wVCallBackContext;
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1203da
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        WVCallBackContext wVCallBackContext = this.f3305a;
        C1215ha c1215ha = this.b;
        wVCallBackContext.error(C1215ha.$ipChange);
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1203da
    public void onSuccess(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            return;
        }
        WVCallBackContext wVCallBackContext = this.f3305a;
        C1215ha c1215ha = this.b;
        wVCallBackContext.success(C1215ha.$ipChange);
    }
}
