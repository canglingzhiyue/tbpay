package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexMethod;
import com.taobao.android.weex.WeexModule;
import com.taobao.android.weex_framework.bridge.MUSThreadStrategy;
import com.taobao.android.weex_framework.util.g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public class juz<T extends WeexModule> implements juv<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f29797a;
    private volatile Map<String, jus<T>> b;
    private volatile JSONArray c;

    static {
        kge.a(1014556675);
        kge.a(1648055765);
    }

    public juz(Class<T> cls) {
        this.f29797a = cls;
    }

    private void b() {
        Method[] methods;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        for (Method method : this.f29797a.getMethods()) {
            try {
                a(method, method.getDeclaredAnnotations(), hashMap);
            } catch (Exception e) {
                g.c("[MUSModuleManager] extractMethodNames:", e);
            }
        }
        this.b = hashMap;
    }

    private void a(Method method, Annotation[] annotationArr, Map<String, jus<T>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df25ec4", new Object[]{this, method, annotationArr, map});
        } else if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (annotation != null && (annotation instanceof WeexMethod)) {
                    WeexMethod weexMethod = (WeexMethod) annotation;
                    String alias = weexMethod.alias();
                    if (StringUtils.equals(weexMethod.alias(), "_")) {
                        alias = method.getName();
                    }
                    map.put(alias, new juu(method, weexMethod.uiThread() ? MUSThreadStrategy.UI : MUSThreadStrategy.JS));
                    return;
                }
            }
        }
    }

    @Override // tb.juv
    public T a(String str, WeexInstance weexInstance) throws Exception {
        return this.f29797a.getConstructor(new Class[0]).newInstance(new Object[0]);
    }

    @Override // tb.jut
    public JSONArray a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("dc1f20d6", new Object[]{this});
        }
        if (this.c != null) {
            return this.c;
        }
        if (this.b == null) {
            b();
        }
        Set<String> keySet = this.b.keySet();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.addAll(keySet);
            this.c = jSONArray;
            return jSONArray;
        } catch (Exception e) {
            g.a(e);
            return jSONArray;
        }
    }

    @Override // tb.jut
    public jus<T> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jus) ipChange.ipc$dispatch("7c71428c", new Object[]{this, str});
        }
        if (this.b == null) {
            b();
        }
        return this.b.get(str);
    }
}
