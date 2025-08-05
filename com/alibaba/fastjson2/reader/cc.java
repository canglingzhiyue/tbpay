package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.Supplier;
import com.alibaba.fastjson2.reader.bu;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import tb.aev;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class cc<T> implements bu<T> {
    protected final Class F;
    protected final Supplier<T> G;
    protected final com.alibaba.fastjson2.function.d H;
    protected final long I;
    private String J;
    private long K;
    protected d L;
    protected boolean M;
    protected final boolean N;
    protected JSONReader.a O;

    static {
        kge.a(54914300);
        kge.a(438295340);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cc(Class cls, Supplier<T> supplier, String str, long j, com.alibaba.fastjson2.function.d dVar) {
        this.F = cls;
        this.G = supplier;
        this.H = dVar;
        this.I = j;
        this.J = str;
        this.K = str != null ? com.alibaba.fastjson2.util.c.b(str) : 0L;
        this.N = cls != null && Serializable.class.isAssignableFrom(cls);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ bu a(JSONReader.c cVar, long j) {
        bu a2;
        a2 = cVar.a(j);
        return a2;
    }

    public final bu a(JSONReader jSONReader, Class cls, long j) {
        if (jSONReader.S()) {
            long F = jSONReader.F();
            JSONReader.c cVar = jSONReader.f2934a;
            long a2 = jSONReader.a(this.I | j);
            JSONReader.a a3 = cVar.a();
            if (a3 != null) {
                Class<?> a4 = a3.a(F, cls, j);
                if (a4 == null) {
                    String aG = jSONReader.aG();
                    Class<?> a5 = a3.a(aG, cls, j);
                    if (a5 == null || cls.isAssignableFrom(a5)) {
                        a4 = a5;
                    } else if ((jSONReader.a(j) & JSONReader.Feature.IgnoreAutoTypeNotMatch.mask) == 0) {
                        throw new JSONException("type not match. " + aG + " -> " + cls.getName());
                    } else {
                        a4 = cls;
                    }
                }
                return cVar.a(a4);
            }
            bu a6 = jSONReader.a(F, cls, j);
            if (a6 == null) {
                throw new JSONException(jSONReader.d("auotype not support"));
            }
            Class<?> bm_ = a6.bm_();
            if (cls == null || bm_ == null || cls.isAssignableFrom(bm_)) {
                if (F == g()) {
                    return this;
                }
                if ((JSONReader.Feature.SupportAutoType.mask & a2) != 0) {
                    return a6;
                }
                return null;
            } else if ((JSONReader.Feature.IgnoreAutoTypeNotMatch.mask & a2) != 0) {
                return cVar.a(cls);
            } else {
                throw new JSONException("type not match. " + this.J + " -> " + cls.getName());
            }
        }
        return null;
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012f A[SYNTHETIC] */
    @Override // com.alibaba.fastjson2.reader.bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T a(com.alibaba.fastjson2.JSONReader r24, java.lang.reflect.Type r25, java.lang.Object r26, long r27) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.cc.a(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(Map map, long j) {
        return (T) bu.CC.$default$a(this, map, j);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(Map map, JSONReader.Feature... featureArr) {
        return (T) bu.CC.$default$a(this, map, featureArr);
    }

    protected String a() {
        Class cls;
        if (this.J == null && (cls = this.F) != null) {
            this.J = TypeUtils.a(cls);
        }
        return this.J;
    }

    public void a(JSONReader.a aVar) {
        this.O = aVar;
    }

    public void a(JSONReader jSONReader, Object obj, long j) {
        if (jSONReader.g()) {
            jSONReader.s();
        } else if (!jSONReader.n()) {
            throw new JSONException(jSONReader.aR());
        } else {
            while (!jSONReader.p()) {
                d b = b(jSONReader.G());
                if (b == null && jSONReader.b(c() | j)) {
                    b = c(jSONReader.H());
                }
                if (b == null) {
                    b(jSONReader, obj, j);
                } else {
                    b.b(jSONReader, obj);
                }
            }
            jSONReader.s();
        }
    }

    protected void a(T t) {
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public void a(Object obj, String str, Object obj2, long j) {
        d dVar = this.L;
        if (dVar != null && obj != null) {
            dVar.a(obj, str, obj2);
        } else if ((j & JSONReader.Feature.ErrorOnUnknownProperties.mask) == 0) {
        } else {
            throw new JSONException("Unknown Property " + str);
        }
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
    public /* synthetic */ T b(JSONReader jSONReader, Type type, Object obj, long j) {
        return (T) bu.CC.$default$b(this, jSONReader, type, obj, j);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T b(Collection collection) {
        return (T) bu.CC.$default$b(this, collection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(JSONReader jSONReader, Object obj, long j) {
        d c;
        d dVar = this.L;
        if (dVar != null && obj != null) {
            dVar.c(jSONReader, obj);
            return;
        }
        if ((jSONReader.a(j) & JSONReader.Feature.SupportSmartMatch.mask) != 0) {
            String J = jSONReader.J();
            if (J.startsWith("is", 0) && (c = c(com.alibaba.fastjson2.util.c.a(J.substring(2)))) != null && c.c == Boolean.class) {
                c.b(jSONReader, obj);
                return;
            }
        }
        aev aevVar = jSONReader.f2934a.v;
        if (aevVar != null) {
            jSONReader.b(aevVar.a(jSONReader.J()));
        } else if ((jSONReader.a(j) & JSONReader.Feature.ErrorOnUnknownProperties.mask) == 0) {
            jSONReader.N();
        } else {
            throw new JSONException("Unknown Property " + jSONReader.J());
        }
    }

    protected void b(Object obj) {
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Class<T> bm_() {
        return this.F;
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

    /* JADX INFO: Access modifiers changed from: protected */
    public T e(JSONReader jSONReader, Type type, Object obj, long j) {
        String str = "expect {, but [, class " + this.J;
        if (obj != null) {
            str = str + ", parent fieldName " + obj;
        }
        String d = jSONReader.d(str);
        if ((jSONReader.a(j) & JSONReader.Feature.SupportSmartMatch.mask) != 0) {
            if (type == null) {
                type = this.F;
            }
            List c = jSONReader.c(type);
            if (c.size() == 1) {
                return (T) c.get(0);
            }
            if (c != null) {
                if (c.size() == 0) {
                    return null;
                }
                if (c.size() == 1) {
                    return (T) c.get(0);
                }
            }
        }
        throw new JSONException(d);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ com.alibaba.fastjson2.function.d f() {
        return bu.CC.$default$f(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long g() {
        String a2;
        if (this.K == 0 && (a2 = a()) != null) {
            this.K = com.alibaba.fastjson2.util.c.b(a2);
        }
        return this.K;
    }
}
