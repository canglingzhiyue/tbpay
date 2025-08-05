package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.function.Supplier;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.reader.bu;
import com.alibaba.fastjson2.reader.cc;
import com.alibaba.fastjson2.reader.ec;
import com.alibaba.fastjson2.time.DateTimeException;
import com.alibaba.fastjson2.time.DateTimeFormatter;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.util.k;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import tb.aer;
import tb.aev;
import tb.cqa;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class JSONReader implements Closeable {
    protected short P;

    /* renamed from: a  reason: collision with root package name */
    public final c f2934a;
    List<d> b;
    protected int c;
    protected char d;
    protected boolean e;
    protected boolean f;
    protected boolean g;
    protected boolean h;
    protected boolean i;
    protected boolean j;
    protected byte k;
    protected short l;
    protected int n;
    protected int o;
    protected int p;
    protected int q;
    protected int r;
    protected String s;
    protected Object t;
    protected boolean u;
    protected char[] v;
    public final boolean w;

    /* loaded from: classes2.dex */
    public enum Feature {
        FieldBased(1),
        IgnoreNoneSerializable(2),
        ErrorOnNoneSerializable(4),
        SupportArrayToBean(8),
        InitStringFieldAsEmpty(16),
        SupportAutoType(32),
        SupportSmartMatch(64),
        UseNativeObject(128),
        SupportClassForName(256),
        IgnoreSetNullValue(512),
        UseDefaultConstructorAsPossible(1024),
        UseBigDecimalForFloats(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX),
        UseBigDecimalForDoubles(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF),
        ErrorOnEnumNotMatch(8192),
        TrimString(16384),
        ErrorOnNotSupportAutoType(32768),
        DuplicateKeyValueAsArray(65536),
        AllowUnQuotedFieldNames(131072),
        NonStringKeyAsString(262144),
        Base64StringAsByteArray(524288),
        IgnoreCheckClose(1048576),
        ErrorOnNullForPrimitives(2097152),
        NullOnError(4194304),
        IgnoreAutoTypeNotMatch(8388608),
        NonZeroNumberCastToBooleanAsTrue(16777216),
        IgnoreNullPropertyValue(33554432),
        ErrorOnUnknownProperties(67108864);
        
        public final long mask;

        Feature(long j) {
            this.mask = j;
        }

        public static long of(Feature[] featureArr) {
            long j = 0;
            if (featureArr == null) {
                return 0L;
            }
            for (Feature feature : featureArr) {
                j |= feature.mask;
            }
            return j;
        }
    }

    /* loaded from: classes2.dex */
    public interface a extends cqa {

        /* renamed from: com.alibaba.fastjson2.JSONReader$a$-CC  reason: invalid class name */
        /* loaded from: classes2.dex */
        public final /* synthetic */ class CC {
            public static Class $default$a(a aVar, long j, Class cls, long j2) {
                return null;
            }
        }

        Class<?> a(long j, Class<?> cls, long j2);

        Class<?> a(String str, Class<?> cls, long j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b implements com.alibaba.fastjson2.function.b<Integer, int[], BigInteger> {

        /* renamed from: a  reason: collision with root package name */
        static final com.alibaba.fastjson2.function.b<Integer, int[], BigInteger> f2935a;

        static {
            kge.a(-1567901993);
            kge.a(-188453804);
            f2935a = new b();
        }

        b() {
        }

        @Override // com.alibaba.fastjson2.function.b
        public BigInteger a(Integer num, int[] iArr) {
            int numberOfLeadingZeros;
            int intValue = num.intValue();
            if (iArr.length == 0) {
                numberOfLeadingZeros = 0;
            } else {
                numberOfLeadingZeros = (32 - Integer.numberOfLeadingZeros(iArr[0])) + ((iArr.length - 1) << 5);
                if (intValue < 0) {
                    boolean z = Integer.bitCount(iArr[0]) == 1;
                    for (int i = 1; i < iArr.length && z; i++) {
                        z = iArr[i] == 0;
                    }
                    if (z) {
                        numberOfLeadingZeros--;
                    }
                }
            }
            int i2 = (numberOfLeadingZeros / 8) + 1;
            byte[] bArr = new byte[i2];
            int i3 = 4;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = i2 - 1; i6 >= 0; i6--) {
                if (i3 == 4) {
                    int i7 = i5 + 1;
                    if (i5 >= 0) {
                        if (i5 < iArr.length) {
                            i4 = iArr[(iArr.length - i5) - 1];
                            if (intValue < 0) {
                                int length = iArr.length;
                                int i8 = length - 1;
                                while (i8 >= 0 && iArr[i8] == 0) {
                                    i8--;
                                }
                                i4 = i5 <= (length - i8) - 1 ? -i4 : ~i4;
                            }
                        } else if (intValue < 0) {
                            i4 = -1;
                        }
                        i5 = i7;
                        i3 = 1;
                    }
                    i4 = 0;
                    i5 = i7;
                    i3 = 1;
                } else {
                    i4 >>>= 8;
                    i3++;
                }
                bArr[i6] = (byte) i4;
            }
            return new BigInteger(bArr);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        String f2936a;
        boolean b;
        boolean c;
        boolean d;
        boolean e;
        boolean f;
        boolean g;
        boolean h;
        boolean i;
        boolean j;
        boolean k;
        int l;
        int m;
        DateTimeFormatter n;
        com.alibaba.fastjson2.time.e o;
        public long p;
        Locale q;
        TimeZone r;
        Supplier<Map> s;
        Supplier<List> t;
        a u;
        public aev v;
        public final ObjectReaderProvider w;
        protected final s x;

        static {
            kge.a(-267379304);
        }

        public c(ObjectReaderProvider objectReaderProvider) {
            this.l = 2048;
            this.m = 524288;
            this.p = JSONFactory.f2931a;
            this.w = objectReaderProvider;
            this.s = JSONFactory.g;
            this.t = JSONFactory.h;
            this.x = null;
            this.o = JSONFactory.c;
            String str = JSONFactory.b;
            if (str != null) {
                a(str);
            }
        }

        public c(ObjectReaderProvider objectReaderProvider, long j) {
            this.l = 2048;
            this.m = 524288;
            this.p = j;
            this.w = objectReaderProvider;
            this.s = JSONFactory.g;
            this.t = JSONFactory.h;
            this.x = null;
            this.o = JSONFactory.c;
            String str = JSONFactory.b;
            if (str != null) {
                a(str);
            }
        }

        public c(ObjectReaderProvider objectReaderProvider, s sVar, cqa cqaVar, Feature... featureArr) {
            this.l = 2048;
            this.m = 524288;
            this.p = JSONFactory.f2931a;
            this.w = objectReaderProvider;
            this.x = sVar;
            this.o = JSONFactory.c;
            String str = JSONFactory.b;
            if (str != null) {
                a(str);
            }
            a(cqaVar);
            for (Feature feature : featureArr) {
                this.p |= feature.mask;
            }
        }

        public c(ObjectReaderProvider objectReaderProvider, Feature... featureArr) {
            this.l = 2048;
            this.m = 524288;
            this.p = JSONFactory.f2931a;
            this.w = objectReaderProvider;
            this.s = JSONFactory.g;
            this.t = JSONFactory.h;
            this.x = null;
            this.o = JSONFactory.c;
            String str = JSONFactory.b;
            if (str != null) {
                a(str);
            }
            for (Feature feature : featureArr) {
                this.p |= feature.mask;
            }
        }

        public a a() {
            return this.u;
        }

        public bu a(long j) {
            return this.w.a(j);
        }

        public bu a(String str, Class cls) {
            Class<?> a2;
            a aVar = this.u;
            if (aVar == null || (a2 = aVar.a(str, cls, this.p)) == null) {
                return this.w.a(str, cls, this.p);
            }
            return this.w.a(a2, (this.p & Feature.FieldBased.mask) != 0);
        }

        public bu a(String str, Class cls, long j) {
            Class<?> a2;
            a aVar = this.u;
            if (aVar == null || (a2 = aVar.a(str, cls, j)) == null) {
                return this.w.a(str, cls, j | this.p);
            }
            return this.w.a(a2, (Feature.FieldBased.mask & j) != 0);
        }

        public bu a(Type type) {
            return this.w.a(type, (this.p & Feature.FieldBased.mask) != 0);
        }

        public void a(Supplier<Map> supplier) {
            this.s = supplier;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public void a(String str) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            String str2;
            char c;
            if (str != null && str.isEmpty()) {
                str = null;
            }
            boolean z5 = false;
            boolean z6 = true;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1172057030:
                        if (str.equals("yyyy-MM-dd HH:mm")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1074095546:
                        if (str.equals("millis")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -347789785:
                        if (str.equals("yyyyMMddHHmmssSSSZ")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -288020395:
                        if (str.equals("unixtime")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -159776256:
                        if (str.equals("yyyy-MM-dd")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1333195168:
                        if (str.equals("yyyy-MM-dd HH:mm:ss")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1798231098:
                        if (str.equals("yyyy-MM-dd'T'HH:mm:ss")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1834843604:
                        if (str.equals("yyyy-MM-ddTHH:mm:ss")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2095190916:
                        if (str.equals("iso8601")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        z = false;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                        break;
                    case 1:
                        z6 = false;
                        z = false;
                        z2 = true;
                        z3 = false;
                        z4 = false;
                        break;
                    case 2:
                        z6 = false;
                        z = false;
                        z2 = false;
                        z3 = true;
                        z4 = false;
                        break;
                    case 3:
                        z = true;
                        this.b = true;
                        z5 = true;
                        z6 = false;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                        break;
                    case 4:
                    case 5:
                        z = false;
                        this.b = true;
                        z5 = true;
                        z6 = false;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                        break;
                    case 6:
                        this.c = true;
                        z5 = true;
                        z6 = false;
                        z = false;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                        break;
                    case 7:
                        this.e = true;
                        z6 = false;
                        z = false;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                        break;
                    case '\b':
                        this.d = true;
                        break;
                    default:
                        boolean z7 = str.indexOf(100) != -1;
                        if (str.indexOf(72) == -1 && str.indexOf(104) == -1 && str.indexOf(75) == -1 && str.indexOf(107) == -1) {
                            z6 = false;
                        }
                        z5 = z6;
                        z4 = z7;
                        z6 = false;
                        z = false;
                        z2 = false;
                        z3 = false;
                        break;
                }
                str2 = this.f2936a;
                if (str2 != null && !str2.equals(str)) {
                    this.n = null;
                }
                this.f2936a = str;
                this.g = z6;
                this.f = z3;
                this.h = z2;
                this.i = z4;
                this.j = z5;
                this.k = z;
            }
            z6 = false;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            str2 = this.f2936a;
            if (str2 != null) {
                this.n = null;
            }
            this.f2936a = str;
            this.g = z6;
            this.f = z3;
            this.h = z2;
            this.i = z4;
            this.j = z5;
            this.k = z;
        }

        public void a(cqa cqaVar) {
            if (cqaVar instanceof a) {
                this.u = (a) cqaVar;
            }
            if (cqaVar instanceof aev) {
                this.v = (aev) cqaVar;
            }
        }

        public void a(Feature... featureArr) {
            for (Feature feature : featureArr) {
                this.p |= feature.mask;
            }
        }

        public boolean a(Feature feature) {
            return (this.p & feature.mask) != 0;
        }

        public Supplier<Map> b() {
            return this.s;
        }

        public void b(Supplier<List> supplier) {
            this.t = supplier;
        }

        public DateTimeFormatter c() {
            String str;
            if (this.n == null && (str = this.f2936a) != null && !this.f && !this.h && !this.g) {
                Locale locale = this.q;
                this.n = locale == null ? DateTimeFormatter.e(str) : DateTimeFormatter.a(str, locale);
            }
            return this.n;
        }

        public com.alibaba.fastjson2.time.e d() {
            if (this.o == null) {
                this.o = com.alibaba.fastjson2.time.e.b;
            }
            return this.o;
        }

        public long e() {
            return this.p;
        }

        public Locale f() {
            return this.q;
        }

        public TimeZone g() {
            if (this.r == null) {
                this.r = com.alibaba.fastjson2.time.e.f3023a;
            }
            return this.r;
        }

        public int h() {
            return this.m;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        final com.alibaba.fastjson2.reader.d f2937a;
        final Object b;
        final Object c;
        final com.alibaba.fastjson2.d d;

        static {
            kge.a(-2084167430);
        }

        d(com.alibaba.fastjson2.reader.d dVar, Object obj, Object obj2, com.alibaba.fastjson2.d dVar2) {
            this.f2937a = dVar;
            this.b = obj;
            this.c = obj2;
            this.d = dVar2;
        }

        public String toString() {
            return this.d.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        protected final int f2938a;
        protected final int b;

        static {
            kge.a(1323473852);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public e(int i, int i2) {
            this.f2938a = i;
            this.b = i2;
        }
    }

    static {
        kge.a(394526125);
        kge.a(-1811054506);
    }

    public JSONReader(c cVar, boolean z) {
        this.f2934a = cVar;
        this.w = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static char a(int i, int i2) {
        return (char) ((JSONFactory.p[i] << 4) + JSONFactory.p[i2]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static char a(int i, int i2, int i3, int i4) {
        return (char) ((JSONFactory.p[i] << 12) + (JSONFactory.p[i2] << 8) + (JSONFactory.p[i3] << 4) + JSONFactory.p[i4]);
    }

    public static a a(Class... clsArr) {
        return new aer(clsArr);
    }

    public static JSONReader a(String str, c cVar) {
        if (str == null || cVar == null) {
            throw new NullPointerException();
        }
        return new o(cVar, str, 0, str.length());
    }

    public static JSONReader a(byte[] bArr) {
        return new n(JSONFactory.b(), bArr, 0, bArr.length);
    }

    public static JSONReader a(char[] cArr, int i, int i2) {
        return new o(JSONFactory.b(), null, cArr, i, i2);
    }

    private void a(List<Object> list, int i, Object obj) {
        if (!(obj instanceof com.alibaba.fastjson2.d)) {
            list.add(obj);
            return;
        }
        a((Collection) list, i, (com.alibaba.fastjson2.d) obj);
        list.add(null);
    }

    public static JSONReader c(String str) {
        if (str != null) {
            return new o(new c(JSONFactory.defaultObjectReaderProvider), str, 0, str.length());
        }
        throw new NullPointerException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONException e(int i, int i2) {
        return new JSONException("syntax error, offset " + i + ", char " + ((char) i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONException f(int i, int i2) {
        return new JSONException("illegal number, offset " + i + ", char " + ((char) i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONException i(int i) {
        return new JSONException("syntax error, expect ',', but '" + ((char) i) + "'");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean j(int i) {
        if (i < 65 || i > 90) {
            if ((i >= 97 && i <= 122) || i == 95 || i == 36) {
                return true;
            }
            return (i >= 48 && i <= 57) || i > 127;
        }
        return true;
    }

    public abstract boolean A();

    public abstract boolean B();

    public final int C() {
        return this.c;
    }

    public abstract void D();

    public abstract long E();

    public long F() {
        return E();
    }

    public abstract long G();

    public abstract long H();

    public abstract String I();

    public abstract String J();

    public final boolean K() {
        return this.u;
    }

    public abstract long L();

    public final String M() {
        L();
        return J();
    }

    public abstract void N();

    public boolean O() {
        return false;
    }

    public abstract byte[] P();

    public byte[] Q() {
        if (this.d == 'x') {
            return P();
        }
        if (z()) {
            String az = az();
            if (az.isEmpty()) {
                return null;
            }
            if ((this.f2934a.p & Feature.Base64StringAsByteArray.mask) != 0) {
                return com.alibaba.fastjson2.util.d.b(az);
            }
            throw new JSONException(d("not support input " + az));
        } else if (!q()) {
            throw new JSONException(d("not support read binary"));
        } else {
            int i = 0;
            byte[] bArr = new byte[64];
            while (this.d != ']') {
                if (i == bArr.length) {
                    int length = bArr.length;
                    bArr = Arrays.copyOf(bArr, length + (length >> 1));
                }
                bArr[i] = (byte) R();
                i++;
            }
            D();
            s();
            return Arrays.copyOf(bArr, i);
        }
    }

    public abstract int R();

    public boolean S() {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract Integer T();

    public final int U() {
        int i;
        switch (this.k) {
            case 1:
            case 9:
            case 10:
                if (this.o == 0 && this.p == 0 && (i = this.q) != Integer.MIN_VALUE) {
                    return this.j ? -i : i;
                }
                Number aP = aP();
                if (!(aP instanceof Long)) {
                    if (!(aP instanceof BigInteger)) {
                        return aP.intValue();
                    }
                    try {
                        return ((BigInteger) aP).intValueExact();
                    } catch (ArithmeticException unused) {
                        throw bc();
                    }
                }
                long longValue = aP.longValue();
                if (longValue >= -2147483648L && longValue <= 2147483647L) {
                    return (int) longValue;
                }
                throw new JSONException(d("integer overflow " + longValue));
            case 2:
                return aP().intValue();
            case 3:
                return a(this.s);
            case 4:
                return this.i ? 1 : 0;
            case 5:
                if ((this.f2934a.p & Feature.ErrorOnNullForPrimitives.mask) != 0) {
                    throw new JSONException(d("int value not support input null"));
                }
                return 0;
            case 6:
                Number b2 = b((Map) this.t);
                if (b2 == null) {
                    return 0;
                }
                return b2.intValue();
            case 7:
                return b((List) this.t);
            case 8:
                try {
                    return aJ().intValueExact();
                } catch (ArithmeticException unused2) {
                    throw bc();
                }
            case 11:
            case 12:
            case 13:
                return aP().intValue();
            default:
                throw new JSONException("TODO : " + ((int) this.k));
        }
    }

    public final long V() {
        int i;
        switch (this.k) {
            case 1:
            case 9:
            case 10:
                if (this.o == 0 && this.p == 0 && (i = this.q) != Integer.MIN_VALUE) {
                    return this.j ? -i : i;
                }
                Number aP = aP();
                if (!(aP instanceof BigInteger)) {
                    return aP.longValue();
                }
                try {
                    return ((BigInteger) aP).longValueExact();
                } catch (ArithmeticException unused) {
                    throw bc();
                }
            case 2:
                return aP().longValue();
            case 3:
                return b(this.s);
            case 4:
                return this.i ? 1L : 0L;
            case 5:
                if ((this.f2934a.p & Feature.ErrorOnNullForPrimitives.mask) != 0) {
                    throw new JSONException(d("long value not support input null"));
                }
                return 0L;
            case 6:
                return a((Map) this.t);
            case 7:
                return b((List) this.t);
            case 8:
                try {
                    return aJ().longValueExact();
                } catch (ArithmeticException unused2) {
                    throw bc();
                }
            case 11:
            case 12:
            case 13:
                return aP().longValue();
            default:
                throw new JSONException("TODO : " + ((int) this.k));
        }
    }

    public abstract void W();

    public long[] X() {
        if (g()) {
            return null;
        }
        if (!q()) {
            if (!z()) {
                throw new JSONException(d("TODO"));
            }
            String az = az();
            if (az.isEmpty()) {
                return null;
            }
            throw new JSONException(d("not support input " + az));
        }
        long[] jArr = new long[8];
        int i = 0;
        while (!r()) {
            if (b()) {
                throw new JSONException(d("input end"));
            }
            if (i == jArr.length) {
                jArr = Arrays.copyOf(jArr, jArr.length << 1);
            }
            jArr[i] = Y();
            i++;
        }
        s();
        return i == jArr.length ? jArr : Arrays.copyOf(jArr, i);
    }

    public abstract long Y();

    public abstract Long Z();

    public final char a() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final char a(int i) {
        if (i != 34 && i != 35 && i != 64) {
            if (i == 70) {
                return '\f';
            }
            if (i != 95) {
                if (i == 98) {
                    return '\b';
                }
                if (i == 102) {
                    return '\f';
                }
                if (i == 110) {
                    return '\n';
                }
                if (i == 114) {
                    return '\r';
                }
                if (i == 116) {
                    return '\t';
                }
                if (i == 118) {
                    return (char) 11;
                }
                switch (i) {
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                        break;
                    default:
                        switch (i) {
                            case 46:
                            case 47:
                                break;
                            case 48:
                                return (char) 0;
                            case 49:
                                return (char) 1;
                            case 50:
                                return (char) 2;
                            case 51:
                                return (char) 3;
                            case 52:
                                return (char) 4;
                            case 53:
                                return (char) 5;
                            case 54:
                                return (char) 6;
                            case 55:
                                return (char) 7;
                            default:
                                switch (i) {
                                    case 91:
                                    case 92:
                                    case 93:
                                        break;
                                    default:
                                        throw new JSONException(d("unclosed.str '\\" + ((char) i)));
                                }
                        }
                }
            }
        }
        return (char) i;
    }

    protected final int a(String str) {
        if (com.alibaba.fastjson2.util.d.a(str)) {
            return Integer.parseInt(str);
        }
        throw new JSONException("parseInt error, value : " + str);
    }

    public final long a(long j) {
        return j | this.f2934a.p;
    }

    protected final long a(Map map) {
        Object obj = map.get("val");
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        throw new JSONException("parseLong error, value : " + map);
    }

    public bu a(long j, Class cls, long j2) {
        Class<?> a2;
        bu a3 = this.f2934a.a(j);
        if (a3 != null) {
            return a3;
        }
        String aG = aG();
        if (this.f2934a.u == null || (a2 = this.f2934a.u.a(aG, cls, j2)) == null) {
            return this.f2934a.w.a(aG, cls, j2 | this.f2934a.p);
        }
        return this.f2934a.w.a(a2, (j2 & Feature.FieldBased.mask) != 0);
    }

    public bu a(Class cls, long j, long j2) {
        return null;
    }

    public final bu a(Type type) {
        return this.f2934a.w.a(type, (this.f2934a.p & Feature.FieldBased.mask) != 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final BigDecimal a(JSONObject jSONObject) {
        BigDecimal bigDecimal = jSONObject.getBigDecimal("value");
        if (bigDecimal == null) {
            bigDecimal = jSONObject.getBigDecimal("$numberDecimal");
        }
        if (bigDecimal != null) {
            return bigDecimal;
        }
        throw new JSONException("can not cast to decimal " + jSONObject);
    }

    public void a(e eVar) {
        this.c = eVar.f2938a;
        this.d = (char) eVar.b;
    }

    public final void a(com.alibaba.fastjson2.reader.d dVar, Object obj, com.alibaba.fastjson2.d dVar2) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(new d(dVar, obj, dVar.b, dVar2));
    }

    public final void a(Class cls) {
        if ((this.f2934a.p & Feature.ErrorOnNoneSerializable.mask) == 0 || Serializable.class.isAssignableFrom(cls)) {
            return;
        }
        throw new JSONException("not support none-Serializable, class " + cls.getName());
    }

    public final void a(Object obj) {
        if (this.b == null) {
            return;
        }
        Object obj2 = null;
        for (int i = 0; i < this.b.size(); i++) {
            d dVar = this.b.get(i);
            com.alibaba.fastjson2.d dVar2 = dVar.d;
            com.alibaba.fastjson2.reader.d dVar3 = dVar.f2937a;
            if (!dVar2.i) {
                c cVar = this.f2934a;
                dVar2.b = cVar;
                if ((cVar.p & Feature.FieldBased.mask) != 0) {
                    JSONWriter.a a2 = JSONFactory.a();
                    a2.k |= JSONWriter.Feature.FieldBased.mask;
                    dVar2.c = a2;
                }
                obj2 = dVar2.a(obj);
            }
            Object obj3 = dVar.c;
            Object obj4 = dVar.b;
            if (obj3 != null) {
                if (obj4 instanceof Map) {
                    Map map = (Map) obj4;
                    if (!(obj3 instanceof k)) {
                        map.put(obj3, obj2);
                    } else if (map instanceof LinkedHashMap) {
                        int size = map.size();
                        if (size != 0) {
                            Object[] objArr = new Object[size];
                            Object[] objArr2 = new Object[size];
                            int i2 = 0;
                            for (Map.Entry entry : map.entrySet()) {
                                Object key = entry.getKey();
                                if (obj3 == key) {
                                    objArr[i2] = obj2;
                                } else {
                                    objArr[i2] = key;
                                }
                                objArr2[i2] = entry.getValue();
                                i2++;
                            }
                            map.clear();
                            for (int i3 = 0; i3 < objArr.length; i3++) {
                                map.put(objArr[i3], objArr2[i3]);
                            }
                        }
                    } else {
                        map.put(obj2, map.remove(obj3));
                    }
                } else if (obj3 instanceof Integer) {
                    if (obj4 instanceof List) {
                        int intValue = ((Integer) obj3).intValue();
                        List list = (List) obj4;
                        if (intValue == list.size()) {
                            list.add(obj2);
                        } else if (intValue >= list.size() || list.get(intValue) != null) {
                            list.add(intValue, obj2);
                        } else {
                            list.set(intValue, obj2);
                        }
                    } else if (obj4 instanceof Object[]) {
                        ((Object[]) obj4)[((Integer) obj3).intValue()] = obj2;
                    } else if (obj4 instanceof Collection) {
                        ((Collection) obj4).add(obj2);
                    }
                }
            }
            dVar3.a((com.alibaba.fastjson2.reader.d) obj4, obj2);
        }
    }

    public final void a(Object obj, long j) {
        if (obj != null) {
            bu a2 = this.f2934a.w.a(obj.getClass(), ((this.f2934a.p | j) & Feature.FieldBased.mask) != 0);
            if (a2 instanceof cc) {
                ((cc) a2).a(this, obj, j);
                return;
            } else if (!(obj instanceof Map)) {
                throw new JSONException("read object not support");
            } else {
                a((Map) obj, j);
                return;
            }
        }
        throw new JSONException("object is null");
    }

    public final void a(Object obj, Feature... featureArr) {
        long j = 0;
        for (Feature feature : featureArr) {
            j |= feature.mask;
        }
        a(obj, j);
    }

    public final void a(Collection collection) {
        if (!q()) {
            throw new JSONException("illegal input, offset " + this.c + ", char " + this.d);
        }
        this.r++;
        if (this.r >= this.f2934a.l) {
            throw new JSONException("level too large : " + this.r);
        }
        while (!r()) {
            collection.add(aM());
            s();
        }
        this.r--;
        s();
    }

    public final void a(Collection collection, int i, com.alibaba.fastjson2.d dVar) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(new d(null, collection, Integer.valueOf(i), dVar));
    }

    public final void a(List list) {
        if (!q()) {
            throw new JSONException("illegal input, offset " + this.c + ", char " + this.d);
        }
        this.r++;
        if (this.r >= this.f2934a.l) {
            throw new JSONException("level too large : " + this.r);
        }
        while (!r()) {
            list.add(ec.INSTANCE.a(this, (Type) null, (Object) null, 0L));
            s();
        }
        this.r--;
        s();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.util.Map r18, long r19) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReader.a(java.util.Map, long):void");
    }

    public final void a(Map map, Object obj, com.alibaba.fastjson2.d dVar) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (map instanceof LinkedHashMap) {
            map.put(obj, null);
        }
        this.b.add(new d(null, map, obj, dVar));
    }

    public final void a(boolean z) {
        this.u = z;
    }

    public final void a(Object[] objArr, int i, com.alibaba.fastjson2.d dVar) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(new d(null, objArr, Integer.valueOf(i), dVar));
    }

    public boolean a(byte b2) {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract boolean a(char c2);

    public abstract boolean a(char c2, char c3, char c4, char c5, char c6);

    public final boolean a(Feature feature) {
        return (this.f2934a.p & feature.mask) != 0;
    }

    public Date aA() {
        if ((this.f2934a.f || this.f2934a.g || this.f2934a.f2936a == null) && d()) {
            long Y = Y();
            if (this.f2934a.g) {
                Y *= 1000;
            }
            return new Date(Y);
        }
        return DateUtils.a(az(), this.f2934a.f2936a, this.f2934a.d());
    }

    public Calendar aB() {
        Date aA = aA();
        if (aA == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance(this.f2934a.g());
        calendar.setTime(aA);
        return calendar;
    }

    public String[] aC() {
        String[] strArr = null;
        if (this.d != 'n' || !g()) {
            if (!q()) {
                char c2 = this.d;
                if (c2 != '\"' && c2 != '\'') {
                    throw new JSONException(d("not support input"));
                }
                String az = az();
                if (az.isEmpty()) {
                    return null;
                }
                throw new JSONException(d("not support input " + az));
            }
            int i = 0;
            while (!r()) {
                if (b()) {
                    throw new JSONException(d("input end"));
                }
                if (strArr == null) {
                    strArr = new String[16];
                } else if (i == strArr.length) {
                    strArr = (String[]) Arrays.copyOf(strArr, strArr.length << 1);
                }
                strArr[i] = az();
                i++;
            }
            if (strArr == null) {
                strArr = new String[0];
            }
            s();
            return strArr.length == i ? strArr : (String[]) Arrays.copyOf(strArr, i);
        }
        return null;
    }

    public char aD() {
        String az = az();
        if (az == null || az.isEmpty()) {
            this.h = true;
            return (char) 0;
        }
        return az.charAt(0);
    }

    public abstract void aE();

    public abstract boolean aF();

    public abstract String aG();

    public boolean aH() {
        return this.h;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, java.lang.Object> aI() {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReader.aI():java.util.Map");
    }

    public final BigDecimal aJ() {
        int[] iArr;
        int i;
        int[] iArr2;
        long j;
        int i2;
        BigDecimal bigDecimal = null;
        if (this.h) {
            return null;
        }
        byte b2 = this.k;
        int i3 = -1;
        if (b2 == 1) {
            if (this.o == 0 && this.p == 0 && (i = this.q) >= 0) {
                if (this.j) {
                    i = -i;
                }
                return BigDecimal.valueOf(i);
            }
            int i4 = this.n;
            if (i4 == 0) {
                int i5 = this.o;
                if (i5 == 0) {
                    int i6 = this.q;
                    long j2 = i6 & 4294967295L;
                    int i7 = this.p;
                    long j3 = i7 & 4294967295L;
                    if (j3 <= 2147483647L) {
                        long j4 = (j3 << 32) + j2;
                        if (this.j) {
                            j4 = -j4;
                        }
                        return BigDecimal.valueOf(j4);
                    }
                    iArr = new int[]{i7, i6};
                } else {
                    iArr = new int[]{i5, this.p, this.q};
                }
            } else {
                iArr = new int[]{i4, this.o, this.p, this.q};
            }
            if (!this.j) {
                i3 = 1;
            }
            return new BigDecimal(b.f2935a.a(Integer.valueOf(i3), iArr));
        } else if (b2 != 2) {
            if (b2 == 3) {
                try {
                    return TypeUtils.b(this.s);
                } catch (NumberFormatException e2) {
                    throw new JSONException(d("read decimal error, value " + this.s), e2);
                }
            } else if (b2 == 4) {
                return this.i ? BigDecimal.ONE : BigDecimal.ZERO;
            } else if (b2 != 6) {
                if (b2 == 8) {
                    return TypeUtils.b(this.s);
                }
                throw new JSONException("TODO : " + ((int) this.k));
            } else {
                JSONObject jSONObject = (JSONObject) this.t;
                BigDecimal bigDecimal2 = jSONObject.getBigDecimal("value");
                if (bigDecimal2 == null) {
                    bigDecimal2 = jSONObject.getBigDecimal("$numberDecimal");
                }
                if (bigDecimal2 != null) {
                    return bigDecimal2;
                }
                throw new JSONException("TODO : " + ((int) this.k));
            }
        } else {
            if (this.l == 0 && this.n == 0 && this.o == 0) {
                if (this.p != 0 || (i2 = this.q) < 0) {
                    long j5 = this.q & 4294967295L;
                    long j6 = 4294967295L & this.p;
                    if (j6 <= 2147483647L) {
                        j = (j6 << 32) + j5;
                        if (this.j) {
                            j = -j;
                        }
                    }
                } else {
                    if (this.j) {
                        i2 = -i2;
                    }
                    j = i2;
                }
                bigDecimal = BigDecimal.valueOf(j, this.P);
            }
            if (bigDecimal == null) {
                int i8 = this.n;
                if (i8 == 0) {
                    int i9 = this.o;
                    if (i9 == 0) {
                        int i10 = this.p;
                        iArr2 = i10 == 0 ? new int[]{this.q} : new int[]{i10, this.q};
                    } else {
                        iArr2 = new int[]{i9, this.p, this.q};
                    }
                } else {
                    iArr2 = new int[]{i8, this.o, this.p, this.q};
                }
                if (!this.j) {
                    i3 = 1;
                }
                bigDecimal = new BigDecimal(b.f2935a.a(Integer.valueOf(i3), iArr2), this.P);
            }
            if (this.l == 0) {
                return bigDecimal;
            }
            return TypeUtils.a(Double.parseDouble(bigDecimal.toPlainString() + "E" + ((int) this.l)));
        }
    }

    public Boolean aK() {
        if (g()) {
            return null;
        }
        boolean aL = aL();
        if (!aL && this.h) {
            return null;
        }
        return Boolean.valueOf(aL);
    }

    public abstract boolean aL();

    public Object aM() {
        return b((Class<Object>) Object.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List aN() {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReader.aN():java.util.List");
    }

    public final BigInteger aO() {
        Number aP = aP();
        if (aP == null) {
            return null;
        }
        return aP instanceof BigInteger ? (BigInteger) aP : BigInteger.valueOf(aP.longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0316  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Number aP() {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReader.aP():java.lang.Number");
    }

    public e aQ() {
        return new e(this.c, this.d);
    }

    public final String aR() {
        return d((String) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONException aZ() {
        return new JSONException(d("not support unquoted name"));
    }

    public abstract float aa();

    public final Float ab() {
        if (g()) {
            return null;
        }
        this.h = false;
        float aa = aa();
        if (!this.h) {
            return Float.valueOf(aa);
        }
        return null;
    }

    public abstract double ac();

    public final Double ad() {
        if (g()) {
            return null;
        }
        this.h = false;
        double ac = ac();
        if (!this.h) {
            return Double.valueOf(ac);
        }
        return null;
    }

    public Number ae() {
        ay();
        return aP();
    }

    public BigInteger af() {
        ay();
        return aO();
    }

    public abstract BigDecimal ag();

    public abstract UUID ah();

    public com.alibaba.fastjson2.time.c ai() {
        if (d()) {
            return com.alibaba.fastjson2.time.f.a(com.alibaba.fastjson2.time.a.a(Y()), this.f2934a.d()).f3024a;
        }
        if (this.f2934a.f2936a == null || this.f2934a.b || this.f2934a.c || this.f2934a.e || this.f2934a.h) {
            int ak = ak();
            switch (ak) {
                case 8:
                    com.alibaba.fastjson2.time.b au = au();
                    if (au != null) {
                        return com.alibaba.fastjson2.time.c.a(au, com.alibaba.fastjson2.time.d.MIN);
                    }
                    return null;
                case 9:
                    com.alibaba.fastjson2.time.b av = av();
                    if (av != null) {
                        return com.alibaba.fastjson2.time.c.a(av, com.alibaba.fastjson2.time.d.MIN);
                    }
                    return null;
                case 10:
                    com.alibaba.fastjson2.time.b aw = aw();
                    if (aw != null) {
                        return com.alibaba.fastjson2.time.c.a(aw, com.alibaba.fastjson2.time.d.MIN);
                    }
                    return null;
                case 11:
                    com.alibaba.fastjson2.time.b ax = ax();
                    if (ax != null) {
                        return com.alibaba.fastjson2.time.c.a(ax, com.alibaba.fastjson2.time.d.MIN);
                    }
                    return null;
                case 16:
                    return ao();
                case 17:
                    com.alibaba.fastjson2.time.c ap = ap();
                    if (ap != null) {
                        return ap;
                    }
                    break;
                case 18:
                    com.alibaba.fastjson2.time.c aq = aq();
                    if (aq != null) {
                        return aq;
                    }
                    break;
                case 19:
                    com.alibaba.fastjson2.time.c ar = ar();
                    if (ar != null) {
                        return ar;
                    }
                    break;
                case 20:
                    com.alibaba.fastjson2.time.c as = as();
                    if (as != null) {
                        return as;
                    }
                    com.alibaba.fastjson2.time.f c2 = c(ak);
                    if (c2 != null) {
                        return c2.f3024a;
                    }
                    break;
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    com.alibaba.fastjson2.time.c b2 = b(ak);
                    if (b2 != null) {
                        return b2;
                    }
                    com.alibaba.fastjson2.time.f c3 = c(ak);
                    if (c3 != null) {
                        com.alibaba.fastjson2.time.e d2 = this.f2934a.d();
                        if (!c3.c.equals(d2)) {
                            c3 = com.alibaba.fastjson2.time.f.a(c3.a(), d2);
                        }
                        return c3.f3024a;
                    }
                    break;
            }
        }
        String az = az();
        if (az.isEmpty() || "null".equals(az)) {
            this.h = true;
            return null;
        }
        DateTimeFormatter c4 = this.f2934a.c();
        if (c4 != null) {
            return !this.f2934a.j ? com.alibaba.fastjson2.time.c.a(c4.a(az), com.alibaba.fastjson2.time.d.MIN) : c4.b(az);
        } else if (com.alibaba.fastjson2.util.d.a(az)) {
            long parseLong = Long.parseLong(az);
            if (this.f2934a.g) {
                parseLong *= 1000;
            }
            return com.alibaba.fastjson2.time.c.a(com.alibaba.fastjson2.time.a.a(parseLong), this.f2934a.d());
        } else if (!az.startsWith("/Date(", 0) || !az.endsWith(")/")) {
            if (az.equals("0000-00-00 00:00:00")) {
                this.h = true;
                return null;
            }
            throw new JSONException(d("read LocalDateTime error " + az));
        } else {
            String substring = az.substring(6, az.length() - 2);
            int indexOf = substring.indexOf(43);
            if (indexOf == -1) {
                indexOf = substring.indexOf(45);
            }
            if (indexOf != -1) {
                substring = substring.substring(0, indexOf);
            }
            return com.alibaba.fastjson2.time.c.a(com.alibaba.fastjson2.time.a.a(Long.parseLong(substring)), this.f2934a.d());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
        if (r0 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
        if (r0 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
        if (r0 == null) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.fastjson2.time.f aj() {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReader.aj():com.alibaba.fastjson2.time.f");
    }

    protected abstract int ak();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
        if (r9 != null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
        if (r9 != null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ac, code lost:
        r9 = com.alibaba.fastjson2.time.c.a(r9, com.alibaba.fastjson2.time.d.MIN);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long al() {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReader.al():long");
    }

    protected abstract com.alibaba.fastjson2.time.c am();

    protected abstract com.alibaba.fastjson2.time.c an();

    protected abstract com.alibaba.fastjson2.time.c ao();

    protected abstract com.alibaba.fastjson2.time.c ap();

    protected abstract com.alibaba.fastjson2.time.c aq();

    protected abstract com.alibaba.fastjson2.time.c ar();

    protected abstract com.alibaba.fastjson2.time.c as();

    public abstract long at();

    protected abstract com.alibaba.fastjson2.time.b au();

    protected abstract com.alibaba.fastjson2.time.b av();

    protected abstract com.alibaba.fastjson2.time.b aw();

    protected abstract com.alibaba.fastjson2.time.b ax();

    protected abstract void ay();

    public abstract String az();

    protected final int b(List list) {
        if (list.size() == 1) {
            Object obj = list.get(0);
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
        }
        throw new JSONException("parseLong error, field : value " + list);
    }

    protected final long b(String str) {
        if (com.alibaba.fastjson2.util.d.a(str)) {
            return Long.parseLong(str);
        }
        if (str.length() > 10 && str.length() < 40) {
            try {
                return DateUtils.a(str, this.f2934a.o);
            } catch (JSONException | DateTimeException unused) {
            }
        }
        throw new JSONException("parseLong error, value : " + str);
    }

    protected abstract com.alibaba.fastjson2.time.c b(int i);

    protected final Number b(Map map) {
        Object obj = map.get("val");
        if (obj instanceof Number) {
            return (Number) obj;
        }
        return null;
    }

    public <T> T b(Class<T> cls) {
        return (T) this.f2934a.w.a(cls, (this.f2934a.p & Feature.FieldBased.mask) != 0).a(this, (Type) null, (Object) null, 0L);
    }

    public <T> T b(Type type) {
        return (T) this.f2934a.w.a(type, (this.f2934a.p & Feature.FieldBased.mask) != 0).a(this, (Type) null, (Object) null, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char c2;
        long j;
        long j2;
        int i5 = i2;
        int i6 = i5 - i;
        if (this.P > 0) {
            i6--;
        }
        if (i6 > 38) {
            throw new JSONException("number too large : " + new String(bArr, i, i6));
        }
        int i7 = i6 % 9;
        if (i7 == 0) {
            i7 = 9;
        }
        int i8 = i7 + i;
        int i9 = i + 1;
        char c3 = (char) bArr[i];
        char c4 = '.';
        if (c3 == '.') {
            int i10 = i9 + 1;
            char c5 = (char) bArr[i9];
            i3 = i8 + 1;
            i9 = i10;
            c3 = c5;
        } else {
            i3 = i8;
        }
        int i11 = c3 - '0';
        while (i9 < i8) {
            char c6 = (char) bArr[i9];
            if (c6 == '.') {
                i9++;
                c6 = (char) bArr[i9];
                i3++;
                if (i8 < i5) {
                    i8++;
                }
            }
            i11 = (i11 * 10) + (c6 - '0');
            i9++;
        }
        this.q = i11;
        while (i3 < i5) {
            int i12 = i3 + 9;
            int i13 = i3 + 1;
            char c7 = (char) bArr[i3];
            if (c7 == c4) {
                i4 = i13 + 1;
                c2 = (char) bArr[i13];
                i12++;
                i3 = i12;
            } else {
                i3 = i12;
                i4 = i13;
                c2 = c7;
            }
            int i14 = c2 - '0';
            while (i4 < i12) {
                char c8 = (char) bArr[i4];
                if (c8 == c4) {
                    i4++;
                    c8 = (char) bArr[i4];
                    i3++;
                    i12++;
                }
                i14 = (i14 * 10) + (c8 - '0');
                i4++;
            }
            long j3 = i14 & 4294967295L;
            int i15 = 3;
            long j4 = 0;
            int i16 = 3;
            while (i16 >= 0) {
                if (i16 == 0) {
                    j2 = ((this.n & 4294967295L) * 1000000000) + j4;
                    this.n = (int) j2;
                } else if (i16 == 1) {
                    j2 = ((this.o & 4294967295L) * 1000000000) + j4;
                    this.o = (int) j2;
                } else if (i16 == 2) {
                    j2 = ((this.p & 4294967295L) * 1000000000) + j4;
                    this.p = (int) j2;
                } else if (i16 != i15) {
                    throw new ArithmeticException("BigInteger would overflow supported range");
                } else {
                    j2 = ((this.q & 4294967295L) * 1000000000) + j4;
                    this.q = (int) j2;
                }
                j4 = j2 >>> 32;
                i16--;
                i15 = 3;
            }
            long j5 = (this.q & 4294967295L) + j3;
            this.q = (int) j5;
            long j6 = j5 >>> 32;
            for (int i17 = 2; i17 >= 0; i17--) {
                if (i17 == 0) {
                    j = (this.n & 4294967295L) + j6;
                    this.n = (int) j;
                } else if (i17 == 1) {
                    j = (this.o & 4294967295L) + j6;
                    this.o = (int) j;
                } else if (i17 == 2) {
                    j = (this.p & 4294967295L) + j6;
                    this.p = (int) j;
                } else if (i17 != 3) {
                    throw new ArithmeticException("BigInteger would overflow supported range");
                } else {
                    j = (this.q & 4294967295L) + j6;
                    this.q = (int) j;
                }
                j6 = j >>> 32;
            }
            i5 = i2;
            c4 = '.';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        char c2;
        long j;
        long j2;
        int i5 = i2 - i;
        if (this.P > 0) {
            i5--;
        }
        if (i5 > 38) {
            throw new JSONException("number too large : " + new String(cArr, i, i5));
        }
        int i6 = i5 % 9;
        if (i6 == 0) {
            i6 = 9;
        }
        int i7 = i6 + i;
        int i8 = i + 1;
        char c3 = cArr[i];
        if (c3 == '.') {
            int i9 = i8 + 1;
            char c4 = cArr[i8];
            i3 = i7 + 1;
            i8 = i9;
            c3 = c4;
        } else {
            i3 = i7;
        }
        int i10 = c3 - '0';
        while (i8 < i7) {
            char c5 = cArr[i8];
            if (c5 == '.') {
                i8++;
                c5 = cArr[i8];
                i3++;
                if (i7 < i2) {
                    i7++;
                }
            }
            i10 = (i10 * 10) + (c5 - '0');
            i8++;
        }
        this.q = i10;
        while (i3 < i2) {
            int i11 = i3 + 9;
            int i12 = i3 + 1;
            char c6 = cArr[i3];
            if (c6 == '.') {
                i4 = i12 + 1;
                c2 = cArr[i12];
                i11++;
                i3 = i11;
            } else {
                i3 = i11;
                i4 = i12;
                c2 = c6;
            }
            int i13 = c2 - '0';
            while (i4 < i11) {
                char c7 = cArr[i4];
                if (c7 == '.') {
                    i4++;
                    c7 = cArr[i4];
                    i3++;
                    i11++;
                }
                i13 = (i13 * 10) + (c7 - '0');
                i4++;
            }
            long j3 = 0;
            for (int i14 = 3; i14 >= 0; i14--) {
                if (i14 == 0) {
                    j2 = ((this.n & 4294967295L) * 1000000000) + j3;
                    this.n = (int) j2;
                } else if (i14 == 1) {
                    j2 = ((this.o & 4294967295L) * 1000000000) + j3;
                    this.o = (int) j2;
                } else if (i14 == 2) {
                    j2 = ((this.p & 4294967295L) * 1000000000) + j3;
                    this.p = (int) j2;
                } else if (i14 != 3) {
                    throw new ArithmeticException("BigInteger would overflow supported range");
                } else {
                    j2 = ((this.q & 4294967295L) * 1000000000) + j3;
                    this.q = (int) j2;
                }
                j3 = j2 >>> 32;
            }
            long j4 = (this.q & 4294967295L) + (i13 & 4294967295L);
            this.q = (int) j4;
            long j5 = j4 >>> 32;
            for (int i15 = 2; i15 >= 0; i15--) {
                if (i15 == 0) {
                    j = (this.n & 4294967295L) + j5;
                    this.n = (int) j;
                } else if (i15 == 1) {
                    j = (this.o & 4294967295L) + j5;
                    this.o = (int) j;
                } else if (i15 == 2) {
                    j = (this.p & 4294967295L) + j5;
                    this.p = (int) j;
                } else if (i15 != 3) {
                    throw new ArithmeticException("BigInteger would overflow supported range");
                } else {
                    j = (this.q & 4294967295L) + j5;
                    this.q = (int) j;
                }
                j5 = j >>> 32;
            }
        }
    }

    public boolean b() {
        return this.d == 26;
    }

    public final boolean b(long j) {
        return ((j | this.f2934a.p) & Feature.SupportSmartMatch.mask) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONException bb() {
        return new JSONException(d("illegal value"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONException bc() {
        return new JSONException("illegal number, offset " + this.c + ", char " + this.d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String bd() {
        char c2 = this.d;
        if (c2 != '+' && c2 != '-') {
            if (c2 == '[') {
                return d(aN());
            }
            if (c2 != 'f') {
                if (c2 == 'n') {
                    aE();
                    return null;
                } else if (c2 != 't') {
                    if (c2 == '{') {
                        return c(aI());
                    }
                    switch (c2) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            break;
                        default:
                            throw new JSONException(d("illegal input : " + this.d));
                    }
                }
            }
            this.i = aL();
            return this.i ? "true" : "false";
        }
        ay();
        return aP().toString();
    }

    public byte c() {
        return Byte.MIN_VALUE;
    }

    protected abstract com.alibaba.fastjson2.time.f c(int i);

    protected final Number c(List list) {
        if (list.size() == 1) {
            Object obj = list.get(0);
            if (obj instanceof Number) {
                return (Number) obj;
            }
            if (!(obj instanceof String)) {
                return null;
            }
            return TypeUtils.b((String) obj);
        }
        return null;
    }

    protected final String c(Map map) {
        JSONWriter g = JSONWriter.g();
        g.a((Object) map);
        g.a(map);
        return g.toString();
    }

    public List c(Type type) {
        char c2;
        if (g()) {
            return null;
        }
        if (!q()) {
            throw new JSONException(d("syntax error : " + this.d));
        }
        boolean z = true;
        bu a2 = this.f2934a.w.a(type, (this.f2934a.p & Feature.FieldBased.mask) != 0);
        ArrayList arrayList = new ArrayList();
        while (!r()) {
            int i = this.c;
            Object a3 = a2.a(this, (Type) null, (Object) null, 0L);
            if (i == this.c || (c2 = this.d) == '}' || c2 == 26) {
                throw new JSONException("illegal input : " + this.d + ", offset " + C());
            }
            arrayList.add(a3);
        }
        if (this.d != ',') {
            z = false;
        }
        this.e = z;
        if (z) {
            D();
        }
        return arrayList;
    }

    public final boolean c(long j) {
        return ((j | this.f2934a.p) & Feature.SupportArrayToBean.mask) != 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONException d(int i, int i2) {
        throw new JSONException("error, offset " + i + ", char " + ((char) i2));
    }

    public String d(String str) {
        if (str == null || str.isEmpty()) {
            return "offset " + this.c;
        }
        return str + ", offset " + this.c;
    }

    protected final String d(List list) {
        JSONWriter g = JSONWriter.g();
        g.a((Object) list);
        g.b(list);
        return g.toString();
    }

    public boolean d() {
        char c2 = this.d;
        if (c2 == '-' || c2 == '+') {
            return true;
        }
        return c2 >= '0' && c2 <= '9';
    }

    public final boolean d(long j) {
        return ((j | this.f2934a.p) & Feature.SupportAutoType.mask) != 0;
    }

    public abstract Date f();

    public abstract boolean g();

    public final c h() {
        return this.f2934a;
    }

    public final Locale i() {
        return this.f2934a.f();
    }

    public final com.alibaba.fastjson2.time.e j() {
        return this.f2934a.d();
    }

    public final boolean k() {
        return (this.f2934a.p & Feature.SupportSmartMatch.mask) != 0;
    }

    public final boolean l() {
        return (this.f2934a.p & Feature.InitStringFieldAsEmpty.mask) != 0;
    }

    public final boolean m() {
        return (this.f2934a.p & Feature.SupportArrayToBean.mask) != 0;
    }

    public abstract boolean n();

    public abstract boolean o();

    public abstract boolean p();

    public abstract boolean q();

    public abstract boolean r();

    public abstract boolean s();

    public int t() {
        if (q()) {
            return Integer.MAX_VALUE;
        }
        throw new JSONException(d("illegal input, expect '[', but " + this.d));
    }

    public abstract boolean u();

    public abstract String v();

    public abstract boolean w();

    public boolean x() {
        return this.d == '{';
    }

    public boolean y() {
        char c2 = this.d;
        if (c2 == '+' || c2 == '-') {
            return true;
        }
        switch (c2) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return true;
            default:
                return false;
        }
    }

    public boolean z() {
        char c2 = this.d;
        return c2 == '\"' || c2 == '\'';
    }
}
