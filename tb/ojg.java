package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IOutLinkService;
import com.taobao.tao.topmultitab.c;
import java.util.Map;

/* loaded from: classes8.dex */
public class ojg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2029438051);
    }

    public static boolean a(ljs ljsVar, lli lliVar) {
        lli scrolledToItemTraceInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81a13ee", new Object[]{ljsVar, lliVar})).booleanValue();
        }
        IOutLinkService iOutLinkService = (IOutLinkService) ljsVar.a(IOutLinkService.class);
        return iOutLinkService == null || (scrolledToItemTraceInfo = iOutLinkService.getScrolledToItemTraceInfo()) == null || !scrolledToItemTraceInfo.equals(lliVar);
    }

    public static void a(kuh kuhVar, boolean z) {
        JSONObject parseObject;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c3f03a", new Object[]{kuhVar, new Boolean(z)});
            return;
        }
        c.a().a("home");
        try {
            laq a2 = laq.a().a("ExternalLink").b("recommendProcess").a("外链", kuhVar.b);
            if (kuhVar.b != null && (jSONObject = JSON.parseObject(kuhVar.b).getJSONObject("nextPageUtProperties")) != null) {
                kss.a((Map) JSON.parseObject(jSONObject.toJSONString(), new TypeReference<Map<String, String>>() { // from class: tb.ojg.1
                }, new Feature[0]));
            }
            if (kuhVar.b == null) {
                parseObject = new JSONObject();
            } else {
                parseObject = JSON.parseObject(kuhVar.b);
            }
            if (parseObject != null) {
                parseObject.put(nfc.PHA_MONITOR_IS_COLD_START, (Object) Boolean.valueOf(z));
                a2.a("当前是否是冷启外链拉端", z);
            }
            c.a().a("home", kuhVar.d, parseObject != null ? parseObject.toJSONString() : "");
            a2.b();
        } catch (Exception unused) {
            lap.a("ExternalLink", "recommendProcess", "recmdParams parse JSON exception :" + kuhVar.b);
            ksr.b("OutLinkMicroservicesCompatible", "2.0", "processOutLink", "processOutLink", null, "recmdParams:" + kuhVar.b);
        }
    }
}
