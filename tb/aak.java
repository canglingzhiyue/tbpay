package tb;

import com.alibaba.fastjson2.reader.bu;
import java.lang.reflect.Constructor;
import java.util.Locale;

/* loaded from: classes2.dex */
public class aak {
    public static final long DISABLE_UNSAFE = 36028797018963968L;
    public static final long FIELD_MASK = 4503599627370496L;
    public static final long RAW_VALUE_MASK = 1125899906842624L;
    public static final long READ_ONLY = 72057594037927936L;
    public static final long READ_USING_MASK = 2251799813685248L;
    public static final long UNWRAPPED_MASK = 562949953421312L;
    public static final long VALUE_MASK = 281474976710656L;

    /* renamed from: a  reason: collision with root package name */
    public String f25184a;
    public String b;
    public String c;
    public int d;
    public long e;
    public boolean f;
    public String[] g;
    public Class<?> h;
    public Class<?> i;
    public Class<?> j;
    public Class<?> k;
    public boolean l;
    public boolean m;
    public String n;
    public Locale o;
    public boolean p;

    static {
        kge.a(2069133645);
    }

    public bu a() {
        Class<?> cls = this.k;
        if (cls != null && bu.class.isAssignableFrom(cls)) {
            try {
                Constructor<?> declaredConstructor = this.k.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                return (bu) declaredConstructor.newInstance(new Object[0]);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void b() {
        this.f25184a = null;
        this.b = null;
        this.c = null;
        this.d = 0;
        this.e = 0L;
        this.f = false;
        this.p = false;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = false;
        this.m = false;
        this.n = null;
        this.o = null;
    }
}
