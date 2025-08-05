package com.taobao.themis.kernel.ability.invoker.binder;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import tb.kge;

/* loaded from: classes9.dex */
public class a implements b<BindingApiContext, ApiContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ApiContext f22493a;

    static {
        kge.a(1681789422);
        kge.a(411647513);
    }

    public a(ApiContext apiContext) {
        this.f22493a = apiContext;
    }

    @Override // com.taobao.themis.kernel.ability.invoker.binder.b
    public ApiContext a(Class<ApiContext> cls, BindingApiContext bindingApiContext) throws BindException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApiContext) ipChange.ipc$dispatch("24c313c6", new Object[]{this, cls, bindingApiContext});
        }
        if (bindingApiContext.required() && this.f22493a == null) {
            throw new BindException("Required ApiContext but not inject!!!");
        }
        return this.f22493a;
    }
}
