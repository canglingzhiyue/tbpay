package com.taobao.themis.kernel.ability.invoker.binder;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.TypeUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.basic.TMSLogger;
import tb.kge;

/* loaded from: classes9.dex */
public class d<T> implements b<BindingParam, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f22495a;

    static {
        kge.a(-1021345400);
        kge.a(411647513);
    }

    public d(JSONObject jSONObject) {
        this.f22495a = jSONObject;
    }

    @Override // com.taobao.themis.kernel.ability.invoker.binder.b
    public T a(Class<T> cls, BindingParam bindingParam) throws BindException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("1b7e4cf1", new Object[]{this, cls, bindingParam});
        }
        String[] name = bindingParam.value().length <= 0 ? bindingParam.name() : bindingParam.value();
        if (name.length <= 0) {
            throw new BindException("bind key is null");
        }
        String str = null;
        try {
            int length = name.length;
            Object obj = null;
            String str2 = null;
            for (int i = 0; i < length; i++) {
                try {
                    str2 = name[i];
                    if (this.f22495a != null && str2 != null && this.f22495a.containsKey(str2)) {
                        obj = this.f22495a.getObject(str2, cls);
                    }
                    if (obj != null) {
                        break;
                    }
                } catch (JSONException e) {
                    e = e;
                    str = str2;
                    TMSLogger.b("ParamBinder", "Binding targetType: " + cls + " with: " + this.f22495a + " key: " + str + " exception!", e);
                    throw new BindException(e.getMessage());
                }
            }
            if (obj == null) {
                if (bindingParam.required()) {
                    throw new BindException(name[0] + " param is missing!");
                } else if (cls.isPrimitive()) {
                    if (cls == Boolean.TYPE) {
                        return (T) TypeUtils.castToJavaBean(Boolean.valueOf(bindingParam.booleanDefault()), cls);
                    }
                    if (cls == Integer.TYPE) {
                        return (T) TypeUtils.castToJavaBean(Integer.valueOf(bindingParam.intDefault()), cls);
                    }
                    if (cls == Float.TYPE) {
                        return (T) TypeUtils.castToJavaBean(Float.valueOf(bindingParam.floatDefault()), cls);
                    }
                    if (cls == Double.TYPE) {
                        return (T) TypeUtils.castToJavaBean(Double.valueOf(bindingParam.doubleDefault()), cls);
                    }
                    if (cls == Long.TYPE) {
                        return (T) TypeUtils.castToJavaBean(Long.valueOf(bindingParam.longDefault()), cls);
                    }
                } else if (cls == String.class) {
                    obj = TypeUtils.castToJavaBean(bindingParam.stringDefault(), cls);
                }
            }
            return (T) obj;
        } catch (JSONException e2) {
            e = e2;
        }
    }
}
