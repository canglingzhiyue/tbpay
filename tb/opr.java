package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class opr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FAILED = "failed";
    public static final String OPTIMIZE_TYPE_ORDER_LIST_T_SCHEDULE = "orderList_tschdule";
    public static final String OPTIMIZE_TYPE_PS_ORDER = "ps_order";
    public static final String OPTIMIZE_TYPE_PS_T_SCHEDULE = "ps_tschedule";
    public static final String OPTIMIZE_TYPE_T_SCHEDULE = "tschdule";
    public static final String OPTIMIZE_TYPE_T_SCHEDULE_AND_INSTANT = "tscheduleAndInstantOpen";
    public static final String ORIGIN_MY_TAO_BAO = "myTaoBao";
    public static final String ORIGIN_NEW_BUY = "newbuy";
    public static final String ORIGIN_ORDER = "order";
    public static final String ORIGIN_T_SCHEDULE = "tschedule";
    public static final String SUCCESS = "success";

    /* renamed from: a  reason: collision with root package name */
    private static String f32266a;
    private static String b;
    private static String c;

    static {
        kge.a(1622171646);
        f32266a = "none";
        b = "none";
        c = "none";
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        f32266a = "none";
        b = "none";
        c = "none";
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            f32266a = str;
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            b = str;
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else {
            c = str;
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : f32266a;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : b;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : c;
    }
}
