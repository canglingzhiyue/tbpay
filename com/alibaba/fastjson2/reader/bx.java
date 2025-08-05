package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.b;
import com.alibaba.fastjson2.function.Supplier;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes2.dex */
public class bx<T> extends cb<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final d f2955a;
    protected final d b;
    protected final d c;
    final long d;
    final long e;
    final long f;
    final long g;
    final long h;
    final long i;

    static {
        kge.a(702253703);
    }

    public bx(Class cls, String str, String str2, long j, Supplier<T> supplier, com.alibaba.fastjson2.function.d dVar, d... dVarArr) {
        super(cls, str, str2, j, supplier, dVar, null, null, null, dVarArr);
        boolean z = false;
        this.f2955a = dVarArr[0];
        this.b = dVarArr[1];
        this.c = dVarArr[2];
        this.d = this.f2955a.m;
        this.e = this.b.m;
        this.f = this.c.m;
        this.g = this.f2955a.n;
        this.h = this.b.n;
        this.i = this.c.n;
        this.M = (this.f2955a.j == null && this.b.j == null && this.c.j == null) ? z : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0122, code lost:
        if (r8 == r13.i) goto L71;
     */
    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T a(com.alibaba.fastjson2.JSONReader r14, java.lang.reflect.Type r15, java.lang.Object r16, long r17) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.bx.a(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc
    protected void a(T t) {
        this.f2955a.a((d) t);
        this.b.a((d) t);
        this.c.a((d) t);
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public d b(long j) {
        if (j == this.d) {
            return this.f2955a;
        }
        if (j == this.e) {
            return this.b;
        }
        if (j != this.f) {
            return null;
        }
        return this.c;
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public T b(JSONReader jSONReader, Type type, Object obj, long j) {
        T t;
        d dVar;
        if (!this.N) {
            jSONReader.a(this.F);
        }
        if (jSONReader.w()) {
            T t2 = this.G.get();
            int t3 = jSONReader.t();
            if (t3 > 0) {
                this.f2955a.b(jSONReader, t2);
                if (t3 > 1) {
                    this.b.b(jSONReader, t2);
                    if (t3 > 2) {
                        this.c.b(jSONReader, t2);
                        for (int i = 3; i < t3; i++) {
                            jSONReader.N();
                        }
                    }
                }
            }
            return this.H != null ? (T) this.H.apply(t2) : t2;
        }
        bu a2 = jSONReader.a(this.F, g(), this.I | j);
        if (a2 != null && a2.bm_() != this.F) {
            return (T) a2.b(jSONReader, type, obj, j);
        }
        if (!jSONReader.a((byte) -90)) {
            throw new JSONException(jSONReader.d("expect object, but " + b.CC.a(jSONReader.c())));
        }
        if (this.G != null) {
            t = this.G.get();
        } else if (((jSONReader.f2934a.p | j) & JSONReader.Feature.FieldBased.mask) != 0) {
            try {
                t = (T) com.alibaba.fastjson2.util.e.UNSAFE.allocateInstance(this.F);
            } catch (InstantiationException e) {
                throw new JSONException(jSONReader.d("create instance error"), e);
            }
        } else {
            t = null;
        }
        if (t != null && this.M) {
            a((bx<T>) t);
        }
        while (!jSONReader.a((byte) -91)) {
            long G = jSONReader.G();
            if (G != 0) {
                if (G != this.d) {
                    if (G != this.e) {
                        if (G != this.f) {
                            if (jSONReader.b(this.I | j)) {
                                long H = jSONReader.H();
                                if (H != this.d) {
                                    if (H != this.e) {
                                        if (H == this.f) {
                                        }
                                    }
                                }
                            }
                            b(jSONReader, t, j);
                        }
                        dVar = this.c;
                        dVar.b(jSONReader, t);
                    }
                    dVar = this.b;
                    dVar.b(jSONReader, t);
                }
                dVar = this.f2955a;
                dVar.b(jSONReader, t);
            }
        }
        return this.H != null ? (T) this.H.apply(t) : t;
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public d c(long j) {
        if (j == this.g) {
            return this.f2955a;
        }
        if (j == this.h) {
            return this.b;
        }
        if (j != this.i) {
            return null;
        }
        return this.c;
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public T c(JSONReader jSONReader, Type type, Object obj, long j) {
        if (!this.N) {
            jSONReader.a(this.F);
        }
        bu a2 = a(jSONReader, this.F, this.I | j);
        if (a2 == null || a2 == this || a2.bm_() == this.F) {
            T t = this.G.get();
            int t2 = jSONReader.t();
            if (t2 > 0) {
                this.f2955a.b(jSONReader, t);
                if (t2 > 1) {
                    this.b.b(jSONReader, t);
                    if (t2 > 2) {
                        this.c.b(jSONReader, t);
                        for (int i = 3; i < t2; i++) {
                            jSONReader.N();
                        }
                    }
                }
            }
            for (int i2 = 3; i2 < t2; i2++) {
                jSONReader.N();
            }
            return this.H != null ? (T) this.H.apply(t) : t;
        }
        return (T) a2.c(jSONReader, type, obj, j);
    }
}
