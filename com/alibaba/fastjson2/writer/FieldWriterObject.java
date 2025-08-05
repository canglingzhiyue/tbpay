package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.writer.du;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Currency;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import tb.aak;
import tb.kge;

/* loaded from: classes2.dex */
public class FieldWriterObject<T> extends FieldWriter<T> {
    static final AtomicReferenceFieldUpdater<FieldWriterObject, Class> D;
    final boolean A;
    final boolean B;
    final boolean C;
    volatile Class z;

    static {
        kge.a(811507538);
        D = AtomicReferenceFieldUpdater.newUpdater(FieldWriterObject.class, Class.class, AmnetConstant.VAL_SUPPORT_ZSTD);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public FieldWriterObject(String str, int i, long j, String str2, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i, j, str2, str3, type, cls, field, method);
        long j2 = aak.UNWRAPPED_MASK & j;
        boolean z = true;
        this.A = j2 != 0;
        if (cls == Currency.class) {
            this.z = cls;
            this.x = co.b;
        }
        if (!cls.isArray() && !Collection.class.isAssignableFrom(cls) && cls != AtomicLongArray.class && cls != AtomicIntegerArray.class) {
            z = false;
        }
        this.B = z;
        this.C = Number.class.isAssignableFrom(cls);
    }

    static boolean a(Class cls, Class cls2) {
        if (cls == Integer.TYPE && cls2 == Integer.class) {
            return true;
        }
        if (cls == Long.TYPE && cls2 == Long.class) {
            return true;
        }
        if (cls == Boolean.TYPE && cls2 == Boolean.class) {
            return true;
        }
        if (cls == Short.TYPE && cls2 == Short.class) {
            return true;
        }
        if (cls == Byte.TYPE && cls2 == Byte.class) {
            return true;
        }
        if (cls == Float.TYPE && cls2 == Float.class) {
            return true;
        }
        if (cls == Double.TYPE && cls2 == Double.class) {
            return true;
        }
        return cls == Character.TYPE && cls2 == Character.class;
    }

    private bg b(JSONWriter jSONWriter, Class cls) {
        bg bgVar;
        if (this.f == null) {
            JSONWriter.a aVar = jSONWriter.b;
            bgVar = aVar.f2940a.a(cls, cls, ((this.d | aVar.a()) & JSONWriter.Feature.FieldBased.mask) != 0);
        } else {
            bgVar = null;
        }
        DecimalFormat decimalFormat = this.g;
        if (cls == Float[].class) {
            bgVar = decimalFormat != null ? new bv(Float.class, decimalFormat) : bv.FLOAT_ARRAY;
        } else if (cls == Double[].class) {
            bgVar = decimalFormat != null ? new bv(Double.class, decimalFormat) : bv.DOUBLE_ARRAY;
        } else if (cls == float[].class) {
            bgVar = decimalFormat != null ? new cu(decimalFormat) : cu.f3074a;
        } else if (cls == double[].class) {
            bgVar = decimalFormat != null ? new cr(decimalFormat) : cr.f3071a;
        }
        if (bgVar == null) {
            bgVar = FieldWriter.a(this.b, this.c, this.f, null, cls);
        }
        if (bgVar != null) {
            if (this.x == null && D.compareAndSet(this, null, cls)) {
                y.compareAndSet(this, null, bgVar);
            }
            return bgVar;
        }
        boolean compareAndSet = D.compareAndSet(this, null, cls);
        bg a2 = jSONWriter.a(cls);
        if (!compareAndSet) {
            return a2;
        }
        y.compareAndSet(this, null, a2);
        return a2;
    }

