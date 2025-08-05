package com.taobao.android.weex_framework.module;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.bridge.MUSThreadStrategy;
import com.taobao.android.weex_framework.bridge.d;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.weex_framework.util.g;
import com.taobao.media.MediaConstant;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes.dex */
public class c<T extends MUSModule> implements b<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f16062a;
    private volatile Map<String, com.taobao.android.weex_framework.bridge.c<T>> b;

    static {
        kge.a(-540488987);
        kge.a(744458807);
    }

    public c(Class<T> cls) {
        this.f16062a = cls;
    }

    private void b() {
        Method[] methods;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        for (Method method : this.f16062a.getMethods()) {
            try {
                a(method, method.getDeclaredAnnotations(), hashMap);
            } catch (Exception e) {
                g.c("[MUSModuleManager] extractMethodNames:", e);
            }
        }
        this.b = hashMap;
    }

    private void a(Method method, Annotation[] annotationArr, Map<String, com.taobao.android.weex_framework.bridge.c<T>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df25ec4", new Object[]{this, method, annotationArr, map});
        } else if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (annotation != null && (annotation instanceof MUSMethod)) {
                    MUSMethod mUSMethod = (MUSMethod) annotation;
                    String alias = mUSMethod.alias();
                    if (TextUtils.equals(mUSMethod.alias(), "_")) {
                        alias = method.getName();
                    }
                    map.put(alias, new d(method, mUSMethod.uiThread() ? MUSThreadStrategy.UI : MUSThreadStrategy.JS));
                    return;
                }
            }
        }
    }

    @Override // com.taobao.android.weex_framework.module.b
    public T a(String str, MUSDKInstance mUSDKInstance) throws Exception {
        return this.f16062a.getConstructor(String.class, MUSDKInstance.class).newInstance(str, mUSDKInstance);
    }

    @Override // com.taobao.android.weex_framework.bridge.a
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (this.b == null) {
            b();
        }
        Set<String> keySet = this.b.keySet();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.addAll(keySet);
            return jSONArray.toJSONString();
        } catch (Exception e) {
            g.a(e);
            return MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
    }

    @Override // com.taobao.android.weex_framework.bridge.a
    public com.taobao.android.weex_framework.bridge.c<T> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.bridge.c) ipChange.ipc$dispatch("cf141d1a", new Object[]{this, str});
        }
        if (this.b == null) {
            b();
        }
        return this.b.get(str);
    }
}
