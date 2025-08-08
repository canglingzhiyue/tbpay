package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.evo.EVO;
import com.alibaba.fastjson.JSON;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.c;
import com.taobao.android.task.Coordinator;
import com.taobao.monitor.procedure.s;
import com.taobao.tao.Globals;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class tmx implements opz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1115878405);
        kge.a(-2082704769);
    }

    @Override // tb.opz
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "secondRefreshAbTestInfo";
    }

    @Override // tb.opz
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        HashMap<String, String> c = c();
        if (!c.isEmpty()) {
            return JSON.toJSONString(c);
        }
        return null;
    }

    public static HashMap<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("52df8a4d", new Object[0]);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        String a2 = c.a.a("performanceAbTestInfo", "Home_Page_ExperimentBucketId", "");
        if (!StringUtils.isEmpty(a2)) {
            hashMap.put("bucketId", a2);
            s.f18233a.d().a("bucketId", a2);
        }
        String a3 = c.a.a("performanceAbTestInfo", "Home_Page_ExperimentId", "");
        if (!StringUtils.isEmpty(a3)) {
            hashMap.put("testId", a3);
        }
        return hashMap;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.tmx.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    VariationSet activateSync = EVO.activateSync(Globals.getApplication(), "Home_Page_ExperimentBucketId");
                    String str = "";
                    if (activateSync == null || activateSync.size() <= 0) {
                        c.a.b("performanceAbTestInfo", "Home_Page_ExperimentBucketId", str);
                        c.a.b("performanceAbTestInfo", "Home_Page_ExperimentId", str);
                        return;
                    }
                    Variation variation = activateSync.getVariation("Home_Page_ExperimentBucketId");
                    c.a.b("performanceAbTestInfo", "Home_Page_ExperimentBucketId", variation == null ? str : variation.getValueAsString(str));
                    Variation variation2 = activateSync.getVariation("Home_Page_ExperimentId");
                    if (variation2 != null) {
                        str = variation2.getValueAsString(str);
                    }
                    c.a.b("performanceAbTestInfo", "Home_Page_ExperimentId", str);
                }
            });
        }
    }
}
