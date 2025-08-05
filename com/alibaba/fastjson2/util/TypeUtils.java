package com.alibaba.fastjson2.util;

import android.support.media.ExifInterface;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.a;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.taobao.artc.api.AConstants;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import tb.crd;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public class TypeUtils {
    public static final Class CLASS_SINGLE_LIST;
    public static final Class CLASS_SINGLE_SET;
    public static final Class CLASS_UNMODIFIABLE_LIST;
    public static final ParameterizedType PARAM_TYPE_LIST_STR;
    public static final double[] SMALL_10_POW;

    /* renamed from: a  reason: collision with root package name */
    static final float[] f3029a;
    static final double[] b;
    static final double[] c;
    static final Cache d;
    static final AtomicReferenceFieldUpdater<Cache, char[]> e;
    private static final BigInteger[] f;
    private static volatile BigInteger[] g;
    static final /* synthetic */ boolean h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class Cache {
        volatile char[] chars;

        static {
            kge.a(1349205322);
        }

        Cache() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final Map<Class, String> f3030a;
        static final Map<String, Class> b;

        static {
            Class[] clsArr;
            kge.a(-196455274);
            f3030a = new IdentityHashMap((int) crd.DETECT_WIDTH);
            b = new ConcurrentHashMap(256);
            f3030a.put(Byte.TYPE, "B");
            f3030a.put(Short.TYPE, ExifInterface.LATITUDE_SOUTH);
            f3030a.put(Integer.TYPE, TLogTracker.LEVEL_INFO);
            f3030a.put(Long.TYPE, "J");
            f3030a.put(Float.TYPE, UTConstant.Args.UT_SUCCESS_F);
            f3030a.put(Double.TYPE, TLogTracker.LEVEL_DEBUG);
            f3030a.put(Character.TYPE, "C");
            f3030a.put(Boolean.TYPE, "Z");
            f3030a.put(Object[].class, "[O");
            f3030a.put(Object[][].class, "[[O");
            f3030a.put(byte[].class, "[B");
            f3030a.put(byte[][].class, "[[B");
            f3030a.put(short[].class, "[S");
            f3030a.put(short[][].class, "[[S");
            f3030a.put(int[].class, "[I");
            f3030a.put(int[][].class, "[[I");
            f3030a.put(long[].class, "[J");
            f3030a.put(long[][].class, "[[J");
            f3030a.put(float[].class, "[F");
            f3030a.put(float[][].class, "[[F");
            f3030a.put(double[].class, "[D");
            f3030a.put(double[][].class, "[[D");
            f3030a.put(char[].class, "[C");
            f3030a.put(char[][].class, "[[C");
            f3030a.put(boolean[].class, "[Z");
            f3030a.put(boolean[][].class, "[[Z");
            f3030a.put(Byte[].class, "[Byte");
            f3030a.put(Byte[][].class, "[[Byte");
            f3030a.put(Short[].class, "[Short");
            f3030a.put(Short[][].class, "[[Short");
            f3030a.put(Integer[].class, "[Integer");
            f3030a.put(Integer[][].class, "[[Integer");
            f3030a.put(Long[].class, "[Long");
            f3030a.put(Long[][].class, "[[Long");
            f3030a.put(Float[].class, "[Float");
            f3030a.put(Float[][].class, "[[Float");
            f3030a.put(Double[].class, "[Double");
            f3030a.put(Double[][].class, "[[Double");
            f3030a.put(Character[].class, "[Character");
            f3030a.put(Character[][].class, "[[Character");
            f3030a.put(Boolean[].class, "[Boolean");
            f3030a.put(Boolean[][].class, "[[Boolean");
            f3030a.put(String[].class, "[String");
            f3030a.put(String[][].class, "[[String");
            f3030a.put(BigDecimal[].class, "[BigDecimal");
            f3030a.put(BigDecimal[][].class, "[[BigDecimal");
            f3030a.put(BigInteger[].class, "[BigInteger");
            f3030a.put(BigInteger[][].class, "[[BigInteger");
            f3030a.put(UUID[].class, "[UUID");
            f3030a.put(UUID[][].class, "[[UUID");
            f3030a.put(Object.class, "Object");
            f3030a.put(HashMap.class, "M");
            b.put("HashMap", HashMap.class);
            b.put("java.util.HashMap", HashMap.class);
            f3030a.put(LinkedHashMap.class, "LM");
            b.put("LinkedHashMap", LinkedHashMap.class);
            b.put("java.util.LinkedHashMap", LinkedHashMap.class);
            f3030a.put(TreeMap.class, "TM");
            b.put("TreeMap", TreeMap.class);
            f3030a.put(ArrayList.class, "A");
            b.put("ArrayList", ArrayList.class);
            b.put("java.util.ArrayList", ArrayList.class);
            f3030a.put(LinkedList.class, RPCDataItems.LOCAL_AMNET);
            b.put(RPCDataItems.LOCAL_AMNET, LinkedList.class);
            b.put("LinkedList", LinkedList.class);
            b.put("java.util.LinkedList", LinkedList.class);
            b.put("java.util.concurrent.ConcurrentLinkedQueue", ConcurrentLinkedQueue.class);
            f3030a.put(HashSet.class, "HashSet");
            f3030a.put(TreeSet.class, "TreeSet");
            f3030a.put(LinkedHashSet.class, "LinkedHashSet");
            f3030a.put(ConcurrentHashMap.class, "ConcurrentHashMap");
            f3030a.put(ConcurrentLinkedQueue.class, "ConcurrentLinkedQueue");
            f3030a.put(JSONObject.class, "JSONObject");
            f3030a.put(JSONArray.class, "JSONArray");
            f3030a.put(Currency.class, "Currency");
            f3030a.put(TimeUnit.class, "TimeUnit");
            for (Class cls : new Class[]{Object.class, Cloneable.class, AutoCloseable.class, Exception.class, RuntimeException.class, IllegalAccessError.class, IllegalAccessException.class, IllegalArgumentException.class, IllegalMonitorStateException.class, IllegalStateException.class, IllegalThreadStateException.class, IndexOutOfBoundsException.class, InstantiationError.class, InstantiationException.class, InternalError.class, InterruptedException.class, LinkageError.class, NegativeArraySizeException.class, NoClassDefFoundError.class, NoSuchFieldError.class, NoSuchFieldException.class, NoSuchMethodError.class, NoSuchMethodException.class, NullPointerException.class, NumberFormatException.class, OutOfMemoryError.class, SecurityException.class, StackOverflowError.class, StringIndexOutOfBoundsException.class, TypeNotPresentException.class, VerifyError.class, StackTraceElement.class, Hashtable.class, TreeMap.class, IdentityHashMap.class, WeakHashMap.class, HashSet.class, LinkedHashSet.class, TreeSet.class, LinkedList.class, TimeUnit.class, ConcurrentHashMap.class, AtomicInteger.class, AtomicLong.class, Collections.EMPTY_MAP.getClass(), Boolean.class, Character.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, Number.class, String.class, BigDecimal.class, BigInteger.class, BitSet.class, Calendar.class, Date.class, Locale.class, UUID.class, Currency.class, SimpleDateFormat.class, JSONObject.class, JSONArray.class, ConcurrentSkipListMap.class, ConcurrentSkipListSet.class}) {
                String simpleName = cls.getSimpleName();
                b.put(simpleName, cls);
                b.put(cls.getName(), cls);
                f3030a.put(cls, simpleName);
            }
            b.put("JO10", JSONObject1O.class);
            b.put("[O", Object[].class);
            b.put("[Ljava.lang.Object;", Object[].class);
            b.put("[java.lang.Object", Object[].class);
            b.put("[Object", Object[].class);
            b.put("StackTraceElement", StackTraceElement.class);
            b.put("[StackTraceElement", StackTraceElement[].class);
            b.put("java.util.Collections$UnmodifiableMap", Collections.unmodifiableMap(Collections.EMPTY_MAP).getClass());
            b.put("java.util.Collections$UnmodifiableCollection", Collections.unmodifiableCollection(Collections.EMPTY_LIST).getClass());
            Class d = JSONFactory.d();
            if (d != null) {
                b.put("JO1", d);
                b.put(d.getName(), d);
            }
            Class e = JSONFactory.e();
            if (e != null) {
                b.put("JA1", e);
                b.put(e.getName(), e);
            }
            f3030a.put(new HashMap().keySet().getClass(), com.taobao.android.weex_framework.util.a.ATOM_Set);
            f3030a.put(new LinkedHashMap().keySet().getClass(), com.taobao.android.weex_framework.util.a.ATOM_Set);
            f3030a.put(new TreeMap().keySet().getClass(), com.taobao.android.weex_framework.util.a.ATOM_Set);
            f3030a.put(new ConcurrentHashMap().keySet().getClass(), com.taobao.android.weex_framework.util.a.ATOM_Set);
            f3030a.put(new ConcurrentSkipListMap().keySet().getClass(), com.taobao.android.weex_framework.util.a.ATOM_Set);
            b.put(com.taobao.android.weex_framework.util.a.ATOM_Set, HashSet.class);
            f3030a.put(new HashMap().values().getClass(), "List");
            f3030a.put(new LinkedHashMap().values().getClass(), "List");
            f3030a.put(new TreeMap().values().getClass(), "List");
            f3030a.put(new ConcurrentHashMap().values().getClass(), "List");
            f3030a.put(new ConcurrentSkipListMap().values().getClass(), "List");
            b.put("List", ArrayList.class);
            b.put("java.util.ImmutableCollections$Map1", HashMap.class);
            b.put("java.util.ImmutableCollections$MapN", LinkedHashMap.class);
            b.put("java.util.ImmutableCollections$Set12", LinkedHashSet.class);
            b.put("java.util.ImmutableCollections$SetN", LinkedHashSet.class);
            b.put("java.util.ImmutableCollections$List12", ArrayList.class);
            b.put("java.util.ImmutableCollections$ListN", ArrayList.class);
            b.put("java.util.ImmutableCollections$SubList", ArrayList.class);
            for (Map.Entry<Class, String> entry : f3030a.entrySet()) {
                String value = entry.getValue();
                if (b.get(value) == null) {
                    b.put(value, entry.getKey());
                }
            }
        }
    }

    static {
        kge.a(1991155852);
        h = !TypeUtils.class.desiredAssertionStatus();
        CLASS_SINGLE_SET = Collections.singleton(Boolean.TRUE).getClass();
        CLASS_SINGLE_LIST = Collections.singletonList(Boolean.TRUE).getClass();
        CLASS_UNMODIFIABLE_LIST = Collections.unmodifiableList(Collections.emptyList()).getClass();
        PARAM_TYPE_LIST_STR = new j(List.class, String.class);
        SMALL_10_POW = new double[]{1.0d, 10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d};
        f3029a = new float[]{1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
        b = new double[]{1.0E16d, 1.0E32d, 1.0E64d, 1.0E128d, 1.0E256d};
        c = new double[]{1.0E-16d, 1.0E-32d, 1.0E-64d, 1.0E-128d, 1.0E-256d};
        d = new Cache();
        e = AtomicReferenceFieldUpdater.newUpdater(Cache.class, char[].class, "chars");
        BigInteger[] bigIntegerArr = new BigInteger[19];
        bigIntegerArr[0] = BigInteger.ONE;
        bigIntegerArr[1] = BigInteger.TEN;
        long j = 10;
        for (int i = 2; i < 19; i++) {
            j *= 10;
            bigIntegerArr[i] = BigInteger.valueOf(j);
        }
        f = bigIntegerArr;
    }

    public static double a(int i, long j, int i2) {
        double d2;
        double scalb;
        double d3;
        double d4;
        long numberOfLeadingZeros = (64 - Long.numberOfLeadingZeros(j)) - ((long) Math.ceil(i2 * 3.321928094887362d));
        if (numberOfLeadingZeros < -1076) {
            d3 = i;
            d4 = mto.a.GEO_NOT_SUPPORT;
        } else if (numberOfLeadingZeros <= 1025) {
            if (i2 < 0) {
                d2 = i;
                scalb = BigInteger.valueOf(j).multiply(a(-i2)).doubleValue();
            } else if (i2 == 0) {
                d2 = i;
                scalb = j;
            } else {
                BigInteger valueOf = BigInteger.valueOf(j);
                int i3 = ((int) numberOfLeadingZeros) - 56;
                BigInteger a2 = a(i2);
                if (i3 <= 0) {
                    valueOf = valueOf.shiftLeft(-i3);
                } else {
                    a2 = a2.shiftLeft(i3);
                }
                BigInteger[] divideAndRemainder = valueOf.divideAndRemainder(a2);
                long longValue = divideAndRemainder[0].longValue();
                int signum = divideAndRemainder[1].signum();
                int i4 = (-1076) - i3;
                if (9 - Long.numberOfLeadingZeros(longValue) >= i4) {
                    return i * Math.scalb(signum | longValue, i3);
                }
                long signum2 = (longValue >> i4) | Long.signum(longValue & ((1 << i4) - 1)) | signum;
                d2 = i;
                scalb = Math.scalb(signum2, -1076);
            }
            return d2 * scalb;
        } else {
            d3 = i;
            d4 = Double.POSITIVE_INFINITY;
        }
        return d3 * d4;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0207 A[EDGE_INSN: B:160:0x0207->B:149:0x0207 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double a(boolean r20, int r21, char[] r22, int r23) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.TypeUtils.a(boolean, int, char[], int):double");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: StringIndexOutOfBoundsException -> 0x010f, TRY_ENTER, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010f, blocks: (B:4:0x000a, B:11:0x001f, B:15:0x002c, B:17:0x0030, B:24:0x003f, B:20:0x0037, B:22:0x003b, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:44:0x007f, B:36:0x0067, B:40:0x0077, B:42:0x007b, B:45:0x0086, B:46:0x008b, B:47:0x008c, B:54:0x0099, B:57:0x009f, B:61:0x00a9, B:73:0x00ca, B:76:0x00d4, B:77:0x00df, B:78:0x00e3, B:82:0x00ec, B:88:0x00f9, B:93:0x0102, B:83:0x00f0, B:68:0x00be, B:55:0x009b, B:10:0x001b, B:95:0x0107, B:96:0x010e), top: B:100:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051 A[Catch: StringIndexOutOfBoundsException -> 0x010f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010f, blocks: (B:4:0x000a, B:11:0x001f, B:15:0x002c, B:17:0x0030, B:24:0x003f, B:20:0x0037, B:22:0x003b, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:44:0x007f, B:36:0x0067, B:40:0x0077, B:42:0x007b, B:45:0x0086, B:46:0x008b, B:47:0x008c, B:54:0x0099, B:57:0x009f, B:61:0x00a9, B:73:0x00ca, B:76:0x00d4, B:77:0x00df, B:78:0x00e3, B:82:0x00ec, B:88:0x00f9, B:93:0x0102, B:83:0x00f0, B:68:0x00be, B:55:0x009b, B:10:0x001b, B:95:0x0107, B:96:0x010e), top: B:100:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099 A[Catch: StringIndexOutOfBoundsException -> 0x010f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010f, blocks: (B:4:0x000a, B:11:0x001f, B:15:0x002c, B:17:0x0030, B:24:0x003f, B:20:0x0037, B:22:0x003b, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:44:0x007f, B:36:0x0067, B:40:0x0077, B:42:0x007b, B:45:0x0086, B:46:0x008b, B:47:0x008c, B:54:0x0099, B:57:0x009f, B:61:0x00a9, B:73:0x00ca, B:76:0x00d4, B:77:0x00df, B:78:0x00e3, B:82:0x00ec, B:88:0x00f9, B:93:0x0102, B:83:0x00f0, B:68:0x00be, B:55:0x009b, B:10:0x001b, B:95:0x0107, B:96:0x010e), top: B:100:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b A[Catch: StringIndexOutOfBoundsException -> 0x010f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010f, blocks: (B:4:0x000a, B:11:0x001f, B:15:0x002c, B:17:0x0030, B:24:0x003f, B:20:0x0037, B:22:0x003b, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:44:0x007f, B:36:0x0067, B:40:0x0077, B:42:0x007b, B:45:0x0086, B:46:0x008b, B:47:0x008c, B:54:0x0099, B:57:0x009f, B:61:0x00a9, B:73:0x00ca, B:76:0x00d4, B:77:0x00df, B:78:0x00e3, B:82:0x00ec, B:88:0x00f9, B:93:0x0102, B:83:0x00f0, B:68:0x00be, B:55:0x009b, B:10:0x001b, B:95:0x0107, B:96:0x010e), top: B:100:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0102 A[Catch: StringIndexOutOfBoundsException -> 0x010f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010f, blocks: (B:4:0x000a, B:11:0x001f, B:15:0x002c, B:17:0x0030, B:24:0x003f, B:20:0x0037, B:22:0x003b, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:44:0x007f, B:36:0x0067, B:40:0x0077, B:42:0x007b, B:45:0x0086, B:46:0x008b, B:47:0x008c, B:54:0x0099, B:57:0x009f, B:61:0x00a9, B:73:0x00ca, B:76:0x00d4, B:77:0x00df, B:78:0x00e3, B:82:0x00ec, B:88:0x00f9, B:93:0x0102, B:83:0x00f0, B:68:0x00be, B:55:0x009b, B:10:0x001b, B:95:0x0107, B:96:0x010e), top: B:100:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double a(char[] r19, int r20, int r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.TypeUtils.a(char[], int, int):double");
    }

    public static Class a(String str) {
        return a.b.get(str);
    }

    public static <T> T a(Class<T> cls, JSONObject jSONObject) {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, jSONObject);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0175, code lost:
        if (r10.equals("java.sql.Date") != false) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T a(java.lang.Object r8, java.lang.Class<T> r9, com.alibaba.fastjson2.reader.ObjectReaderProvider r10) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.TypeUtils.a(java.lang.Object, java.lang.Class, com.alibaba.fastjson2.reader.ObjectReaderProvider):java.lang.Object");
    }

    public static <T> T a(Object obj, Type type) {
        return (T) a(obj, type, JSONFactory.defaultObjectReaderProvider);
    }

    public static <T> T a(Object obj, Type type, ObjectReaderProvider objectReaderProvider) {
        return type instanceof Class ? (T) a(obj, (Class<Object>) type, objectReaderProvider) : obj instanceof Collection ? (T) objectReaderProvider.a(type).b((Collection) obj) : obj instanceof Map ? (T) objectReaderProvider.a(type).a((Map) obj, 0L) : (T) a.CC.a(a.CC.a(obj), type);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String a(Class cls) {
        char c2;
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1402722386:
                if (name.equals("java.util.HashMap")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1114099497:
                if (name.equals("java.util.ArrayList")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -603401550:
                if (name.equals("com.alibaba.fastjson.JSONObject")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -170456954:
                if (name.equals("com.alibaba.fastjson.JSONArray")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 65821278:
                if (name.equals("java.util.List")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 303315282:
                if (name.equals("com.alibaba.fastjson2.JSONArray")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1063877011:
                if (name.equals("java.lang.Object")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1198635878:
                if (name.equals("com.alibaba.fastjson2.JSONObject")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return "JO1";
            case 1:
                return "JA1";
            case 2:
                return "JSONObject";
            case 3:
                return "JSONArray";
            case 4:
                return "M";
            case 5:
                return "A";
            case 6:
                return "Object";
            case 7:
                return name;
            default:
                String str = a.f3030a.get(cls);
                if (str != null) {
                    return str;
                }
                int indexOf = name.indexOf(36);
                if (indexOf != -1 && d(name.substring(indexOf + 1))) {
                    Class superclass = cls.getSuperclass();
                    if (Map.class.isAssignableFrom(superclass)) {
                        return a(superclass);
                    }
                }
                return name;
        }
    }

    public static Type a(Type type) {
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            return (rawType == List.class && actualTypeArguments.length == 1 && actualTypeArguments[0] == String.class) ? PARAM_TYPE_LIST_STR : type;
        }
        return type;
    }

    public static BigDecimal a(double d2) {
        byte[] bArr = new byte[24];
        return a(bArr, 0, com.alibaba.fastjson2.util.a.a(d2, bArr, 0, true));
    }

    public static BigDecimal a(float f2) {
        byte[] bArr = new byte[15];
        return a(bArr, 0, com.alibaba.fastjson2.util.a.a(f2, bArr, 0, true));
    }

    public static BigDecimal a(byte[] bArr, int i, int i2) {
        int i3;
        boolean z;
        if (bArr == null || i2 == 0) {
            return null;
        }
        int i4 = 0;
        if (bArr[i] == 45) {
            i3 = i + 1;
            z = true;
        } else {
            i3 = i;
            z = false;
        }
        if (i2 <= 20 || (z && i2 == 21)) {
            int i5 = i + i2;
            long j = 0;
            int i6 = 0;
            int i7 = -1;
            while (i3 < i5) {
                byte b2 = bArr[i3];
                if (b2 != 46) {
                    if (b2 >= 48 && b2 <= 57) {
                        long j2 = j * 10;
                        if (((j | 10) >>> 31) == 0 || j2 / 10 == j) {
                            j = j2 + (b2 - 48);
                            i3++;
                        }
                    }
                    j = -1;
                    break;
                }
                i6++;
                if (i6 > 1) {
                    break;
                }
                i7 = i3;
                i3++;
            }
            if (j >= 0 && i6 <= 1) {
                if (z) {
                    j = -j;
                }
                if (i7 != -1) {
                    i4 = (i2 - (i7 - i)) - 1;
                }
                return BigDecimal.valueOf(j, i4);
            }
        }
        char[] cArr = new char[i2];
        for (int i8 = 0; i8 < i2; i8++) {
            cArr[i8] = (char) bArr[i + i8];
        }
        return new BigDecimal(cArr, 0, cArr.length);
    }

    private static BigInteger a(int i) {
        BigInteger[] bigIntegerArr = f;
        if (i < bigIntegerArr.length) {
            return bigIntegerArr[i];
        }
        BigInteger[] bigIntegerArr2 = g;
        if (bigIntegerArr2 == null) {
            BigInteger[] bigIntegerArr3 = new BigInteger[128];
            BigInteger bigInteger = f[18];
            for (int i2 = 19; i2 < 128; i2++) {
                bigInteger = bigInteger.multiply(BigInteger.TEN);
                bigIntegerArr3[i2] = bigInteger;
            }
            g = bigIntegerArr3;
            bigIntegerArr2 = bigIntegerArr3;
        }
        return bigIntegerArr2[i];
    }

    public static Date a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof com.alibaba.fastjson2.time.a) {
            return new Date(((com.alibaba.fastjson2.time.a) obj).a());
        }
        if (obj instanceof com.alibaba.fastjson2.time.f) {
            return new Date(((com.alibaba.fastjson2.time.f) obj).a().a());
        }
        if (obj instanceof com.alibaba.fastjson2.time.b) {
            return new Date(((com.alibaba.fastjson2.time.b) obj).a(com.alibaba.fastjson2.time.e.b).a().a());
        }
        if (obj instanceof com.alibaba.fastjson2.time.c) {
            return new Date(com.alibaba.fastjson2.time.f.a((com.alibaba.fastjson2.time.c) obj, com.alibaba.fastjson2.time.e.b).a().a());
        }
        if (obj instanceof String) {
            long a2 = DateUtils.a((String) obj, com.alibaba.fastjson2.time.e.b);
            if (a2 != 0) {
                return new Date(a2);
            }
            return null;
        } else if ((obj instanceof Long) || (obj instanceof Integer)) {
            return new Date(((Number) obj).longValue());
        } else {
            throw new JSONException("can not cast to Date from " + obj.getClass());
        }
    }

    public static Map a(Map map) {
        return (Map) JSONFactory.g().apply(map);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: StringIndexOutOfBoundsException -> 0x0111, TRY_ENTER, TryCatch #0 {StringIndexOutOfBoundsException -> 0x0111, blocks: (B:4:0x000a, B:11:0x001f, B:15:0x002c, B:17:0x0030, B:24:0x003f, B:20:0x0037, B:22:0x003b, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:44:0x0081, B:36:0x0068, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009b, B:57:0x00a1, B:61:0x00ab, B:73:0x00cc, B:76:0x00d6, B:77:0x00e1, B:78:0x00e5, B:82:0x00ee, B:88:0x00fb, B:93:0x0104, B:83:0x00f2, B:68:0x00c0, B:55:0x009d, B:10:0x001b, B:95:0x0109, B:96:0x0110), top: B:100:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051 A[Catch: StringIndexOutOfBoundsException -> 0x0111, TryCatch #0 {StringIndexOutOfBoundsException -> 0x0111, blocks: (B:4:0x000a, B:11:0x001f, B:15:0x002c, B:17:0x0030, B:24:0x003f, B:20:0x0037, B:22:0x003b, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:44:0x0081, B:36:0x0068, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009b, B:57:0x00a1, B:61:0x00ab, B:73:0x00cc, B:76:0x00d6, B:77:0x00e1, B:78:0x00e5, B:82:0x00ee, B:88:0x00fb, B:93:0x0104, B:83:0x00f2, B:68:0x00c0, B:55:0x009d, B:10:0x001b, B:95:0x0109, B:96:0x0110), top: B:100:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b A[Catch: StringIndexOutOfBoundsException -> 0x0111, TryCatch #0 {StringIndexOutOfBoundsException -> 0x0111, blocks: (B:4:0x000a, B:11:0x001f, B:15:0x002c, B:17:0x0030, B:24:0x003f, B:20:0x0037, B:22:0x003b, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:44:0x0081, B:36:0x0068, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009b, B:57:0x00a1, B:61:0x00ab, B:73:0x00cc, B:76:0x00d6, B:77:0x00e1, B:78:0x00e5, B:82:0x00ee, B:88:0x00fb, B:93:0x0104, B:83:0x00f2, B:68:0x00c0, B:55:0x009d, B:10:0x001b, B:95:0x0109, B:96:0x0110), top: B:100:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d A[Catch: StringIndexOutOfBoundsException -> 0x0111, TryCatch #0 {StringIndexOutOfBoundsException -> 0x0111, blocks: (B:4:0x000a, B:11:0x001f, B:15:0x002c, B:17:0x0030, B:24:0x003f, B:20:0x0037, B:22:0x003b, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:44:0x0081, B:36:0x0068, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009b, B:57:0x00a1, B:61:0x00ab, B:73:0x00cc, B:76:0x00d6, B:77:0x00e1, B:78:0x00e5, B:82:0x00ee, B:88:0x00fb, B:93:0x0104, B:83:0x00f2, B:68:0x00c0, B:55:0x009d, B:10:0x001b, B:95:0x0109, B:96:0x0110), top: B:100:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0104 A[Catch: StringIndexOutOfBoundsException -> 0x0111, TryCatch #0 {StringIndexOutOfBoundsException -> 0x0111, blocks: (B:4:0x000a, B:11:0x001f, B:15:0x002c, B:17:0x0030, B:24:0x003f, B:20:0x0037, B:22:0x003b, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:44:0x0081, B:36:0x0068, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009b, B:57:0x00a1, B:61:0x00ab, B:73:0x00cc, B:76:0x00d6, B:77:0x00e1, B:78:0x00e5, B:82:0x00ee, B:88:0x00fb, B:93:0x0104, B:83:0x00f2, B:68:0x00c0, B:55:0x009d, B:10:0x001b, B:95:0x0109, B:96:0x0110), top: B:100:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double b(byte[] r19, int r20, int r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.TypeUtils.b(byte[], int, int):double");
    }

    public static float b(int i, long j, int i2) {
        int i3;
        float f2;
        float scalb;
        long numberOfLeadingZeros = (64 - Long.numberOfLeadingZeros(j)) - ((long) Math.ceil(i2 * 3.321928094887362d));
        if (numberOfLeadingZeros < -151) {
            f2 = i;
            scalb = 0.0f;
        } else if (numberOfLeadingZeros > 129) {
            f2 = i;
            scalb = Float.POSITIVE_INFINITY;
        } else if (i2 < 0) {
            f2 = i;
            scalb = BigInteger.valueOf(j).multiply(a(-i2)).floatValue();
        } else {
            BigInteger valueOf = BigInteger.valueOf(j);
            int i4 = ((int) numberOfLeadingZeros) - 27;
            BigInteger a2 = a(i2);
            if (i4 <= 0) {
                valueOf = valueOf.shiftLeft(-i4);
            } else {
                a2 = a2.shiftLeft(i4);
            }
            BigInteger[] divideAndRemainder = valueOf.divideAndRemainder(a2);
            int intValue = divideAndRemainder[0].intValue();
            int signum = divideAndRemainder[1].signum();
            if (6 - Integer.numberOfLeadingZeros(intValue) >= (-151) - i4) {
                f2 = i;
                scalb = Math.scalb(signum | intValue, i4);
            } else {
                f2 = i;
                scalb = Math.scalb(signum | Integer.signum(((1 << i3) - 1) & intValue) | (intValue >> i3), (int) AConstants.ArtcErrorIceRecvCandidateTimeout);
            }
        }
        return f2 * scalb;
    }

    public static float b(boolean z, int i, char[] cArr, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        b c2;
        boolean z2;
        int i7 = 1;
        int length = f3029a.length - 1;
        int i8 = 8;
        int min = Math.min(i2, 8);
        int i9 = cArr[0] - '0';
        for (int i10 = 1; i10 < min; i10++) {
            i9 = ((i9 * 10) + cArr[i10]) - 48;
        }
        float f2 = i9;
        int i11 = i - min;
        if (i2 <= 7) {
            if (i11 == 0 || f2 == 0.0f) {
                return z ? -f2 : f2;
            } else if (i11 >= 0) {
                if (i11 <= length) {
                    float f3 = f2 * f3029a[i11];
                    return z ? -f3 : f3;
                }
                int i12 = 7 - min;
                if (i11 <= length + i12) {
                    float[] fArr = f3029a;
                    float f4 = f2 * fArr[i12] * fArr[i11 - i12];
                    return z ? -f4 : f4;
                }
            } else if (i11 >= (-length)) {
                float f5 = f2 / f3029a[-i11];
                return z ? -f5 : f5;
            }
        } else if (i >= i2 && i2 + i <= 15) {
            long j = i9;
            while (min < i2) {
                j = (j * 10) + (cArr[min] - '0');
                min++;
            }
            float f6 = (float) (j * SMALL_10_POW[i - i2]);
            return z ? -f6 : f6;
        }
        double d2 = f2;
        if (i11 > 0) {
            if (i > 39) {
                return z ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
            }
            int i13 = i11 & 15;
            if (i13 != 0) {
                d2 *= SMALL_10_POW[i13];
            }
            int i14 = i11 >> 4;
            if (i14 != 0) {
                int i15 = 0;
                while (i14 > 0) {
                    if ((i14 & 1) != 0) {
                        d2 *= b[i15];
                    }
                    i15++;
                    i14 >>= 1;
                }
            }
        } else if (i11 < 0) {
            int i16 = -i11;
            if (i < -46) {
                return z ? -0.0f : 0.0f;
            }
            int i17 = i16 & 15;
            if (i17 != 0) {
                d2 /= SMALL_10_POW[i17];
            }
            int i18 = i16 >> 4;
            if (i18 != 0) {
                int i19 = 0;
                while (i18 > 0) {
                    if ((i18 & 1) != 0) {
                        d2 *= c[i19];
                    }
                    i19++;
                    i18 >>= 1;
                }
            }
        }
        float max = Math.max(Float.MIN_VALUE, Math.min(Float.MAX_VALUE, (float) d2));
        if (i2 > 200) {
            cArr[200] = '1';
            i3 = 201;
        } else {
            i3 = i2;
        }
        b bVar = new b(i9, cArr, min, i3);
        int i20 = i - i3;
        int floatToRawIntBits = Float.floatToRawIntBits(max);
        int max2 = Math.max(0, -i20);
        int max3 = Math.max(0, i20);
        b a2 = bVar.a(max3, 0);
        a2.f3032a = true;
        b bVar2 = null;
        int i21 = 0;
        while (true) {
            int i22 = floatToRawIntBits >>> 23;
            int i23 = 8388607 & floatToRawIntBits;
            if (i22 > 0) {
                i4 = i23 | 8388608;
            } else if (!h && i23 == 0) {
                throw new AssertionError(i23);
            } else {
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i23) - i8;
                i4 = i23 << numberOfLeadingZeros;
                i22 = 1 - numberOfLeadingZeros;
            }
            int i24 = i22 - 127;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i4);
            int i25 = i4 >>> numberOfTrailingZeros;
            int i26 = (i24 - 23) + numberOfTrailingZeros;
            int i27 = 24 - numberOfTrailingZeros;
            if (i26 >= 0) {
                i6 = max2 + i26;
                i5 = max3;
            } else {
                i5 = max3 - i26;
                i6 = max2;
            }
            int i28 = i24 <= -127 ? i24 + numberOfTrailingZeros + 127 : numberOfTrailingZeros + 1;
            int i29 = i6 + i28;
            int i30 = i5 + i28;
            int min2 = Math.min(i29, Math.min(i30, i6));
            int i31 = i29 - min2;
            int i32 = i30 - min2;
            int i33 = i6 - min2;
            b a3 = b.a(i25, max2, i31);
            if (bVar2 == null || i21 != i32) {
                bVar2 = a2.a(i32);
                i21 = i32;
            }
            int a4 = a3.a(bVar2);
            if (a4 <= 0) {
                if (a4 >= 0) {
                    break;
                }
                c2 = bVar2.c(a3);
                z2 = false;
            } else {
                c2 = a3.b(bVar2);
                if (i27 == 1 && i26 > -126) {
                    int i34 = i33 - 1;
                    if (i34 < 0) {
                        c2 = c2.a(1);
                        z2 = true;
                        i33 = 0;
                    } else {
                        i33 = i34;
                    }
                }
                z2 = true;
            }
            int b2 = c2.b(max2, i33);
            if (b2 < 0) {
                break;
            }
            int i35 = -1;
            if (b2 != 0) {
                if (!z2) {
                    i35 = 1;
                }
                floatToRawIntBits += i35;
                if (floatToRawIntBits == 0 || floatToRawIntBits == 2139095040) {
                    break;
                }
                i8 = 8;
            } else if ((floatToRawIntBits & 1) != 0) {
                if (z2) {
                    i7 = -1;
                }
                floatToRawIntBits += i7;
            }
        }
        if (z) {
            floatToRawIntBits |= Integer.MIN_VALUE;
        }
        return Float.intBitsToFloat(floatToRawIntBits);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: StringIndexOutOfBoundsException -> 0x010e, TRY_ENTER, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010e, blocks: (B:4:0x000a, B:11:0x001f, B:15:0x002c, B:17:0x0030, B:24:0x003f, B:20:0x0037, B:22:0x003b, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:44:0x007f, B:36:0x0067, B:40:0x0077, B:42:0x007b, B:45:0x0086, B:46:0x008b, B:47:0x008c, B:54:0x0099, B:57:0x009f, B:61:0x00a9, B:73:0x00ca, B:76:0x00d4, B:77:0x00df, B:78:0x00e3, B:82:0x00ec, B:88:0x00f9, B:93:0x0101, B:83:0x00f0, B:68:0x00be, B:55:0x009b, B:10:0x001b, B:95:0x0106, B:96:0x010d), top: B:100:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051 A[Catch: StringIndexOutOfBoundsException -> 0x010e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010e, blocks: (B:4:0x000a, B:11:0x001f, B:15:0x002c, B:17:0x0030, B:24:0x003f, B:20:0x0037, B:22:0x003b, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:44:0x007f, B:36:0x0067, B:40:0x0077, B:42:0x007b, B:45:0x0086, B:46:0x008b, B:47:0x008c, B:54:0x0099, B:57:0x009f, B:61:0x00a9, B:73:0x00ca, B:76:0x00d4, B:77:0x00df, B:78:0x00e3, B:82:0x00ec, B:88:0x00f9, B:93:0x0101, B:83:0x00f0, B:68:0x00be, B:55:0x009b, B:10:0x001b, B:95:0x0106, B:96:0x010d), top: B:100:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099 A[Catch: StringIndexOutOfBoundsException -> 0x010e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010e, blocks: (B:4:0x000a, B:11:0x001f, B:15:0x002c, B:17:0x0030, B:24:0x003f, B:20:0x0037, B:22:0x003b, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:44:0x007f, B:36:0x0067, B:40:0x0077, B:42:0x007b, B:45:0x0086, B:46:0x008b, B:47:0x008c, B:54:0x0099, B:57:0x009f, B:61:0x00a9, B:73:0x00ca, B:76:0x00d4, B:77:0x00df, B:78:0x00e3, B:82:0x00ec, B:88:0x00f9, B:93:0x0101, B:83:0x00f0, B:68:0x00be, B:55:0x009b, B:10:0x001b, B:95:0x0106, B:96:0x010d), top: B:100:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b A[Catch: StringIndexOutOfBoundsException -> 0x010e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010e, blocks: (B:4:0x000a, B:11:0x001f, B:15:0x002c, B:17:0x0030, B:24:0x003f, B:20:0x0037, B:22:0x003b, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:44:0x007f, B:36:0x0067, B:40:0x0077, B:42:0x007b, B:45:0x0086, B:46:0x008b, B:47:0x008c, B:54:0x0099, B:57:0x009f, B:61:0x00a9, B:73:0x00ca, B:76:0x00d4, B:77:0x00df, B:78:0x00e3, B:82:0x00ec, B:88:0x00f9, B:93:0x0101, B:83:0x00f0, B:68:0x00be, B:55:0x009b, B:10:0x001b, B:95:0x0106, B:96:0x010d), top: B:100:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0101 A[Catch: StringIndexOutOfBoundsException -> 0x010e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x010e, blocks: (B:4:0x000a, B:11:0x001f, B:15:0x002c, B:17:0x0030, B:24:0x003f, B:20:0x0037, B:22:0x003b, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:44:0x007f, B:36:0x0067, B:40:0x0077, B:42:0x007b, B:45:0x0086, B:46:0x008b, B:47:0x008c, B:54:0x0099, B:57:0x009f, B:61:0x00a9, B:73:0x00ca, B:76:0x00d4, B:77:0x00df, B:78:0x00e3, B:82:0x00ec, B:88:0x00f9, B:93:0x0101, B:83:0x00f0, B:68:0x00be, B:55:0x009b, B:10:0x001b, B:95:0x0106, B:96:0x010d), top: B:100:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static float b(char[] r19, int r20, int r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.TypeUtils.b(char[], int, int):float");
    }

    public static com.alibaba.fastjson2.time.a b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof com.alibaba.fastjson2.time.a) {
            return (com.alibaba.fastjson2.time.a) obj;
        }
        if (obj instanceof Date) {
            com.alibaba.fastjson2.time.a.a(((Date) obj).getTime());
        }
        if (obj instanceof com.alibaba.fastjson2.time.f) {
            return ((com.alibaba.fastjson2.time.f) obj).a();
        }
        if (!(obj instanceof String)) {
            throw new JSONException("can not cast to Date from " + obj.getClass());
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        if (str.charAt(0) != '\"') {
            str = '\"' + str + '\"';
        }
        JSONReader c2 = JSONReader.c(str);
        try {
            com.alibaba.fastjson2.time.a aVar = (com.alibaba.fastjson2.time.a) c2.b((Class<Object>) com.alibaba.fastjson2.time.a.class);
            if (c2 != null) {
                c2.close();
            }
            return aVar;
        } catch (Throwable th) {
            if (c2 != null) {
                try {
                    c2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static Class<?> b(Class cls) {
        return cls == Integer.TYPE ? int[].class : cls == Byte.TYPE ? byte[].class : cls == Short.TYPE ? short[].class : cls == Long.TYPE ? long[].class : cls == String.class ? String[].class : cls == Object.class ? Object[].class : Array.newInstance(cls, 1).getClass();
    }

    public static Class<?> b(Type type) {
        if (type == null) {
            return null;
        }
        if (type.getClass() == Class.class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return b(((ParameterizedType) type).getRawType());
        }
        if (type instanceof TypeVariable) {
            Type type2 = ((TypeVariable) type).getBounds()[0];
            return type2 instanceof Class ? (Class) type2 : b(type2);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return b(upperBounds[0]);
            }
        }
        return type instanceof GenericArrayType ? b((Class) e(((GenericArrayType) type).getGenericComponentType())) : Object.class;
    }

    public static BigDecimal b(String str) {
        if (str == null || str.isEmpty() || "null".equals(str)) {
            return null;
        }
        char[] charArray = str.toCharArray();
        return d(charArray, 0, charArray.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: StringIndexOutOfBoundsException -> 0x0110, TRY_ENTER, TryCatch #0 {StringIndexOutOfBoundsException -> 0x0110, blocks: (B:4:0x000a, B:11:0x001f, B:15:0x002c, B:17:0x0030, B:24:0x003f, B:20:0x0037, B:22:0x003b, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:44:0x0081, B:36:0x0068, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009b, B:57:0x00a1, B:61:0x00ab, B:73:0x00cc, B:76:0x00d6, B:77:0x00e1, B:78:0x00e5, B:82:0x00ee, B:88:0x00fb, B:93:0x0103, B:83:0x00f2, B:68:0x00c0, B:55:0x009d, B:10:0x001b, B:95:0x0108, B:96:0x010f), top: B:100:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051 A[Catch: StringIndexOutOfBoundsException -> 0x0110, TryCatch #0 {StringIndexOutOfBoundsException -> 0x0110, blocks: (B:4:0x000a, B:11:0x001f, B:15:0x002c, B:17:0x0030, B:24:0x003f, B:20:0x0037, B:22:0x003b, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:44:0x0081, B:36:0x0068, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009b, B:57:0x00a1, B:61:0x00ab, B:73:0x00cc, B:76:0x00d6, B:77:0x00e1, B:78:0x00e5, B:82:0x00ee, B:88:0x00fb, B:93:0x0103, B:83:0x00f2, B:68:0x00c0, B:55:0x009d, B:10:0x001b, B:95:0x0108, B:96:0x010f), top: B:100:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b A[Catch: StringIndexOutOfBoundsException -> 0x0110, TryCatch #0 {StringIndexOutOfBoundsException -> 0x0110, blocks: (B:4:0x000a, B:11:0x001f, B:15:0x002c, B:17:0x0030, B:24:0x003f, B:20:0x0037, B:22:0x003b, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:44:0x0081, B:36:0x0068, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009b, B:57:0x00a1, B:61:0x00ab, B:73:0x00cc, B:76:0x00d6, B:77:0x00e1, B:78:0x00e5, B:82:0x00ee, B:88:0x00fb, B:93:0x0103, B:83:0x00f2, B:68:0x00c0, B:55:0x009d, B:10:0x001b, B:95:0x0108, B:96:0x010f), top: B:100:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d A[Catch: StringIndexOutOfBoundsException -> 0x0110, TryCatch #0 {StringIndexOutOfBoundsException -> 0x0110, blocks: (B:4:0x000a, B:11:0x001f, B:15:0x002c, B:17:0x0030, B:24:0x003f, B:20:0x0037, B:22:0x003b, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:44:0x0081, B:36:0x0068, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009b, B:57:0x00a1, B:61:0x00ab, B:73:0x00cc, B:76:0x00d6, B:77:0x00e1, B:78:0x00e5, B:82:0x00ee, B:88:0x00fb, B:93:0x0103, B:83:0x00f2, B:68:0x00c0, B:55:0x009d, B:10:0x001b, B:95:0x0108, B:96:0x010f), top: B:100:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0103 A[Catch: StringIndexOutOfBoundsException -> 0x0110, TryCatch #0 {StringIndexOutOfBoundsException -> 0x0110, blocks: (B:4:0x000a, B:11:0x001f, B:15:0x002c, B:17:0x0030, B:24:0x003f, B:20:0x0037, B:22:0x003b, B:25:0x0044, B:26:0x0049, B:30:0x0051, B:33:0x0059, B:44:0x0081, B:36:0x0068, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009b, B:57:0x00a1, B:61:0x00ab, B:73:0x00cc, B:76:0x00d6, B:77:0x00e1, B:78:0x00e5, B:82:0x00ee, B:88:0x00fb, B:93:0x0103, B:83:0x00f2, B:68:0x00c0, B:55:0x009d, B:10:0x001b, B:95:0x0108, B:96:0x010f), top: B:100:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static float c(byte[] r19, int r20, int r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.TypeUtils.c(byte[], int, int):float");
    }

    public static long c(char[] cArr, int i, int i2) {
        switch (i2) {
            case 1:
                char c2 = cArr[i];
                if (c2 >= '0' && c2 <= '9') {
                    return c2 - '0';
                }
                break;
            case 2:
                char c3 = cArr[i];
                char c4 = cArr[i + 1];
                if (c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9') {
                    return ((c3 - '0') * 10) + (c4 - '0');
                }
                break;
            case 3:
                char c5 = cArr[i];
                char c6 = cArr[i + 1];
                char c7 = cArr[i + 2];
                if (c5 >= '0' && c5 <= '9' && c6 >= '0' && c6 <= '9' && c7 >= '0' && c7 <= '9') {
                    return ((c5 - '0') * 100) + ((c6 - '0') * 10) + (c7 - '0');
                }
                break;
            case 4:
                char c8 = cArr[i];
                char c9 = cArr[i + 1];
                char c10 = cArr[i + 2];
                char c11 = cArr[i + 3];
                if (c8 >= '0' && c8 <= '9' && c9 >= '0' && c9 <= '9' && c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9') {
                    return ((c8 - '0') * 1000) + ((c9 - '0') * 100) + ((c10 - '0') * 10) + (c11 - '0');
                }
                break;
            case 5:
                char c12 = cArr[i];
                char c13 = cArr[i + 1];
                char c14 = cArr[i + 2];
                char c15 = cArr[i + 3];
                char c16 = cArr[i + 4];
                if (c12 >= '0' && c12 <= '9' && c13 >= '0' && c13 <= '9' && c14 >= '0' && c14 <= '9' && c15 >= '0' && c15 <= '9' && c16 >= '0' && c16 <= '9') {
                    return ((c12 - '0') * 10000) + ((c13 - '0') * 1000) + ((c14 - '0') * 100) + ((c15 - '0') * 10) + (c16 - '0');
                }
                break;
            case 6:
                char c17 = cArr[i];
                char c18 = cArr[i + 1];
                char c19 = cArr[i + 2];
                char c20 = cArr[i + 3];
                char c21 = cArr[i + 4];
                char c22 = cArr[i + 5];
                if (c17 >= '0' && c17 <= '9' && c18 >= '0' && c18 <= '9' && c19 >= '0' && c19 <= '9' && c20 >= '0' && c20 <= '9' && c21 >= '0' && c21 <= '9' && c22 >= '0' && c22 <= '9') {
                    return ((c17 - '0') * 100000) + ((c18 - '0') * 10000) + ((c19 - '0') * 1000) + ((c20 - '0') * 100) + ((c21 - '0') * 10) + (c22 - '0');
                }
                break;
            case 7:
                char c23 = cArr[i];
                char c24 = cArr[i + 1];
                char c25 = cArr[i + 2];
                char c26 = cArr[i + 3];
                char c27 = cArr[i + 4];
                char c28 = cArr[i + 5];
                char c29 = cArr[i + 6];
                if (c23 >= '0' && c23 <= '9' && c24 >= '0' && c24 <= '9' && c25 >= '0' && c25 <= '9' && c26 >= '0' && c26 <= '9' && c27 >= '0' && c27 <= '9' && c28 >= '0' && c28 <= '9' && c29 >= '0' && c29 <= '9') {
                    return ((c23 - '0') * 1000000) + ((c24 - '0') * 100000) + ((c25 - '0') * 10000) + ((c26 - '0') * 1000) + ((c27 - '0') * 100) + ((c28 - '0') * 10) + (c29 - '0');
                }
                break;
            case 8:
                char c30 = cArr[i];
                char c31 = cArr[i + 1];
                char c32 = cArr[i + 2];
                char c33 = cArr[i + 3];
                char c34 = cArr[i + 4];
                char c35 = cArr[i + 5];
                char c36 = cArr[i + 6];
                char c37 = cArr[i + 7];
                if (c30 >= '0' && c30 <= '9' && c31 >= '0' && c31 <= '9' && c32 >= '0' && c32 <= '9' && c33 >= '0' && c33 <= '9' && c34 >= '0' && c34 <= '9' && c35 >= '0' && c35 <= '9' && c36 >= '0' && c36 <= '9' && c37 >= '0' && c37 <= '9') {
                    return ((c30 - '0') * 10000000) + ((c31 - '0') * 1000000) + ((c32 - '0') * 100000) + ((c33 - '0') * 10000) + ((c34 - '0') * 1000) + ((c35 - '0') * 100) + ((c36 - '0') * 10) + (c37 - '0');
                }
                break;
        }
        return Long.parseLong(new String(cArr, i, i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:348:0x0486 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0487  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Class c(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 1798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.TypeUtils.c(java.lang.String):java.lang.Class");
    }

    public static String c(Type type) {
        return type instanceof Class ? a((Class) type) : "<non-class>";
    }

    public static BigDecimal c(Object obj) {
        if (obj == null || (obj instanceof BigDecimal)) {
            return (BigDecimal) obj;
        }
        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
            return BigDecimal.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            return (BigDecimal) a(obj, (Class<Object>) BigDecimal.class, JSONFactory.defaultObjectReaderProvider);
        }
        String str = (String) obj;
        if (!str.isEmpty() && !"null".equals(str)) {
            return new BigDecimal(str);
        }
        return null;
    }

    public static Object d(Type type) {
        if (type == Integer.TYPE) {
            return 0;
        }
        if (type == Long.TYPE) {
            return 0L;
        }
        if (type == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (type == Double.TYPE) {
            return Double.valueOf((double) mto.a.GEO_NOT_SUPPORT);
        }
        if (type == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (type == Short.TYPE) {
            return (short) 0;
        }
        if (type == Byte.TYPE) {
            return (byte) 0;
        }
        return type == Character.TYPE ? (char) 0 : null;
    }

    public static BigDecimal d(char[] cArr, int i, int i2) {
        int i3;
        boolean z;
        if (cArr == null || i2 == 0) {
            return null;
        }
        if (cArr[i] == '-') {
            i3 = i + 1;
            z = true;
        } else {
            i3 = i;
            z = false;
        }
        if (i2 <= 20 || (z && i2 == 21)) {
            int i4 = i + i2;
            long j = 0;
            int i5 = 0;
            int i6 = -1;
            while (i3 < i4) {
                char c2 = cArr[i3];
                if (c2 != '.') {
                    if (c2 >= '0' && c2 <= '9') {
                        long j2 = j * 10;
                        if (((j | 10) >>> 31) == 0 || j2 / 10 == j) {
                            j = j2 + (c2 - '0');
                            i3++;
                        }
                    }
                    j = -1;
                    break;
                }
                i5++;
                if (i5 > 1) {
                    break;
                }
                i6 = i3;
                i3++;
            }
            if (j >= 0 && i5 <= 1) {
                if (z) {
                    j = -j;
                }
                return BigDecimal.valueOf(j, i6 != -1 ? (i2 - (i6 - i)) - 1 : 0);
            }
        }
        return new BigDecimal(cArr, i, i2);
    }

    public static BigInteger d(Object obj) {
        if (obj == null || (obj instanceof BigInteger)) {
            return (BigInteger) obj;
        }
        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
            return BigInteger.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            throw new JSONException("can not cast to bigint");
        }
        String str = (String) obj;
        if (!str.isEmpty() && !"null".equals(str)) {
            return new BigInteger(str);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
        if (r1 <= '9') goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L42
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto La
            goto L42
        La:
            char r1 = r6.charAt(r0)
            r2 = 45
            r3 = 1
            if (r1 == r2) goto L1a
            r2 = 43
            if (r1 != r2) goto L18
            goto L1a
        L18:
            r2 = 0
            goto L1b
        L1a:
            r2 = 1
        L1b:
            r4 = 57
            r5 = 48
            if (r2 == 0) goto L28
            int r1 = r6.length()
            if (r1 != r3) goto L2d
            return r0
        L28:
            if (r1 < r5) goto L42
            if (r1 <= r4) goto L2d
            goto L42
        L2d:
            r1 = 1
        L2e:
            int r2 = r6.length()
            if (r1 >= r2) goto L41
            char r2 = r6.charAt(r1)
            if (r2 < r5) goto L40
            if (r2 <= r4) goto L3d
            goto L40
        L3d:
            int r1 = r1 + 1
            goto L2e
        L40:
            return r0
        L41:
            return r3
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.TypeUtils.d(java.lang.String):boolean");
    }

    public static Class<?> e(Type type) {
        if (type == null) {
            return null;
        }
        if (type.getClass() == Class.class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return e(((ParameterizedType) type).getRawType());
        }
        if (type instanceof TypeVariable) {
            Type type2 = ((TypeVariable) type).getBounds()[0];
            return type2 instanceof Class ? (Class) type2 : e(type2);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return e(upperBounds[0]);
            }
        }
        return type instanceof GenericArrayType ? b((Class) e(((GenericArrayType) type).getGenericComponentType())) : Object.class;
    }

    public static Long e(Object obj) {
        long parseLong;
        if (obj == null || (obj instanceof Long)) {
            return (Long) obj;
        }
        if (obj instanceof Number) {
            parseLong = ((Number) obj).longValue();
        } else if (!(obj instanceof String)) {
            throw new JSONException("can not cast to long, class " + obj.getClass());
        } else {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            parseLong = Long.parseLong(str);
        }
        return Long.valueOf(parseLong);
    }

    public static long f(Object obj) {
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (!(obj instanceof String)) {
            throw new JSONException("can not cast to long from " + obj.getClass());
        }
        String str = (String) obj;
        if (!str.isEmpty() && !"null".equals(str)) {
            return Long.parseLong(str);
        }
        return 0L;
    }

    public static Integer g(Object obj) {
        int parseInt;
        if (obj == null || (obj instanceof Integer)) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            parseInt = ((Number) obj).intValue();
        } else if (!(obj instanceof String)) {
            if ((obj instanceof Map) && ((Map) obj).isEmpty()) {
                return null;
            }
            if (!(obj instanceof Boolean)) {
                throw new JSONException("can not cast to integer");
            }
            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            parseInt = Integer.parseInt(str);
        }
        return Integer.valueOf(parseInt);
    }

    public static Byte h(Object obj) {
        byte parseByte;
        if (obj == null || (obj instanceof Byte)) {
            return (Byte) obj;
        }
        if (obj instanceof Number) {
            parseByte = ((Number) obj).byteValue();
        } else if (!(obj instanceof String)) {
            throw new JSONException("can not cast to byte");
        } else {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            parseByte = Byte.parseByte(str);
        }
        return Byte.valueOf(parseByte);
    }

    public static byte i(Object obj) {
        if (obj == null) {
            return (byte) 0;
        }
        if (obj instanceof Byte) {
            return ((Byte) obj).byteValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).byteValue();
        }
        if (!(obj instanceof String)) {
            throw new JSONException("can not cast to byte");
        }
        String str = (String) obj;
        if (!str.isEmpty() && !"null".equals(str)) {
            return Byte.parseByte(str);
        }
        return (byte) 0;
    }

    public static Short j(Object obj) {
        short parseShort;
        if (obj == null || (obj instanceof Short)) {
            return (Short) obj;
        }
        if (obj instanceof Number) {
            parseShort = ((Number) obj).shortValue();
        } else if (!(obj instanceof String)) {
            throw new JSONException("can not cast to byte");
        } else {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            parseShort = Short.parseShort(str);
        }
        return Short.valueOf(parseShort);
    }

    public static short k(Object obj) {
        if (obj == null) {
            return (short) 0;
        }
        if (obj instanceof Short) {
            return ((Short) obj).shortValue();
        }
        if (obj instanceof Number) {
            return (byte) ((Number) obj).shortValue();
        }
        if (!(obj instanceof String)) {
            throw new JSONException("can not cast to byte");
        }
        String str = (String) obj;
        if (!str.isEmpty() && !"null".equals(str)) {
            return Short.parseShort(str);
        }
        return (short) 0;
    }

    public static int l(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue()).intValue();
        }
        if (!(obj instanceof String)) {
            throw new JSONException("can not cast to decimal");
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return 0;
        }
        return str.indexOf(46) != -1 ? new BigDecimal(str).intValueExact() : Integer.parseInt(str);
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (!str.isEmpty() && !"null".equals(str)) {
                return Boolean.parseBoolean(str);
            }
            return false;
        }
        if (obj instanceof Number) {
            int intValue = ((Number) obj).intValue();
            if (intValue == 1) {
                return true;
            }
            if (intValue == 0) {
                return false;
            }
        }
        throw new JSONException("can not cast to boolean");
    }

    public static Boolean n(Object obj) {
        boolean z;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            z = ((Boolean) obj).booleanValue();
        } else if (!(obj instanceof String)) {
            if (obj instanceof Number) {
                int intValue = ((Number) obj).intValue();
                if (intValue == 1) {
                    return true;
                }
                if (intValue == 0) {
                    z = false;
                }
            }
            throw new JSONException("can not cast to boolean");
        } else {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            z = Boolean.parseBoolean(str);
        }
        return Boolean.valueOf(z);
    }

    public static float o(Object obj) {
        if (obj == null) {
            return 0.0f;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        if (!(obj instanceof String)) {
            throw new JSONException("can not cast to decimal");
        }
        String str = (String) obj;
        if (!str.isEmpty() && !"null".equals(str)) {
            return Float.parseFloat(str);
        }
        return 0.0f;
    }

    public static Float p(Object obj) {
        float parseFloat;
        if (obj == null || (obj instanceof Float)) {
            return (Float) obj;
        }
        if (obj instanceof Number) {
            parseFloat = ((Number) obj).floatValue();
        } else if (!(obj instanceof String)) {
            throw new JSONException("can not cast to decimal");
        } else {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            parseFloat = Float.parseFloat(str);
        }
        return Float.valueOf(parseFloat);
    }

    public static double q(Object obj) {
        if (obj == null) {
            return mto.a.GEO_NOT_SUPPORT;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (!(obj instanceof String)) {
            throw new JSONException("can not cast to decimal");
        }
        String str = (String) obj;
        return (str.isEmpty() || "null".equals(str)) ? mto.a.GEO_NOT_SUPPORT : Double.parseDouble(str);
    }

    public static Double r(Object obj) {
        double parseDouble;
        if (obj == null || (obj instanceof Double)) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            parseDouble = ((Number) obj).doubleValue();
        } else if (!(obj instanceof String)) {
            throw new JSONException("can not cast to decimal");
        } else {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            parseDouble = Double.parseDouble(str);
        }
        return Double.valueOf(parseDouble);
    }
}
