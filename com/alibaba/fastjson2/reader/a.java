package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.aak;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a<T> implements com.alibaba.fastjson2.function.d<Map<Long, Object>, T> {

    /* renamed from: a  reason: collision with root package name */
    final Constructor f2949a;
    final int b;
    final com.alibaba.fastjson2.function.d c;
    final com.alibaba.fastjson2.function.b d;
    final Class[] e;
    final boolean f;
    final long[] g;
    Map<Set<Long>, Constructor> h;
    Map<Set<Long>, String[]> i;
    Map<Set<Long>, long[]> j;
    Map<Set<Long>, Type[]> k;

    static {
        kge.a(1761652840);
        kge.a(895087661);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(List<Constructor> list, Constructor constructor, com.alibaba.fastjson2.function.d dVar, com.alibaba.fastjson2.function.b bVar, Constructor constructor2, String... strArr) {
        this.f = constructor2 != null;
        this.c = dVar;
        this.d = bVar;
        this.f2949a = this.f ? constructor2 : constructor;
        this.b = this.f2949a.getParameterTypes().length;
        this.e = constructor.getParameterTypes();
        this.g = new long[this.e.length];
        int i = 0;
        while (i < this.e.length) {
            String str = i < strArr.length ? strArr[i] : null;
            if (str == null) {
                str = IWXUserTrackAdapter.MONITOR_ARG + i;
            }
            this.g[i] = com.alibaba.fastjson2.util.c.b(str);
            i++;
        }
        if (list != null) {
            this.h = new HashMap(list.size());
            this.i = new HashMap(list.size());
            this.k = new HashMap(list.size());
            this.j = new HashMap(list.size());
            for (int i2 = 0; i2 < list.size(); i2++) {
                Constructor constructor3 = list.get(i2);
                constructor3.setAccessible(true);
                String[] a2 = BeanUtils.a(constructor3);
                Class<?>[] parameterTypes = constructor3.getParameterTypes();
                aak aakVar = new aak();
                ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
                Annotation[][] parameterAnnotations = constructor3.getParameterAnnotations();
                int i3 = 0;
                while (i2 < parameterTypes.length && i3 < a2.length) {
                    aakVar.b();
                    int i4 = i3;
                    objectReaderProvider.a(aakVar, constructor3.getDeclaringClass(), constructor3, i3, parameterAnnotations);
                    if (aakVar.f25184a != null) {
                        a2[i4] = aakVar.f25184a;
                    }
                    i3 = i4 + 1;
                }
                long[] jArr = new long[a2.length];
                Type[] genericParameterTypes = constructor3.getGenericParameterTypes();
                HashSet hashSet = new HashSet(a2.length);
                for (int i5 = 0; i5 < a2.length; i5++) {
                    String str2 = a2[i5];
                    long b = str2 == null ? 0L : com.alibaba.fastjson2.util.c.b(str2);
                    jArr[i5] = b;
                    hashSet.add(Long.valueOf(b));
                }
                this.h.put(hashSet, constructor3);
                this.i.put(hashSet, a2);
                this.j.put(hashSet, jArr);
                this.k.put(hashSet, genericParameterTypes);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.function.d
    /* renamed from: a */
    public T apply(Map<Long, Object> map) {
        boolean z;
        Set<Long> keySet;
        Constructor constructor;
        int i = 0;
        int i2 = 0;
        while (true) {
            long[] jArr = this.g;
            if (i2 >= jArr.length) {
                z = true;
                break;
            } else if (!map.containsKey(Long.valueOf(jArr[i2]))) {
                z = false;
                break;
            } else {
                i2++;
            }
        }
        if (!z && this.h != null && (constructor = this.h.get((keySet = map.keySet()))) != null) {
            long[] jArr2 = this.j.get(keySet);
            Type[] typeArr = this.k.get(keySet);
            Object[] objArr = new Object[jArr2.length];
            while (i < jArr2.length) {
                Object obj = map.get(Long.valueOf(jArr2[i]));
                Type type = typeArr[i];
                if (obj == null) {
                    obj = TypeUtils.d(type);
                }
                objArr[i] = obj;
                i++;
            }
            try {
                return (T) constructor.newInstance(objArr);
            } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException e) {
                throw new JSONException("invoke constructor error, " + constructor, e);
            }
        } else if (this.c != null && this.e.length == 1) {
            Object obj2 = map.get(Long.valueOf(this.g[0]));
            Class cls = this.e[0];
            if (obj2 == null) {
                obj2 = TypeUtils.d((Type) cls);
            } else if (!cls.isInstance(obj2)) {
                obj2 = TypeUtils.a(obj2, (Class<Object>) cls, JSONFactory.defaultObjectReaderProvider);
            }
            return (T) this.c.apply(obj2);
        } else if (this.d != null && this.e.length == 2) {
            Object obj3 = map.get(Long.valueOf(this.g[0]));
            Class cls2 = this.e[0];
            if (obj3 == null) {
                obj3 = TypeUtils.d((Type) cls2);
            } else if (!cls2.isInstance(obj3)) {
                obj3 = TypeUtils.a(obj3, (Class<Object>) cls2, JSONFactory.defaultObjectReaderProvider);
            }
            Object obj4 = map.get(Long.valueOf(this.g[1]));
            Class cls3 = this.e[1];
            if (obj4 == null) {
                obj4 = TypeUtils.d((Type) cls3);
            } else if (!cls3.isInstance(obj4)) {
                obj4 = TypeUtils.a(obj4, (Class<Object>) cls3, JSONFactory.defaultObjectReaderProvider);
            }
            return (T) this.d.a(obj3, obj4);
        } else {
            int length = this.e.length;
            Object[] objArr2 = new Object[this.b];
            if (this.f) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    Object obj5 = map.get(Long.valueOf(this.g[i3]));
                    if (obj5 != null) {
                        objArr2[i3] = obj5;
                    } else {
                        i4 |= 1 << i3;
                        Class cls4 = this.e[i3];
                        if (cls4.isPrimitive()) {
                            objArr2[i3] = TypeUtils.d((Type) cls4);
                        }
                    }
                    int i5 = i3 + 1;
                    if (i5 % 32 == 0 || i5 == length) {
                        objArr2[(i3 / 32) + length] = Integer.valueOf(i4);
                        i4 = 0;
                    }
                    i3 = i5;
                }
            } else {
                while (i < length) {
                    Class cls5 = this.e[i];
                    Object obj6 = map.get(Long.valueOf(this.g[i]));
                    if (obj6 == null) {
                        obj6 = TypeUtils.d((Type) cls5);
                    } else if (!cls5.isInstance(obj6)) {
                        obj6 = TypeUtils.a(obj6, (Class<Object>) cls5, JSONFactory.defaultObjectReaderProvider);
                    } else if (Collection.class.isAssignableFrom(cls5) || Map.class.isAssignableFrom(cls5)) {
                        Type[] genericParameterTypes = this.f2949a.getGenericParameterTypes();
                        if (genericParameterTypes.length == this.e.length) {
                            obj6 = TypeUtils.a(obj6, genericParameterTypes[i]);
                        }
                    }
                    objArr2[i] = obj6;
                    i++;
                }
            }
            try {
                return (T) this.f2949a.newInstance(objArr2);
            } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException e2) {
                throw new JSONException("invoke constructor error, " + this.f2949a, e2);
            }
        }
    }
}
