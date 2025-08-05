package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jqi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, a> f29705a;
    public static final String sDefaultBizCode = "ultron";

    /* loaded from: classes6.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2050978109);
        }

        public float a(String str, float f) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{this, str, new Float(f)})).floatValue() : f;
        }

        public int a(String str, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue() : i;
        }

        public long a(String str, long j) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{this, str, new Long(j)})).longValue() : j;
        }

        public String a(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : str2;
        }

        public boolean a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue() : z;
        }
    }

    static {
        kge.a(-1860871282);
        f29705a = new HashMap();
        a("ultron", new b());
    }

    public static void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64d85183", new Object[]{str, aVar});
        } else if (f29705a.containsKey(str)) {
        } else {
            f29705a.put(str, aVar);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            f29705a.remove(str);
        }
    }

    private static a b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ad1ddb54", new Object[]{str});
        }
        a aVar = null;
        if (!TextUtils.isEmpty(str)) {
            aVar = f29705a.get(str);
        }
        return aVar == null ? f29705a.get("ultron") : aVar;
    }

    public static boolean a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4dbad4dc", new Object[]{str, str2, new Boolean(z)})).booleanValue() : a(str, str2, z, false);
    }

    public static boolean a(String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69a07900", new Object[]{str, str2, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        boolean a2 = b(str).a(str2, z);
        if (z2) {
            jqg.a("奥创开关#" + str, str2, "=" + a2);
        }
        return a2;
    }

    public static long a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4dba98bc", new Object[]{str, str2, new Long(j)})).longValue() : b(str).a(str2, j);
    }

    public static float a(String str, String str2, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4dba89b4", new Object[]{str, str2, new Float(f)})).floatValue() : b(str).a(str2, f);
    }

    public static int a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4dba94fa", new Object[]{str, str2, new Integer(i)})).intValue() : b(str).a(str2, i);
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3}) : b(str).a(str2, str3);
    }

    /* loaded from: classes6.dex */
    public static final class b extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1949328865);
        }

        private b() {
        }

        @Override // tb.jqi.a
        public boolean a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue() : jpw.a(str, z);
        }

        @Override // tb.jqi.a
        public float a(String str, float f) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{this, str, new Float(f)})).floatValue() : jpw.a(str, f);
        }

        @Override // tb.jqi.a
        public int a(String str, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue() : jpw.a(str, i);
        }

        @Override // tb.jqi.a
        public long a(String str, long j) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{this, str, new Long(j)})).longValue() : jpw.a(str, j);
        }

        @Override // tb.jqi.a
        public String a(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : jpw.a(str, str2);
        }
    }
}
