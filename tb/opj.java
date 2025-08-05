package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;

/* loaded from: classes8.dex */
public class opj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALL_LESS_THEN = "allLessThan3";
    public static final String ONE_LESS_THEN = "oneLessThan3";
    public static final String T_SCHEDULE = "tschedule";
    public static final String T_SCHEDULE_AND_INSTANT = "tscheduleAndInstantOpen";

    static {
        kge.a(-1072133645);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : j.a("orderListPreloadExpireTime", 15000);
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        JSONObject e = e();
        if (e == null || e.isEmpty()) {
            lap.a("recmdPrefetch", "OptimizationConfig", "recmdConfig == null || recmdConfig.isEmpty()");
            return null;
        }
        return e.getString("optimizeType");
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        JSONObject e = e();
        if (e == null || e.isEmpty()) {
            lap.a("recmdPrefetch", "OptimizationConfig", "recmdConfig == null || recmdConfig.isEmpty()");
            return null;
        }
        return e.getString("experimentType");
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue();
        }
        JSONObject e = e();
        if (e == null || e.isEmpty()) {
            lap.a("recmdPrefetch", "OptimizationConfig", "recmdConfig == null || recmdConfig.isEmpty()");
            return -1;
        }
        return e.getIntValue("orderNumThreshold");
    }

    private static JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[0]);
        }
        JSONObject a2 = oqb.a(ksk.REC_ORDER_LIST_CATAPULT.f30287a);
        if (a2 != null) {
            return a2.getJSONObject(ops.OPTIMIZATION_CONFIG);
        }
        return null;
    }
}
