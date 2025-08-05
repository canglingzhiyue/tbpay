package tb;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.time.DateTimeFormatter;
import com.alibaba.fastjson2.time.a;
import com.alibaba.fastjson2.time.b;
import com.alibaba.fastjson2.time.c;
import com.alibaba.fastjson2.util.TypeUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class aer implements JSONReader.a {
    static final Class d;
    static final Class e;
    static final Class f;

    /* renamed from: a  reason: collision with root package name */
    final long[] f25294a;
    final ConcurrentMap<Integer, ConcurrentHashMap<Long, Class>> b;
    final Map<Long, Class> c;

    static {
        kge.a(1654658312);
        kge.a(-1457212437);
        d = Collections.unmodifiableSortedSet(new TreeSet()).getClass();
        e = Collections.unmodifiableSet(Collections.emptySet()).getClass();
        f = Collections.unmodifiableCollection(Collections.emptyList()).getClass();
    }

    public aer(boolean z, Class... clsArr) {
        this(z, a(Arrays.asList(clsArr)));
    }

    public aer(boolean z, String... strArr) {
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap(16, 0.75f, 1);
        HashSet<String> hashSet = new HashSet();
        if (z) {
            for (Class cls : new Class[]{Object.class, Byte.TYPE, Byte.class, Short.TYPE, Short.class, Integer.TYPE, Integer.class, Long.TYPE, Long.class, Float.TYPE, Float.class, Double.TYPE, Double.class, Number.class, BigInteger.class, BigDecimal.class, AtomicInteger.class, AtomicLong.class, AtomicBoolean.class, AtomicIntegerArray.class, AtomicLongArray.class, AtomicReference.class, Boolean.TYPE, Boolean.class, Character.TYPE, Character.class, String.class, UUID.class, Currency.class, BitSet.class, EnumSet.class, EnumSet.noneOf(TimeUnit.class).getClass(), Date.class, Calendar.class, b.class, c.class, a.class, SimpleDateFormat.class, DateTimeFormatter.class, TimeUnit.class, Set.class, HashSet.class, LinkedHashSet.class, TreeSet.class, List.class, ArrayList.class, LinkedList.class, ConcurrentLinkedQueue.class, ConcurrentSkipListSet.class, CopyOnWriteArrayList.class, Collections.emptyList().getClass(), Collections.emptyMap().getClass(), TypeUtils.CLASS_SINGLE_SET, TypeUtils.CLASS_SINGLE_LIST, f, TypeUtils.CLASS_UNMODIFIABLE_LIST, e, d, Collections.unmodifiableMap(new HashMap()).getClass(), Collections.unmodifiableSortedMap(new TreeMap()).getClass(), Arrays.asList(new Object[0]).getClass(), Map.class, HashMap.class, Hashtable.class, TreeMap.class, LinkedHashMap.class, WeakHashMap.class, IdentityHashMap.class, ConcurrentMap.class, ConcurrentHashMap.class, ConcurrentSkipListMap.class, Exception.class, IllegalAccessError.class, IllegalAccessException.class, IllegalArgumentException.class, IllegalMonitorStateException.class, IllegalStateException.class, IllegalThreadStateException.class, IndexOutOfBoundsException.class, InstantiationError.class, InstantiationException.class, InternalError.class, InterruptedException.class, LinkageError.class, NegativeArraySizeException.class, NoClassDefFoundError.class, NoSuchFieldError.class, NoSuchFieldException.class, NoSuchMethodError.class, NoSuchMethodException.class, NullPointerException.class, NumberFormatException.class, OutOfMemoryError.class, RuntimeException.class, SecurityException.class, StackOverflowError.class, StringIndexOutOfBoundsException.class, TypeNotPresentException.class, VerifyError.class, StackTraceElement.class}) {
                hashSet.add(TypeUtils.a(cls));
            }
            hashSet.add("javax.validation.ValidationException");
            hashSet.add("javax.validation.NoProviderFoundException");
        }
        for (String str : strArr) {
            if (str != null && !str.isEmpty()) {
                Class a2 = TypeUtils.a(str);
                hashSet.add(a2 != null ? TypeUtils.a(a2) : str);
            }
        }
        long[] jArr = new long[hashSet.size()];
        int i = 0;
        for (String str2 : hashSet) {
            long j = com.alibaba.fastjson2.util.c.MAGIC_HASH_CODE;
            for (int i2 = 0; i2 < str2.length(); i2++) {
                char charAt = str2.charAt(i2);
                if (charAt == '$') {
                    charAt = '.';
                }
                j = (j ^ charAt) * com.alibaba.fastjson2.util.c.MAGIC_PRIME;
            }
            jArr[i] = j;
            i++;
        }
        jArr = i != jArr.length ? Arrays.copyOf(jArr, i) : jArr;
        Arrays.sort(jArr);
        this.f25294a = jArr;
    }

    public aer(Class... clsArr) {
        this(false, clsArr);
    }

    private Class a(long j, Class cls) {
        Class put;
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null || contextClassLoader == com.alibaba.fastjson2.a.class.getClassLoader()) {
            put = this.c.put(Long.valueOf(j), cls);
        } else {
            int identityHashCode = System.identityHashCode(contextClassLoader);
            ConcurrentHashMap<Long, Class> concurrentHashMap = this.b.get(Integer.valueOf(identityHashCode));
            if (concurrentHashMap == null) {
                this.b.put(Integer.valueOf(identityHashCode), new ConcurrentHashMap<>());
                concurrentHashMap = this.b.get(Integer.valueOf(identityHashCode));
            }
            put = concurrentHashMap.put(Long.valueOf(j), cls);
        }
        return put;
    }

    static String[] a(Collection<Class> collection) {
        HashSet hashSet = new HashSet();
        for (Class cls : collection) {
            if (cls != null) {
                hashSet.add(TypeUtils.a(cls));
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    @Override // com.alibaba.fastjson2.JSONReader.a
    public Class<?> a(long j, Class<?> cls, long j2) {
        Class cls2;
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null && contextClassLoader != com.alibaba.fastjson2.a.class.getClassLoader()) {
            ConcurrentHashMap<Long, Class> concurrentHashMap = this.b.get(Integer.valueOf(System.identityHashCode(contextClassLoader)));
            if (concurrentHashMap != null) {
                cls2 = concurrentHashMap.get(Long.valueOf(j));
                return cls2;
            }
        }
        cls2 = this.c.get(Long.valueOf(j));
        return cls2;
    }

    @Override // com.alibaba.fastjson2.JSONReader.a
    public Class<?> a(String str, Class<?> cls, long j) {
        int i;
        Class<?> a2;
        String str2 = "O".equals(str) ? "Object" : str;
        long j2 = com.alibaba.fastjson2.util.c.MAGIC_HASH_CODE;
        int length = str2.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt = str2.charAt(i2);
            if (charAt == '$') {
                charAt = '.';
            }
            long j3 = (j2 ^ charAt) * com.alibaba.fastjson2.util.c.MAGIC_PRIME;
            if (Arrays.binarySearch(this.f25294a, j3) >= 0) {
                long b = com.alibaba.fastjson2.util.c.b(str2);
                i = i2;
                Class<?> a3 = a(b, cls, j);
                if (a3 == null && (a3 = TypeUtils.c(str2)) != null && (a2 = a(b, a3)) != null) {
                    a3 = a2;
                }
                if (a3 != null) {
                    return a3;
                }
            } else {
                i = i2;
            }
            i2 = i + 1;
            j2 = j3;
        }
        long b2 = com.alibaba.fastjson2.util.c.b(str2);
        if (str2.length() > 0 && str2.charAt(0) == '[') {
            Class<?> a4 = a(b2, cls, j);
            if (a4 != null) {
                return a4;
            }
            String substring = str2.substring(1);
            Class<?> componentType = cls != null ? cls.getComponentType() : null;
            Class<?> a5 = a(substring, componentType, j);
            if (a5 != null) {
                Class<?> b3 = a5 == componentType ? cls : TypeUtils.b((Class) a5);
                Class<?> a6 = a(b2, b3);
                return a6 != null ? a6 : b3;
            }
        }
        Class a7 = TypeUtils.a(str2);
        if (a7 != null) {
            String a8 = TypeUtils.a(a7);
            if (!str2.equals(a8)) {
                Class<?> a9 = a(a8, cls, j);
                if (a9 != null) {
                    a(b2, a9);
                }
                return a9;
            }
        }
        return null;
    }
}
