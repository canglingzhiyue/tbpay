package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class bj<T> extends d<T> {
    protected bu y;
    protected final com.alibaba.fastjson2.function.a z;

    static {
        kge.a(-445835278);
    }

    public bj(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, Method method, Field field, com.alibaba.fastjson2.function.a aVar) {
        super(str, type, cls, i, j, str2, locale, obj, method, field);
        this.z = aVar;
    }

    @Override // com.alibaba.fastjson2.reader.d
    public bu a(JSONReader.c cVar) {
        bu a2;
        if (this.o != null) {
            return this.o;
        }
        bu a3 = a(this.d, this.c, this.f, this.k);
        if (a3 != null) {
            this.o = a3;
            return a3;
        }
        if (Map.class.isAssignableFrom(this.c)) {
            a2 = du.a(this.d, this.c, this.e);
        } else if (Collection.class.isAssignableFrom(this.c)) {
            a2 = dq.a(this.d, this.c, this.e);
        } else {
            a2 = cVar.w.a(this.d, (cVar.p & JSONReader.Feature.FieldBased.mask) != 0);
        }
        this.o = a2;
        return a2;
    }

    @Override // com.alibaba.fastjson2.reader.d
    public bu a(JSONReader jSONReader) {
        bu a2;
        bu buVar = this.y;
        if (buVar != null) {
            return buVar;
        }
        if (this.o != null) {
            return this.o;
        }
        bu a3 = a(this.d, this.c, this.f, this.k);
        if (a3 != null) {
            this.o = a3;
            return a3;
        }
        if (this.c != null && Map.class.isAssignableFrom(this.c)) {
            a2 = du.a(this.d, this.c, this.e);
        } else if (this.c == null || !Collection.class.isAssignableFrom(this.c)) {
            JSONReader.c cVar = jSONReader.f2934a;
            a2 = cVar.w.a(this.d, (cVar.p & JSONReader.Feature.FieldBased.mask) != 0);
        } else {
            a2 = dq.a(this.d, this.c, this.e);
        }
        this.o = a2;
        return a2;
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(JSONReader jSONReader, T t) {
        JSONReader.c cVar = jSONReader.f2934a;
        long j = cVar.p;
        if (!this.l && jSONReader.c() != -110) {
            if ((JSONReader.Feature.IgnoreNoneSerializable.mask & j) != 0) {
                jSONReader.N();
                return;
            } else if ((JSONReader.Feature.ErrorOnNoneSerializable.mask & j) != 0) {
                throw new JSONException("not support none-Serializable");
            }
        }
        if (this.y == null) {
            this.y = cVar.w.a(this.d, (j & JSONReader.Feature.FieldBased.mask) != 0);
        }
        if (!jSONReader.u()) {
            a((bj<T>) t, this.y.b(jSONReader, this.d, this.b, this.e));
            return;
        }
        String v = jSONReader.v();
        if ("..".equals(v)) {
            a((bj<T>) t, t);
        } else {
            a(jSONReader, t, v);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, byte b) {
        a((bj<T>) t, Byte.valueOf(b));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, char c) {
        a((bj<T>) t, Character.valueOf(c));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, double d) {
        a((bj<T>) t, Double.valueOf(d));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, float f) {
        a((bj<T>) t, Float.valueOf(f));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, int i) {
        a((bj<T>) t, Integer.valueOf(i));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, long j) {
        a((bj<T>) t, Long.valueOf(j));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        if (obj != null || (this.e & JSONReader.Feature.IgnoreSetNullValue.mask) == 0) {
            if (this.c == Character.TYPE && (obj instanceof String)) {
                String str = (String) obj;
                obj = str.length() > 0 ? Character.valueOf(str.charAt(0)) : (char) 0;
            }
            if (obj != null && !this.c.isInstance(obj)) {
                obj = TypeUtils.a(obj, this.d);
            }
            try {
                if (this.z != null) {
                    this.z.accept(t, obj);
                } else if (this.g != null) {
                    this.g.invoke(t, obj);
                } else {
                    this.h.set(t, obj);
                }
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("set ");
                sb.append(this.z != null ? super.toString() : this.b);
                sb.append(" error");
                throw new JSONException(sb.toString(), e);
            }
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, short s) {
        a((bj<T>) t, Short.valueOf(s));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, boolean z) {
        a((bj<T>) t, Boolean.valueOf(z));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        if (this.y == null) {
            this.y = a(jSONReader);
        }
        Object b = jSONReader.w ? this.y.b(jSONReader, this.d, this.b, this.e) : this.y.a(jSONReader, this.d, this.b, this.e);
        com.alibaba.fastjson2.function.d f = this.y.f();
        return f != null ? f.apply(b) : b;
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        Member member;
        String str;
        Object a2;
        Type type;
        String str2;
        long j;
        if (!this.l) {
            long j2 = jSONReader.f2934a.p;
            if ((JSONReader.Feature.IgnoreNoneSerializable.mask & j2) != 0) {
                jSONReader.N();
                return;
            } else if ((j2 & JSONReader.Feature.ErrorOnNoneSerializable.mask) != 0) {
                throw new JSONException("not support none-Serializable");
            }
        }
        bu buVar = this.y;
        if (buVar == null) {
            buVar = a(this.d, this.c, this.f, this.k);
            if (buVar == null) {
                buVar = jSONReader.f2934a.a(this.d);
            }
            this.y = buVar;
        }
        if (jSONReader.u()) {
            String v = jSONReader.v();
            if ("..".equals(v)) {
                a((bj<T>) t, t);
                return;
            } else {
                a(jSONReader, t, v);
                return;
            }
        }
        try {
            if (jSONReader.o()) {
                a2 = this.j;
            } else if (jSONReader.w) {
                if (this.c == Object.class) {
                    buVar = jSONReader.a(Object.class, 0L, this.e);
                    if (buVar != null) {
                        type = this.d;
                        str2 = this.b;
                        j = this.e;
                    } else {
                        a2 = jSONReader.aM();
                    }
                } else {
                    type = this.d;
                    str2 = this.b;
                    j = this.e;
                }
                a2 = buVar.b(jSONReader, type, str2, j);
            } else {
                a2 = buVar.a(jSONReader, this.d, this.b, this.e);
            }
            a((bj<T>) t, a2);
            if (!this.q) {
                return;
            }
            BeanUtils.b(a2, t);
        } catch (Exception | IllegalAccessError e) {
            if ((this.h != null ? this.h : this.g) != null) {
                str = "read field '" + member.getDeclaringClass().getName() + "." + member.getName();
            } else {
                str = "read field " + this.b + " error";
            }
            throw new JSONException(jSONReader.d(str), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.reader.d
    public void c(JSONReader jSONReader, Object obj) {
        if (this.y == null) {
            this.y = a(jSONReader);
        }
        if ((this.y instanceof cc) && this.h != null) {
            d a2 = this.y.a(jSONReader.J());
            if (a2 != null) {
                try {
                    Object obj2 = this.h.get(obj);
                    if (obj2 == null) {
                        obj2 = this.y.a(this.e);
                        a((bj<T>) obj, obj2);
                    }
                    a2.b(jSONReader, obj2);
                    return;
                } catch (Exception e) {
                    throw new JSONException("read unwrapped field error", e);
                }
            }
        }
        jSONReader.N();
    }

    @Override // com.alibaba.fastjson2.reader.d
    public bu d() {
        return this.y;
    }
}
