package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.b;
import com.alibaba.fastjson2.function.Supplier;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes2.dex */
public class bv<T> extends cb<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final d f2953a;
    final long b;
    final long c;

    static {
        kge.a(702253701);
    }

    public bv(Class cls, String str, String str2, long j, Supplier<T> supplier, com.alibaba.fastjson2.function.d dVar, d... dVarArr) {
        super(cls, str, str2, j, supplier, dVar, null, null, null, dVarArr);
        boolean z = false;
        this.f2953a = dVarArr[0];
        this.b = this.f2953a.m;
        this.c = this.f2953a.n;
        this.M = this.f2953a.j != null ? true : z;
    }

    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public T a(JSONReader jSONReader) {
        return a(jSONReader, (Type) null, (Object) null, this.I);
    }

    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public T a(JSONReader jSONReader, Type type, Object obj, long j) {
        bu buVar;
        if (!this.N) {
            jSONReader.a(this.F);
        }
        if (jSONReader.w) {
            return b(jSONReader, type, obj, 0L);
        }
        T t = null;
        if (jSONReader.o()) {
            return null;
        }
        long a2 = jSONReader.a(this.I | j);
        if (jSONReader.w()) {
            if ((JSONReader.Feature.SupportArrayToBean.mask & a2) == 0) {
                return e(jSONReader, type, obj, a2);
            }
            jSONReader.D();
            T t2 = this.G.get();
            this.f2953a.b(jSONReader, t2);
            if (jSONReader.r()) {
                jSONReader.s();
                return this.H != null ? (T) this.H.apply(t2) : t2;
            }
            throw new JSONException(jSONReader.d("array to bean end error, " + jSONReader.a()));
        }
        jSONReader.n();
        if (this.G != null) {
            t = this.G.get();
        }
        if (this.M) {
            a((bv<T>) t);
        }
        if (t != null && (JSONReader.Feature.InitStringFieldAsEmpty.mask & a2) != 0) {
            b(t);
        }
        int i = 0;
        while (true) {
            if (jSONReader.p()) {
                break;
            }
            long G = jSONReader.G();
            if (i == 0 && G == bu.HASH_TYPE) {
                long F = jSONReader.F();
                JSONReader.c cVar = jSONReader.f2934a;
                bu a3 = cVar.a(F);
                if ((a3 != null || (a3 = cVar.a(jSONReader.aG(), this.F)) != null) && (buVar = a3) != this) {
                    t = (T) buVar.a(jSONReader, type, obj, j);
                    break;
                }
            } else if (G != this.b && (!jSONReader.b(this.I | j) || jSONReader.H() != this.c)) {
                b(jSONReader, t, j);
            } else {
                this.f2953a.b(jSONReader, t);
            }
            i++;
        }
        jSONReader.s();
        return this.H != null ? (T) this.H.apply(t) : t;
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc
    protected void a(T t) {
        this.f2953a.a((d) t);
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public d b(long j) {
        if (j == this.b) {
            return this.f2953a;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public T b(JSONReader jSONReader, Type type, Object obj, long j) {
        T t;
        if (!this.N) {
            jSONReader.a(this.F);
        }
        bu a2 = a(jSONReader, this.F, this.I | j);
        if (a2 == null || a2 == this || a2.bm_() == this.F) {
            if (jSONReader.w()) {
                T t2 = this.G.get();
                int t3 = jSONReader.t();
                if (t3 > 0) {
                    this.f2953a.b(jSONReader, t2);
                    for (int i = 1; i < t3; i++) {
                        jSONReader.N();
                    }
                }
                return this.H != null ? (T) this.H.apply(t2) : t2;
            }
            int i2 = 0;
            if (!jSONReader.a((byte) -90)) {
                if (!jSONReader.K()) {
                    throw new JSONException(jSONReader.d("expect object, but " + b.CC.a(jSONReader.c())));
                }
                jSONReader.a(false);
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
                a((bv<T>) t);
            }
            while (!jSONReader.a((byte) -91)) {
                long G = jSONReader.G();
                if (G == e() && i2 == 0) {
                    long F = jSONReader.F();
                    JSONReader.c cVar = jSONReader.f2934a;
                    bu a3 = a(cVar, F);
                    if (a3 == null) {
                        String aG = jSONReader.aG();
                        bu a4 = cVar.a(aG, null);
                        if (a4 == null) {
                            throw new JSONException(jSONReader.d("auotype not support : " + aG));
                        }
                        a3 = a4;
                    }
                    if (a3 != this) {
                        return (T) a3.b(jSONReader, type, obj, j);
                    }
                } else if (G != 0) {
                    if (G == this.b) {
                        this.f2953a.a(jSONReader, (JSONReader) t);
                    } else if (!jSONReader.b(this.I | j) || jSONReader.H() != this.c) {
                        b(jSONReader, t, j);
                    } else {
                        this.f2953a.b(jSONReader, t);
                    }
                }
                i2++;
            }
            return this.H != null ? (T) this.H.apply(t) : t;
        }
        return (T) a2.b(jSONReader, type, obj, j);
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public d c(long j) {
        if (j == this.c) {
            return this.f2953a;
        }
        return null;
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
                this.f2953a.b(jSONReader, t);
                for (int i = 1; i < t2; i++) {
                    jSONReader.N();
                }
            }
            return this.H != null ? (T) this.H.apply(t) : t;
        }
        return (T) a2.c(jSONReader, type, obj, j);
    }
}
