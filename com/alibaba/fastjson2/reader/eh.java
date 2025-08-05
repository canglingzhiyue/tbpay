package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.bu;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class eh<I, T> implements bu<T> {

    /* renamed from: a  reason: collision with root package name */
    final Type f3013a;
    final Class<I> b;
    final long c;
    final Constructor<T> d;
    final Method e;
    final com.alibaba.fastjson2.function.d<I, T> f;
    final Object g;
    bu h;

    static {
        kge.a(226011493);
        kge.a(438295340);
    }

    public eh(Class<T> cls, Type type, Class<I> cls2, long j, String str, Object obj, Constructor<T> constructor, Method method, com.alibaba.fastjson2.function.d<I, T> dVar) {
        Object obj2;
        this.f3013a = type;
        this.b = cls2;
        this.c = j;
        this.d = constructor;
        this.e = method;
        this.f = dVar;
        if (method != null) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 2) {
                obj2 = Array.newInstance(parameterTypes[1].getComponentType(), 0);
                this.g = obj2;
            }
        }
        obj2 = null;
        this.g = obj2;
    }

    public static <I, T> eh<I, T> a(Class<T> cls, Class<I> cls2, com.alibaba.fastjson2.function.d<I, T> dVar) {
        return new eh<>(cls, cls2, cls2, 0L, null, null, null, null, dVar);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ bu a(JSONReader.c cVar, long j) {
        bu a2;
        a2 = cVar.a(j);
        return a2;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ bu a(ObjectReaderProvider objectReaderProvider, long j) {
        bu a2;
        a2 = objectReaderProvider.a(j);
        return a2;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ d a(String str) {
        return bu.CC.$default$a(this, str);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(long j) {
        return (T) bu.CC.$default$a(this, j);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(JSONReader jSONReader) {
        Object a2;
        a2 = a(jSONReader, (Type) null, (Object) null, c());
        return (T) a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.reader.bu
    public T a(JSONReader jSONReader, Type type, Object obj, long j) {
        if (this.h == null) {
            this.h = jSONReader.a(this.f3013a);
        }
        Object a2 = this.h.a(jSONReader, type, obj, j | this.c);
        if (a2 == null) {
            return null;
        }
        com.alibaba.fastjson2.function.d<I, T> dVar = this.f;
        if (dVar != 0) {
            try {
                return (T) dVar.apply(a2);
            } catch (Exception e) {
                throw new JSONException(jSONReader.d("create object error"), e);
            }
        }
        Constructor<T> constructor = this.d;
        if (constructor != null) {
            try {
                return constructor.newInstance(a2);
            } catch (Exception e2) {
                throw new JSONException(jSONReader.d("create object error"), e2);
            }
        }
        Method method = this.e;
        if (method == null) {
            throw new JSONException(jSONReader.d("create object error"));
        }
        try {
            jSONReader = this.g != null ? (T) method.invoke(null, a2, this.g) : (T) method.invoke(null, a2);
            return (T) jSONReader;
        } catch (Exception e3) {
            throw new JSONException(jSONReader.d("create object error"), e3);
        }
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(Map map, long j) {
        return (T) bu.CC.$default$a(this, map, j);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(Map map, JSONReader.Feature... featureArr) {
        return (T) bu.CC.$default$a(this, map, featureArr);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ void a(Object obj, String str, Object obj2, long j) {
        bu.CC.$default$a(this, obj, str, obj2, j);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ d b(long j) {
        return bu.CC.$default$b(this, j);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T b() {
        Object a2;
        a2 = a(0L);
        return (T) a2;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public T b(JSONReader jSONReader, Type type, Object obj, long j) {
        return a(jSONReader, type, obj, j);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T b(Collection collection) {
        return (T) bu.CC.$default$b(this, collection);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ Class<T> bm_() {
        return bu.CC.$default$bm_(this);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ long c() {
        return bu.CC.$default$c(this);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ d c(long j) {
        return bu.CC.$default$c(this, j);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T c(JSONReader jSONReader, Type type, Object obj, long j) {
        return (T) bu.CC.$default$c(this, jSONReader, type, obj, j);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T d(JSONReader jSONReader, Type type, Object obj, long j) {
        return (T) bu.CC.$default$d(this, jSONReader, type, obj, j);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ String d() {
        String str;
        str = JSON.DEFAULT_TYPE_KEY;
        return str;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ long e() {
        long j;
        j = bu.HASH_TYPE;
        return j;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ com.alibaba.fastjson2.function.d f() {
        return bu.CC.$default$f(this);
    }
}
