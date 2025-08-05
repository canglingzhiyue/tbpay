package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.BeanUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import tb.aak;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ce<T> extends cb<T> {

    /* renamed from: a  reason: collision with root package name */
    static final long f2962a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;
    static final long g;
    final List<Constructor> h;
    final Constructor i;
    final Constructor j;
    final Constructor k;
    final Constructor l;
    final List<String[]> m;
    private final d n;

    static {
        kge.a(2028463747);
        f2962a = com.alibaba.fastjson2.util.c.b(JSON.DEFAULT_TYPE_KEY);
        b = com.alibaba.fastjson2.util.c.b("message");
        c = com.alibaba.fastjson2.util.c.b("detailMessage");
        d = com.alibaba.fastjson2.util.c.b("localizedMessage");
        e = com.alibaba.fastjson2.util.c.b("cause");
        f = com.alibaba.fastjson2.util.c.b("stackTrace");
        g = com.alibaba.fastjson2.util.c.b("suppressedExceptions");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ce(Class<T> cls, List<Constructor> list, d... dVarArr) {
        super(cls, null, cls.getName(), 0L, null, null, dVarArr);
        int i;
        String[] strArr;
        this.h = list;
        Iterator<Constructor> it = list.iterator();
        d dVar = null;
        Constructor constructor = null;
        Constructor constructor2 = null;
        Constructor constructor3 = null;
        Constructor constructor4 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Constructor next = it.next();
            if (next != null && constructor3 == null) {
                int length = next.getParameterTypes().length;
                if (length == 0) {
                    constructor = next;
                } else {
                    Class<?>[] parameterTypes = next.getParameterTypes();
                    Class<?> cls2 = parameterTypes[0];
                    if (length == 1) {
                        if (cls2 == String.class) {
                            constructor2 = next;
                        } else if (Throwable.class.isAssignableFrom(cls2)) {
                            constructor4 = next;
                        }
                    }
                    if (length == 2 && cls2 == String.class && Throwable.class.isAssignableFrom(parameterTypes[1])) {
                        constructor3 = next;
                    }
                }
            }
        }
        this.i = constructor;
        this.j = constructor2;
        this.k = constructor3;
        this.l = constructor4;
        Collections.sort(list, $$Lambda$ce$ger9gfup8yXbftGUhSJe15ut5yc.INSTANCE);
        this.m = new ArrayList(list.size());
        for (Constructor constructor5 : list) {
            Class<?>[] parameterTypes2 = constructor5.getParameterTypes();
            if (parameterTypes2.length > 0) {
                strArr = BeanUtils.a(constructor5);
                aak aakVar = new aak();
                Annotation[][] parameterAnnotations = constructor5.getParameterAnnotations();
                for (int i2 = 0; i2 < parameterTypes2.length && i2 < strArr.length; i2++) {
                    aakVar.b();
                    JSONFactory.defaultObjectReaderProvider.a(aakVar, cls, constructor5, i2, parameterAnnotations);
                    if (aakVar.f25184a != null) {
                        strArr[i2] = aakVar.f25184a;
                    }
                }
            } else {
                strArr = null;
            }
            this.m.add(strArr);
        }
        for (d dVar2 : dVarArr) {
            if ("stackTrace".equals(dVar2.b) && dVar2.c == StackTraceElement[].class) {
                dVar = dVar2;
            }
        }
        this.n = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(Constructor constructor, Constructor constructor2) {
        int length = constructor.getParameterTypes().length;
        int length2 = constructor2.getParameterTypes().length;
        if (length < length2) {
            return 1;
        }
        return length > length2 ? -1 : 0;
    }

    private Throwable a(String str, Throwable th) {
        try {
            if (this.k != null && th != null && str != null) {
                return (Throwable) this.k.newInstance(str, th);
            }
            if (this.j != null && str != null) {
                return (Throwable) this.j.newInstance(str);
            }
            if (this.l != null && th != null) {
                return (Throwable) this.l.newInstance(th);
            }
            if (this.k != null && (th != null || str != null)) {
                return (Throwable) this.k.newInstance(str, th);
            }
            if (this.i != null) {
                return (Throwable) this.i.newInstance(new Object[0]);
            }
            if (this.k != null) {
                return (Throwable) this.k.newInstance(str, th);
            }
            if (this.j != null) {
                return (Throwable) this.j.newInstance(str);
            }
            if (this.l == null) {
                return null;
            }
            return (Throwable) this.l.newInstance(th);
        } catch (Throwable th2) {
            throw new JSONException("create Exception error, class " + this.F.getName() + ", " + th2.getMessage(), th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0285  */
    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T a(com.alibaba.fastjson2.JSONReader r19, java.lang.reflect.Type r20, java.lang.Object r21, long r22) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ce.a(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public T b(JSONReader jSONReader, Type type, Object obj, long j) {
        bu buVar;
        if (jSONReader.c() == -110) {
            JSONReader.c cVar = jSONReader.f2934a;
            if (jSONReader.d(j) || cVar.a() != null) {
                jSONReader.D();
                bu a2 = cVar.a(jSONReader.F());
                if (a2 == null) {
                    String aG = jSONReader.aG();
                    bu a3 = cVar.a(aG, null);
                    if (a3 == null) {
                        throw new JSONException("auoType not support : " + aG + ", offset " + jSONReader.C());
                    }
                    buVar = a3;
                } else {
                    buVar = a2;
                }
                return (T) buVar.b(jSONReader, type, obj, 0L);
            }
        }
        return a(jSONReader, type, obj, j);
    }
}
