package com.taobao.themis.kernel.ability.invoker.binder;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.annotation.BindingRequest;
import tb.kge;

/* loaded from: classes9.dex */
public class e<T> implements b<BindingRequest, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f22496a;

    static {
        kge.a(821680586);
        kge.a(411647513);
    }

    public e(JSONObject jSONObject) {
        this.f22496a = jSONObject;
    }

    @Override // com.taobao.themis.kernel.ability.invoker.binder.b
    public T a(Class<T> cls, BindingRequest bindingRequest) throws BindException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("f43c1b73", new Object[]{this, cls, bindingRequest});
        }
        JSONObject jSONObject = this.f22496a;
        if (jSONObject == null) {
            throw new BindException("input JSON is null");
        }
        try {
            return (T) JSON.toJavaObject(jSONObject, cls);
        } catch (Throwable th) {
            throw new BindException(th.getMessage());
        }
    }
}
