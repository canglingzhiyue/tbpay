package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.function.Supplier;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.reader.bu;
import com.alibaba.fastjson2.reader.dq;
import com.alibaba.fastjson2.time.e;
import com.alibaba.fastjson2.writer.du;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import tb.fxb;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public final class JSONFactory {
    static final byte[] A;
    static com.alibaba.fastjson2.function.d B;
    static com.alibaba.fastjson2.function.d C;
    static Class D;
    static volatile boolean E;

    /* renamed from: a  reason: collision with root package name */
    static long f2931a;
    static String b;
    static e c;
    static long d;
    public static final ObjectReaderProvider defaultObjectReaderProvider;
    public static final du defaultObjectWriterProvider;
    static String e;
    static e f;
    static Supplier<Map> g;
    static Supplier<List> h;
    static final com.alibaba.fastjson2.util.i[] i;
    static final a[] j;
    static final BigDecimal k;
    static final BigDecimal l;
    static final BigInteger m;
    static final BigInteger n;
    static final char[] o;
    static final int[] p;
    static final float[] q;
    static final double[] r;
    static final Double s;
    static final CacheItem[] t;
    static final AtomicReferenceFieldUpdater<CacheItem, char[]> u;
    static final AtomicReferenceFieldUpdater<CacheItem, byte[]> v;
    static Class w;
    static final bu<JSONArray> x;
    static final bu<JSONObject> y;
    static final char[] z;

    /* loaded from: classes2.dex */
    static final class CacheItem {
        volatile byte[] bytes;
        volatile char[] chars;

        static {
            kge.a(-781777071);
        }

        CacheItem() {
        }
    }

    /* loaded from: classes2.dex */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final String f2932a;
        final long b;
        final long c;

        static {
            kge.a(1535214899);
        }

        public a(String str, long j, long j2) {
            this.f2932a = str;
            this.b = j;
            this.c = j2;
        }
    }

    /* loaded from: classes2.dex */
    private static final class b implements com.alibaba.fastjson2.function.d {
        static {
            kge.a(1113237466);
            kge.a(895087661);
        }

        private b() {
        }

        @Override // com.alibaba.fastjson2.function.d
        public Object apply(Object obj) {
            return ((com.alibaba.fastjson.JSONObject) obj).getInnerMap();
        }
    }

    /* loaded from: classes2.dex */
    private static final class c implements com.alibaba.fastjson2.function.d {
        static {
            kge.a(-852473821);
            kge.a(895087661);
        }

        private c() {
        }

        @Override // com.alibaba.fastjson2.function.d
        public Object apply(Object obj) {
            return new com.alibaba.fastjson.JSONObject((Map) obj);
        }
    }

    static {
        kge.a(1468082528);
        i = new com.alibaba.fastjson2.util.i[8192];
        j = new a[8192];
        k = BigDecimal.valueOf(-9007199254740991L);
        l = BigDecimal.valueOf(9007199254740991L);
        m = BigInteger.valueOf(-9007199254740991L);
        n = BigInteger.valueOf(9007199254740991L);
        o = new char[]{'A', 'B', 'C', com.taobao.tao.image.d.LEVEL_D, com.taobao.tao.image.d.LEVEL_E, 'F', 'G', 'H', com.taobao.tao.image.d.LEVEL_I, 'J', 'K', com.taobao.tao.image.d.LEVEL_L, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', com.taobao.tao.image.d.LEVEL_V, com.taobao.tao.image.d.LEVEL_W, 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', fxb.DIR};
        p = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0, 0, 0, 10, 11, 12, 13, 14, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 11, 12, 13, 14, 15};
        q = new float[]{1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
        r = new double[]{1.0d, 10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d};
        s = Double.valueOf((double) mto.a.GEO_NOT_SUPPORT);
        CacheItem[] cacheItemArr = new CacheItem[16];
        for (int i2 = 0; i2 < cacheItemArr.length; i2++) {
            cacheItemArr[i2] = new CacheItem();
        }
        t = cacheItemArr;
        u = AtomicReferenceFieldUpdater.newUpdater(CacheItem.class, char[].class, "chars");
        v = AtomicReferenceFieldUpdater.newUpdater(CacheItem.class, byte[].class, "bytes");
        defaultObjectWriterProvider = new du();
        defaultObjectReaderProvider = new ObjectReaderProvider();
        x = dq.v;
        y = com.alibaba.fastjson2.reader.du.e;
        z = new char[256];
        A = new byte[55];
        for (int i3 = 0; i3 < 256; i3++) {
            int i4 = (i3 >> 4) & 15;
            int i5 = i3 & 15;
            z[i3] = (char) (((i4 < 10 ? i4 + 48 : (i4 + 97) - 10) << 8) + (i5 < 10 ? i5 + 48 : (i5 + 97) - 10));
        }
        for (char c2 = '0'; c2 <= '9'; c2 = (char) (c2 + 1)) {
            int i6 = c2 - '0';
            A[i6] = (byte) i6;
        }
        for (char c3 = 'a'; c3 <= 'f'; c3 = (char) (c3 + 1)) {
            A[c3 - '0'] = (byte) ((c3 - 'a') + 10);
        }
        for (char c4 = 'A'; c4 <= 'F'; c4 = (char) (c4 + 1)) {
            A[c4 - '0'] = (byte) ((c4 - 'A') + 10);
        }
    }

    public static JSONReader.c a(long j2) {
        return new JSONReader.c(defaultObjectReaderProvider, j2);
    }

    public static JSONReader.c a(ObjectReaderProvider objectReaderProvider, JSONReader.Feature... featureArr) {
        if (objectReaderProvider == null) {
            objectReaderProvider = defaultObjectReaderProvider;
        }
        JSONReader.c cVar = new JSONReader.c(objectReaderProvider);
        cVar.a(featureArr);
        return cVar;
    }

    public static JSONReader.c a(JSONReader.Feature... featureArr) {
        return new JSONReader.c(defaultObjectReaderProvider, featureArr);
    }

    public static JSONWriter.a a() {
        return new JSONWriter.a(defaultObjectWriterProvider);
    }

    public static JSONWriter.a a(JSONWriter.Feature... featureArr) {
        return new JSONWriter.a(defaultObjectWriterProvider, featureArr);
    }

    public static Map a(Map map) {
        return new com.alibaba.fastjson.JSONObject(map);
    }

    public static JSONReader.c b() {
        return new JSONReader.c(defaultObjectReaderProvider);
    }

    public static ObjectReaderProvider c() {
        return defaultObjectReaderProvider;
    }

    public static Class d() {
        if (w == null && !E) {
            try {
                w = com.alibaba.fastjson.JSONObject.class;
            } catch (Throwable unused) {
                E = true;
            }
        }
        return w;
    }

    public static Class e() {
        if (D == null && !E) {
            try {
                D = com.alibaba.fastjson.JSONArray.class;
            } catch (Throwable unused) {
                E = true;
            }
        }
        return D;
    }

    public static com.alibaba.fastjson2.function.d f() {
        if (B == null && !E && d() != null) {
            B = new c();
        }
        return B;
    }

    public static com.alibaba.fastjson2.function.d g() {
        if (C == null && !E && d() != null) {
            C = new b();
        }
        return C;
    }
}
