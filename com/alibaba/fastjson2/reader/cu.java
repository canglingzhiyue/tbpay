package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.bu;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public final class cu implements bu {

    /* renamed from: a  reason: collision with root package name */
    final Method f2976a;
    final Type b;
    final Member c;
    final Type d;
    final Class e;
    final long f;
    protected final Enum[] g;
    protected final Enum[] h;
    protected long[] i;
    protected String[] j;
    protected long[] k;

    static {
        kge.a(2085006989);
        kge.a(438295340);
    }

    public cu(Class cls, Method method, Member member, Enum[] enumArr, Enum[] enumArr2, long[] jArr) {
        this.e = cls;
        this.f2976a = method;
        if (member instanceof AccessibleObject) {
            ((AccessibleObject) member).setAccessible(true);
        }
        this.c = member;
        Class<?> cls2 = null;
        Class<?> type = member instanceof Field ? ((Field) member).getType() : member instanceof Method ? ((Method) member).getReturnType() : null;
        this.d = type;
        if (type != null) {
            if (type == String.class) {
                this.j = new String[enumArr.length];
            } else {
                this.k = new long[enumArr.length];
            }
            for (int i = 0; i < enumArr.length; i++) {
                Enum r5 = enumArr[i];
                try {
                    Object invoke = member instanceof Field ? ((Field) member).get(r5) : ((Method) member).invoke(r5, new Object[0]);
                    if (type == String.class) {
                        this.j[i] = (String) invoke;
                    } else if (invoke instanceof Number) {
                        this.k[i] = ((Number) invoke).longValue();
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (method != null) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1) {
                cls2 = parameterTypes[0];
            }
        }
        this.b = cls2;
        this.f = com.alibaba.fastjson2.util.c.b(TypeUtils.a(cls));
        this.g = enumArr;
        this.h = enumArr2;
        this.i = jArr;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ bu a(JSONReader.c cVar, long j) {
        bu a2;
        a2 = cVar.a(j);
        return a2;
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

    public Enum a(int i) {
        if (i >= 0) {
            Enum[] enumArr = this.h;
            if (i < enumArr.length) {
                return enumArr[i];
            }
        }
        throw new JSONException("No enum ordinal " + this.e.getCanonicalName() + "." + i);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(long j) {
        return bu.CC.$default$a(this, j);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(JSONReader jSONReader) {
        ?? a2;
        a2 = a(jSONReader, (Type) null, (Object) null, c());
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x012e  */
    @Override // com.alibaba.fastjson2.reader.bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.alibaba.fastjson2.JSONReader r8, java.lang.reflect.Type r9, java.lang.Object r10, long r11) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.cu.a(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(Map map, long j) {
        return bu.CC.$default$a(this, map, j);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(Map map, JSONReader.Feature... featureArr) {
        return bu.CC.$default$a(this, map, featureArr);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ void a(Object obj, String str, Object obj2, long j) {
        bu.CC.$default$a(this, obj, str, obj2, j);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ d b(long j) {
        return bu.CC.$default$b(this, j);
    }

    public Enum b(int i) {
        Member member = this.c;
        Enum r1 = null;
        if (member == null) {
            r1 = a(i);
        } else {
            try {
                int i2 = 0;
                if (!(member instanceof Field)) {
                    Method method = (Method) member;
                    Enum[] enumArr = this.g;
                    int length = enumArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        Enum r6 = enumArr[i3];
                        if (((Number) method.invoke(r6, new Object[0])).intValue() == i) {
                            r1 = r6;
                            break;
                        }
                        i3++;
                    }
                } else {
                    Enum[] enumArr2 = this.g;
                    int length2 = enumArr2.length;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        Enum r4 = enumArr2[i2];
                        if (((Field) this.c).getInt(r4) == i) {
                            r1 = r4;
                            break;
                        }
                        i2++;
                    }
                }
            } catch (Exception e) {
                throw new JSONException("parse enum error, class " + this.e.getName() + ", value " + i, e);
            }
        }
        if (r1 != null) {
            return r1;
        }
        throw new JSONException("None enum ordinal or value " + i);
    }

    public Enum b(String str) {
        if (str == null) {
            return null;
        }
        return d(com.alibaba.fastjson2.util.c.b(str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T b() {
        ?? a2;
        a2 = a(0L);
        return a2;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        Enum d;
        int C = jSONReader.C();
        int c = jSONReader.c();
        if (c == -110) {
            bu a2 = jSONReader.a(this.e, 0L, j);
            if (a2 != null) {
                if (a2 != this) {
                    return a2.b(jSONReader, type, obj, j);
                }
            } else if (jSONReader.a(JSONReader.Feature.ErrorOnNotSupportAutoType)) {
                throw new JSONException(jSONReader.d("not support enumType : " + jSONReader.aG()));
            }
        }
        if (c >= -16 && c <= 72) {
            if (c <= 47) {
                jSONReader.D();
            } else {
                c = jSONReader.R();
            }
            d = a(c);
        } else if (jSONReader.o()) {
            return null;
        } else {
            d = d(jSONReader.E());
            if (d == null) {
                d = d(jSONReader.H());
            }
        }
        if (d != null || jSONReader.C() != C || !(type instanceof ParameterizedType) || !List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
            return d;
        }
        throw new JSONException(getClass().getSimpleName() + " parses error, JSONReader not forward when field type belongs to collection to avoid OOM");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T b(Collection collection) {
        return bu.CC.$default$b(this, collection);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Class bm_() {
        return this.e;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ long c() {
        return bu.CC.$default$c(this);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ d c(long j) {
        return bu.CC.$default$c(this, j);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T c(JSONReader jSONReader, Type type, Object obj, long j) {
        return bu.CC.$default$c(this, jSONReader, type, obj, j);
    }

    public Enum d(long j) {
        int binarySearch;
        if (this.g != null && (binarySearch = Arrays.binarySearch(this.i, j)) >= 0) {
            return this.g[binarySearch];
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T d(JSONReader jSONReader, Type type, Object obj, long j) {
        return bu.CC.$default$d(this, jSONReader, type, obj, j);
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

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ com.alibaba.fastjson2.function.d f() {
        return bu.CC.$default$f(this);
    }
}
