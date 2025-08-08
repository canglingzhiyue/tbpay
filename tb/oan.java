package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public class oan {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_DNS_REGEX = ".*http(s?)://(baron|share).laiwang.com.*tm=.*";
    public static final String DEFAULT_PLAN_B_PASSWORD_REGEX = ".*";
    public static final String DEFAULT_PRE_CHECK_REGEX = ".*\\/.*";
    public static final String DEFAULT_REFLOW_PLAN = "C";
    public static final String REFLOW_PLAN_A = "A";
    public static final String REFLOW_PLAN_B = "B";
    public static final String REFLOW_PLAN_C = "C";

    /* renamed from: a  reason: collision with root package name */
    private static ArrayList<oaq> f31879a;
    private static oap b;
    private static oao c;

    static {
        kge.a(-802532495);
    }

    public static ArrayList<oaq> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ab0d0c42", new Object[0]);
        }
        if (f31879a == null) {
            ArrayList<oaq> arrayList = new ArrayList<>();
            f31879a = arrayList;
            arrayList.add(new oar());
        }
        return f31879a;
    }

    public static void a(oap oapVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f789ad3a", new Object[]{oapVar});
        } else {
            b = oapVar;
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        oap oapVar = b;
        if (oapVar == null) {
            return "(￥|¥)(.+?)(￥|¥)";
        }
        String b2 = oapVar.b();
        return StringUtils.isEmpty(b2) ? "(￥|¥)(.+?)(￥|¥)" : b2;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        oap oapVar = b;
        return oapVar == null ? "C" : oapVar.a();
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
        }
        oap oapVar = b;
        return oapVar == null ? ".*\\/.*" : oapVar.d();
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        oap oapVar = b;
        return oapVar == null ? DEFAULT_PLAN_B_PASSWORD_REGEX : oapVar.c();
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
        }
        oao oaoVar = c;
        return oaoVar == null ? ".*http(s?)://(baron|share).laiwang.com.*tm=.*" : oaoVar.a();
    }

    public static void a(oao oaoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f78938db", new Object[]{oaoVar});
        } else {
            c = oaoVar;
        }
    }
}
