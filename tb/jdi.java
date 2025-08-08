package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.o;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopStatistics;

/* loaded from: classes6.dex */
public class jdi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(260134798);
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : System.currentTimeMillis();
    }

    public static String a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf8a613", new Object[]{mtopResponse});
        }
        MtopStatistics mtopStat = mtopResponse.getMtopStat();
        return (mtopStat != null && !StringUtils.isEmpty(mtopStat.eagleEyeTraceId)) ? mtopStat.eagleEyeTraceId : "";
    }

    public static long a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("266fb7c", new Object[]{jSONObject})).longValue();
        }
        String string = jSONObject.getString(o.P_CART_BTN_CLICK);
        String string2 = jSONObject.getString(o.P_BUY_BTN_CLICK);
        String string3 = jSONObject.getString(o.P_SKUBAR_BTN_CLICK);
        if (StringUtils.isEmpty(string3)) {
            string3 = "";
        }
        if (!StringUtils.isEmpty(string)) {
            string3 = string;
        }
        if (!StringUtils.isEmpty(string2)) {
            string3 = string2;
        }
        try {
            return Long.parseLong(string3);
        } catch (Throwable unused) {
            return -1L;
        }
    }
}
