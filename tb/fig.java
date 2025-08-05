package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class fig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PRE_REQUEST_START_TIME_INVALID = -1;
    public static final int PRE_REQUEST_STATUS_NEVER_REQUEST = 0;
    public static final int PRE_REQUEST_STATUS_NID_ABSENT = 3;
    public static final int PRE_REQUEST_STATUS_REQUESTING = 1;
    public static final int PRE_REQUEST_STATUS_REQUEST_FAIL = 2;
    public static final int PRE_REQUEST_STATUS_SUCCESS = 5;
    public static final int PRE_REQUEST_STATUS_WEED_OUT = 4;

    /* renamed from: a  reason: collision with root package name */
    public static int f27971a;
    public static long b;
    public static boolean c;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static boolean h;
    public static boolean i;
    public static boolean j;
    public static int k;
    public static boolean l;
    private static Map<String, a> m;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f27972a = 0;
        public int b = 0;
        public long c = -1;
        public int d;

        static {
            kge.a(1811536785);
        }
    }

    static {
        kge.a(-1279667631);
        m = new HashMap();
    }

    public static void a(String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{str, new Integer(i2)});
            return;
        }
        a aVar = m.get(str);
        if (aVar != null) {
            aVar.f27972a = aVar.b;
            aVar.b = i2;
            return;
        }
        a aVar2 = new a();
        aVar2.b = i2;
        m.put(str, aVar2);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        a aVar = m.get(str);
        if (aVar == null) {
            aVar = new a();
            m.put(str, aVar);
        }
        aVar.c = System.currentTimeMillis();
        aVar.d = 0;
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        a aVar = m.get(str);
        if (aVar == null) {
            aVar = new a();
            m.put(str, aVar);
        }
        aVar.d++;
    }

    public static a c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2e0913f1", new Object[]{str}) : m.get(str);
    }
}