    private bg c(JSONWriter jSONWriter, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return this.c.isAssignableFrom(cls) ? dl.a(this.b, cls) : dl.a(cls);
        }
        bg bgVar = null;
        if (this.f != null) {
            bgVar = FieldWriter.a(this.b, this.c, this.f, null, cls);
        }
        return bgVar == null ? jSONWriter.a(cls) : bgVar;
    }

    private bg d(JSONWriter jSONWriter, Class cls) {
        bg a2 = Map.class.isAssignableFrom(cls) ? this.c.isAssignableFrom(cls) ? dl.a(this.b, cls) : dl.a(cls) : jSONWriter.a(cls);
        y.compareAndSet(this, null, a2);
        return a2;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public bg a(JSONWriter jSONWriter, Class cls) {
        Class cls2 = this.z;
        if (cls2 == null || this.x == du.a.INSTANCE) {
            return b(jSONWriter, cls);
        }
        boolean z = cls2 == cls || (cls2 == Map.class && cls2.isAssignableFrom(cls)) || (cls2 == List.class && cls2.isAssignableFrom(cls));
        if (!z && cls2.isPrimitive()) {
            z = a(cls2, cls);
        }
        return z ? this.x == null ? d(jSONWriter, cls) : this.x : c(jSONWriter, cls);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        bg a2;
        Object a3 = a((FieldWriterObject<T>) t);
        if (a3 == null) {
            jSONWriter.n();
            return;
        }
        Class<?> cls = a3.getClass();
        if (this.z == null) {
            this.z = cls;
            a2 = a(jSONWriter, (Class) cls);
            y.compareAndSet(this, null, a2);
        } else {
            a2 = this.z == cls ? this.x : jSONWriter.a((Class) cls);
        }
        if (a2 == null) {
            throw new JSONException("get value writer error, valueType : " + cls);
        }
        boolean z = jSONWriter.c() && !du.d(cls);
        if (z) {
            if (a3 == t) {
                jSONWriter.f("..");
                return;
            }
            String a4 = jSONWriter.a(this.f3039a, a3);
            if (a4 != null) {
                jSONWriter.f(a4);
                jSONWriter.b(a3);
                return;
            }
        }
        if (!jSONWriter.e) {
            a2.a(jSONWriter, a3, this.f3039a, this.c, this.d);
        } else if (jSONWriter.d()) {
            a2.c(jSONWriter, a3, this.f3039a, this.c, this.d);
        } else {
            a2.b(jSONWriter, a3, this.f3039a, this.c, this.d);
        }
        if (!z) {
            return;
        }
        jSONWriter.b(a3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        long e = this.d | jSONWriter.e();
        if (this.r || (JSONWriter.Feature.IgnoreNoneSerializable.mask & e) == 0) {
            try {
                Object a2 = a((FieldWriterObject<T>) t);
                if (a2 == null) {
                    if ((JSONWriter.Feature.WriteNulls.mask & e) != 0 && (JSONWriter.Feature.NotWriteDefaultValue.mask & e) == 0) {
                        a(jSONWriter);
                        if (this.B) {
                            jSONWriter.p();
                        } else if (this.C) {
                            jSONWriter.q();
                        } else if (this.c == Appendable.class || this.c == StringBuffer.class || this.c == StringBuilder.class) {
                            jSONWriter.o();
                        } else {
                            jSONWriter.n();
                        }
                        return true;
                    } else if (((JSONWriter.Feature.WriteNullNumberAsZero.mask | JSONWriter.Feature.NullAsDefaultValue.mask) & e) != 0 && this.C) {
                        a(jSONWriter);
                        jSONWriter.d(0);
                        return true;
                    } else if ((e & (JSONWriter.Feature.WriteNullBooleanAsFalse.mask | JSONWriter.Feature.NullAsDefaultValue.mask)) == 0 || !(this.c == Boolean.class || this.c == AtomicBoolean.class)) {
                        return false;
                    } else {
                        a(jSONWriter);
                        jSONWriter.b(false);
                        return true;
                    }
                } else if (a2 == t && this.c == Throwable.class && this.i != null && this.i.getDeclaringClass() == Throwable.class) {
                    return false;
                } else {
                    if ((JSONWriter.Feature.IgnoreNoneSerializable.mask & e) != 0 && !(a2 instanceof Serializable)) {
                        return false;
                    }
                    boolean c = jSONWriter.c(a2);
                    if (c) {
                        if (a2 == t) {
                            a(jSONWriter);
                            jSONWriter.f("..");
                            return true;
                        }
                        String a3 = jSONWriter.a(this, a2);
                        if (a3 != null) {
                            a(jSONWriter);
                            jSONWriter.f(a3);
                            jSONWriter.b(a2);
                            return true;
                        }
                    }
                    Class<?> cls = a2.getClass();
                    if (cls == byte[].class) {
                        a(jSONWriter, (byte[]) a2);
                        return true;
                    }
                    bg a4 = a(jSONWriter, (Class) cls);
                    if (a4 == null) {
                        throw new JSONException("get objectWriter error : " + cls);
                    }
                    if (this.A) {
                        if (a2 instanceof Map) {
                            boolean z = jSONWriter.e;
                            for (Map.Entry entry : ((Map) a2).entrySet()) {
                                String obj = entry.getKey().toString();
                                Object value = entry.getValue();
                                if (value != null || (JSONWriter.Feature.WriteNulls.mask & e) != 0) {
                                    jSONWriter.b(obj);
                                    if (!z) {
                                        jSONWriter.m();
                                    }
                                    if (value == null) {
                                        jSONWriter.n();
                                    } else {
                                        jSONWriter.a((Class) value.getClass()).a(jSONWriter, value);
                                    }
                                }
                            }
                            if (c) {
                                jSONWriter.b(a2);
                            }
                            return true;
                        } else if (a4 instanceof bt) {
                            for (FieldWriter fieldWriter : ((bt) a4).s) {
                                fieldWriter.b(jSONWriter, (JSONWriter) a2);
                            }
                            return true;
                        }
                    }
                    a(jSONWriter);
                    boolean z2 = jSONWriter.e;
                    if ((this.d & JSONWriter.Feature.BeanToArray.mask) != 0) {
                        if (z2) {
                            a4.c(jSONWriter, a2, this.f3039a, this.b, this.d);
                        } else {
                            a4.d(jSONWriter, a2, this.f3039a, this.b, this.d);
                        }
                    } else if (z2) {
                        a4.b(jSONWriter, a2, this.f3039a, this.b, this.d);
                    } else {
                        a4.a(jSONWriter, a2, this.f3039a, this.b, this.d);
                    }
                    if (c) {
                        jSONWriter.b(a2);
                    }
                    return true;
                }
            } catch (RuntimeException e2) {
                if (!jSONWriter.f()) {
                    throw e2;
                }
                return false;
            }
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public bg c() {
        return this.x;
    }
}
