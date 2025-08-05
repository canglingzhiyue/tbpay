package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.b;
import com.alibaba.fastjson2.function.Supplier;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes2.dex */
public class bz<T> extends cb<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final d f2957a;
    protected final d b;
    protected final d c;
    protected final d d;
    protected final d e;
    final long f;
    final long g;
    final long h;
    final long i;
    final long j;
    final long k;
    final long l;
    final long m;
    final long n;
    final long o;

    static {
        kge.a(702253705);
    }

    public bz(Class cls, String str, String str2, long j, Supplier<T> supplier, com.alibaba.fastjson2.function.d dVar, d... dVarArr) {
        super(cls, str, str2, j, supplier, dVar, null, null, null, dVarArr);
        boolean z = false;
        this.f2957a = dVarArr[0];
        this.b = dVarArr[1];
        this.c = dVarArr[2];
        this.d = dVarArr[3];
        this.e = dVarArr[4];
        this.f = this.f2957a.m;
        this.g = this.b.m;
        this.h = this.c.m;
        this.i = this.d.m;
        this.j = this.e.m;
        this.k = this.f2957a.n;
        this.l = this.b.n;
        this.m = this.c.n;
        this.n = this.d.n;
        this.o = this.e.n;
        this.M = (this.f2957a.j == null && this.b.j == null && this.c.j == null && this.d.j == null && this.e.j == null) ? z : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0148, code lost:
        if (r2 == r9.o) goto L79;
     */
    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T a(com.alibaba.fastjson2.JSONReader r10, java.lang.reflect.Type r11, java.lang.Object r12, long r13) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.bz.a(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc
    protected void a(T t) {
        this.f2957a.a((d) t);
        this.b.a((d) t);
        this.c.a((d) t);
        this.d.a((d) t);
        this.e.a((d) t);
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public d b(long j) {
        if (j == this.f) {
            return this.f2957a;
        }
        if (j == this.g) {
            return this.b;
        }
        if (j == this.h) {
            return this.c;
        }
        if (j == this.i) {
            return this.d;
        }
        if (j != this.j) {
            return null;
        }
        return this.e;
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
                this.f2957a.b(jSONReader, t2);
                if (t3 > 1) {
                    this.b.b(jSONReader, t2);
                    if (t3 > 2) {
                        this.c.b(jSONReader, t2);
                        if (t3 > 3) {
                            this.d.b(jSONReader, t2);
                            if (t3 > 4) {
                                this.e.b(jSONReader, t2);
                                for (int i = 5; i < t3; i++) {
                                    jSONReader.N();
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
            throw new JSONException("expect object, but " + b.CC.a(jSONReader.c()));
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
            a((bz<T>) t);
        }
        while (!jSONReader.a((byte) -91)) {
            long G = jSONReader.G();
            if (G != 0) {
                if (G != this.f) {
                    if (G != this.g) {
                        if (G != this.h) {
                            if (G != this.i) {
                                if (G != this.j) {
                                    if (jSONReader.b(this.I | j)) {
                                        long H = jSONReader.H();
                                        if (H != this.k) {
                                            if (H != this.l) {
                                                if (H != this.m) {
                                                    if (H != this.n) {
                                                        if (H == this.o) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    b(jSONReader, t, j);
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
                dVar = this.f2957a;
                dVar.b(jSONReader, t);
            }
        }
        return this.H != null ? (T) this.H.apply(t) : t;
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public d c(long j) {
        if (j == this.k) {
            return this.f2957a;
        }
        if (j == this.l) {
            return this.b;
        }
        if (j == this.m) {
            return this.c;
        }
        if (j == this.n) {
            return this.d;
        }
        if (j != this.o) {
            return null;
        }
        return this.e;
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
                this.f2957a.b(jSONReader, t);
                if (t2 > 1) {
                    this.b.b(jSONReader, t);
                    if (t2 > 2) {
                        this.c.b(jSONReader, t);
                        if (t2 > 3) {
                            this.d.b(jSONReader, t);
                            if (t2 > 4) {
                                this.e.b(jSONReader, t);
                                for (int i = 5; i < t2; i++) {
                                    jSONReader.N();
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
