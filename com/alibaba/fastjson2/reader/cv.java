package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.bu;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public final class cv implements bu {
    static final long i;
    static final long j;

    /* renamed from: a  reason: collision with root package name */
    final Class f2977a;
    final long b;
    protected final Enum c;
    protected final Enum d;
    protected long e;
    protected long f;
    protected long g;
    protected long h;

    static {
        kge.a(626225377);
        kge.a(438295340);
        i = com.alibaba.fastjson2.util.c.b("0");
        j = com.alibaba.fastjson2.util.c.b("1");
    }

    public cv(Class cls, Enum[] enumArr, Enum[] enumArr2, long[] jArr) {
        this.f2977a = cls;
        this.b = com.alibaba.fastjson2.util.c.b(TypeUtils.a(cls));
        this.c = enumArr2[0];
        this.d = enumArr2[1];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < jArr.length; i4++) {
            long j2 = jArr[i4];
            Enum r3 = enumArr[i4];
            if (r3 == this.c) {
                int i5 = i2 + 1;
                if (i2 == 0) {
                    this.e = j2;
                } else {
                    this.f = j2;
                }
                i2 = i5;
            } else if (r3 == this.d) {
                int i6 = i3 + 1;
                if (i3 == 0) {
                    this.g = j2;
                } else {
                    this.h = j2;
                }
                i3 = i6;
            }
        }
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ bu a(JSONReader.c cVar, long j2) {
        bu a2;
        a2 = cVar.a(j2);
        return a2;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ bu a(ObjectReaderProvider objectReaderProvider, long j2) {
        bu a2;
        a2 = objectReaderProvider.a(j2);
        return a2;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ d a(String str) {
        return bu.CC.$default$a(this, str);
    }

    public Enum a(int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return this.d;
            }
            return null;
        }
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(long j2) {
        return bu.CC.$default$a(this, j2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(JSONReader jSONReader) {
        ?? a2;
        a2 = a(jSONReader, (Type) null, (Object) null, c());
        return a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
        if (r4.h != r0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r8 == 1) goto L19;
     */
    @Override // com.alibaba.fastjson2.reader.bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.alibaba.fastjson2.JSONReader r5, java.lang.reflect.Type r6, java.lang.Object r7, long r8) {
        /*
            r4 = this;
            int r7 = r5.C()
            boolean r8 = r5.d()
            r9 = 0
            if (r8 == 0) goto L1a
            int r8 = r5.R()
            if (r8 != 0) goto L14
        L11:
            java.lang.Enum r9 = r4.c
            goto L69
        L14:
            r0 = 1
            if (r8 != r0) goto L69
        L17:
            java.lang.Enum r9 = r4.d
            goto L69
        L1a:
            boolean r8 = r5.o()
            if (r8 == 0) goto L21
            goto L69
        L21:
            long r0 = r5.E()
            long r2 = r4.e
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L11
            long r2 = r4.f
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L11
            long r2 = com.alibaba.fastjson2.reader.cv.i
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L38
            goto L11
        L38:
            long r2 = r4.g
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L17
            long r2 = r4.h
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L17
            long r2 = com.alibaba.fastjson2.reader.cv.j
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L4b
            goto L17
        L4b:
            long r0 = r5.H()
            long r2 = r4.e
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L11
            long r2 = r4.f
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L5c
            goto L11
        L5c:
            long r2 = r4.g
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L17
            long r2 = r4.h
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L69
            goto L17
        L69:
            if (r9 != 0) goto La5
            int r5 = r5.C()
            if (r5 != r7) goto La5
            boolean r5 = r6 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto La5
            java.lang.reflect.ParameterizedType r6 = (java.lang.reflect.ParameterizedType) r6
            java.lang.reflect.Type r5 = r6.getRawType()
            java.lang.Class<java.util.List> r6 = java.util.List.class
            java.lang.Class r5 = (java.lang.Class) r5
            boolean r5 = r6.isAssignableFrom(r5)
            if (r5 != 0) goto L86
            goto La5
        L86:
            com.alibaba.fastjson2.JSONException r5 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.Class r7 = r4.getClass()
            java.lang.String r7 = r7.getSimpleName()
            r6.append(r7)
            java.lang.String r7 = " parses error, JSONReader not forward when field type belongs to collection to avoid OOM"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        La5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.cv.a(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(Map map, long j2) {
        return bu.CC.$default$a(this, map, j2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(Map map, JSONReader.Feature... featureArr) {
        return bu.CC.$default$a(this, map, featureArr);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ void a(Object obj, String str, Object obj2, long j2) {
        bu.CC.$default$a(this, obj, str, obj2, j2);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ d b(long j2) {
        return bu.CC.$default$b(this, j2);
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

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r8 == 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009f, code lost:
        if (r4.h != r8) goto L20;
     */
    @Override // com.alibaba.fastjson2.reader.bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(com.alibaba.fastjson2.JSONReader r5, java.lang.reflect.Type r6, java.lang.Object r7, long r8) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.cv.b(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T b(Collection collection) {
        return bu.CC.$default$b(this, collection);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Class bm_() {
        return this.f2977a;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ long c() {
        return bu.CC.$default$c(this);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ d c(long j2) {
        return bu.CC.$default$c(this, j2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T c(JSONReader jSONReader, Type type, Object obj, long j2) {
        return bu.CC.$default$c(this, jSONReader, type, obj, j2);
    }

    public Enum d(long j2) {
        if (this.e == j2 || this.f == j2) {
            return this.c;
        }
        if (this.g != j2 && this.h != j2) {
            return null;
        }
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T d(JSONReader jSONReader, Type type, Object obj, long j2) {
        return bu.CC.$default$d(this, jSONReader, type, obj, j2);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ String d() {
        String str;
        str = JSON.DEFAULT_TYPE_KEY;
        return str;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ long e() {
        long j2;
        j2 = bu.HASH_TYPE;
        return j2;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ com.alibaba.fastjson2.function.d f() {
        return bu.CC.$default$f(this);
    }
}
