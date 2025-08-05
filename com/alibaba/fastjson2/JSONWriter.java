package com.alibaba.fastjson2;

import com.alibaba.fastjson2.time.DateTimeFormatter;
import com.alibaba.fastjson2.time.e;
import com.alibaba.fastjson2.writer.FieldWriter;
import com.alibaba.fastjson2.writer.bg;
import com.alibaba.fastjson2.writer.du;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import com.taobao.media.MediaConstant;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.Closeable;
import java.io.Reader;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import tb.aal;
import tb.aeq;
import tb.aes;
import tb.aeu;
import tb.cqk;
import tb.dqj;
import tb.dqo;
import tb.dqs;
import tb.dqv;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public abstract class JSONWriter implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f2939a;
    public final a b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final s g;
    protected final Charset h;
    protected final char i;
    protected final int j;
    protected boolean k;
    protected int l;
    protected int m;
    protected Object n;
    protected IdentityHashMap<Object, b> o;
    protected b p;
    protected String q;
    protected boolean r;
    protected int s;

    /* loaded from: classes2.dex */
    public enum Feature {
        FieldBased(1),
        IgnoreNoneSerializable(2),
        ErrorOnNoneSerializable(4),
        BeanToArray(8),
        WriteNulls(16),
        WriteMapNullValue(16),
        BrowserCompatible(32),
        NullAsDefaultValue(64),
        WriteBooleanAsNumber(128),
        WriteNonStringValueAsString(256),
        WriteClassName(512),
        NotWriteRootClassName(1024),
        NotWriteHashMapArrayListClassName(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX),
        NotWriteDefaultValue(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF),
        WriteEnumsUsingName(8192),
        WriteEnumUsingToString(16384),
        IgnoreErrorGetter(32768),
        PrettyFormat(65536),
        ReferenceDetection(131072),
        WriteNameAsSymbol(262144),
        WriteBigDecimalAsPlain(524288),
        UseSingleQuotes(1048576),
        MapSortField(2097152),
        WriteNullListAsEmpty(4194304),
        WriteNullStringAsEmpty(8388608),
        WriteNullNumberAsZero(16777216),
        WriteNullBooleanAsFalse(33554432),
        NotWriteEmptyArray(67108864),
        WriteNonStringKeyAsString(134217728),
        WritePairAsJavaBean(268435456),
        OptimizedForAscii(536870912),
        EscapeNoneAscii(1073741824),
        WriteByteArrayAsBase64(2147483648L),
        IgnoreNonFieldGetter(4294967296L),
        LargeObject(8589934592L),
        WriteLongAsString(17179869184L),
        BrowserSecure(34359738368L),
        WriteEnumUsingOrdinal(68719476736L),
        WriteThrowableClassName(137438953472L),
        UnquoteFieldName(274877906944L),
        NotWriteSetClassName(549755813888L),
        NotWriteNumberClassName(1099511627776L);
        
        public final long mask;

        Feature(long j) {
            this.mask = j;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final du f2940a;
        DateTimeFormatter b;
        String c;
        Locale d;
        boolean e;
        boolean f;
        boolean g;
        boolean h;
        boolean i;
        boolean j;
        long k;
        e l;
        boolean m;
        dqs n;
        dqo o;
        dqj p;
        dqv q;
        aeq r;
        aal s;
        cqk t;
        aeu u;
        aes v;

        static {
            kge.a(31766856);
        }

        public a(du duVar) {
            if (duVar != null) {
                this.k = JSONFactory.d;
                this.f2940a = duVar;
                this.l = JSONFactory.f;
                String str = JSONFactory.e;
                if (str == null) {
                    return;
                }
                a(str);
                return;
            }
            throw new IllegalArgumentException("objectWriterProvider must not null");
        }

        public a(du duVar, Feature... featureArr) {
            if (duVar != null) {
                this.k = JSONFactory.d;
                this.f2940a = duVar;
                this.l = JSONFactory.f;
                for (Feature feature : featureArr) {
                    this.k |= feature.mask;
                }
                String str = JSONFactory.e;
                if (str == null) {
                    return;
                }
                a(str);
                return;
            }
            throw new IllegalArgumentException("objectWriterProvider must not null");
        }

        public long a() {
            return this.k;
        }

        public <T> bg<T> a(Class<T> cls) {
            return this.f2940a.b(cls, cls, (this.k & Feature.FieldBased.mask) != 0);
        }

        public <T> bg<T> a(Type type, Class<T> cls) {
            return this.f2940a.b(type, cls, (this.k & Feature.FieldBased.mask) != 0);
        }

        public void a(Feature feature, boolean z) {
            long j;
            if (z) {
                j = feature.mask | this.k;
            } else {
                j = (~feature.mask) & this.k;
            }
            this.k = j;
        }

        public void a(String str) {
            String str2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            if (str == null || !str.equals(this.c)) {
                this.b = null;
            }
            if (str != null && !str.isEmpty()) {
                char c = 65535;
                boolean z5 = false;
                boolean z6 = true;
                switch (str.hashCode()) {
                    case -1074095546:
                        if (str.equals("millis")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -288020395:
                        if (str.equals("unixtime")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1333195168:
                        if (str.equals("yyyy-MM-dd HH:mm:ss")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1834843604:
                        if (str.equals("yyyy-MM-ddTHH:mm:ss")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 2095190916:
                        if (str.equals("iso8601")) {
                            c = 1;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    str2 = str;
                    z = false;
                    z2 = false;
                    z3 = false;
                    z4 = false;
                    z5 = true;
                } else if (c != 1) {
                    if (c == 2) {
                        str2 = str;
                        z = true;
                        z2 = false;
                        z3 = false;
                    } else if (c == 3) {
                        str2 = "yyyy-MM-dd'T'HH:mm:ss";
                        z = false;
                        z2 = true;
                        z3 = true;
                    } else if (c != 4) {
                        z2 = str.contains(Repeat.D);
                        z3 = str.contains("H");
                        str2 = str;
                        z = false;
                    } else {
                        str2 = str;
                        z = false;
                        z2 = true;
                        z3 = true;
                        z4 = true;
                    }
                    z4 = false;
                } else {
                    str2 = str;
                    z = false;
                    z2 = false;
                    z3 = false;
                    z4 = false;
                    this.e = z5;
                    this.f = z6;
                    this.g = z;
                    this.i = z2;
                    this.j = z3;
                    this.h = z4;
                    str = str2;
                }
                z6 = false;
                this.e = z5;
                this.f = z6;
                this.g = z;
                this.i = z2;
                this.j = z3;
                this.h = z4;
                str = str2;
            }
            this.c = str;
        }

        public boolean a(long j) {
            return (j & this.k) != 0;
        }

        public boolean a(Feature feature) {
            return (this.k & feature.mask) != 0;
        }

        public e b() {
            if (this.l == null) {
                this.l = e.b;
            }
            return this.l;
        }

        public String c() {
            return this.c;
        }

        public boolean d() {
            return this.e;
        }

        public boolean e() {
            return this.g;
        }

        public boolean f() {
            return this.f;
        }

        public boolean g() {
            return this.h;
        }

        public DateTimeFormatter h() {
            String str;
            if (this.b == null && (str = this.c) != null && !this.e && !this.f && !this.g) {
                Locale locale = this.d;
                this.b = locale == null ? DateTimeFormatter.e(str) : DateTimeFormatter.a(str, locale);
            }
            return this.b;
        }

        public dqs i() {
            return this.n;
        }

        public dqj j() {
            return this.p;
        }

        public dqv k() {
            return this.q;
        }

        public aeu l() {
            return this.u;
        }

        public aes m() {
            return this.v;
        }

        public dqo n() {
            return this.o;
        }

        public aal o() {
            return this.s;
        }

        public aeq p() {
            return this.r;
        }

        public cqk q() {
            return this.t;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public static final b ROOT;

        /* renamed from: a  reason: collision with root package name */
        public final b f2941a;
        final String b;
        final int c;
        String d;
        b e;
        b f;

        static {
            kge.a(1983000364);
            ROOT = new b((b) null, "$");
        }

        public b(b bVar, int i) {
            this.f2941a = bVar;
            this.b = null;
            this.c = i;
        }

        public b(b bVar, String str) {
            this.f2941a = bVar;
            this.b = str;
            this.c = -1;
        }

        public boolean equals(Object obj) {
            b bVar;
            String str;
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                b bVar2 = (b) obj;
                if ((this.c == bVar2.c && this.f2941a == bVar2.f2941a) || (((bVar = this.f2941a) != null && bVar.equals(bVar2.f2941a) && this.b == bVar2.b) || ((str = this.b) != null && str.equals(bVar2.b)))) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f2941a, this.b, Integer.valueOf(this.c)});
        }

        /* JADX WARN: Removed duplicated region for block: B:81:0x017b A[FALL_THROUGH] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0180  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 494
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONWriter.b.toString():java.lang.String");
        }
    }

    static {
        kge.a(549931357);
        kge.a(-1811054506);
        f2939a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONWriter(a aVar, s sVar, boolean z, Charset charset) {
        this.b = aVar;
        this.g = sVar;
        this.h = charset;
        this.e = z;
        boolean z2 = true;
        this.c = !z && charset == StandardCharsets.UTF_8;
        this.d = !z && charset == StandardCharsets.UTF_16;
        this.f = !z && (aVar.k & Feature.UseSingleQuotes.mask) != 0;
        this.i = this.f ? '\'' : '\"';
        this.j = (aVar.k & Feature.LargeObject.mask) != 0 ? 1073741824 : 67108864;
        this.r = (aVar.k & Feature.PrettyFormat.mask) == 0 ? false : z2;
    }

    public static JSONWriter a(a aVar) {
        if (aVar == null) {
            aVar = JSONFactory.a();
        }
        return (aVar.k & Feature.OptimizedForAscii.mask) != 0 ? new r(aVar) : new q(aVar);
    }

    public static JSONWriter a(Feature... featureArr) {
        a a2 = JSONFactory.a(featureArr);
        return (a2.k & Feature.OptimizedForAscii.mask) != 0 ? new r(a2) : new q(a2);
    }

    private static boolean a(GenericArrayType genericArrayType, Class cls) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof ParameterizedType) {
            genericComponentType = ((ParameterizedType) genericComponentType).getRawType();
        }
        if (cls.isArray()) {
            return cls.getComponentType().equals(genericComponentType);
        }
        return false;
    }

    public static JSONWriter b(Feature... featureArr) {
        return new p(new a(JSONFactory.defaultObjectWriterProvider, featureArr), null);
    }

    public static JSONWriter g() {
        a aVar = new a(JSONFactory.defaultObjectWriterProvider);
        return (JSONFactory.d & Feature.OptimizedForAscii.mask) != 0 ? new r(aVar) : new q(aVar);
    }

    public final bg a(Class cls) {
        return this.b.f2940a.b(cls, cls, (this.b.k & Feature.FieldBased.mask) != 0);
    }

    public final bg a(Type type, Class cls) {
        return this.b.f2940a.b(type, cls, (this.b.k & Feature.FieldBased.mask) != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(int r7, java.lang.Object r8) {
        /*
            r6 = this;
            com.alibaba.fastjson2.JSONWriter$a r0 = r6.b
            long r0 = r0.k
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L81
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            if (r8 == r0) goto L81
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            if (r8 != r0) goto L1a
            goto L81
        L1a:
            if (r7 != 0) goto L32
            com.alibaba.fastjson2.JSONWriter$b r0 = r6.p
            com.alibaba.fastjson2.JSONWriter$b r0 = r0.e
            if (r0 == 0) goto L27
            com.alibaba.fastjson2.JSONWriter$b r7 = r6.p
            com.alibaba.fastjson2.JSONWriter$b r7 = r7.e
            goto L52
        L27:
            com.alibaba.fastjson2.JSONWriter$b r0 = r6.p
            com.alibaba.fastjson2.JSONWriter$b r1 = new com.alibaba.fastjson2.JSONWriter$b
            r1.<init>(r0, r7)
            r0.e = r1
        L30:
            r7 = r1
            goto L52
        L32:
            r0 = 1
            if (r7 != r0) goto L4a
            com.alibaba.fastjson2.JSONWriter$b r0 = r6.p
            com.alibaba.fastjson2.JSONWriter$b r0 = r0.f
            if (r0 == 0) goto L40
            com.alibaba.fastjson2.JSONWriter$b r7 = r6.p
            com.alibaba.fastjson2.JSONWriter$b r7 = r7.f
            goto L52
        L40:
            com.alibaba.fastjson2.JSONWriter$b r0 = r6.p
            com.alibaba.fastjson2.JSONWriter$b r1 = new com.alibaba.fastjson2.JSONWriter$b
            r1.<init>(r0, r7)
            r0.f = r1
            goto L30
        L4a:
            com.alibaba.fastjson2.JSONWriter$b r0 = new com.alibaba.fastjson2.JSONWriter$b
            com.alibaba.fastjson2.JSONWriter$b r1 = r6.p
            r0.<init>(r1, r7)
            r7 = r0
        L52:
            r6.p = r7
            java.lang.Object r7 = r6.n
            if (r8 != r7) goto L5b
            com.alibaba.fastjson2.JSONWriter$b r7 = com.alibaba.fastjson2.JSONWriter.b.ROOT
            goto L68
        L5b:
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson2.JSONWriter$b> r7 = r6.o
            if (r7 == 0) goto L6d
            java.lang.Object r7 = r7.get(r8)
            com.alibaba.fastjson2.JSONWriter$b r7 = (com.alibaba.fastjson2.JSONWriter.b) r7
            if (r7 != 0) goto L68
            goto L6d
        L68:
            java.lang.String r7 = r7.toString()
            return r7
        L6d:
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson2.JSONWriter$b> r7 = r6.o
            if (r7 != 0) goto L7a
            java.util.IdentityHashMap r7 = new java.util.IdentityHashMap
            r0 = 8
            r7.<init>(r0)
            r6.o = r7
        L7a:
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson2.JSONWriter$b> r7 = r6.o
            com.alibaba.fastjson2.JSONWriter$b r0 = r6.p
            r7.put(r8, r0)
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONWriter.a(int, java.lang.Object):java.lang.String");
    }

    public final String a(FieldWriter fieldWriter, Object obj) {
        b bVar;
        if ((this.b.k & Feature.ReferenceDetection.mask) != 0 && obj != Collections.EMPTY_LIST && obj != Collections.EMPTY_SET) {
            this.p = this.p == b.ROOT ? fieldWriter.d() : fieldWriter.a(this.p);
            if (obj == this.n) {
                bVar = b.ROOT;
            } else {
                IdentityHashMap<Object, b> identityHashMap = this.o;
                if (identityHashMap == null || (bVar = identityHashMap.get(obj)) == null) {
                    if (this.o == null) {
                        this.o = new IdentityHashMap<>(8);
                    }
                    this.o.put(obj, this.p);
                }
            }
            return bVar.toString();
        }
        return null;
    }

    public final String a(String str, Object obj) {
        b bVar;
        if ((this.b.k & Feature.ReferenceDetection.mask) != 0 && obj != Collections.EMPTY_LIST && obj != Collections.EMPTY_SET) {
            this.p = new b(this.p, str);
            if (obj == this.n) {
                bVar = b.ROOT;
            } else {
                IdentityHashMap<Object, b> identityHashMap = this.o;
                if (identityHashMap == null || (bVar = identityHashMap.get(obj)) == null) {
                    if (this.o == null) {
                        this.o = new IdentityHashMap<>(8);
                    }
                    this.o.put(obj, this.p);
                }
            }
            return bVar.toString();
        }
        return null;
    }

    public void a(byte b2) {
        throw new JSONException("UnsupportedOperation");
    }

    protected abstract void a(char c);

    public abstract void a(double d);

    public final void a(double d, DecimalFormat decimalFormat) {
        if (decimalFormat == null || this.e) {
            a(d);
        } else if (Double.isNaN(d) || Double.isInfinite(d)) {
            n();
        } else {
            a(decimalFormat.format(d));
        }
    }

    public abstract void a(float f);

    public final void a(float f, DecimalFormat decimalFormat) {
        if (decimalFormat == null || this.e) {
            a(f);
        } else if (Float.isNaN(f) || Float.isInfinite(f)) {
            n();
        } else {
            a(decimalFormat.format(f));
        }
    }

    public void a(int i) {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract void a(int i, int i2, int i3);

    public abstract void a(int i, int i2, int i3, int i4, int i5, int i6);

    public abstract void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z);

    public final void a(int i, String str) {
        if (str == null || this.e) {
            d(i);
        } else {
            d(String.format(str, Integer.valueOf(i)));
        }
    }

    public void a(long j, int i) {
        throw new JSONException("TODO");
    }

    public void a(JSONObject jSONObject) {
        a((Map) jSONObject);
    }

    public final void a(Feature feature, boolean z) {
        this.b.a(feature, z);
    }

    public abstract void a(com.alibaba.fastjson2.time.c cVar);

    public final void a(Reader reader) {
        c(this.i);
        try {
            char[] cArr = new char[2048];
            while (true) {
                int read = reader.read(cArr, 0, cArr.length);
                if (read < 0) {
                    c(this.i);
                    return;
                } else if (read > 0) {
                    a(cArr, 0, read, false);
                }
            }
        } catch (Exception e) {
            throw new JSONException("read string from reader error", e);
        }
    }

    public void a(Enum r7) {
        if (r7 == null) {
            n();
        } else if ((this.b.k & Feature.WriteEnumUsingToString.mask) != 0) {
            d(r7.toString());
        } else if ((this.b.k & Feature.WriteEnumsUsingName.mask) != 0) {
            d(r7.name());
        } else {
            d(r7.ordinal());
        }
    }

    public final void a(Object obj) {
        this.n = obj;
        this.p = b.ROOT;
    }

    public abstract void a(String str);

    public abstract void a(BigDecimal bigDecimal, long j, DecimalFormat decimalFormat);

    public abstract void a(BigInteger bigInteger, long j);

    public void a(List<String> list) {
        j();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                l();
            }
            d(list.get(i));
        }
        k();
    }

    public void a(Map map) {
        if (map == null) {
            n();
        } else if (((Feature.ReferenceDetection.mask | Feature.PrettyFormat.mask | Feature.NotWriteEmptyArray.mask | Feature.NotWriteDefaultValue.mask) & this.b.k) != 0) {
            this.b.a(map.getClass()).a(this, map, null, null, 0L);
        } else {
            a('{');
            boolean z = true;
            for (Map.Entry entry : map.entrySet()) {
                if (!z) {
                    a(',');
                }
                f(entry.getKey());
                a(riy.CONDITION_IF_MIDDLE);
                f(entry.getValue());
                z = false;
            }
            a('}');
        }
    }

    public abstract void a(UUID uuid);

    public abstract void a(short s);

    public void a(byte[] bArr) {
        if (bArr == null) {
            p();
        } else if ((this.b.k & Feature.WriteByteArrayAsBase64.mask) != 0) {
            b(bArr);
        } else {
            j();
            for (int i = 0; i < bArr.length; i++) {
                if (i != 0) {
                    l();
                }
                d((int) bArr[i]);
            }
            k();
        }
    }

    public void a(byte[] bArr, long j) {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract void a(char[] cArr);

    public void a(char[] cArr, int i, int i2) {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract void a(char[] cArr, int i, int i2, boolean z);

    public abstract void a(double[] dArr);

    public final void a(double[] dArr, DecimalFormat decimalFormat) {
        if (decimalFormat == null || this.e) {
            a(dArr);
        } else if (dArr == null) {
            n();
        } else {
            j();
            for (int i = 0; i < dArr.length; i++) {
                if (i != 0) {
                    l();
                }
                a(decimalFormat.format(dArr[i]));
            }
            k();
        }
    }

    public void a(float[] fArr) {
        if (fArr == null) {
            n();
            return;
        }
        j();
        for (int i = 0; i < fArr.length; i++) {
            if (i != 0) {
                l();
            }
            a(fArr[i]);
        }
        k();
    }

    public final void a(float[] fArr, DecimalFormat decimalFormat) {
        if (decimalFormat == null || this.e) {
            a(fArr);
        } else if (fArr == null) {
            n();
        } else {
            j();
            for (int i = 0; i < fArr.length; i++) {
                if (i != 0) {
                    l();
                }
                a(decimalFormat.format(fArr[i]));
            }
            k();
        }
    }

    public abstract void a(int[] iArr);

    public abstract void a(long[] jArr);

    public abstract void a(String[] strArr);

    public void a(boolean[] zArr) {
        if (zArr == null) {
            p();
            return;
        }
        j();
        for (int i = 0; i < zArr.length; i++) {
            if (i != 0) {
                l();
            }
            b(zArr[i]);
        }
        k();
    }

    public final boolean a() {
        return this.c;
    }

    public final boolean a(long j) {
        return this.b.m || (j & this.b.k) != 0;
    }

    public final boolean a(Feature feature) {
        return (this.b.k & feature.mask) != 0;
    }

    public final boolean a(Object obj, long j) {
        Class<?> cls;
        long j2 = j | this.b.k;
        if ((Feature.WriteClassName.mask & j2) == 0) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j2) != 0 && obj != null && ((cls = obj.getClass()) == HashMap.class || cls == ArrayList.class)) {
            return false;
        }
        return (j2 & Feature.NotWriteRootClassName.mask) == 0 || obj != this.n;
    }

    public final boolean a(Object obj, Class cls) {
        Class<?> cls2;
        long j = this.b.k;
        if ((Feature.WriteClassName.mask & j) == 0 || obj == null || (cls2 = obj.getClass()) == cls) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j) != 0 && (cls2 == HashMap.class || cls2 == ArrayList.class)) {
            return false;
        }
        return (j & Feature.NotWriteRootClassName.mask) == 0 || obj != this.n;
    }

    public final boolean a(Object obj, Class cls, long j) {
        Class<?> cls2;
        if (obj == null || (cls2 = obj.getClass()) == cls) {
            return false;
        }
        long j2 = j | this.b.k;
        if ((Feature.WriteClassName.mask & j2) == 0) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j2) != 0) {
            if (cls2 == HashMap.class) {
                if (cls == null || cls == Object.class || cls == Map.class || cls == AbstractMap.class) {
                    return false;
                }
            } else if (cls2 == ArrayList.class) {
                return false;
            }
        }
        return (j2 & Feature.NotWriteRootClassName.mask) == 0 || obj != this.n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        if ((r11 instanceof java.lang.Class) != false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Type inference failed for: r11v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.Object r10, java.lang.reflect.Type r11) {
        /*
            r9 = this;
            com.alibaba.fastjson2.JSONWriter$a r0 = r9.b
            long r0 = r0.k
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r2 = r2.mask
            long r2 = r2 & r0
            r4 = 0
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L62
            if (r10 != 0) goto L13
            goto L62
        L13:
            java.lang.Class r2 = r10.getClass()
            r3 = 0
            boolean r7 = r11 instanceof java.lang.Class
            if (r7 == 0) goto L20
        L1c:
            r3 = r11
            java.lang.Class r3 = (java.lang.Class) r3
            goto L3c
        L20:
            boolean r7 = r11 instanceof java.lang.reflect.GenericArrayType
            if (r7 == 0) goto L2d
            java.lang.reflect.GenericArrayType r11 = (java.lang.reflect.GenericArrayType) r11
            boolean r11 = a(r11, r2)
            if (r11 == 0) goto L3c
            return r6
        L2d:
            boolean r7 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r7 == 0) goto L3c
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type r11 = r11.getRawType()
            boolean r7 = r11 instanceof java.lang.Class
            if (r7 == 0) goto L3c
            goto L1c
        L3c:
            if (r2 != r3) goto L3f
            return r6
        L3f:
            com.alibaba.fastjson2.JSONWriter$Feature r11 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteHashMapArrayListClassName
            long r7 = r11.mask
            long r7 = r7 & r0
            int r11 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r11 == 0) goto L51
            java.lang.Class<java.util.HashMap> r11 = java.util.HashMap.class
            if (r2 == r11) goto L50
            java.lang.Class<java.util.ArrayList> r11 = java.util.ArrayList.class
            if (r2 != r11) goto L51
        L50:
            return r6
        L51:
            com.alibaba.fastjson2.JSONWriter$Feature r11 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName
            long r2 = r11.mask
            long r0 = r0 & r2
            int r11 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r11 == 0) goto L60
            java.lang.Object r11 = r9.n
            if (r10 == r11) goto L5f
            goto L60
        L5f:
            return r6
        L60:
            r10 = 1
            return r10
        L62:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONWriter.a(java.lang.Object, java.lang.reflect.Type):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        if ((r9 instanceof java.lang.Class) != false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Type inference failed for: r9v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.Object r8, java.lang.reflect.Type r9, long r10) {
        /*
            r7 = this;
            com.alibaba.fastjson2.JSONWriter$a r0 = r7.b
            long r0 = r0.k
            long r10 = r10 | r0
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r0 = r0.mask
            long r0 = r0 & r10
            r2 = 0
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L12
            return r4
        L12:
            if (r8 != 0) goto L15
            return r4
        L15:
            java.lang.Class r0 = r8.getClass()
            r1 = 0
            boolean r5 = r9 instanceof java.lang.Class
            if (r5 == 0) goto L22
        L1e:
            r1 = r9
            java.lang.Class r1 = (java.lang.Class) r1
            goto L31
        L22:
            boolean r5 = r9 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L31
            java.lang.reflect.ParameterizedType r9 = (java.lang.reflect.ParameterizedType) r9
            java.lang.reflect.Type r9 = r9.getRawType()
            boolean r5 = r9 instanceof java.lang.Class
            if (r5 == 0) goto L31
            goto L1e
        L31:
            if (r0 != r1) goto L34
            return r4
        L34:
            com.alibaba.fastjson2.JSONWriter$Feature r9 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteHashMapArrayListClassName
            long r5 = r9.mask
            long r5 = r5 & r10
            int r9 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r9 == 0) goto L55
            java.lang.Class<java.util.HashMap> r9 = java.util.HashMap.class
            if (r0 != r9) goto L50
            if (r1 == 0) goto L4f
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            if (r1 == r9) goto L4f
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            if (r1 == r9) goto L4f
            java.lang.Class<java.util.AbstractMap> r9 = java.util.AbstractMap.class
            if (r1 != r9) goto L55
        L4f:
            return r4
        L50:
            java.lang.Class<java.util.ArrayList> r9 = java.util.ArrayList.class
            if (r0 != r9) goto L55
            return r4
        L55:
            com.alibaba.fastjson2.JSONWriter$Feature r9 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName
            long r0 = r9.mask
            long r9 = r10 & r0
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 == 0) goto L65
            java.lang.Object r9 = r7.n
            if (r8 == r9) goto L64
            goto L65
        L64:
            return r4
        L65:
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONWriter.a(java.lang.Object, java.lang.reflect.Type, long):boolean");
    }

    public final boolean a(boolean z) {
        if (!this.b.m) {
            return z && (this.b.k & Feature.IgnoreNonFieldGetter.mask) != 0;
        }
        return true;
    }

    public abstract void b(byte b2);

    public abstract void b(char c);

    public final void b(int i) {
        if (this.k) {
            this.k = false;
        } else {
            l();
        }
        d(i);
    }

    public abstract void b(int i, int i2, int i3);

    public abstract void b(int i, int i2, int i3, int i4, int i5, int i6);

    public final void b(Object obj) {
        if (this.p == null || (this.b.k & Feature.ReferenceDetection.mask) == 0 || obj == Collections.EMPTY_LIST || obj == Collections.EMPTY_SET) {
            return;
        }
        this.p = this.p.f2941a;
    }

    public void b(String str) {
        if (this.k) {
            this.k = false;
        } else {
            l();
        }
        boolean z = (this.b.k & Feature.UnquoteFieldName.mask) != 0;
        if (z && (str.indexOf(this.i) >= 0 || str.indexOf(92) >= 0)) {
            z = false;
        }
        if (z) {
            a(str);
        } else {
            d(str);
        }
    }

    public void b(List list) {
        if (list == null) {
            p();
        } else if (((Feature.ReferenceDetection.mask | Feature.PrettyFormat.mask | Feature.NotWriteEmptyArray.mask | Feature.NotWriteDefaultValue.mask) & this.b.k) != 0) {
            this.b.a(list.getClass()).a(this, list, null, null, 0L);
        } else {
            a('[');
            for (int i = 0; i < list.size(); i++) {
                Object obj = list.get(i);
                if (i != 0) {
                    a(',');
                }
                f(obj);
            }
            a(']');
        }
    }

    public void b(boolean z) {
        if ((this.b.k & Feature.WriteBooleanAsNumber.mask) != 0) {
            a(z ? '1' : '0');
        } else {
            a(z ? "true" : "false");
        }
    }

    public abstract void b(byte[] bArr);

    public abstract void b(char[] cArr, int i, int i2);

    public final boolean b() {
        return (this.b.k & Feature.WriteNulls.mask) != 0;
    }

    public final boolean b(long j) {
        return (j & this.b.k) != 0;
    }

    public final boolean b(Object obj, Class cls, long j) {
        Class<?> cls2;
        if (obj == null || (cls2 = obj.getClass()) == cls) {
            return false;
        }
        long j2 = j | this.b.k;
        if ((Feature.WriteClassName.mask & j2) == 0) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j2) != 0 && cls2 == HashMap.class) {
            return false;
        }
        return (j2 & Feature.NotWriteRootClassName.mask) == 0 || obj != this.n;
    }

    public boolean b(byte[] bArr, long j) {
        throw new JSONException("UnsupportedOperation");
    }

    public final long c(long j) {
        return j | this.b.k;
    }

    public abstract void c(char c);

    public void c(int i) {
        throw new JSONException("UnsupportedOperation");
    }

    public void c(String str) {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract void c(byte[] bArr);

    public final boolean c() {
        return (this.b.k & Feature.ReferenceDetection.mask) != 0;
    }

    public final boolean c(Object obj) {
        return ((this.b.k & Feature.ReferenceDetection.mask) == 0 || obj == null || du.d(obj.getClass())) ? false : true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract void d(int i);

    public final void d(long j) {
        if (this.k) {
            this.k = false;
        } else {
            l();
        }
        e(j);
    }

    public abstract void d(String str);

    public abstract void d(byte[] bArr);

    public final boolean d() {
        return (this.b.k & Feature.BeanToArray.mask) != 0;
    }

    public final boolean d(Object obj) {
        Class<?> cls;
        long j = this.b.k;
        if ((Feature.WriteClassName.mask & j) == 0) {
            return false;
        }
        if ((Feature.NotWriteHashMapArrayListClassName.mask & j) != 0 && obj != null && ((cls = obj.getClass()) == HashMap.class || cls == ArrayList.class)) {
            return false;
        }
        return (j & Feature.NotWriteRootClassName.mask) == 0 || obj != this.n;
    }

    public final long e() {
        return this.b.k;
    }

    public abstract void e(long j);

    public void e(Object obj) {
        if (this.k) {
            this.k = false;
        } else {
            l();
        }
        f(obj);
    }

    public void e(String str) {
        d(str);
    }

    public abstract void e(byte[] bArr);

    public void f(long j) {
        e(j);
    }

    public void f(Object obj) {
        if (obj == null) {
            n();
            return;
        }
        Class<?> cls = obj.getClass();
        this.b.a(cls, cls).a(this, obj, null, null, 0L);
    }

    public abstract void f(String str);

    public final boolean f() {
        return (this.b.k & Feature.IgnoreErrorGetter.mask) != 0;
    }

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public void n() {
        a("null");
    }

    public void o() {
        a((this.b.k & (Feature.NullAsDefaultValue.mask | Feature.WriteNullStringAsEmpty.mask)) != 0 ? (this.b.k & Feature.UseSingleQuotes.mask) != 0 ? "''" : "\"\"" : "null");
    }

    public void p() {
        a((this.b.k & (Feature.NullAsDefaultValue.mask | Feature.WriteNullListAsEmpty.mask)) != 0 ? MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264 : "null");
    }

    public final void q() {
        if ((this.b.k & (Feature.NullAsDefaultValue.mask | Feature.WriteNullNumberAsZero.mask)) != 0) {
            d(0);
        } else {
            n();
        }
    }

    public final void r() {
        if ((this.b.k & (Feature.NullAsDefaultValue.mask | Feature.WriteNullBooleanAsFalse.mask)) != 0) {
            b(false);
        } else {
            n();
        }
    }

    public abstract byte[] s();

    public final void t() {
        if ((this.b.k & (Feature.NullAsDefaultValue.mask | Feature.WriteNullNumberAsZero.mask)) != 0) {
            e(0L);
        } else {
            n();
        }
    }
}
