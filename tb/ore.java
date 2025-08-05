package tb;

import android.text.TextUtils;
import com.alibaba.evo.EVO;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.c;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.Globals;

/* loaded from: classes.dex */
public class ore implements opz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2132516380);
        kge.a(-2082704769);
    }

    @Override // tb.opz
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "performanceAbTestInfo";
    }

    @Override // tb.opz
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : d();
    }

    private String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        String a2 = c.a.a("performanceAbTestInfo", "tb_start_bucket_id", "");
        if (!TextUtils.isEmpty(a2)) {
            jSONObject.put("bucketId", (Object) a2);
        }
        String a3 = c.a.a("performanceAbTestInfo", "tb_bucket_type", "");
        if (!TextUtils.isEmpty(a3)) {
            jSONObject.put("bucketType", (Object) a3);
        }
        String a4 = c.a.a("performanceAbTestInfo", "tb_start_test_id", "");
        if (!TextUtils.isEmpty(a4)) {
            jSONObject.put("testId", (Object) a4);
        }
        if (!jSONObject.isEmpty()) {
            return jSONObject.toJSONString();
        }
        return null;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.ore.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    VariationSet activateSync = EVO.activateSync(Globals.getApplication(), "tb_start_bucket_id");
                    String str = "";
                    if (activateSync == null || activateSync.size() <= 0) {
                        c.a.b("performanceAbTestInfo", "tb_start_bucket_id", str);
                        c.a.b("performanceAbTestInfo", "tb_bucket_type", str);
                        c.a.b("performanceAbTestInfo", "tb_start_test_id", str);
                        return;
                    }
                    Variation variation = activateSync.getVariation("tb_start_bucket_id");
                    c.a.b("performanceAbTestInfo", "tb_start_bucket_id", variation == null ? str : variation.getValueAsString(str));
                    Variation variation2 = activateSync.getVariation("tb_bucket_type");
                    c.a.b("performanceAbTestInfo", "tb_bucket_type", variation2 == null ? str : variation2.getValueAsString(str));
                    Variation variation3 = activateSync.getVariation("tb_start_test_id");
                    if (variation3 != null) {
                        str = variation3.getValueAsString(str);
                    }
                    c.a.b("performanceAbTestInfo", "tb_start_test_id", str);
                }
            });
        }
    }
}
