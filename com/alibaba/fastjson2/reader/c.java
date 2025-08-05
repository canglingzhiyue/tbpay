package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
final class c<T> implements com.alibaba.fastjson2.function.d<Map<Long, Object>, T> {

    /* renamed from: a  reason: collision with root package name */
    final Method f2958a;
    final com.alibaba.fastjson2.function.d b;
    final com.alibaba.fastjson2.function.b c;
    final String[] d;
    final long[] e;

    static {
        kge.a(1268950136);
        kge.a(895087661);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Method method, String... strArr) {
        this.f2958a = method;
        Class<?>[] parameterTypes = method.getParameterTypes();
        this.d = new String[parameterTypes.length];
        this.e = new long[parameterTypes.length];
        int i = 0;
        while (true) {
            String str = null;
            if (i >= parameterTypes.length) {
                this.b = null;
                this.c = null;
                return;
            }
            str = i < strArr.length ? strArr[i] : str;
            if (str == null) {
                str = IWXUserTrackAdapter.MONITOR_ARG + i;
            }
            strArr[i] = str;
            this.e[i] = com.alibaba.fastjson2.util.c.b(str);
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.function.d
    /* renamed from: a */
    public T apply(Map<Long, Object> map) {
        if (this.b != null) {
            return (T) this.b.apply(map.get(Long.valueOf(this.e[0])));
        } else if (this.c != null) {
            return (T) this.c.a(map.get(Long.valueOf(this.e[0])), map.get(Long.valueOf(this.e[1])));
        } else {
            Object[] objArr = new Object[this.e.length];
            for (int i = 0; i < objArr.length; i++) {
                objArr[i] = map.get(Long.valueOf(this.e[i]));
            }
            try {
                return (T) this.f2958a.invoke(null, objArr);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                throw new JSONException("invoke factoryMethod error", e);
            }
        }
    }
}
