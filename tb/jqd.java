package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.protodb.Config;
import com.taobao.android.protodb.LSDB;
import com.taobao.android.protodb.e;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class jqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<String, jqd> f29690a;
    private final String b;
    private final LSDB c;

    static {
        kge.a(-583161403);
        f29690a = new ConcurrentHashMap<>();
    }

    public static jqd a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jqd) ipChange.ipc$dispatch("7c7131b7", new Object[]{str}) : a(str, (Config) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.jqd a(java.lang.String r3, com.taobao.android.protodb.Config r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.jqd.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            java.lang.String r3 = "20cfc078"
            java.lang.Object r3 = r0.ipc$dispatch(r3, r1)
            tb.jqd r3 = (tb.jqd) r3
            return r3
        L18:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, tb.jqd> r0 = tb.jqd.f29690a
            java.lang.Object r0 = r0.get(r3)
            tb.jqd r0 = (tb.jqd) r0
            if (r0 == 0) goto L23
            return r0
        L23:
            tb.jqd r1 = new tb.jqd     // Catch: java.lang.Exception -> L34
            com.taobao.android.protodb.LSDB r4 = com.taobao.android.protodb.LSDB.open(r3, r4)     // Catch: java.lang.Exception -> L34
            r1.<init>(r3, r4)     // Catch: java.lang.Exception -> L34
            java.util.concurrent.ConcurrentHashMap<java.lang.String, tb.jqd> r4 = tb.jqd.f29690a     // Catch: java.lang.Exception -> L32
            r4.put(r3, r1)     // Catch: java.lang.Exception -> L32
            goto L4b
        L32:
            r4 = move-exception
            goto L36
        L34:
            r4 = move-exception
            r1 = r0
        L36:
            tb.jpu r0 = tb.jpu.a(r3)
            java.lang.String r2 = "UltronMMKV#LSDBInitException"
            tb.jpu r0 = r0.c(r2)
            java.lang.String r4 = r4.getMessage()
            tb.jpu r4 = r0.b(r4)
            tb.jpr.a(r4)
        L4b:
            if (r1 != 0) goto L54
            tb.jqd r4 = new tb.jqd
            r0 = 0
            r4.<init>(r3, r0)
            return r4
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jqd.a(java.lang.String, com.taobao.android.protodb.Config):tb.jqd");
    }

    private jqd(String str, LSDB lsdb) {
        this.b = str;
        this.c = lsdb;
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (!a()) {
            return this.c.contains(new e(str));
        }
        return false;
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        if (!a()) {
            return this.c.delete(new e(str));
        }
        return false;
    }

    public boolean a(final String str, final byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a35a7c7d", new Object[]{this, str, bArr})).booleanValue() : a("saveBinary", new jns<Boolean, LSDB>() { // from class: tb.jqd.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jns
            public Boolean a(LSDB lsdb) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Boolean) ipChange2.ipc$dispatch("80bcd195", new Object[]{this, lsdb}) : Boolean.valueOf(lsdb.insertBinary(new e(str), bArr));
            }
        });
    }

    public byte[] d(final String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("7527e788", new Object[]{this, str}) : (byte[]) b("getBinary", new jns<byte[], LSDB>() { // from class: tb.jqd.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jns
            public byte[] a(LSDB lsdb) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (byte[]) ipChange2.ipc$dispatch("5beadc5", new Object[]{this, lsdb}) : lsdb.getBinary(new e(str));
            }
        });
    }

    public boolean a(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : a("saveString", new jns<Boolean, LSDB>() { // from class: tb.jqd.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jns
            public Boolean a(LSDB lsdb) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Boolean) ipChange2.ipc$dispatch("80bcd195", new Object[]{this, lsdb}) : Boolean.valueOf(lsdb.insertString(new e(str), str2));
            }
        });
    }

    public String e(final String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("666b162a", new Object[]{this, str}) : (String) b("getString", new jns<String, LSDB>() { // from class: tb.jqd.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jns
            public String a(LSDB lsdb) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("4e11d188", new Object[]{this, lsdb}) : lsdb.getString(new e(str));
            }
        });
    }

    public boolean a(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue() : a("saveBool", new jns<Boolean, LSDB>() { // from class: tb.jqd.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jns
            public Boolean a(LSDB lsdb) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Boolean) ipChange2.ipc$dispatch("80bcd195", new Object[]{this, lsdb}) : Boolean.valueOf(lsdb.insertBool(new e(str), z));
            }
        });
    }

    public boolean b(final String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d257bc5", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        Boolean bool = (Boolean) b("getBool", new jns<Boolean, LSDB>() { // from class: tb.jqd.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jns
            public Boolean a(LSDB lsdb) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Boolean) ipChange2.ipc$dispatch("80bcd195", new Object[]{this, lsdb}) : Boolean.valueOf(lsdb.getBool(new e(str)));
            }
        });
        return bool == null ? z : bool.booleanValue();
    }

    private boolean a(String str, jns<Boolean, LSDB> jnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fa47697", new Object[]{this, str, jnsVar})).booleanValue();
        }
        if (a()) {
            return false;
        }
        try {
            return jnsVar.a(this.c).booleanValue();
        } catch (Exception e) {
            jpu a2 = jpu.a(this.b);
            jpr.a(a2.c("UltronMMKV#" + str).b(e.getMessage()));
            return false;
        }
    }

    private <T> T b(String str, jns<T, LSDB> jnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("3b1cdade", new Object[]{this, str, jnsVar});
        }
        if (a()) {
            return null;
        }
        try {
            return jnsVar.a(this.c);
        } catch (Exception e) {
            jpu a2 = jpu.a(this.b);
            jpr.a(a2.c("UltronMMKV#" + str).b(e.getMessage()));
            return null;
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c == null;
    }
}
