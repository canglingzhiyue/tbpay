package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import tb.aal;
import tb.aeq;
import tb.dqj;
import tb.dqo;
import tb.dqs;
import tb.dqv;
import tb.kge;

/* loaded from: classes2.dex */
public final class dl extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f3090a;
    static final long b;
    static final dl c;
    static dl d;
    final Type e;
    final Class f;
    final Type g;
    final Type h;
    final boolean i;
    volatile bg j;
    volatile bg k;
    final byte[] l;
    final long m;
    final long n;
    final boolean o;
    final Field p;
    long q;
    final char[] r;
    final byte[] s;

    static {
        kge.a(-1572541360);
        f3090a = b.CC.a("JO10");
        b = com.alibaba.fastjson2.util.c.b("JO10");
        c = new dl(String.class, Object.class, JSONObject.class, JSONObject.class, 0L);
    }

    public dl(Type type, Type type2, Class cls, Type type3, long j) {
        this.q = -1L;
        this.g = type;
        this.h = type2;
        this.f = cls;
        this.e = type3;
        this.n = j;
        if (type2 == null) {
            this.i = true;
        } else {
            this.i = !du.d(TypeUtils.e(type2));
        }
        String a2 = TypeUtils.a(cls);
        String str = "\"@type\":\"" + cls.getName() + "\"";
        this.r = str.toCharArray();
        this.s = str.getBytes(StandardCharsets.UTF_8);
        this.o = "JO1".equals(a2);
        this.l = b.CC.a(a2);
        this.m = com.alibaba.fastjson2.util.c.b(a2);
        if (!this.o) {
            this.p = null;
            return;
        }
        this.p = BeanUtils.b(cls, "map");
        Field field = this.p;
        if (field == null) {
            return;
        }
        field.setAccessible(true);
        this.q = com.alibaba.fastjson2.util.e.UNSAFE.objectFieldOffset(this.p);
    }

    public static dl a() {
        if (d == null) {
            Class d2 = JSONFactory.d();
            d = d2 == null ? null : new dl(String.class, Object.class, d2, d2, 0L);
        }
        return d;
    }

    public static dl a(Class cls) {
        return cls == JSONObject.class ? c : cls == JSONFactory.d() ? a() : new dl(null, null, cls, cls, 0L);
    }

    public static dl a(Type type, Class cls) {
        Type type2;
        Type type3;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (actualTypeArguments.length == 2) {
                Type type4 = actualTypeArguments[0];
                type3 = actualTypeArguments[1];
                type2 = type4;
                return new dl(type2, type3, cls, type, 0L);
            }
        }
        type2 = null;
        type3 = null;
        return new dl(type2, type3, cls, type, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x025e, code lost:
        if (r19 == false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x016f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017b  */
    @Override // com.alibaba.fastjson2.writer.bg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.alibaba.fastjson2.JSONWriter r21, java.lang.Object r22, java.lang.Object r23, java.lang.reflect.Type r24, long r25) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.dl.a(com.alibaba.fastjson2.JSONWriter, java.lang.Object, java.lang.Object, java.lang.reflect.Type, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(com.alibaba.fastjson2.JSONWriter r32, java.lang.Object r33, java.lang.Object r34, java.lang.reflect.Type r35, long r36) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.dl.b(com.alibaba.fastjson2.JSONWriter, java.lang.Object, java.lang.Object, java.lang.reflect.Type, long):void");
    }

    public boolean b(JSONWriter jSONWriter) {
        if (jSONWriter.c) {
            jSONWriter.e(this.s);
            return true;
        }
        jSONWriter.a(this.r);
        return true;
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void c(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        jSONWriter.h();
        boolean b2 = jSONWriter.b();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                jSONWriter.d(str);
                Class<?> cls = value.getClass();
                if (cls == String.class) {
                    jSONWriter.d((String) value);
                } else {
                    jSONWriter.a((Class) cls).b(jSONWriter, value, str, this.h, this.n);
                }
            } else if (b2) {
                jSONWriter.d(str);
                jSONWriter.n();
            }
        }
        jSONWriter.i();
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        dqo dqoVar;
        aal aalVar;
        if (obj == null) {
            jSONWriter.n();
            return;
        }
        jSONWriter.h();
        Map map = (Map) obj;
        long e = j | jSONWriter.e();
        long j2 = 0;
        if ((JSONWriter.Feature.MapSortField.mask & e) != 0 && !(map instanceof SortedMap) && map.getClass() != LinkedHashMap.class) {
            map = new TreeMap(map);
        }
        JSONWriter.a aVar = jSONWriter.b;
        aeq p = aVar.p();
        if (p != null) {
            p.a(jSONWriter, obj);
        }
        dqs i = aVar.i();
        dqj j3 = aVar.j();
        dqv k = aVar.k();
        dqo n = aVar.n();
        aal o = aVar.o();
        boolean a2 = aVar.a(JSONWriter.Feature.WriteNulls.mask);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null || a2) {
                Object key = entry.getKey();
                String obj3 = key == null ? null : key.toString();
                if (i == null || i.a(jSONWriter, obj, obj3)) {
                    if (j3 != null) {
                        obj3 = j3.process(obj, obj3, value);
                    }
                    if (n == null || n.a(obj, obj3, value)) {
                        if (k != null) {
                            value = k.apply(obj, obj3, value);
                        }
                        Object obj4 = value;
                        if (obj4 == null) {
                            dqoVar = n;
                            aalVar = o;
                            if ((jSONWriter.c(e) & JSONWriter.Feature.WriteNulls.mask) == j2) {
                                n = dqoVar;
                                o = aalVar;
                            }
                        } else {
                            dqoVar = n;
                            aalVar = o;
                        }
                        jSONWriter.b(obj3);
                        jSONWriter.m();
                        if (obj4 == null) {
                            jSONWriter.n();
                            n = dqoVar;
                            o = aalVar;
                        } else {
                            jSONWriter.a((Class) obj4.getClass()).a(jSONWriter, obj4, obj2, type, this.n);
                            o = aalVar;
                            n = dqoVar;
                            j2 = 0;
                        }
                    }
                }
            }
        }
        aal aalVar2 = o;
        if (aalVar2 != null) {
            aalVar2.a(jSONWriter, obj);
        }
        jSONWriter.i();
    }
}
