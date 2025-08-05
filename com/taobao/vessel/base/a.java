package com.taobao.vessel.base;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.bridge.JSCallback;
import tb.kge;

/* loaded from: classes9.dex */
public class a implements JSCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSCallback f23446a;
    private WVCallBackContext b;
    private com.taobao.vessel.local.a c;

    static {
        kge.a(533232058);
        kge.a(157966937);
    }

    @Override // com.taobao.weex.bridge.JSCallback
    public void invokeAndKeepAlive(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119a8ac", new Object[]{this, obj});
        }
    }

    public a(JSCallback jSCallback) {
        this.f23446a = jSCallback;
    }

    public a(WVCallBackContext wVCallBackContext) {
        this.b = wVCallBackContext;
    }

    public a(com.taobao.vessel.local.a aVar) {
        this.c = aVar;
    }

    @Override // com.taobao.weex.bridge.JSCallback
    public void invoke(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5411b1b", new Object[]{this, obj});
            return;
        }
        JSCallback jSCallback = this.f23446a;
        if (jSCallback != null) {
            jSCallback.invoke(obj);
        }
        WVCallBackContext wVCallBackContext = this.b;
        if (wVCallBackContext == null) {
            return;
        }
        wVCallBackContext.success(com.taobao.vessel.utils.b.a(obj));
    }
}
