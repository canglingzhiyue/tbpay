package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HGifView;
import com.taobao.tao.image.ImageStrategyConfig;

/* loaded from: classes7.dex */
public class leg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ImageStrategyConfig f30520a;
    private static final ImageStrategyConfig b;

    static {
        kge.a(867506112);
        f30520a = ImageStrategyConfig.a("home", 5111).a();
        b = ImageStrategyConfig.a("home", 5112).a();
    }

    public static void a(HGifView hGifView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1836630", new Object[]{hGifView, jSONObject});
        } else if (jSONObject == null) {
        } else {
            if (StringUtils.equals(lix.c(jSONObject), "true")) {
                hGifView.setStrategyConfig(f30520a);
            } else if (StringUtils.equals(lix.d(jSONObject), "true")) {
                hGifView.setStrategyConfig(b);
            } else {
                hGifView.setStrategyConfig(lfx.IMAGE_STRATEGY_CONFIG);
            }
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            return;
        }
        ldf.c("reportDx2TemplateDownload", "name = " + str + ",version = " + str2 + ",url = " + str3 + ",module = " + str4);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) str);
        jSONObject.put("version", (Object) str2);
        jSONObject.put("url", (Object) str3);
        jSONObject.put("module", (Object) str4);
        AppMonitor.Alarm.commitSuccess("infoflow_dx", "dx2_check", jSONObject.toJSONString());
    }
}
