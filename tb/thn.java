package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* loaded from: classes9.dex */
public class thn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f34095a = "thn";

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
            String str4 = f34095a;
            TLog.logi(tkd.TLOG_MODULE, str4, "invalid params: " + str + "," + str2 + "," + str3);
            return "";
        }
        VariationSet activate = UTABTest.activate(str2, str);
        if (activate == null) {
            TLog.logi(tkd.TLOG_MODULE, f34095a, "variationSet is null");
            return "";
        }
        Variation variation = activate.getVariation(str3);
        if (variation == null) {
            TLog.logi(tkd.TLOG_MODULE, f34095a, "variation is null");
            return "";
        }
        return variation.getValueAsString("");
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        String g = tho.g();
        if (StringUtils.isEmpty(g)) {
            TLog.logi(tkd.TLOG_MODULE, f34095a, "abConfig is null");
            return false;
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(g);
            if (parseObject == null) {
                String str2 = f34095a;
                TLog.loge(tkd.TLOG_MODULE, str2, "parse config failed: " + g);
                return false;
            }
            JSONObject jSONObject = parseObject.getJSONObject(str);
            if (jSONObject == null) {
                String str3 = f34095a;
                TLog.loge(tkd.TLOG_MODULE, str3, "get channelConfig failed: " + g);
                return false;
            }
            return "true".equals(a(jSONObject.getString("module"), jSONObject.getString("component"), jSONObject.getString("value")));
        } catch (Exception e) {
            String str4 = f34095a;
            TLog.loge(tkd.TLOG_MODULE, str4, "parse config failed: " + g + "; exception: " + e);
            return false;
        }
    }
}
