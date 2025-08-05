package com.taobao.themis.kernel.ability.invoker.binder;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import tb.kge;
import tb.qox;
import tb.qoz;

/* loaded from: classes9.dex */
public class c implements b<BindingCallback, BridgeCallback> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public qox f22494a;

    static {
        kge.a(-1675336770);
        kge.a(411647513);
    }

    public c(qox qoxVar) {
        this.f22494a = qoxVar;
    }

    @Override // com.taobao.themis.kernel.ability.invoker.binder.b
    public BridgeCallback a(Class<BridgeCallback> cls, BindingCallback bindingCallback) throws BindException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BridgeCallback) ipChange.ipc$dispatch("817c1249", new Object[]{this, cls, bindingCallback}) : new qoz(this.f22494a, bindingCallback.isSticky());
    }
}
