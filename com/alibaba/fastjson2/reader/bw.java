package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.b;
import com.alibaba.fastjson2.function.Supplier;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes2.dex */
public class bw<T> extends cb<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final d f2954a;
    protected final d b;
    protected final long c;
    protected final long d;
    protected final long e;
    protected final long f;

    static {
        kge.a(702253702);
    }

    public bw(Class cls, String str, String str2, long j, Supplier<T> supplier, com.alibaba.fastjson2.function.d dVar, d... dVarArr) {
        super(cls, str, str2, j, supplier, dVar, null, null, null, dVarArr);
        boolean z = false;
        this.f2954a = dVarArr[0];
        this.b = dVarArr[1];
        this.c = this.f2954a.m;
        this.e = this.f2954a.n;
        this.d = this.b.m;
        this.f = this.b.n;
        this.M = (this.f2954a.j == null && this.b.j == null) ? z : true;
    }

    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public T a(JSONReader jSONReader) {
        return a(jSONReader, (Type) null, (Object) null, this.I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f5, code lost:
        if (r2 == r9.f) goto L70;
     */
    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T a(com.alibaba.fastjson2.JSONReader r10, java.lang.reflect.Type r11, java.lang.Object r12, long r13) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.bw.a(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc
    protected void a(T t) {
        this.f2954a.a((d) t);
        this.b.a((d) t);
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public d b(long j) {
        if (j == this.c) {
            return this.f2954a;
        }
        if (j != this.d) {
            return null;
        }
        return this.b;
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public T b(JSONReader jSONReader, Type type, Object obj, long j) {
        T t;
        d dVar;
        if (!this.N) {
            jSONReader.a(this.F);
        }
        bu a2 = jSONReader.a(this.F, g(), this.I | j);
        if (a2 == null || a2.bm_() == this.F) {
            if (jSONReader.w()) {
                T t2 = this.G.get();
                if (this.M) {
                    a((bw<T>) t2);
                }
                int t3 = jSONReader.t();
                if (t3 > 0) {
                    this.f2954a.b(jSONReader, t2);
                    if (t3 > 1) {
                        this.b.b(jSONReader, t2);
                        for (int i = 2; i < t3; i++) {
                            jSONReader.N();
                        }
                    }
                }
                return this.H != null ? (T) this.H.apply(t2) : t2;
            } else if (!jSONReader.a((byte) -90)) {
                throw new JSONException(jSONReader.d("expect object, but " + b.CC.a(jSONReader.c())));
            } else {
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
                    a((bw<T>) t);
                }
                if (t != null && jSONReader.l()) {
                    b(t);
                }
                while (!jSONReader.a((byte) -91)) {
                    long G = jSONReader.G();
                    if (G != 0) {
                        if (G == this.c) {
                            this.f2954a.b(jSONReader, t);
                        } else {
                            if (G != this.d) {
                                if (jSONReader.b(this.I | j)) {
                                    long H = jSONReader.H();
                                    if (H == this.e) {
                                        dVar = this.f2954a;
                                        dVar.a(jSONReader, (JSONReader) t);
                                    } else if (H == this.f) {
                                    }
                                }
                                b(jSONReader, t, j);
                            }
                            dVar = this.b;
                            dVar.a(jSONReader, (JSONReader) t);
                        }
                    }
                }
                return this.H != null ? (T) this.H.apply(t) : t;
            }
        }
        return (T) a2.b(jSONReader, type, obj, j);
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public d c(long j) {
        if (j == this.e) {
            return this.f2954a;
        }
        if (j != this.f) {
            return null;
        }
        return this.b;
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
                this.f2954a.b(jSONReader, t);
                if (t2 > 1) {
                    this.b.b(jSONReader, t);
                    for (int i = 2; i < t2; i++) {
                        jSONReader.N();
                    }
                }
            }
            return this.H != null ? (T) this.H.apply(t) : t;
        }
        return (T) a2.c(jSONReader, type, obj, j);
    }
}
