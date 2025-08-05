package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.b;
import com.alibaba.fastjson2.function.Supplier;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes2.dex */
public class ca<T> extends cb<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final d f2959a;
    protected final d b;
    protected final d c;
    protected final d d;
    protected final d e;
    protected final d f;
    final long g;
    final long h;
    final long i;
    final long j;
    final long k;
    final long l;
    final long m;
    final long n;
    final long o;
    final long p;
    final long q;
    final long r;

    static {
        kge.a(702253706);
    }

    public ca(Class cls, String str, String str2, long j, Supplier<T> supplier, com.alibaba.fastjson2.function.d dVar, d... dVarArr) {
        super(cls, str, str2, j, supplier, dVar, null, null, null, dVarArr);
        boolean z = false;
        this.f2959a = dVarArr[0];
        this.b = dVarArr[1];
        this.c = dVarArr[2];
        this.d = dVarArr[3];
        this.e = dVarArr[4];
        this.f = dVarArr[5];
        this.g = this.f2959a.m;
        this.h = this.b.m;
        this.i = this.c.m;
        this.j = this.d.m;
        this.k = this.e.m;
        this.l = this.f.m;
        this.m = this.f2959a.n;
        this.n = this.b.n;
        this.o = this.c.n;
        this.p = this.d.n;
        this.q = this.e.n;
        this.r = this.f.n;
        this.M = (this.f2959a.j == null && this.b.j == null && this.c.j == null && this.d.j == null && this.e.j == null && this.f.j == null) ? z : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0158, code lost:
        if (r2 == r9.r) goto L80;
     */
    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T a(com.alibaba.fastjson2.JSONReader r10, java.lang.reflect.Type r11, java.lang.Object r12, long r13) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ca.a(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc
    protected void a(T t) {
        this.f2959a.a((d) t);
        this.b.a((d) t);
        this.c.a((d) t);
        this.d.a((d) t);
        this.e.a((d) t);
        this.f.a((d) t);
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public d b(long j) {
        if (j == this.g) {
            return this.f2959a;
        }
        if (j == this.h) {
            return this.b;
        }
        if (j == this.i) {
            return this.c;
        }
        if (j == this.j) {
            return this.d;
        }
        if (j == this.k) {
            return this.e;
        }
        if (j != this.l) {
            return null;
        }
        return this.f;
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
                this.f2959a.b(jSONReader, t2);
                if (t3 > 1) {
                    this.b.b(jSONReader, t2);
                    if (t3 > 2) {
                        this.c.b(jSONReader, t2);
                        if (t3 > 3) {
                            this.d.b(jSONReader, t2);
                            if (t3 > 4) {
                                this.e.b(jSONReader, t2);
                                if (t3 > 5) {
                                    this.f.b(jSONReader, t2);
                                    for (int i = 6; i < t3; i++) {
                                        jSONReader.N();
                                    }
                                }
                            }
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
            a((ca<T>) t);
        }
        while (!jSONReader.a((byte) -91)) {
            long G = jSONReader.G();
            if (G != 0) {
                if (G != this.g) {
                    if (G != this.h) {
                        if (G != this.i) {
                            if (G != this.j) {
                                if (G != this.k) {
                                    if (G != this.l) {
                                        if (jSONReader.b(this.I | j)) {
                                            long H = jSONReader.H();
                                            if (H != this.m) {
                                                if (H != this.n) {
                                                    if (H != this.o) {
                                                        if (H != this.p) {
                                                            if (H != this.q) {
                                                                if (H == this.r) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        b(jSONReader, t, j);
                                    }
                                    dVar = this.f;
                                    dVar.b(jSONReader, t);
                                }
                                dVar = this.e;
                                dVar.b(jSONReader, t);
                            }
                            dVar = this.d;
                            dVar.b(jSONReader, t);
                        }
                        dVar = this.c;
                        dVar.b(jSONReader, t);
                    }
                    dVar = this.b;
                    dVar.b(jSONReader, t);
                }
                dVar = this.f2959a;
                dVar.b(jSONReader, t);
            }
        }
        return this.H != null ? (T) this.H.apply(t) : t;
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public d c(long j) {
        if (j == this.m) {
            return this.f2959a;
        }
        if (j == this.n) {
            return this.b;
        }
        if (j == this.o) {
            return this.c;
        }
        if (j == this.p) {
            return this.d;
        }
        if (j == this.q) {
            return this.e;
        }
        if (j != this.r) {
            return null;
        }
        return this.f;
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
                this.f2959a.b(jSONReader, t);
                if (t2 > 1) {
                    this.b.b(jSONReader, t);
                    if (t2 > 2) {
                        this.c.b(jSONReader, t);
                        if (t2 > 3) {
                            this.d.b(jSONReader, t);
                            if (t2 > 4) {
                                this.e.b(jSONReader, t);
                                if (t2 > 5) {
                                    this.f.b(jSONReader, t);
                                    for (int i = 6; i < t2; i++) {
                                        jSONReader.N();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return this.H != null ? (T) this.H.apply(t) : t;
        }
        return (T) a2.c(jSONReader, type, obj, j);
    }
}
