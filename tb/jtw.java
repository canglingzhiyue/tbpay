package tb;

import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jtw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(386032760);
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("taobao.waitpay.detail", 19999, "/jstracker.3", "", "", a("waitpaydetail_exposure_android", bba.b(map), jtx.a("waitpaydetailExposureSampling", "1"))).build());
        }
    }

    private static Map<String, String> a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4b1feffb", new Object[]{str, str2, str3});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", BizTaskData.MANUAL_TIME);
        hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, "26607-tracker");
        hashMap.put("code", str);
        hashMap.put("sampling", str3);
        hashMap.put("collection_url", "http://taobao.waitpay.detail");
        hashMap.put("name", "代付款请求页面曝光");
        hashMap.put("native", "1");
        if (str2 != null) {
            try {
                hashMap.put("message", URLEncoder.encode(str2, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return hashMap;
    }
}
